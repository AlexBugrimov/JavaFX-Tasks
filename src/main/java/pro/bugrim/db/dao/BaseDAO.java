package pro.bugrim.db.dao;

import pro.bugrim.db.entity.Base;

import java.util.List;

public interface BaseDAO extends DAO<Base> {

    List<Base> getAll();

    void choose(String name);
}
