package Senla.adminHotel.dao;

import Senla.adminHotel.api.dao.IMaintenanceDao;
import Senla.adminHotel.model.Maintenance;

import java.util.ArrayList;
import java.util.List;

public class MaintenanceDao implements IMaintenanceDao {

    private List<Maintenance> maintenances = new ArrayList<>();

    @Override
    public void save(Maintenance entity) {

    }

    @Override
    public Maintenance getById(long id) {
        return null;
    }

    @Override
    public List<Maintenance> getAll() {
        return null;
    }

    @Override
    public void delete(Maintenance entity) {

    }

    @Override
    public Maintenance update(Maintenance entity) {
        return null;
    }
}
