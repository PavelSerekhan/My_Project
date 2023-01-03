package Senla.adminHotel.dao;

import Senla.adminHotel.api.dao.GenericDao;
import Senla.adminHotel.model.AEntity;
import Senla.adminHotel.model.Guest;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDao<T extends AEntity> implements GenericDao<T> {

    private List<T> repository = new ArrayList<>();

    @Override
    public void save(T entity) {
        repository.add(entity);
    }

    @Override
    public T getById(long id) {
//        for (T entity : repository) {
//            if (id.equals(entity.getId())) {
//                return entity;
//            }
//        }
        return null;
    }

    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public T update(T entity) {
        return null;
    }
}
