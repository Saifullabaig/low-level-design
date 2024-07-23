public class Room {
    private final String id;
    private final RoomType roomType;
    private final double price;
    private RoomStatus status;

    public Room(String id, RoomType roomType, double price){
        this.id = id;
        this.roomType = roomType;
        this.price = price;
        this.status = RoomStatus.AVAILABLE;
    }

    public synchronized void book(){
        if(status == RoomStatus.AVAILABLE){
            status = RoomStatus.BOOKED;
        }else{
            throw new IllegalStateException("Room is not available to booking.");
        }
    }

    public synchronized void checkIn(){
        if(status == RoomStatus.BOOKED){
            status = RoomStatus.OCCUPIED;
        }else{
            throw new IllegalStateException("Room is not booked.");
        }
    }
    public synchronized void checkOut() {
        if (status == RoomStatus.OCCUPIED) {
            status = RoomStatus.AVAILABLE;
        } else {
            throw new IllegalStateException("Room is not occupied.");
        }
    }

    public String getId() {
        return id;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public RoomStatus getStatus() {
        return status;
    }


}
