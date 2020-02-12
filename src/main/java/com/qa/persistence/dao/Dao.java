package com.qa.persistence.dao;

import java.util.List;

public interface Dao<T> {

    List<T> readAll();
     
    void create(T t);
     
    void update(int id, T t);
     
    void delete(int id);
}
	