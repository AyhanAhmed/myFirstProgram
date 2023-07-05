import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void listItems(ArrayList<ArrayList<String>> stockAvailability, int countDeliveries, ArrayList<String> productName, ArrayList<String> datesOfExpiry, ArrayList<String> entryDates
            , ArrayList<String> manufacturerName, ArrayList<String> unitOfProduct, ArrayList<String> quantityOfProduct,
                                 ArrayList<String> locationOfProduct, ArrayList<String> maxQquantityOfProduct, ArrayList<String> productComment) {
        System.out.println();
    }

    public static void addNewDilivery(ArrayList<ArrayList<String>> stockAvailability,
                                      ArrayList<String> productName, ArrayList<String> datesOfExpiry, ArrayList<String> entryDates, ArrayList<String> manufacturerName, ArrayList<String> unitOfProduct, ArrayList<String> quantityOfProduct,
                                      ArrayList<String> locationOfProduct, ArrayList<String> maxQquantityOfProduct, ArrayList<String> productComment) {
        System.out.println();
    }

    public static void listDeliveriesForPeriod(ArrayList<ArrayList<String>> stockAvailability, int countDeliveries, ArrayList<String> entryDates) {
        System.out.println();
    }


    public static void main(String[] args) {

        ArrayList<ArrayList<String>> stockAvailability = new ArrayList<>();
        ArrayList<String> productName = new ArrayList<>();
        ArrayList<String> datesOfExpiry = new ArrayList<>();
        ArrayList<String> entryDates = new ArrayList<>();
        ArrayList<String> manufacturerName = new ArrayList<>();
        ArrayList<String> unitOfProduct = new ArrayList<>();
        ArrayList<String> quantityOfProduct = new ArrayList<>();
        ArrayList<String> locationOfProduct = new ArrayList<>();
        ArrayList<String> maxQquantityOfProduct = new ArrayList<>();
        ArrayList<String> productComment = new ArrayList<>();
        int option;
        int countDeliveries = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please choose what to do (1 - List all items; 2 - Add new delivery; " + "3 - List deliveries for time period; " + "0 - exit;)");
            option = input.nextInt();
            switch (option) {
                case 1:
                    Object ArrayList;
                    listItems(stockAvailability, countDeliveries, productName, datesOfExpiry, entryDates,
                            manufacturerName, unitOfProduct, quantityOfProduct, locationOfProduct, maxQquantityOfProduct, productComment);
                    System.out.println();
                    break;
                case 2:
                    addNewDilivery(stockAvailability, productName, datesOfExpiry, entryDates,
                            manufacturerName, unitOfProduct, quantityOfProduct, locationOfProduct, maxQquantityOfProduct, productComment);
                    System.out.println("Product was added successfully!");
                    countDeliveries++;
                    break;
                case 3:
                    listDeliveriesForPeriod(stockAvailability, countDeliveries, entryDates);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (option != 0);
    }
}



