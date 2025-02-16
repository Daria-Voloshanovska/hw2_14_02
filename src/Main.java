import java.util.List;

public class Main {
    public static void main(String[] args) {

Hotel hotel = Hotel.getInstance();

hotel.addRoom(new Room(101, "Standard",2,100, "Standard single-room accommodation"));
hotel.addRoom(new Room(102, "Studio", 2, 150, "Single-room with a mini-kitchen"));
hotel.addRoom(new Room(103, "Junior Suite", 3, 200, "Enhanced layout room"));
hotel.addRoom(new Room(104, "Suite", 4, 300, "Enhanced layout room with two rooms"));
hotel.addRoom(new Room(105, "De Luxe", 2, 400, "High comfort room"));
hotel.addRoom(new Room(106, "President", 2, 600, "The most luxurious rooms"));


        System.out.println("All rooms in the hotel:");
       for(Room room : hotel.listRooms()){
           System.out.println(String.format(
                   "Room %d: %s, Capacity: %d, Price per night: Euro%.2f, Description: %s",
                   room.getNumber(), room.getRoomType(),room.getCapacity(),room.getBasePrice(),room.getDescription()));

       }
        System.out.println("\nStandard rooms:");
       List<Room> standardRooms = hotel.listRoomsByType("Standard");
       for (Room room : standardRooms){
           System.out.println(String.format( "Room %d: %s, Capacity: %d, Price per night: Euro%.2f, Description: %s",
                   room.getNumber(), room.getRoomType(), room.getCapacity(), room.getBasePrice(), room.getDescription()
           ));
       }
    }
}