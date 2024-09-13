package HotelController;

//RoomController.java (Business Logic Layer)
import java.util.List;

import HotelDAO.RoomDao;
import Model.Room;

public class RoomController {
 private RoomDao roomDAO;

 public RoomController() {
     this.roomDAO = new RoomDao();
 }

 public List<Room> getAllRooms() {
     return roomDAO.getAllRooms();
 }

 public void addRoom(Room room) {
     roomDAO.addRoom(room);
 }

 public void updateRoom(Room room) {
     roomDAO.updateRoom(room);
 }

 public void deleteRoom(int roomId) {
     roomDAO.deleteRoom(roomId);
 }
}
