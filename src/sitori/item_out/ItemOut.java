package sitori.item_out;

/**
 *
 * @author lucky
 */
public class ItemOut {
    int id;
    int itemId;
    String itemName;
    int itemOutAmmount;
    String description;
    String createdAt;
    String updatedAt;

    public ItemOut(int id, int itemId, String itemName, int itemOutAmmount, String description, String createdAt, String updatedAt) {
        this.id = id;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemOutAmmount = itemOutAmmount;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public ItemOut(int itemId, int itemOutAmmount, String description) {
        this.itemId = itemId;
        this.itemOutAmmount = itemOutAmmount;
        this.description = description;
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

    public int getItemOutAmmount() {
        return itemOutAmmount;
    }

    public String getDescription() {
        return description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
    
}
