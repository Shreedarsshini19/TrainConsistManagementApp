package org.example;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===\n");

        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized successfully.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        System.out.println("\n--- Adding Passenger Bogies ---");

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        System.out.println("Bogies after addition: " + trainConsist);

        // Remove a bogie
        System.out.println("\n--- Removing AC Chair ---");
        trainConsist.remove("AC Chair");

        System.out.println("Bogies after removal: " + trainConsist);

        // Check existence
        System.out.println("\n--- Checking Bogie Existence ---");
        if (trainConsist.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }

        System.out.println("\nFinal Train Consist: " + trainConsist);

        // ================= UC2 END =================

        System.out.println("\nProgram continues...");
    }
}