package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();

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


        myPhone.setSerialNumber(serial);
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNumber(phoneNumber);
        myPhone.setOwner(owner);


        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println(("Carrier: ") + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());


    }
}
