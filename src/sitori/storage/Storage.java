package sitori.storage;

/**
 *
 * @author lucky
 */
public class Storage {
    private int id;
    private String storageName;

    public Storage(int id, String storageName) {
        this.id = id;
        this.storageName = storageName;
    }

    public int getId() {
        return id;
    }

    public String getStorageName() {
        return storageName;
    }    
}
