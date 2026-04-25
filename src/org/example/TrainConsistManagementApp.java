package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;

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
// ================= UC3 START =================

        System.out.println("\n--- Tracking Unique Bogie IDs ---");

        Set<String> bogieIds = new HashSet<>();

// Adding bogie IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Unique Bogie IDs: " + bogieIds);

        // ================= UC4 START =================

        System.out.println("\n--- Managing Train Order using LinkedList ---");

        LinkedList<String> trainOrder = new LinkedList<>();

// Add bogies
        trainOrder.add("Engine");
        trainOrder.add("Sleeper");
        trainOrder.add("AC");
        trainOrder.add("Cargo");
        trainOrder.add("Guard");

        System.out.println("Initial Train Order: " + trainOrder);

// Insert Pantry Car at position 2
        trainOrder.add(2, "Pantry");

        System.out.println("After adding Pantry at position 2: " + trainOrder);

// Remove first and last
        trainOrder.removeFirst();
        trainOrder.removeLast();

        System.out.println("After removing first and last: " + trainOrder);

// ================= UC4 END =================
    }
}
