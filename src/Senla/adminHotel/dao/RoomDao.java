package Senla.adminHotel.dao;

import Senla.adminHotel.api.dao.IRoomDao;
import Senla.adminHotel.model.Room;
import Senla.adminHotel.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class RoomDao implements IRoomDao {

    private List<Room> rooms = new ArrayList<>();

    @Override
    public void save(Room entity) {
        entity.setId(IdGenerator.generateRoomId());
        rooms.add(entity);
    }

    @Override
    public Room getById(long id) {
        return null;
    }

    @Override
    public List<Room> getAll() {
        return null;
    }

    @Override
    public void delete(Room entity) {

    }

    @Override
    public Room update(Room entity) {
        return null;
    }
}
