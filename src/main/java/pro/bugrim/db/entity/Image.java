package pro.bugrim.db.entity;

import java.io.File;
import java.util.Objects;

public class Image {

    private long id;
    private File file;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return id == image.id &&
                Objects.equals(file, image.file);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, file);
    }
}
