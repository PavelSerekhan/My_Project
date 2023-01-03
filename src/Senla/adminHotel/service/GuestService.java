package Senla.adminHotel.service;

import Senla.adminHotel.api.dao.IGuestDao;
import Senla.adminHotel.api.service.IGuestService;
import Senla.adminHotel.model.Guest;
import Senla.adminHotel.util.IdGenerator;

public class GuestService implements IGuestService {

    private final IGuestDao guestDao;

    public GuestService(IGuestDao guestDao) {
        this.guestDao = guestDao;
    }

//    @Override
    public Guest addGuest(String name, Integer age) {
        Guest guest = new Guest(name, age);
        guest.setId(IdGenerator.generateGuestId());
        guestDao.save(guest);
        return guest;
    }
}
