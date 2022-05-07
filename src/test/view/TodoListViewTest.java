package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServieImpl;
import view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        testAddTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServieImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todoListService.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServieImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.addTodoList();

        todoListService.showTodoList();

        todoListView.addTodoList();

        todoListService.showTodoList();

    }
}