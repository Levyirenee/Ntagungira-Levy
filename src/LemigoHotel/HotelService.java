package LemigoHotel;

public abstract class HotelService {
    protected String guestId;
    protected String guestName;
    protected String roomType;
    protected int stayDays;
    protected String roomStatus;

    public HotelService(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.roomType = roomType;
        this.stayDays = stayDays;
        this.roomStatus = roomStatus;
    }

    public abstract void bookRoom();
    public abstract void checkoutGuest();
    public abstract void generateBill();
}
