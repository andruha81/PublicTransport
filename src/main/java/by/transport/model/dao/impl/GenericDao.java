package by.transport.model.dao.impl;

import by.transport.model.dao.IGenericDao;

import java.util.List;

public class GenericDao<T> implements IGenericDao<T> {

    private final Class<T> clazz;

    public GenericDao(Class<T> clazzToSet) {
        this.clazz = clazzToSet;
    }

    public void save(T entity) {

    }

    public void update(T entity) {

    }

    public void delete(T entity) {

    }

    public T getById(int entityId) {
        return null;
    }

    public List<T> getAll() {
        return null;
    }

    public void deleteById(int entityId) {

    }
}
