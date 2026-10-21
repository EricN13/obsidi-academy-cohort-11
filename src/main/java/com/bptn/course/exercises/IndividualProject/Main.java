package com.bptn.course.exercises.IndividualProject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TravelService service = new TravelService();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("================================");
        System.out.println("     AIRPORT TRAVEL ASSISTANT   ");
        System.out.println("================================");

        // entering traveler information
        System.out.println("\n--- Traveler Information ---");

        String name;
        do {
            System.out.print("Full name: ");
            name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty.");
            }
        } while (name.isEmpty());

        int age;
        while (true) {
            try {
                System.out.print("Age: ");
                age = Integer.parseInt(scanner.nextLine().trim());

                if (age <=18) {
                    System.out.println("A traveler should be at least 18 years old. Enter a valid age.");
                    continue;
                }
                break;

            } catch (NumberFormatException e) {
                System.out.println("Age must be a number.");
            }
        }

        String nationality;
        do {
            System.out.print("Nationality: ");
            nationality = scanner.nextLine().trim();

            if (nationality.isEmpty()) {
                System.out.println("Nationality cannot be empty.");
            }
        } while (nationality.isEmpty());

        // flight information
        System.out.println("\n--- Flight Information ---");

        boolean international;

        while (true) {
            System.out.print(
                    "Flight type (1 = Domestic, 2 = International): ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                international = false;
                break;
            } else if (choice.equals("2")) {
                international = true;
                break;
            } else {
                System.out.println("Please enter 1 or 2.");
            }
        }

        // creating a traveler
        Traveler traveler;

        if (international) {
            String passport;

            do {
                System.out.print("Passport number: ");
                passport = scanner.nextLine().trim();

                if (passport.isEmpty()) {
                    System.out.println(
                            "Passport number cannot be empty.");
                }
            } while (passport.isEmpty());

            traveler = new InternationalTraveler(
                    name, age, nationality, passport);

        } else {
            traveler = new DomesticTraveler(
                    name, age, nationality);
        }

        // trip information
        String departure;

        do {
            System.out.print("Departure airport: ");
            departure = scanner.nextLine().trim();
        } while (departure.isEmpty());

        String destination;

        while (true) {
            System.out.print("Destination airport: ");
            destination = scanner.nextLine().trim();

            if (destination.isEmpty()) {
                System.out.println(
                        "Destination cannot be empty.");
            } else if (destination.equalsIgnoreCase(departure)) {
                System.out.println(
                        "Destination must differ from departure.");
            } else {
                break;
            }
        }

        LocalDateTime flightTime;

        while (true) {
            try {
                System.out.print(
                        "Flight date and time (yyyy-MM-dd HH:mm): ");

                flightTime = LocalDateTime.parse(
                        scanner.nextLine().trim(), formatter);

                if (!flightTime.isAfter(LocalDateTime.now())) {
                    System.out.println(
                            "Flight time must be in the future.");
                    continue;
                }

                break;

            } catch (Exception e) {
                System.out.println(
                        "Invalid date. Example: 2027-05-10 20:00");
            }
        }

        boolean checkedBaggage;

        while (true) {
            System.out.print("Checked baggage? (yes/no): ");
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase("yes")) {
                checkedBaggage = true;
                break;
            } else if (answer.equalsIgnoreCase("no")) {
                checkedBaggage = false;
                break;
            } else {
                System.out.println("Please enter yes or no.");
            }
        }

        // creating a trip
        Trip trip = new Trip(
                traveler,
                departure,
                destination,
                flightTime,
                checkedBaggage
        );

        // displaying trip summary
        System.out.println("\n================================");
        System.out.println("          TRIP SUMMARY          ");
        System.out.println("================================");

        System.out.println("Traveler: " + traveler.getFullName());
        System.out.println("Age: " + traveler.getAge());
        System.out.println("Nationality: " + traveler.getNationality());

        System.out.println("Flight type: " +
                (international ? "International" : "Domestic"));

        System.out.println("Departure airport: " +
                trip.getDepartureAirport());

        System.out.println("Destination airport: " +
                trip.getDestinationAirport());

        System.out.println("Flight departure: " +
                trip.getFlightTime().format(formatter));

        System.out.println("Recommended airport arrival: " +
                service.calculateArrival(trip).format(formatter));

        // 7. Display checklist
        System.out.println("\n--- Travel Checklist ---");

        for (String item : service.makeChecklist(trip)) {
            System.out.println("[ ] " + item);
        }

        System.out.println("\n------ Have a safe flight! ------");

        scanner.close();
    }
}

