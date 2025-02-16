import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private static Hotel instance;
   private List<Room> rooms;


   private Hotel(){
       rooms = new ArrayList<>();
   }
   public static Hotel getInstance(){
       if (instance == null){
           instance = new Hotel();
       }
       return instance;
   }

   public void addRoom(Room room) {
       rooms.add(room);
   }

       public List<Room> listRooms() {
           return rooms;
       }


   public List<Room> listRoomsByType(String roomType){
       List<Room> result = new ArrayList<>();
       for (Room room : rooms){
           if (room.getRoomType().equalsIgnoreCase(roomType)){
               result.add(room);
           }
       }
       return  result;
   }

   @Override
    public String toString(){
       String result ="";
       for (Room room : rooms){
           result +=String.format("%s\n",room);
       }
       return result;
   }
}
