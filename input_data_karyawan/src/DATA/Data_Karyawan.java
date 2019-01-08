/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;
import Controller.dl_data_karyawan;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.util.HashMap;


/**
 *
 * @author Kel6
 */
public class Data_Karyawan extends javax.swing.JFrame {

    private void ViewData(){
    dl_data_karyawan ck = new dl_data_karyawan();
        try{
            jTable.setModel(DbUtils.resultSetToTableModel(ck.UpdateJTable()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * Creates new form Data_Karyawan
     */
    public Data_Karyawan() {
        initComponents();
    }
    
    private void AmbilJK(String jk){
        if (jk.equals("laki-laki")){
            rdlk.setSelected(true);
        }else{
            rdpr.setSelected(true);
        }
    }
    private void Ambilstatus(String status){
        if (status.equals("menikah")){
            rdmhk.setSelected(true);
        }else{
            rdbmhk.setSelected(true);
       }
    }
    
    private void AmbilAgama(String agama){
        String[] ag ={"Islam","Kristen","Budha","Hindu"};
        cbagama.removeAllItems();
        cbagama.addItem(agama);
        for(int i = 0;i<ag.length;i++){
            if(!ag[i].equals(agama)){
                cbagama.addItem(ag[i]); 
            }
        }
    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txnip = new javax.swing.JTextField();
        txnama = new javax.swing.JTextField();
        txjabatan = new javax.swing.JTextField();
        rdlk = new javax.swing.JRadioButton();
        rdpr = new javax.swing.JRadioButton();
        cbagama = new javax.swing.JComboBox<>();
        rdmhk = new javax.swing.JRadioButton();
        rdbmhk = new javax.swing.JRadioButton();
        txalamat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        cbsimpan = new javax.swing.JButton();
        cbtambah = new javax.swing.JButton();
        cbedit = new javax.swing.JButton();
        cbhapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM DATA KARYAWAN");

        jLabel2.setText("NIP");

        jLabel3.setText("Nama");

        jLabel4.setText("Jabatan");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Agama");

        jLabel7.setText("Status");

        jLabel8.setText("Alamat");

        txnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnamaActionPerformed(evt);
            }
        });

        txjabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txjabatanActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdlk);
        rdlk.setText("Laki-Laki");

        buttonGroup1.add(rdpr);
        rdpr.setText("Perempuan");
        rdpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdprActionPerformed(evt);
            }
        });

        cbagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Hindu", "Budha" }));

        buttonGroup2.add(rdmhk);
        rdmhk.setText("Menikah");

        buttonGroup2.add(rdbmhk);
        rdbmhk.setText("Belum  Menikah");
        rdbmhk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbmhkActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        cbsimpan.setText("Simpan");
        cbsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsimpanActionPerformed(evt);
            }
        });

        cbtambah.setText("Tambah");
        cbtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtambahActionPerformed(evt);
            }
        });

        cbedit.setText("Edit");
        cbedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbeditActionPerformed(evt);
            }
        });

        cbhapus.setText("Hapus");
        cbhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(21, 21, 21)
                        .addComponent(rdlk)
                        .addGap(18, 18, 18)
                        .addComponent(rdpr))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(cbsimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(cbtambah))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(45, 45, 45)
                                .addComponent(txjabatan))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txnip)
                                    .addComponent(txnama, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdmhk)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdbmhk))
                                    .addComponent(txalamat)
                                    .addComponent(cbagama, 0, 180, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(cbedit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbhapus)
                                .addGap(37, 37, 37)))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel6)
                        .addComponent(cbagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txnip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rdmhk)
                            .addComponent(rdbmhk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addComponent(txjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdlk)
                    .addComponent(rdpr))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbsimpan)
                    .addComponent(cbtambah)
                    .addComponent(cbedit)
                    .addComponent(cbhapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txjabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txjabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txjabatanActionPerformed

    private void rdprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdprActionPerformed

    private void rdbmhkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbmhkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbmhkActionPerformed

    private void txnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnamaActionPerformed

    private void cbsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsimpanActionPerformed
        // TODO add your handling code here:
        dl_data_karyawan ck= new dl_data_karyawan();
        ck.nip = txnip.getText();
        ck.nama = txnama.getText();
        ck.jabatan = txjabatan.getText();
        if(rdlk.isSelected()==true){
            ck.jenis_kelamin="laki-laki";
        }else{
            ck.jenis_kelamin="perempuan";
        }
        ck.agama = (String) cbagama.getSelectedItem();
        if(rdmhk.isSelected()==true){
            ck.status="menikah";
        }else{
            ck.status="belum menikah";
        }
        ck.alamat = txalamat.getText();
        try{
            ck.simpan();
            JOptionPane.showMessageDialog(null,"berhasil");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        ViewData();

    }//GEN-LAST:event_cbsimpanActionPerformed

    private void cbtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtambahActionPerformed
        // TODO add your handling code here:
        txnip.setText("");
        txnama.setText("");
        txjabatan.setText("");
        buttonGroup1.clearSelection();
        cbagama.setSelectedItem("");
        buttonGroup2.clearSelection();
        txalamat.setText("");

    }//GEN-LAST:event_cbtambahActionPerformed

    private void cbeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbeditActionPerformed
        // TODO add your handling code here:
        dl_data_karyawan ck= new dl_data_karyawan();
        ck.nip = txnip.getText();
        ck.nama = txnama.getText();
        ck.jabatan = txjabatan.getText();
        if(rdlk.isSelected()==true){
            ck.jenis_kelamin="laki-laki";
        }else{
            ck.jenis_kelamin="perempuan";
        }
        ck.agama = (String) cbagama.getSelectedItem();
        if(rdmhk.isSelected()==true){
            ck.status="menikah";
        }else{
            ck.status="belum menikah";
        }
        ck.alamat = txalamat.getText();
        try{
            ck.rubah();
            JOptionPane.showMessageDialog(null,"berhasil");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        ViewData();

    }//GEN-LAST:event_cbeditActionPerformed

    private void cbhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhapusActionPerformed
        // TODO add your handling code here:
        String ObjButtons[]={"Yes","No"};
        int PromptResult =JOptionPane.showOptionDialog(null, "yakin Mau Hapus ?", "Massage", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ObjButtons, ObjButtons[1]);
        if(PromptResult ==0){
            dl_data_karyawan ck = new dl_data_karyawan();
            ck.nip = txnip.getText();
            try{
                ck.hapus();
                JOptionPane.showMessageDialog(null, "berhasil dihapus");
                ViewData();
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }

    }//GEN-LAST:event_cbhapusActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        int row = jTable.getSelectedRow();
        txnip.setText(jTable.getModel().getValueAt(row,0).toString());
        txnama.setText(jTable.getModel().getValueAt(row,1).toString());
        txjabatan.setText(jTable.getModel().getValueAt(row,2).toString());
        String jenis_kelamin = jTable.getModel().getValueAt(row, 3).toString();
        AmbilJK (jenis_kelamin);
        String agama =jTable.getModel().getValueAt(row,4).toString();
        AmbilAgama(agama);
        String status = jTable.getModel().getValueAt(row, 5).toString();
        Ambilstatus (status);
        txalamat.setText(jTable.getModel().getValueAt(row,6).toString());

    }//GEN-LAST:event_jTableMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ViewData();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Data_Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbagama;
    private javax.swing.JButton cbedit;
    private javax.swing.JButton cbhapus;
    private javax.swing.JButton cbsimpan;
    private javax.swing.JButton cbtambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JRadioButton rdbmhk;
    private javax.swing.JRadioButton rdlk;
    private javax.swing.JRadioButton rdmhk;
    private javax.swing.JRadioButton rdpr;
    private javax.swing.JTextField txalamat;
    private javax.swing.JTextField txjabatan;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txnip;
    // End of variables declaration//GEN-END:variables
}
