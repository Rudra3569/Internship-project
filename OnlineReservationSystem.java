import java.util.Scanner;

public class OnlineReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] reservations = new String[5]; // Assuming 5 available slots

        System.out.println("Welcome to the Online Reservation System!");

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Make a reservation");
            System.out.println("2. View reservations");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    makeReservation(reservations);
                    break;
                case 2:
                    viewReservations(reservations);
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void makeReservation(String[] reservations) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name for the reservation:");
        String name = scanner.nextLine();

        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] == null) {
                reservations[i] = name;
                System.out.println("Reservation made for " + name);
                return;
            }
        }

        System.out.println("Sorry, all slots are full. Please try again later.");
    }

    public static void viewReservations(String[] reservations) {
        System.out.println("Current Reservations:");
        for (String reservation : reservations) {
            if (reservation != null) {
                System.out.println(reservation);
            }
        }
    }
}