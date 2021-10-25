package com.sitori;

import com.sitori.storage.StorageView;
import com.sitori.item_category.ItemCategoryView;
import com.sitori.item.ItemView;
import com.sitori.item_in.ItemInView;
import com.sitori.item_out.ItemOutView;
import com.sitori.last_activity.LastActivityView;

/**
 *
 * @author lucky
 */
public class Main extends javax.swing.JFrame {
    StorageView storageView;
    ItemCategoryView itemCategoryView;
    ItemView itemView;
    ItemInView itemInView;
    ItemOutView itemOutView;
    LastActivityView lastActivityView;


    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setTitle("Inventory");
        
        storageView = new StorageView();
        itemCategoryView = new ItemCategoryView();
        itemView = new ItemView();
        itemInView = new ItemInView();
        itemOutView = new ItemOutView();
        lastActivityView = new LastActivityView();

        
        MainPanel.add(storageView);
        MainPanel.add(itemCategoryView);
        MainPanel.add(itemView);
        MainPanel.add(itemInView);
        MainPanel.add(itemOutView);
        MainPanel.add(lastActivityView);
        
        storageView.setVisible(true);
        itemCategoryView.setVisible(false);
        itemView.setVisible(false);
        itemInView.setVisible(false);
        itemOutView.setVisible(false);
        lastActivityView.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        StorageMenu = new javax.swing.JButton();
        ItemCategoryMenu = new javax.swing.JButton();
        ItemMenu = new javax.swing.JButton();
        ItemInMenu = new javax.swing.JButton();
        ItemOutMenu = new javax.swing.JButton();
        LastActivityMenu = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("MainFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(950, 650));

        MainPanel.setPreferredSize(new java.awt.Dimension(850, 0));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));

        StorageMenu.setText("Storage");
        StorageMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StorageMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StorageMenuMousePressed(evt);
            }
        });

        ItemCategoryMenu.setText("Item Category");
        ItemCategoryMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ItemCategoryMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemCategoryMenuMousePressed(evt);
            }
        });

        ItemMenu.setText("Item");
        ItemMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ItemMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemMenuMousePressed(evt);
            }
        });

        ItemInMenu.setText("Item In");
        ItemInMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ItemInMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemInMenuMousePressed(evt);
            }
        });

        ItemOutMenu.setText("Item Out");
        ItemOutMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ItemOutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemOutMenuMousePressed(evt);
            }
        });

        LastActivityMenu.setText("Last Activity");
        LastActivityMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LastActivityMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LastActivityMenuMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StorageMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
            .addComponent(ItemCategoryMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ItemMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ItemInMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ItemOutMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LastActivityMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(StorageMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ItemCategoryMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ItemMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ItemInMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ItemOutMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(LastActivityMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StorageMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StorageMenuMousePressed
        storageView.setVisible(true);
        itemCategoryView.setVisible(false);
        itemView.setVisible(false);
        itemInView.setVisible(false);
        itemOutView.setVisible(false);
        lastActivityView.setVisible(false);
    }//GEN-LAST:event_StorageMenuMousePressed

    private void ItemCategoryMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemCategoryMenuMousePressed
        storageView.setVisible(false);
        itemCategoryView.setVisible(true);
        itemView.setVisible(false);
        itemInView.setVisible(false);
        itemOutView.setVisible(false);
        lastActivityView.setVisible(false);
    }//GEN-LAST:event_ItemCategoryMenuMousePressed

    private void ItemMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemMenuMousePressed
        storageView.setVisible(false);
        itemCategoryView.setVisible(false);
        itemView.setVisible(true);
        itemInView.setVisible(false);
        itemOutView.setVisible(false);
        lastActivityView.setVisible(false);
    }//GEN-LAST:event_ItemMenuMousePressed

    private void ItemInMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemInMenuMousePressed
        storageView.setVisible(false);
        itemCategoryView.setVisible(false);
        itemView.setVisible(false);
        itemInView.setVisible(true);
        itemOutView.setVisible(false);
        lastActivityView.setVisible(false);
    }//GEN-LAST:event_ItemInMenuMousePressed

    private void ItemOutMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemOutMenuMousePressed
        storageView.setVisible(false);
        itemCategoryView.setVisible(false);
        itemView.setVisible(false);
        itemInView.setVisible(false);
        itemOutView.setVisible(true);
        lastActivityView.setVisible(false);
    }//GEN-LAST:event_ItemOutMenuMousePressed

    private void LastActivityMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LastActivityMenuMousePressed
        storageView.setVisible(false);
        itemCategoryView.setVisible(false);
        itemView.setVisible(false);
        itemInView.setVisible(false);
        itemOutView.setVisible(false);
        lastActivityView.setVisible(true);
    }//GEN-LAST:event_LastActivityMenuMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ItemCategoryMenu;
    private javax.swing.JButton ItemInMenu;
    private javax.swing.JButton ItemMenu;
    private javax.swing.JButton ItemOutMenu;
    private javax.swing.JButton LastActivityMenu;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton StorageMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}