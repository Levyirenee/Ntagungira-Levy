package LemigoHotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("🏨 Welcome to LEMIGO HOTEL Management System");

        System.out.print("Enter Guest ID: ");
        String guestId = scanner.nextLine();

        System.out.print("Enter Guest Name: ");
        String guestName = scanner.nextLine();

        System.out.print("Enter Room Type (STANDARD/DELUXE/SUITE): ");
        String roomType = scanner.nextLine();

        System.out.print("Enter Number of Stay Days: ");
        int stayDays = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String initialRoomStatus = "AVAILABLE";

        RoomBooking booking = new RoomBooking(guestId, guestName, roomType, stayDays, initialRoomStatus);
        booking.bookRoom();

        GuestCheckout checkout = new GuestCheckout(guestId, guestName, roomType, stayDays, "OCCUPIED");
        checkout.checkoutGuest();

        Billing bill = new Billing(guestId, guestName, roomType, stayDays, "AVAILABLE");
        bill.generateBill();

        scanner.close();
    }
}
