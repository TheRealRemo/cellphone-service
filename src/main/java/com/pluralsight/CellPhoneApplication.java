package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();

        System.out.println("CellPhone 1:");
        System.out.print("Please enter the serial number: ");
        int serial = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the model: ");
        String model = scanner.nextLine();
        System.out.print("Please enter the carrier: ");
        String carrier = scanner.nextLine();
        System.out.print("Please enter the phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Please enter the owner's name: ");
        String owner = scanner.nextLine();

        cellPhone1.setSerialNumber(serial);
        cellPhone1.setModel(model);
        cellPhone1.setCarrier(carrier);
        cellPhone1.setPhoneNumber(phoneNumber);
        cellPhone1.setOwner(owner);

        System.out.println("CellPhone 2:");
        CellPhone cellPhone2 = new CellPhone();

        System.out.print("Please enter the serial number: ");
        int serial2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the model: ");
        String model2 = scanner.nextLine();
        System.out.print("Please enter the carrier: ");
        String carrier2 = scanner.nextLine();
        System.out.print("Please enter the phone number: ");
        String phoneNumber2 = scanner.nextLine();
        System.out.print("Please enter the owner's name: ");
        String owner2 = scanner.nextLine();
        cellPhone2.setSerialNumber(serial2);
        cellPhone2.setModel(model2);
        cellPhone2.setCarrier(carrier2);
        cellPhone2.setPhoneNumber(phoneNumber2);
        cellPhone2.setOwner(owner2);


        System.out.println("Serial Number: " + cellPhone1.getSerialNumber());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println(("Carrier: ") + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());


        System.out.println("\n\nSerial Number: " + cellPhone2.getSerialNumber());
        System.out.println("Model: " + cellPhone2.getModel());
        System.out.println(("Carrier: ") + cellPhone2.getCarrier());
        System.out.println("Phone Number: " + cellPhone2.getPhoneNumber());
        System.out.println("Owner: " + cellPhone2.getOwner() + "\n\n");
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        scanner.close();



    }
}
