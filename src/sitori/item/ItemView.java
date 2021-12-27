package sitori.item;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import sitori.storage.Storage;
import sitori.storage.StorageService;
import sitori.item_category.ItemCategory;
import sitori.item_category.ItemCategoryService;

/**
 *
 * @author lucky
 */
public class ItemView extends javax.swing.JPanel {
    private int itemId = -1; 
    private final StorageService storageService;
    private final ItemCategoryService itemCategoryService;
    private final ItemService itemService;
    private ItemTableModel itemTableModel;
    private ArrayList<Storage> listStorage;
    private ArrayList<ItemCategory> listItemCategory;
    private ArrayList<Item> listItem;
    
    /**
     * Creates new form ItemView
     */
    public ItemView() {
        initComponents();
        this.setSize(800, 650);
        
        itemService = new ItemService();
        storageService = new StorageService();
        itemCategoryService = new ItemCategoryService();
        DeleteBtn.setVisible(false);
        ResetBtn.setVisible(false);
    }
    
    public void initData() {
        ItemCategoryComboBox.removeAllItems();
        StorageComboBox.removeAllItems();
        getStorage();
        getItemCategory();
        getItem();
    }
    
    private void getStorage() {
        listStorage = storageService.getAll();
        
        for (Storage storage : listStorage){
            StorageComboBox.addItem(storage.getStorageName());
        }
    }
    
    private void getItemCategory() {
        listItemCategory = itemCategoryService.getAll();
        for(ItemCategory itemCategory : listItemCategory) {
            ItemCategoryComboBox.addItem(itemCategory.getItemCategoryName());
        }
    }
    
    private void getItem() {
        listItem = itemService.getAll();
        itemTableModel = new ItemTableModel(listItem);
        ItemTable.setModel(itemTableModel);
    }
    
    private void insertItem(Item item) {
        itemService.insert(item);
        getItem();
    }
    
    private void updateItem(int id, Item item) {
        itemService.update(id, item);
        clearForm();
        getItem();
    }

    private void deleteItem(int id) {
        itemService.delete(id);
        clearForm();
        getItem();
    }
    
    private void clearForm() {
        ItemNameField.setText("");
        StorageComboBox.setSelectedIndex(0);
        ItemCategoryComboBox.setSelectedIndex(0);
        ResetBtn.setVisible(false);
        DeleteBtn.setVisible(false);
        ItemTable.clearSelection();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ItemCategoryComboBox = new javax.swing.JComboBox<>();
        StorageComboBox = new javax.swing.JComboBox<>();
        ItemNameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemTable = new javax.swing.JTable();
        SaveBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 240, 240));
        setMinimumSize(new java.awt.Dimension(800, 650));
        setName(""); // NOI18N

        jLabel1.setBackground(new java.awt.Color(42, 110, 244));
        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 110, 244));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Tempat penyimpanan");

        jLabel2.setBackground(new java.awt.Color(42, 110, 244));
        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 110, 244));
        jLabel2.setText("Kategori barang");

        jLabel3.setBackground(new java.awt.Color(42, 110, 244));
        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 110, 244));
        jLabel3.setText("Nama barang");

        ItemCategoryComboBox.setBackground(new java.awt.Color(240, 240, 240));
        ItemCategoryComboBox.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        ItemCategoryComboBox.setForeground(new java.awt.Color(51, 51, 51));
        ItemCategoryComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));

        StorageComboBox.setBackground(new java.awt.Color(240, 240, 240));
        StorageComboBox.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        StorageComboBox.setForeground(new java.awt.Color(51, 51, 51));
        StorageComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));

        ItemNameField.setBackground(new java.awt.Color(240, 240, 240));
        ItemNameField.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        ItemNameField.setForeground(new java.awt.Color(51, 51, 51));
        ItemNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));

        ItemTable.setAutoCreateRowSorter(true);
        ItemTable.setBackground(new java.awt.Color(240, 240, 240));
        ItemTable.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        ItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ItemTable);

        SaveBtn.setBackground(new java.awt.Color(240, 240, 240));
        SaveBtn.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(42, 110, 244));
        SaveBtn.setText("Simpan");
        SaveBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));
        SaveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(240, 240, 240));
        DeleteBtn.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 69, 40));
        DeleteBtn.setText("Hapus");
        DeleteBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 69, 40), 3, true));
        DeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        ResetBtn.setBackground(new java.awt.Color(240, 240, 240));
        ResetBtn.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(153, 153, 153));
        ResetBtn.setText("Reset");
        ResetBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        ResetBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(ItemCategoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ItemNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addComponent(StorageComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StorageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemCategoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        String itemName = ItemNameField.getText();
        int itemCategoryId = listItemCategory.get(ItemCategoryComboBox.getSelectedIndex()).getId();
        int itemStorageId = listStorage.get(StorageComboBox.getSelectedIndex()).getId();
        
        if (itemName.equals("")) {
            JOptionPane.showMessageDialog(
                this, 
                "All field are required", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
        } else {
            if (itemId == -1) {
                insertItem(new Item(itemName, itemCategoryId, itemStorageId, 0));
            } else {
                updateItem(itemId, new Item(itemName, itemCategoryId, itemStorageId));
            }

            ItemNameField.setText("");
        }
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        deleteItem(itemId);
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        clearForm();
        itemId = -1;
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void ItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemTableMouseClicked
        int index = ItemTable.getSelectedRow();
        Item item = listItem.get(index);
        itemId = item.getId();
        ItemNameField.setText(item.getItemName());
        for (int i = 0; i < listStorage.size(); i++) {
            if (listStorage.get(i).getId() == item.getItemStorageId()) {
                StorageComboBox.setSelectedIndex(i);
                break;
            }
        }
        for (int i = 0; i < listItemCategory.size(); i++) {
            if (listItemCategory.get(i).getId() == item.getItemCategoryId()) {
                ItemCategoryComboBox.setSelectedIndex(i);
                break;
            }
        }
        ResetBtn.setVisible(true);
        DeleteBtn.setVisible(true);
    }//GEN-LAST:event_ItemTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JComboBox<String> ItemCategoryComboBox;
    private javax.swing.JTextField ItemNameField;
    private javax.swing.JTable ItemTable;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JComboBox<String> StorageComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
