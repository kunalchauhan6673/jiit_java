import java.util.Scanner;


class ProductNotFoundException extends Exception {
    ProductNotFoundException(String msg) { super(msg); }
}

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String msg) { super(msg); }
}

class InvalidPriceException extends Exception {
    InvalidPriceException(String msg) { super(msg); }
}


class Product {
    String name;
    int quantity;
    double price;

    Product(String name, int quantity, double price) throws InvalidPriceException {
        if (price <= 0)
            throw new InvalidPriceException("Price must be above zero!");

        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}


class Inventory {
    Product[] products = new Product[10]; 
    int count = 0;


    void addProduct(String name, int qty, double price) throws InvalidPriceException {
        products[count] = new Product(name, qty, price);
        count++;
        System.out.println("Product added successfully!\n");
    }


    void updateQuantity(String name, int newQty)
            throws ProductNotFoundException, InvalidQuantityException {

        if (newQty < 0)
            throw new InvalidQuantityException("Quantity cannot be negative!");

        for (int i = 0; i < count; i++) {
            if (products[i].name.equalsIgnoreCase(name)) {
                products[i].quantity = newQty;
                System.out.println("Quantity updated!\n");
                return;
            }
        }

        throw new ProductNotFoundException("Product not found!");
    }

   
    void displayProducts() {
        System.out.println("\n--- Inventory List ---");
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].name +
                    " | Qty: " + products[i].quantity +
                    " | Price: " + products[i].price);
        }
        System.out.println();
    }

    
    double totalValue() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].quantity * products[i].price;
        }
        return total;
    }
}

public class CustomExcep03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inv = new Inventory();

        try {
            // first product
            System.out.print("Enter product name: ");
            String name = sc.nextLine();
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            inv.addProduct(name, qty, price);
            sc.nextLine(); 
    
            // second product
            System.out.print("Enter product name: ");
            String name2 = sc.nextLine();
            System.out.print("Enter quantity: ");
            int qty2 = sc.nextInt();
            System.out.print("Enter price: ");
            double price2 = sc.nextDouble();

            inv.addProduct(name2, qty2, price2);
            sc.nextLine(); 

            // details of both
            System.out.println("The Details of the inventory before any updation: ");
            inv.displayProducts();
            
            System.out.print("Enter name of product to update: ");
            String updateName = sc.nextLine();
            System.out.print("Enter new quantity: ");
            int newQty = sc.nextInt();

            inv.updateQuantity(updateName, newQty);
            System.out.println("The Details of the inventory after updation: ");
            inv.displayProducts();

            System.out.println("Total Inventory Value: " + inv.totalValue());
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }

        sc.close();
    }
}
