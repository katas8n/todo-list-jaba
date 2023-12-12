package TodoAttributes;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private final List<TodoItem> items;
    public TodoList() {
        items = new ArrayList<>();
    }

    // CREATE NEW ITEM
    public void pushNewItem(String description) {
        items.add(new TodoItem(description));
        System.out.println("Item was successfully added.");
    }

    // READ OPERATION
    public void printItems() {
        if(items.isEmpty()) { System.out.println("There is nothing here yet!"); return; }

        for(int i = 0 ; i < items.size() ; i++) {
            System.out.println((i + 1) + ")" + items.get(i).stringPerformance());
        }
    }

    // UPDATE
    public void updateItem(int index) {
        if(index < 1 || index > items.size()) {
            System.out.println("There is invalid index. This task doesn't exist!");
        } else {
            items.get(index - 1).setHasDone(true);
        }
    }

    // DELETE
    public void removeItem(int index) {
        if(index < 1 || index > items.size()) {
            System.out.println("There is invalid index. This task doesn't exist!");
        } else {
            items.remove(index - 1);
        }
    }
}
