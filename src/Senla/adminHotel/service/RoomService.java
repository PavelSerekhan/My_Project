package Senla.adminHotel.service;

import Senla.adminHotel.api.dao.IGuestDao;
import Senla.adminHotel.api.dao.IRoomDao;
import Senla.adminHotel.api.service.IRoomService;
import Senla.adminHotel.model.Guest;
import Senla.adminHotel.model.Room;

public class RoomService implements IRoomService {
    private final IRoomDao roomDao;
    private final IGuestDao guestDao;

    public RoomService(IRoomDao roomDao, IGuestDao guestDao) {
        this.roomDao = roomDao;
        this.guestDao = guestDao;
    }
//    @Override
    public void checkIn(Long guestId, Long roomId){
//        Room room = roomDao.getById(roomId);
        Guest guest = guestDao.getById(guestId);
//        room.getGuests().add(guest);
    }
}
