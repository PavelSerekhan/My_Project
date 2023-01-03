package Senla.adminHotel.api.dao;

import Senla.adminHotel.model.AEntity;
import Senla.adminHotel.model.Guest;

import java.util.ArrayList;
import java.util.List;

public interface GenericDao<T extends AEntity> {
    // ограничение работать только с (extends AEntity) базовой сущностью

//    private
    List<Guest> guests = new ArrayList<>();

    void save(T entity);

    T getById(long id);

    List<T> getAll();

    void delete(T entity);

    T update(T entity);
}
