package com.pluralsight;

public class Main {

    private static Vehicle[] inventory = new Vehicle[20]; //addresses 0 through 19
    private static int quantityOfVehicles;
    public static void main(String[] args) {




        inventory[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        inventory[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        inventory[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        inventory[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        inventory[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        inventory[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        inventory[6] = new Vehicle(101127, "Nissan Altima", "Gray", 82000, 6800);
        inventory[7] = new Vehicle(101128, "Hyundai Sonata", "Silver", 40000, 12500);
        inventory[8] = new Vehicle(101129, "Kia Sportage", "White", 35000, 14900);
        quantityOfVehicles = 9;

        int command;

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("  1 - List all vehicles");
            System.out.println("  2 - Search by make/model");
            System.out.println("  3 - Search by price range");
            System.out.println("  4 - Search by color");
            System.out.println("  5 - Add a vehicle");
            System.out.println("  6 - Quit");
            System.out.print("Enter your command: ");

            command = ConsoleHelper.promptForInt("Enter your command");
            switch (command) {
                case 1:
                    listAllVehicle();
                    break;
                case 2:
                    findVehiclesByMakeModel();
                    break;
                case 3:
                    findVehiclesByPrice();
                    break;
                case 4:
                    findVehiclesByColor();
                    break;
                case 5:
                    addAVehicle();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("INVALID COMMAND!! Please select a valid option.");
                    break;

            }
        }
    }
    private static void displayVehicle(Vehicle v){
        System.out.print(v.getVehicleId() + " ");
        System.out.println(v.getColor() + " " + v.getMakeModel());
    }

    private static void listAllVehicle() {
        System.out.println("Listing out vehicles....");
        for(Vehicle v : inventory){
            if(v == null){
                continue;
            }
           displayVehicle(v);
        }
    }

    private static void findVehiclesByPrice() {
        float minPrice = ConsoleHelper.promptForFloat("Please enter the min price");
        float maxPrice = ConsoleHelper.promptForFloat("Please enter the max price");
        for(Vehicle v : inventory){
            if(v == null){
                continue;
            }
            if(v.getPrice()>= minPrice && v.getPrice()<= maxPrice){
                displayVehicle(v);
            }

        }
    }

    private static void findVehiclesByColor() {
        String color = ConsoleHelper.promptForString("Please enter the color");
        for (Vehicle v : inventory) {
            if (v == null) {
                continue;
            }
            if(v.getColor().toLowerCase().contains(color.toLowerCase())){
                displayVehicle(v);

            }
        }
    }


    private static void findVehiclesByMakeModel() {
        String makeModelToSearchFor = ConsoleHelper.promptForString("Please enter a make/model to search for");

        for(Vehicle v : inventory){
            if(v == null){
                continue;
            }
            if(v.getMakeModel().toLowerCase().contains(makeModelToSearchFor.toLowerCase())) {
                displayVehicle(v);
            }
        }
    }



    private static void addAVehicle() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter the price: ");
//        float price = scanner.nextFloat();
//        scanner.nextLine();
        long vehicleId = ConsoleHelper.promptForLong("What is the vehicle ID");
        String makeModel = ConsoleHelper.promptForString("Please enter the make/mode");
        String color = ConsoleHelper.promptForString("Please enter the color");
        int odometerReading = ConsoleHelper.promptForInt("Please enter the mileage");
        float price = ConsoleHelper.promptForFloat("What is the cost of the vehicle");



        //Vehicle newVehicle = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
        //inventory[quantityOfVehicles] = newVehicle;

        inventory[quantityOfVehicles] = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
        quantityOfVehicles++;







    }
}