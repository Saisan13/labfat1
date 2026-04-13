package com.system;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        List<String> subjects = new ArrayList<>();
        int totalCredits = 0;

        System.out.print("How many subjects? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Subject Name: ");
            subjects.add(sc.nextLine());
            System.out.print("Enter Credit Value: ");
            totalCredits += sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n--- Registration Summary ---");
        System.out.println("Student: " + name + " (ID: " + id + ")");
        System.out.println("Subjects: " + String.join(", ", subjects));
        System.out.println("Total Credits: " + totalCredits);
        
        String status = (totalCredits >= 15) ? "ELIGIBLE" : "NOT ELIGIBLE";
        System.out.println("Status: " + status);
        
        sc.close();
    }
}

