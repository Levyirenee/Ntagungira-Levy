package LemigoHotel;

public class RoomBooking extends HotelService {

    public RoomBooking(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {
        if (stayDays < 1 || stayDays > 30) {
            System.out.println("❌ Stay duration must be between 1 and 30 days.");
        } else if (!roomStatus.equalsIgnoreCase("AVAILABLE")) {
            System.out.println("❌ Room is not available for booking.");
        } else {
            roomStatus = "OCCUPIED";
            System.out.println("✅ Booking confirmed for " + guestName + " (" + roomType + "). Status: " + roomStatus);
        }
    }

    @Override
    public void checkoutGuest() {}

    @Override
    public void generateBill() {}
}
