package LemigoHotel;

public class GuestCheckout extends HotelService {

    public GuestCheckout(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void checkoutGuest() {
        if (roomStatus.equalsIgnoreCase("OCCUPIED")) {
            roomStatus = "AVAILABLE";
            System.out.println("✅ " + guestName + " has checked out. Room is now " + roomStatus);
        } else {
            System.out.println("❌ Cannot checkout. Room is already available.");
        }
    }

    @Override
    public void bookRoom() {}

    @Override
    public void generateBill() {}
}
