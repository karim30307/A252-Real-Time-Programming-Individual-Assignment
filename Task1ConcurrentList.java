

import java.util.concurrent.CopyOnWriteArrayList;
public class Task1ConcurrentList {

    public static void main(String[] args) {

        System.out.println("          TASK 1: CONCURRENT LIST                 ");


        // 1. Initialize CopyOnWriteArrayList
        CopyOnWriteArrayList<String> registrationList = new CopyOnWriteArrayList<>();

        // 2. Add at least 50 course registration records
        for (int i = 1; i <= 55; i++) {
            registrationList.add("Student_" + String.format("%03d", i) + " signed up for STIW3014");
        }

        // 3. Display all registration records
        System.out.println("--- All Registration Records ---");
        for (String record : registrationList) {
            System.out.println(record);
        }

        // 4. Display the total number of registration requests
        System.out.println("\nTotal Registration Requests (size()): " + registrationList.size());

        // 5. Check whether a specific course exists in the list
        String searchRecord = "Student_025 signed up for STIW3014";
        boolean exists = registrationList.contains(searchRecord);
        System.out.println("Does record for Student_025 exist? " + exists);

        // 6. Retrieve and display the registration record at index position 10
        if (registrationList.size() > 10) {
            System.out.println("Record at index position 10: " + registrationList.get(10));
        }
    }
}
