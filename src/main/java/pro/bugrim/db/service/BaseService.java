package pro.bugrim.db.service;

import pro.bugrim.db.Database;
import pro.bugrim.db.dao.BaseDAO;
import pro.bugrim.db.entity.Base;

import java.sql.Connection;
import java.util.List;

public class BaseService extends Database implements BaseDAO {

    private final Connection connection = connection();

    @Override
    public List<Base> getAll() {
        return null;
    }

    @Override
    public void choose(String name) {

    }
}
