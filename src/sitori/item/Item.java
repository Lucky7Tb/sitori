package sitori.item;

/**
 *
 * @author lucky
 */
public class Item {
    private int id;
    private String itemName;
    private int itemCategoryId;
    private String itemCategoryName;
    private int itemStorageId;
    private String itemStorageName;
    private int itemGoodConditionAmmount;
    private String createdAt;
    private String updatedAt;

    public Item(int id, String itemName, int itemCategoryId, String itemCategoryName, int itemStorageId, String itemStorageName, int itemGoodConditionAmmount, String createdAt, String updatedAt) {
        this.id = id;
        this.itemName = itemName;
        this.itemCategoryId = itemCategoryId;
        this.itemCategoryName = itemCategoryName;
        this.itemStorageId = itemStorageId;
        this.itemStorageName = itemStorageName;
        this.itemGoodConditionAmmount = itemGoodConditionAmmount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Item(String itemName, int itemCategoryId, int itemStorageId, int itemGoodConditionAmmount) {
        this.itemName = itemName;
        this.itemCategoryId = itemCategoryId;
        this.itemStorageId = itemStorageId;
        this.itemGoodConditionAmmount = itemGoodConditionAmmount;
    }

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemCategoryId() {
        return itemCategoryId;
    }

    public String getItemCategoryName() {
        return itemCategoryName;
    }

    public int getItemStorageId() {
        return itemStorageId;
    }

    public String getItemStorageName() {
        return itemStorageName;
    }

    public int getItemGoodConditionAmmount() {
        return itemGoodConditionAmmount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    
}
