package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select:");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
           } else if (select == 1) {
                if(tracker.findAll().length>0) {
                    for (Item item : tracker.findAll()) {
                        System.out.println(item.getName());
                    }
                }else{
                    System.out.println("The database is empty");
                }
            }else if(select == 2) {
                System.out.println("=== Edit item ====");
                System.out.print("Enter name for edit: ");
                String name = scanner.nextLine();
                Item[] result = tracker.findByName(name);
                if(result.length>0) {
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                            for(Item res:result){
                                res.setName(newName);
                            }
                        System.out.println("Name changed");
                }else {
                        System.out.println("The entered name is incorrect");
                }

            }else if(select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter name for delete: ");
                String name = scanner.nextLine();
                Item[] result = tracker.findByName(name);
                if(result.length>0) {
                    Item[] allItems = tracker.getItems();
                    for(int i = 0; i < allItems.length; i++){
                       if(result[i].getId().equals(allItems[i].getId())) {
                           allItems[i]=null;
                           break;
                       }
                    }
                    System.out.println("Delete item success");
                }else {
                    System.out.println("The entered name is incorrect");
                }
            }else if(select == 4) {
                System.out.println("=== Search Id item ====");
                System.out.print("Enter Id to search: ");
                String id = scanner.nextLine();
                Item result = tracker.findById(id);
                if(result!=null) {
                        System.out.println(result.getId());
                }else {
                    System.out.println("No Id in database");
                }

            }else if(select==5) {
                System.out.println("=== Search item ====");
                System.out.print("Enter name to search: ");
                String name = scanner.nextLine();
                Item[] result = tracker.findByName(name);
                if(result.length>0) {
                    for(Item res:result){
                        System.out.println(res.getName());
                    }
                }else {
                    System.out.println("No name in database");
                }
            }else if(select==6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        // добавить остальные пункты меню.
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
