package sitori.item;

/**
 *
 * @author lucky
 */
public class Item {
    private int id;
    private String itemName;
    private int itemCategoryId;
    private int itemStorageId;
    private int itemGoodConditionAmmount;
    private String created_at;
    private String updated_at;

    public Item(int id, String itemName, int itemCategoryId, int itemStorageId, int itemGoodConditionAmmount, String created_at, String updated_at) {
        this.id = id;
        this.itemName = itemName;
        this.itemCategoryId = itemCategoryId;
        this.itemStorageId = itemStorageId;
        this.itemGoodConditionAmmount = itemGoodConditionAmmount;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public int getItemStorageId() {
        return itemStorageId;
    }

    public int getItemGoodConditionAmmount() {
        return itemGoodConditionAmmount;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }
}
