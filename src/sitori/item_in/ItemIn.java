/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sitori.item_in;

/**
 * 
 * @author gema
 */
public class ItemIn {
    int id;
    int itemId;
    String itemName;
    int itemInAmmount;
    String description;
    String createdAt;
    String updatedAt;
    
    public ItemIn(int id, int itemId, String itemName, int itemInAmmount, String description, String createdAt, String updatedAt) {
        this.id = id;
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemInAmmount = itemInAmmount;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public ItemIn(int itemId, int itemInAmmount, String description) {
        this.itemId = itemId;
        this.itemInAmmount = itemInAmmount;
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

    public int getItemInAmmount() {
        return itemInAmmount;
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
