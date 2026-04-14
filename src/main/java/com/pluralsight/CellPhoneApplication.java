package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone myPhone = new CellPhone();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the serial number: ");
        int serial = scanner.nextInt();

        myPhone.setSerialNumber(serial);
        //myPhone stringBuilder construction

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Serial Number: ").append(myPhone.getSerialNumber());

        //final stringBuilder completion


        System.out.println(stringBuilder);

    }
}
