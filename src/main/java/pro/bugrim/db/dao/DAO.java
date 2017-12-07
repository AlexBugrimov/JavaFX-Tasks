package pro.bugrim.db.dao;

import java.util.List;

public interface DAO<T> {

    List<T> getAll();
}
