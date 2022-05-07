package test.service;

import entity.TodoList;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServieImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {

    testShowTodoList();

    }

    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("Belajar Java Dasar");
        todoListRepository.data[1] = new TodoList("Belajar Java OOP");
        todoListRepository.data[2] = new TodoList("Belajar Java Standard Classes");

        TodoListService todoListService = new TodoListServieImpl(todoListRepository);

        todoListService.showTodoList();
    }
}
