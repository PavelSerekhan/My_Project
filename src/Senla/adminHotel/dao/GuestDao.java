package Senla.adminHotel.dao;

import Senla.adminHotel.api.dao.IGuestDao;
import Senla.adminHotel.model.Guest;

import java.util.ArrayList;
import java.util.List;

public class GuestDao extends AbstractDao<Guest> implements IGuestDao {

//    private List<Guest> guest = new ArrayList<>();
//
//    @Override
//    public void save(Guest entity) {
//    entity.setId(IdGeneretor.generateGuestId());
//    }
//
//    @Override
//    public Guest getById(long id) {
//        return guests.stream()
//                .filter(x -> id.equals(x.getId()))
//                .findFirt()
//                .orElse(null);
//    }
//
//    @Override
//    public List<Guest> getAll() {
//        return new ArrayList<>(guests);
//    }
//
//    @Override
//    public void delete(Guest entity) {
//    guests.remove(entity);
//    }
//
//    @Override
//    public Guest update(Guest entity) {
//        Guest guest = getById(entity.getId());
//        guest.setName(entity.getName());
//        guest.setAge(entity.getAge());
//        return guest;
}

