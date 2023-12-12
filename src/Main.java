import java.util.Scanner;
import TodoAttributes.TodoList;
import TodoAttributes.TodoItem;


public class Main {

    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        boolean isRunning = true;

        Scanner scanner = new Scanner(System.in);

        while(isRunning) {
            System.out.println("\nCurrent todo-list looks like this : ");
            todoList.printItems();

            System.out.println("\nChoose function which you gonna use : add , update , remove , exit");
            String userChoice = scanner.nextLine();

            switch(userChoice) {
                case "add":
                    System.out.println("Enter description to ur task please : ");
                    String description = scanner.nextLine();

                    todoList.pushNewItem(description);
                    break;
                case "update":
                    System.out.println("Pick task which you wanna update by it's number : ");
                    int index = Integer.parseInt(scanner.nextLine());

                    todoList.updateItem(index);
                    break;
                case "remove":
                    System.out.println("Pick task which you wanna remove by it's number : ");
                    int removeIndex = Integer.parseInt(scanner.nextLine());

                    todoList.removeItem(removeIndex);
                    break;
                case "exit":
                    System.out.println("Thank you , for attention , have a nice one!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Such type option hasn't existed yet");
                    break;
            }
        }
    }
}
