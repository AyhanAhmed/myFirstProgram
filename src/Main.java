import java.util.ArrayList;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    public static ArrayList<String> addProductName(ArrayList<String> productName) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of product: ");
        String name = input.nextLine();
        if (productName.contains(name)) {
            System.out.println("Existing product name.");
        } else {
            System.out.println("New product name.");
            productName.add(name);
        }
        return productName;

    }

    public static ArrayList<String> addDateOfExpiry(ArrayList<String> datesOfExpiry) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        Date expirationDate = null;
        boolean validFormat = false;
        do {
            System.out.println("Enter the expiry date of product (dd-MM-yyyy): ");
            String inputDateOfExpiry = input.nextLine();
            try {
                expirationDate = dateFormat.parse(inputDateOfExpiry);
                validFormat = true;
            } catch (ParseException e) {
                System.out.println("Invalid date format.");
            }
        } while (!validFormat);
        datesOfExpiry.add(String.valueOf(String.format("%tD", expirationDate)));
        return datesOfExpiry;
    }

    public static ArrayList<String> addEntryDates(ArrayList<String> entryDates) {
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        boolean validFormat = false;
        Date entryDate = null;
        validFormat = false;
        do {
            System.out.println("Enter the date of dilivery of product (dd-MM-yyyy): ");
            String inputEntryDate = input.nextLine();
            try {
                entryDate = dateFormat.parse(inputEntryDate);
                validFormat = true;
            } catch (ParseException e) {
                System.out.println("Invalid date format.");
            }
        } while (!validFormat);
        entryDates.add(String.format("%tD", entryDate));
        return entryDates;
    }
    public static ArrayList<String> addManufacturerName(ArrayList<String> manufacturerName) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of manufacturer of the product: ");
        String manufacturer = input.nextLine();
        manufacturerName.add(manufacturer);
        return manufacturerName;
    }

    public static ArrayList<String> addUnitOfProduct(ArrayList<String> unitOfProduct) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the units of the product (kilograms, liters, pieces etc.: ");
        String unit = input.nextLine();
        unitOfProduct.add(unit);
        return unitOfProduct;
    }

    public static ArrayList<String> addQuantityOfProduct(ArrayList<String> quantityOfProduct) {
        Scanner input = new Scanner(System.in);
        double quantity = 0;
        boolean checkNumber = false;
        do {
            System.out.println("Enter the quantity of the product: ");
            try {
                quantity = input.nextDouble();
                if (quantity > 0) {
                    checkNumber = true;
                    break;
                } else {
                    System.out.println("Invalid number.");
                }
            } catch (Exception e) {
                System.out.println("Invalid number.");
            }
        } while (!checkNumber);

        quantityOfProduct.add(String.valueOf(quantity));
        return quantityOfProduct;
    }


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



