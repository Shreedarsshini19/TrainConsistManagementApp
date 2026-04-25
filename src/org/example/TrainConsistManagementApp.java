package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;
import java.util.stream.Collectors;

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
        // ================= UC5 START =================

        System.out.println("\n--- Train Formation using LinkedHashSet ---");

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

// Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

// Attempt duplicate
        trainFormation.add("Sleeper"); // duplicate

        System.out.println("Final Train Formation (No duplicates, ordered): " + trainFormation);

// ================= UC5 END =================
        // ================= UC6 START =================

        System.out.println("\n--- Bogie Capacity Mapping using HashMap ---");

        HashMap<String, Integer> bogieCapacity = new HashMap<>();

// Add bogie capacities
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

// Display using entrySet
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }
// ================= UC7 START =================

        System.out.println("\n--- Sorting Bogies by Capacity ---");

        List<Bogie> bogieList = new ArrayList<>();

// Add bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 40));

// Sort using Comparator (ascending)
        bogieList.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("Sorted Bogies (by capacity):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }
        // ================= UC8 START =================

        System.out.println("\n--- Filtering Bogies (Capacity > 60) ---");

// Reuse bogieList from UC7

        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.getCapacity() > 60)
                .toList();   // Java 16+ (if error, I’ll fix below 👇)

        System.out.println("Filtered Bogies:");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

// ================= UC8 END =================
        // ================= UC9 START =================

        System.out.println("\n--- Grouping Bogies by Type ---");

// Reuse bogieList from UC7

        Map<String, List<Bogie>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        System.out.println("Grouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

// ================= UC9 END =================
    }
}
