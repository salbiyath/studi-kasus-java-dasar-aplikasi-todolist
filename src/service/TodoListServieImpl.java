package service;

import entity.TodoList;
import repository.TodoListRepository;

public class TodoListServieImpl implements TodoListService{

     private TodoListRepository todoListRepository;

    public TodoListServieImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        TodoList[] model = todoListRepository.getAll();

        System.out.println("TODOLIST");
        for (int i = 0; i < model.length; i++) {
            var todoList = model[i];
            var no = i + 1;

            if (todoList != null){
                System.out.println(no + ". " + todoList.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        TodoList todoList = new TodoList(todo);
        todoListRepository.add(todoList);
        System.out.println("Success add new todo : " + todo);
    }

    @Override
    public void removeTodoList(Integer number) {
        boolean success = todoListRepository.remove(number);
        if (success ) {
            System.out.println("Success remove todo with number : " + number);
        } else {
            System.out.println("Failed remove todo with number : " + number);
        }
    }
}
