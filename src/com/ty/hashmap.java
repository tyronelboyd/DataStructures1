package com.ty;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        HashMap <String, String> vehicles = new HashMap();
        vehicles.put("Mustang","Ford");
        vehicles.put("Accord", "Honda");
        vehicles.put("Camry", "Toyota");
        vehicles.put("Camaro", "Chevorlet");

        System.out.println(vehicles);

        Scanner ask = new Scanner(System.in);
        System.out.println("Hello what car model are you looking for today?");
        String answer = ask.nextLine();
        if(vehicles.containsKey(answer)) {
            System.out.println("Well, you're in luck the " + vehicles.get(answer) + " collection is right over there!");
        }
        else {
            System.out.println("Sorry we currently don't have that vehicle in stock.");

        }
    }
}
