package Tutorial12;

import java.util.Scanner;

// Custom exception for invalid reservations
class InvalidReservationException extends Exception {

    public InvalidReservationException(String message) {
        super(message);
    }
}

// HotelRoom class to manage reservations
class HotelRoom {

    public void reserveSlots(int slots)
            throws InvalidReservationException {

        if (slots <= 0) {
            throw new InvalidReservationException(
                    "Invalid reservation! Slots must be greater than 0."
            );
        }

        System.out.println(
                "Successfully reserved " + slots + " room(s)."
        );
    }
}

// Main class
public class hotelRoom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HotelRoom room = new HotelRoom();

        System.out.print("Enter the number of rooms to reserve: ");
        int slots = sc.nextInt();

        try {
            room.reserveSlots(slots);
        } catch (InvalidReservationException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}