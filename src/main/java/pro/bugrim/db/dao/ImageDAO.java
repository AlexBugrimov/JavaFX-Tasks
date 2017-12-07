package pro.bugrim.db.dao;

import pro.bugrim.db.entity.Image;

import java.util.List;

public interface ImageDAO extends DAO<Image> {

    void add(Image image);

    List<Image> getAll();


}
