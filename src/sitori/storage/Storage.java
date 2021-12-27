package sitori.storage;

/**
 *
 * @author lucky
 * @author audy
 */
public class Storage {
    private int id;
    private String storageName;
    private String updateAt;

    public Storage(int id, String storageName, String updateAt) {
        this.id = id;
        this.storageName = storageName;
        this.updateAt = updateAt;
    }

    public int getId() {
        return id;
    }

    public String getStorageName() {
        return storageName;
    }
    
    public String getUpdatedAt() {
        return updateAt;
    }
}
