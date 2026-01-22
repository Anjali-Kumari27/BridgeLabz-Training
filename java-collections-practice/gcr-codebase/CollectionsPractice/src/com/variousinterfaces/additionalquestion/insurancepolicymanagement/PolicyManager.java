package com.variousinterfaces.additionalquestion.insurancepolicymanagement;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    // SETS
    Set<Integer> hashSet = new HashSet<>();
    Set<Integer> linkedHashSet = new LinkedHashSet<>();
    Set<Integer> treeSet = new TreeSet<>();

    // MAPS
    Map<Integer, Policy> hashMap = new HashMap<>();
    Map<Integer, Policy> linkedHashMap = new LinkedHashMap<>();
    TreeMap<LocalDate, Policy> treeMap = new TreeMap<>();

    // Add policy to all collections
    void addPolicy(Policy p) {

        hashSet.add(p.policyNumber);
        linkedHashSet.add(p.policyNumber);
        treeSet.add(p.policyNumber);

        hashMap.put(p.policyNumber, p);
        linkedHashMap.put(p.policyNumber, p);
        treeMap.put(p.expiryDate, p);
    }

    // Retrieve policy by policy number
    void getPolicyByNumber(int number) {
        Policy p = hashMap.get(number);

        if (p != null)
            System.out.println(p);
        else
            System.out.println("Policy not found");
    }

    // Policies expiring within 30 days
    void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();

        for (Policy p : hashMap.values()) {
            if (p.expiryDate.isBefore(today.plusDays(30))) {
                System.out.println(p);
            }
        }
    }

    // Policies of a specific policyholder
    void policiesByHolder(String name) {
        for (Policy p : hashMap.values()) {
            if (p.holderName.equalsIgnoreCase(name)) {
                System.out.println(p);
            }
        }
    }

    // Remove expired policies
    void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<Integer, Policy>> it =
                hashMap.entrySet().iterator();

        while (it.hasNext()) {
            Policy p = it.next().getValue();

            if (p.expiryDate.isBefore(today)) {
                it.remove();
            }
        }
    }

    // Display policies in insertion order
    void showInsertionOrder() {
        for (Policy p : linkedHashMap.values()) {
            System.out.println(p);
        }
    }

    // Display policies sorted by expiry date
    void showSortedByExpiry() {
        for (Policy p : treeMap.values()) {
            System.out.println(p);
        }
    }
}
