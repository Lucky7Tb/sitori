package sitori.item;

import javax.swing.JOptionPane;

/**
 *
 * @author lucky
 */
public class ItemView extends javax.swing.JPanel {

    /**
     * Creates new form ItemView
     */
    public ItemView() {
        initComponents();
        this.setSize(800, 650);
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
        jTable1 = new javax.swing.JTable();
        BtnSave = new javax.swing.JButton();

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

        jTable1.setBackground(new java.awt.Color(240, 240, 240));
        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
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

        BtnSave.setBackground(new java.awt.Color(240, 240, 240));
        BtnSave.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        BtnSave.setForeground(new java.awt.Color(42, 110, 244));
        BtnSave.setText("Simpan");
        BtnSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));
        BtnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSaveMouseClicked(evt);
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
                        .addComponent(StorageComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(ItemCategoryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ItemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSaveMouseClicked
        String itemName = ItemNameField.getText();
        
        if (itemName.equals("")) {
            JOptionPane.showMessageDialog(
                this, 
                "All field are required", 
                "Error", 
                JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_BtnSaveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSave;
    private javax.swing.JComboBox<String> ItemCategoryComboBox;
    private javax.swing.JTextField ItemNameField;
    private javax.swing.JComboBox<String> StorageComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
