package sitori.last_activity;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import sitori.helper.DateHelper;

/**
 *
 * @author lucky
 */

public class LastActivityView extends javax.swing.JPanel {
    private final LastActivityService lastActivityService;
    private LastActivityTableModel lastActivityTableModel;
    
    public LastActivityView() {
        initComponents();
        this.setSize(800, 650);
        lastActivityService = new LastActivityService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        DateChooseFrom = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        DateChooseTo = new com.toedter.calendar.JDateChooser();
        ExportBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LastActivityTable = new javax.swing.JTable();
        StatusComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 240, 240));
        setMinimumSize(new java.awt.Dimension(800, 650));
        setPreferredSize(new java.awt.Dimension(800, 650));
        setRequestFocusEnabled(false);

        DateChooseFrom.setBackground(new java.awt.Color(240, 240, 240));
        DateChooseFrom.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));
        DateChooseFrom.setForeground(new java.awt.Color(51, 51, 51));
        DateChooseFrom.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(42, 110, 244));
        jLabel1.setText("Dari tanggal");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(42, 110, 244));
        jLabel2.setText("Sampai tanggal");

        DateChooseTo.setBackground(new java.awt.Color(240, 240, 240));
        DateChooseTo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));
        DateChooseTo.setForeground(new java.awt.Color(51, 51, 51));
        DateChooseTo.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N

        ExportBtn.setBackground(new java.awt.Color(240, 240, 240));
        ExportBtn.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        ExportBtn.setForeground(new java.awt.Color(42, 110, 244));
        ExportBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sitori/resource/download.png"))); // NOI18N
        ExportBtn.setText("Export");
        ExportBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));
        ExportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExportBtnMouseClicked(evt);
            }
        });

        LastActivityTable.setAutoCreateRowSorter(true);
        LastActivityTable.setBackground(new java.awt.Color(240, 240, 240));
        LastActivityTable.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        LastActivityTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(LastActivityTable);

        StatusComboBox.setBackground(new java.awt.Color(240, 240, 240));
        StatusComboBox.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        StatusComboBox.setForeground(new java.awt.Color(51, 51, 51));
        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEMUA", "BARANG_MASUK", "BARANG_KELUAR" }));
        StatusComboBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 110, 244), 3, true));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 110, 244));
        jLabel3.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(DateChooseFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(StatusComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DateChooseTo, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                    .addComponent(ExportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateChooseFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateChooseTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(ExportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ExportBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExportBtnMouseClicked
        Date dateChooseFrom = DateChooseFrom.getDate();
        Date dateChooseTo = DateChooseTo.getDate();

        if ((dateChooseFrom == null && dateChooseTo != null) || (dateChooseFrom != null && dateChooseTo == null)) {
            JOptionPane.showMessageDialog(
                null, 
                "Salah satu tanggal tidak boleh kosong",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
        } else {
            String status = StatusComboBox.getSelectedItem().toString();
            String dateFrom = dateChooseFrom != null ? DateHelper.formatDate(dateChooseFrom) : "";
            String dateTo = dateChooseTo != null ? DateHelper.formatDate(dateChooseTo) : "";
            try {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showSaveDialog(this);
                File saveFilePath = fileChooser.getSelectedFile();
                if (saveFilePath != null) {
                    ArrayList<LastActivity> listLastActivity = lastActivityService.getAll(dateFrom, dateTo, status);
                    System.out.println(status);
                    lastActivityTableModel = new LastActivityTableModel(listLastActivity);
                    LastActivityTable.setModel(lastActivityTableModel);

                    saveFilePath = new File(saveFilePath.toString() + ".xlsx");

                    XSSFWorkbook workbook = new XSSFWorkbook();  
                    XSSFSheet sheet = workbook.createSheet("Reporting");   
                    XSSFRow rowhead = sheet.createRow(0);
                    rowhead.createCell(0).setCellValue("Nama barang");  
                    rowhead.createCell(1).setCellValue("Jumlah barang");  
                    rowhead.createCell(2).setCellValue("Deskripsi");  
                    rowhead.createCell(3).setCellValue("Status");  
                    rowhead.createCell(4).setCellValue("Tanggal");

                    for (int i = 0; i < listLastActivity.size(); i++) {
                        XSSFRow row = sheet.createRow((i+1));
                        LastActivity lastActivity = listLastActivity.get(i);
                        row.createCell(0).setCellValue(lastActivity.getItemName());  
                        row.createCell(1).setCellValue(lastActivity.getAmmount());
                        row.createCell(2).setCellValue(lastActivity.getDescription());  
                        row.createCell(3).setCellValue(lastActivity.getStatus());  
                        row.createCell(4).setCellValue(lastActivity.getCreatedAt());  
                    }

                    FileOutputStream fileOut = new FileOutputStream(saveFilePath.toString());  
                    workbook.write(fileOut);  
                    fileOut.close();  
                    workbook.close();
                    JOptionPane.showMessageDialog(
                        null, 
                        "Sukses export data",
                        "Sukses",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Error get file path",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Internal error",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(
                    null, 
                    "Error simpan file export",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }//GEN-LAST:event_ExportBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooseFrom;
    private com.toedter.calendar.JDateChooser DateChooseTo;
    private javax.swing.JButton ExportBtn;
    private javax.swing.JTable LastActivityTable;
    private javax.swing.JComboBox<String> StatusComboBox;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
