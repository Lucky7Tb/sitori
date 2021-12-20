package sitori.last_activity;

/**
 *
 * @author lucky
 */
public class LastActivity {
    private int id;
    private int itemId;
    private String itemName;
    private int ammount;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;

    public LastActivity(int id, int itemId, String itemName, int ammount, String description, String status, String createdAt, String updatedAt) {
        this.id = id;
        this.itemId = itemId;
        this.itemName = itemName;
        this.ammount = ammount;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getAmmount() {
        return ammount;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    
}
