package pro.bugrim.db.service;

import pro.bugrim.db.Database;
import pro.bugrim.db.dao.ImageDAO;
import pro.bugrim.db.entity.Image;

import java.sql.Connection;
import java.util.List;

public class ImageService extends Database implements ImageDAO {

    private final Connection connection = connection();

    @Override
    public void add(Image image) {

    }

    @Override
    public List<Image> getAll() {
        return null;
    }
}
