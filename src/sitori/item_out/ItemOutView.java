package sitori.item_out;

import sitori.item.Item;
import sitori.item_out.ItemOut;
import sitori.item_out.ItemOutService;
import sitori.item_out.ItemOutTableModel;
import sitori.item.ItemService;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lucky
 */
public class ItemOutView extends javax.swing.JPanel {

    private final ItemOutService itemOutService;    
    private final ItemService itemService;
    private ItemOutTableModel itemOutTableModel;
    private ArrayList<ItemOut> listItemOut;
    private ArrayList<Item> listItem;
    
    /**
     * Creates new form ItemOutView
     */
    public ItemOutView() {
        initComponents();
        this.setSize(800, 650);
        itemOutService = new ItemOutService();
        itemService = new ItemService();
    }
    
    public void initData() {
        ItemComboBox.removeAllItems();
        getItemOut();
        getItem();
    }
    
    private void getItemOut() {
        listItemOut = itemOutService.getAll();
        itemOutTableModel = new ItemOutTableModel(listItemOut);
        itemOutTable.setModel(itemOutTableModel);
    }
    
    private void getItem() {
        listItem = itemService.getAll();
        
        for(Item item : listItem) {
            ItemComboBox.addItem(item.getItemName());
        }
    }
    
    private void insertItemOut(ItemOut itemOut) {
        itemOutService.insert(itemOut);
        getItemOut();
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
        itemOutTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ItemComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ItemOutAmmountField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ItemOutDescriptionField = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 240, 240));
        setMinimumSize(new java.awt.Dimension(800, 650));
        setPreferredSize(new java.awt.Dimension(800, 650));
        setVerifyInputWhenFocusTarget(false);

        itemOutTable.setAutoCreateRowSorter(true);
        itemOutTable.setBackground(new java.awt.Color(240, 240, 240));
        itemOutTable.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        itemOutTable.setModel(new javax.swing.table.DefaultTableModel(
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
        itemOutTable.setToolTipText("Daftar barang yang keluar");
        itemOutTable.setGridColor(new java.awt.Color(42, 110, 244));
        itemOutTable.setSelectionBackground(new java.awt.Color(42, 110, 244));
        itemOutTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(itemOutTable);
        itemOutTable.getAccessibleContext().setAccessibleName("");

        jLabel1.setBackground(new java.awt.Color(42, 110, 244));
        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 110, 244));
        jLabel1.setText("Barang");

        ItemComboBox.setBackground(new java.awt.Color(240, 240, 240));
        ItemComboBox.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        ItemComboBox.setForeground(new java.awt.Color(51, 51, 51));
        ItemComboBox.setToolTipText("Pilih barang");
        ItemComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));
        ItemComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 110, 244));
        jLabel2.setText("Jumlah");

        ItemOutAmmountField.setBackground(new java.awt.Color(240, 240, 240));
        ItemOutAmmountField.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        ItemOutAmmountField.setForeground(new java.awt.Color(51, 51, 51));
        ItemOutAmmountField.setToolTipText("Jumlah barang yang keluar");
        ItemOutAmmountField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 110, 244));
        jLabel3.setText("Keterangan");

        ItemOutDescriptionField.setBackground(new java.awt.Color(240, 240, 240));
        ItemOutDescriptionField.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        ItemOutDescriptionField.setForeground(new java.awt.Color(51, 51, 51));
        ItemOutDescriptionField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));
        ItemOutDescriptionField.setOpaque(false);

        SaveBtn.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(42, 110, 244));
        SaveBtn.setText("Simpan");
        SaveBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));
        SaveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SaveBtn.setMargin(new java.awt.Insets(100, 100, 100, 100));
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ItemOutDescriptionField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addComponent(ItemOutAmmountField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ItemComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemOutAmmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ItemOutDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        Item item = listItem.get(ItemComboBox.getSelectedIndex());
        String itemOut = ItemOutAmmountField.getText();
        String itemOutDescription = ItemOutDescriptionField.getText();
        if (itemOut.equals("") || itemOutDescription.equals("")) {
            JOptionPane.showMessageDialog(
                this, 
                "Semua field harus diisi", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
        } else {
            int itemOutAmmount = Integer.parseInt(itemOut);
            int itemId = item.getId();
            insertItemOut(new ItemOut(itemId, itemOutAmmount, itemOutDescription));
            ItemOutAmmountField.setText("");
            ItemOutDescriptionField.setText("");
        }
    }//GEN-LAST:event_SaveBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ItemComboBox;
    private javax.swing.JTextField ItemOutAmmountField;
    private javax.swing.JTextField ItemOutDescriptionField;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTable itemOutTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
