package workshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>() ; 
        Scanner input = new Scanner(System.in); 

        System.out.println("Welcome to your shopping cart");

        while (true) {
            System.out.println("");
            System.out.println("Select action: ");
            System.out.println("1. View cart list");
            System.out.println("2. Add item");
            System.out.println("3. Remove item");
            System.out.println("4. Exit shopping list");
            System.out.print("> ");

            switch (input.nextInt()) { 
                case 1: 
                    if(list.isEmpty()) {
                        System.out.println("Your cart is empty");
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println((i+1) + ") " + list.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.print("> ");
                    String[] itemArray = input.next().split(",");
                    for (String item : itemArray) {
                        if(!list.contains(item)) {
                            list.add(item);
                            System.out.println(item + " added to cart");
                        } else {
                            System.out.println(item + " already added to cart");
                        }
                    }
                    break;
                case 3:
                    System.out.print("> ");
                    int option = input.nextInt(); 
                    if(list.isEmpty()) {
                        System.out.println("Nothing to remove, your cart is empty");
                    } else if(option <= list.size()) {
                        System.out.println(list.get(option - 1) + " has been removed from the cart");
                        list.remove(option - 1);
                    } else {
                        System.out.println("You have entered an invalid number");
                    }
                    break;
                case 4:
                    System.out.println("Adios, hasta luego~"); 
                    return; 
                default:
                    System.out.println("You have entered an invalid number");
            }  
        }
    }
}
