package Adapter;

import Adapter.DataBase;
import Adapter.JavaApplication;

public class AdapterJavaToDataBase extends JavaApplication implements DataBase {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
