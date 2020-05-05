package pl.kfrak.dao;

import java.util.Optional;

interface Dao<T> {

    Optional<T> get(Integer id);

    String getAll();

    void insert(T t);

    void delete(int id);

}
