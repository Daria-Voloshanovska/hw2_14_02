public class Room {
    private int number;
    private String roomType;
    private int capacity;
    private double basePrice;
    private String description;

    public Room(int number, String roomType, int capacity, double basePrice, String description) {
        this.number = number;
        this.roomType = roomType;
        this.capacity = capacity;
        this.basePrice = basePrice;
        this.description = description;
    }

    public int getNumber() {
        return number;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("Room %d: %s, Capacity: %d, Price per night: Euro %.2f, Description: %s",
                number, roomType,capacity,basePrice,description);
    }
}
