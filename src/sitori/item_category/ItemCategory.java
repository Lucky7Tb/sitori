package sitori.item_category;

/**
 *
 * @author lucky
 * @author gema
 */
public class ItemCategory {
    private int id;
    private String itemCategoryName;
    private String updatedAt;

    public ItemCategory(int id, String itemCategoryName, String updatedAt) {
        this.id = id;
        this.itemCategoryName = itemCategoryName;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public String getItemCategoryName() {
        return itemCategoryName;
    }
    
    public String getUpdatedAt() {
        return updatedAt;
    }

}
