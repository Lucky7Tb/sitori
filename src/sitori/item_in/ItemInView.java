package sitori.item_in;

import sitori.item.ItemService;
import sitori.item.Item;
import sitori.item_in.ItemIn;
import sitori.item_in.ItemInService;
import sitori.item_in.ItemInTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author lucky
 * @author gema
 */
public class ItemInView extends javax.swing.JPanel {
    
    private final ItemInService itemInService;    
    private final ItemService itemService;
    private ItemInTableModel itemInTableModel;
    private ArrayList<ItemIn> listItemIn;
    private ArrayList<Item> listItem;
    /**
     * Creates new form ItemInView
     */
    public ItemInView() {
        initComponents();
        this.setSize(800, 650);
        itemInService = new ItemInService();
        itemService = new ItemService();
    }
    
    public void initData() {
        ItemComboBox.removeAllItems();
        getItemIn();
        getItem();
    }
    
    private void getItemIn() {
        listItemIn = itemInService.getAll();
        itemInTableModel = new ItemInTableModel(listItemIn);
        itemInTable.setModel(itemInTableModel);
    }
    
    private void getItem() {
        listItem = itemService.getAll();
        
        for(Item item : listItem) {
            ItemComboBox.addItem(item.getItemName());
        }
    }
    
    private void insertItemIn(ItemIn itemIn) {
        itemInService.insert(itemIn);
        getItemIn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ItemComboBox = new javax.swing.JComboBox<>();
        ItemInAmmountField = new javax.swing.JTextField();
        ItemInDescriptionField = new javax.swing.JTextField();
        BtnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemInTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(240, 240, 240));

        jLabel1.setBackground(new java.awt.Color(42, 110, 244));
        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 110, 244));
        jLabel1.setText("Barang");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 110, 244));
        jLabel2.setText("Jumlah");

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 110, 244));
        jLabel3.setText("Keterangan");

        ItemComboBox.setBackground(new java.awt.Color(240, 240, 240));
        ItemComboBox.setForeground(new java.awt.Color(51, 51, 51));
        ItemComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));

        ItemInAmmountField.setBackground(new java.awt.Color(240, 240, 240));
        ItemInAmmountField.setForeground(new java.awt.Color(51, 51, 51));
        ItemInAmmountField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));

        ItemInDescriptionField.setBackground(new java.awt.Color(240, 240, 240));
        ItemInDescriptionField.setForeground(new java.awt.Color(51, 51, 51));
        ItemInDescriptionField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));

        BtnSave.setBackground(new java.awt.Color(240, 240, 240));
        BtnSave.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        BtnSave.setForeground(new java.awt.Color(42, 110, 244));
        BtnSave.setText("Simpan");
        BtnSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));
        BtnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSaveMouseClicked(evt);
            }
        });

        itemInTable.setAutoCreateRowSorter(true);
        itemInTable.setBackground(new java.awt.Color(240, 240, 240));
        itemInTable.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        itemInTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(itemInTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemInDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ItemComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 498, Short.MAX_VALUE)
                        .addComponent(ItemInAmmountField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel1))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemInAmmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemInDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSaveMouseClicked
        Item item = listItem.get(ItemComboBox.getSelectedIndex());
        String itemIn = ItemInAmmountField.getText();
        String itemInDescription = ItemInDescriptionField.getText();
        if (itemIn.equals("") || itemInDescription.equals("")) {
            JOptionPane.showMessageDialog(
                this, 
                "All field are required", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
        } else {
            int itemInAmmount = Integer.parseInt(itemIn);
            int itemId = item.getId();
            this.insertItemIn(new ItemIn(itemId, itemInAmmount, itemInDescription));
            ItemInAmmountField.setText("");
            ItemInDescriptionField.setText("");
        }
    }//GEN-LAST:event_BtnSaveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSave;
    private javax.swing.JComboBox<String> ItemComboBox;
    private javax.swing.JTextField ItemInAmmountField;
    private javax.swing.JTextField ItemInDescriptionField;
    private javax.swing.JTable itemInTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
