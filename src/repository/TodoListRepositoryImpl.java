package repository;

import entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository{

    public TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    public boolean isFull(){
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null){
                // Model masih ada yang kosong
                isFull = false;
                break;
            }
        }
        return  isFull;
    }

    public void resizeIfFull(){
        // Jika penuh, resize ukuran array 2x lipat
        if (isFull()){
            var temp = data;
            data = new TodoList[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    @Override
    public void add(TodoList todoList) {

    }

    @Override
    public void remove(Integer number) {

    }
}
