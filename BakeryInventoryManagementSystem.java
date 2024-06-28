package Lab3;
import java.util.Scanner;
import java.util.ArrayList;

class Item {
    private String name;
    private String description;
    private int quantity;
    private double price;

    public Item(String name, String description, int quantity, double price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(Item item) {
        items.remove(item);
    }

    public void updateItem(Item item, int quantity, double price) {
        item.setQuantity(quantity);
        item.setPrice(price);
    }

    public ArrayList<Item> searchItems(String keyword) {
        ArrayList<Item> searchResults = new ArrayList<Item>();
        for (Item item : items) {
            if (item.getName().contains(keyword) || item.getDescription().contains(keyword)) {
                searchResults.add(item);
            }
        }
        return searchResults;
    }

    public void checkStock() {
        for (Item item : items) {
            if (item.getQuantity() == 0) {
                System.out.println("Low stock alert: " + item.getName());
            }
        }
    }

    public void displayItems() {
        for (Item item : items) {//include index number in the display function
            System.out.println("Item: " + (items.indexOf(item) + 1));
            System.out.println("Name: " + item.getName());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("Price: " + item.getPrice());
            System.out.println();
        }
    }
}

public class BakeryInventoryManagementSystem {
    public static void main(String[] args) {
           
        
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
//write unittest case to ensure add and delete functionality meets the acceptance criteria
        // Test add item
        inventory.addItem(new Item("Croissant", "Flaky pastry", 20, 2.5));
        inventory.addItem(new Item("Baguette", "Long bread", 15, 3.0));
        inventory.addItem(new Item("Eclair", "Chocolate pastry", 10, 4.0));
        inventory.addItem(new Item("Chocolate Cake", "Rich and decadent chocolate cake",6, 30));
        inventory.addItem(new Item("Tres Leches Cake", "Traditional Latin American sponge Cake",4, 35));
        inventory.addItem(new Item("Vanilla Cake", "Classic vanilla sponge cake", 8, 20));
        // Test delete item
        inventory.deleteItem(inventory.searchItems("Croissant").get(0));
        inventory.deleteItem(inventory.searchItems("Eclair").get(0));
        while (true) {
            
            System.out.println("1. Add Item");
            System.out.println("2. Delete Item");
            System.out.println("3. Update Item");
            System.out.println("4. Search Items");
            System.out.println("5. Check Stock");
            System.out.println("6. Display Items");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
                

            switch (choice) {
                case 1:
                
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble(); 
                    // pop up the error message if any of the input is missing
                    if (name.isEmpty() || description.isEmpty()) {
                        System.out.println("Item name and description cannot be empty.");
                        break;
                    } else if (quantity <= 0 || price <= 0) {
                        System.out.println("Quantity and price must be greater than 0.");
                        break;
           
                 }
                    // insert item into
                    Item newItem = new Item(name, description, quantity, price);
                    inventory.addItem(newItem); 
                    System.out.println("Item added successfully!");
                    break;
                case 2:
                //rewrite the code to prompt before deletion
                    inventory.displayItems();
                    System.out.print("Enter item index to delete: ");
                    int index = scanner.nextInt();
                    //prompt before deleting
                    System.out.println("Are you sure you want to delete this item? (Yes/No): ");
                    String confirm = scanner.next();
                    if (!confirm.toLowerCase().equals("yes")) {
                        System.out.println("Item deletion cancelled.");
                        break;
                    }

                    inventory.deleteItem(inventory.searchItems("").get(index - 1));
                    System.out.println("Item deleted successfully!");
                    
                    break;
                case 3:
                    inventory.displayItems();
                    System.out.print("Enter item index to update: ");
                    index = scanner.nextInt();
                    System.out.print("Enter new quantity: ");
                    quantity = scanner.nextInt();
                    System.out.print("Enter new price: ");
                    price = scanner.nextDouble();
                    inventory.updateItem(inventory.searchItems("").get(index - 1), quantity, price);
                    System.out.println("Item updated successfully!");
                    break;
                case 4:
                // Implement search functionality for items based on their attributes (e.g., name, description)
                //display name, description price and quantity of the searched item
                  
                    System.out.print("Enter search keyword: ");
                    String keyword = scanner.nextLine();
                    ArrayList<Item> searchResults = inventory.searchItems(keyword);// search based on name 
                    if (searchResults.isEmpty
                    ()) {
                        System.out.println("No matching items found.");
                    } else {
                        for (int i = 0; i < searchResults.size(); i++) {
                             System.out.println((i + 1) + ". " + searchResults.get(i).getName());
                        }
                    }
                    break;
                case 5:
                    inventory.checkStock();
                    break;
                case 6:
                    inventory.displayItems();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
        
    }
        }
    }
}

