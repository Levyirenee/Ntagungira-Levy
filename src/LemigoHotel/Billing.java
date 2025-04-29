package LemigoHotel;

public class Billing extends HotelService {

    public Billing(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void generateBill() {
        int costPerNight;
        switch (roomType.toUpperCase()) {
            case "STANDARD":
                costPerNight = 50000;
                break;
            case "DELUXE":
                costPerNight = 80000;
                break;
            case "SUITE":
                costPerNight = 120000;
                break;
            default:
                System.out.println("❌ Invalid room type.");
                return;
        }

        int totalCost = costPerNight * stayDays;
        System.out.println("📋 Billing Information");
        System.out.println("----------------------");
        System.out.println("Guest ID     : " + guestId);
        System.out.println("Guest Name   : " + guestName);
        System.out.println("Room Type    : " + roomType);
        System.out.println("Days Stayed  : " + stayDays);
        System.out.printf("Total Cost   : %,d RWF%n", totalCost);
    }

    @Override
    public void bookRoom() {}

    @Override
    public void checkoutGuest() {}
}
