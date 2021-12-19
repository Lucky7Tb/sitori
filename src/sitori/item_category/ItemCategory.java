package sitori.item_category;

/**
 *
 * @author lucky
 */
public class ItemCategory {
    private int id;
    private String itemCategoryName;

    public ItemCategory(int id, String itemCategoryName) {
        this.id = id;
        this.itemCategoryName = itemCategoryName;
    }

    public int getId() {
        return id;
    }

    public String getItemCategoryName() {
        return itemCategoryName;
    }
}
