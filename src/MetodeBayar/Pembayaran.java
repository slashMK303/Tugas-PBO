/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package metodeBayar;

import MetodeBayar.PembayaranBelanja;
import javax.swing.JOptionPane;

/**
 *
 * @author victus
 */
public class Pembayaran extends javax.swing.JFrame {

    /**
     * Creates new form PembayaranDemo
     */
    public Pembayaran() {
        initComponents();
    }
    
    double totalPembelian = 0;
    PembayaranBelanja pb = new PembayaranBelanja();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pembelian = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cbSoto = new javax.swing.JCheckBox();
        cbBakso = new javax.swing.JCheckBox();
        cbNasgor = new javax.swing.JCheckBox();
        cbMieAyam = new javax.swing.JCheckBox();
        cbAyamGeprek = new javax.swing.JCheckBox();
        cbEsTeh = new javax.swing.JCheckBox();
        cbEsJeruk = new javax.swing.JCheckBox();
        cbEsCampur = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnHitungPembelian = new javax.swing.JButton();
        lbPembelian = new javax.swing.JLabel();
        tbSaldoPembeli = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rbGopay = new javax.swing.JRadioButton();
        rbShopeepay = new javax.swing.JRadioButton();
        rbQris = new javax.swing.JRadioButton();
        rbEwallet = new javax.swing.JRadioButton();
        rbKartuDebit = new javax.swing.JRadioButton();
        rbKartuKredit = new javax.swing.JRadioButton();
        rbCash = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        lbKembalian = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnHitungKembalian = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmbNama = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Metode Pembayaran");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(231, 251, 180));

        cbSoto.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        cbSoto.setText("Soto Ayam/Sapi");

        cbBakso.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        cbBakso.setText("Bakso");

        cbNasgor.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        cbNasgor.setText("Nasi Goreng");

        cbMieAyam.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        cbMieAyam.setText("Mie Ayam");

        cbAyamGeprek.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        cbAyamGeprek.setText("Ayam Geprek/Penyet");

        cbEsTeh.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        cbEsTeh.setText("Es Teh");

        cbEsJeruk.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        cbEsJeruk.setText("Es Jeruk");
        cbEsJeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEsJerukActionPerformed(evt);
            }
        });

        cbEsCampur.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        cbEsCampur.setText("Es Campur");
        cbEsCampur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEsCampurActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel2.setText("Rp. 12000");

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel3.setText("Rp. 7000");

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel4.setText("Rp. 15000");

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel5.setText("Rp. 13000");

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel6.setText("Rp. 10000");

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel7.setText("Rp. 3000");

        jLabel8.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel8.setText("Rp. 4000");

        jLabel9.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel9.setText("Rp. 7000");

        jPanel2.setBackground(new java.awt.Color(205, 193, 255));

        btnHitungPembelian.setText("Hitung Pembelian");
        btnHitungPembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungPembelianActionPerformed(evt);
            }
        });

        lbPembelian.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        lbPembelian.setText("0");

        tbSaldoPembeli.setEditable(false);
        tbSaldoPembeli.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel11.setText("Saldo/Uang Pembeli");

        jLabel12.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel12.setText("Metode Pembayaran (fee)");

        jLabel13.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel13.setText("Total");

        pembelian.add(rbGopay);
        rbGopay.setText("GoPay (3%)");

        pembelian.add(rbShopeepay);
        rbShopeepay.setText("ShopeePay (3%)");

        pembelian.add(rbQris);
        rbQris.setText("QRIS (5%)");

        pembelian.add(rbEwallet);
        rbEwallet.setText("e-wallet (7%)");

        pembelian.add(rbKartuDebit);
        rbKartuDebit.setText("kartu Debit (Rp. 3k)");

        pembelian.add(rbKartuKredit);
        rbKartuKredit.setText("Kartu Kredit (Rp. 5k)");

        pembelian.add(rbCash);
        rbCash.setSelected(true);
        rbCash.setText("Cash (0%)");
        rbCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCashActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel14.setText("Kembalian (terasuk fee)");

        lbKembalian.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        lbKembalian.setText("Rp. 0 (+Rp. 0)");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnHitungKembalian.setText("Hitung Kembalian");
        btnHitungKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungKembalianActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel10.setText("Rp.");

        cmbNama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Andika", "Nanang", "Maulvi", "Umum" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(btnHitungPembelian)
                                    .addComponent(rbEwallet)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbShopeepay)
                                            .addComponent(rbGopay)
                                            .addComponent(rbQris))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbCash)
                                            .addComponent(rbKartuKredit)
                                            .addComponent(rbKartuDebit)))
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12))
                                .addGap(0, 64, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnHitungKembalian)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lbKembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReset))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbSaldoPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(cmbNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHitungPembelian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPembelian)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbSaldoPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbGopay)
                    .addComponent(rbKartuKredit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbShopeepay)
                    .addComponent(rbKartuDebit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbQris)
                    .addComponent(rbCash))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbEwallet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHitungKembalian)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKembalian)
                    .addComponent(btnReset))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbNasgor)
                    .addComponent(cbSoto)
                    .addComponent(cbBakso)
                    .addComponent(cbMieAyam)
                    .addComponent(cbAyamGeprek)
                    .addComponent(cbEsTeh)
                    .addComponent(cbEsJeruk)
                    .addComponent(cbEsCampur))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNasgor)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSoto)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBakso)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMieAyam)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAyamGeprek)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEsTeh)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEsJeruk)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEsCampur)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Metode Pembayaran");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbEsJerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEsJerukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEsJerukActionPerformed

    private void cbEsCampurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEsCampurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEsCampurActionPerformed

    private void rbCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCashActionPerformed

    private void btnHitungPembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungPembelianActionPerformed
        // TODO add your handling code here:
        double total = 0;
        if (cbNasgor.isSelected()) {
            total += 12000;
        }
        if (cbSoto.isSelected()) {
            total += 7000;
        }
        if (cbBakso.isSelected()) {
            total += 15000;
        }
        if (cbMieAyam.isSelected()) {
            total += 13000;
        }
        if (cbAyamGeprek.isSelected()) {
            total += 10000;
        }
        if (cbEsTeh.isSelected()) {
            total += 3000;
        }
        if (cbEsJeruk.isSelected()) {
            total += 4000;
        }
        if (cbEsCampur.isSelected()) {
            total += 7000;
        }
        lbPembelian.setText(String.valueOf(total));
        totalPembelian = total;
        tbSaldoPembeli.setEditable(true);
    }//GEN-LAST:event_btnHitungPembelianActionPerformed

    private void btnHitungKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungKembalianActionPerformed
        // TODO add your handling code here:
        double uangSaldoPembeli = Double.parseDouble(tbSaldoPembeli.getText());
        
        int user_rekening;
        String nama = String.valueOf(cmbNama.getSelectedItem());
        switch (nama) {
            case "Andika":
                user_rekening = 12345678;
                break;
            case "Nanang":
                user_rekening = 23456789;
                break;
            case "Maulvi":
                user_rekening = 34567890;
                break;
            default:
                user_rekening = 00000000;
                break;
        }
        
        double biaya_layanan = 0;
        double total_kembalian = 0;
        if (rbGopay.isSelected()) {
            biaya_layanan = 3 * totalPembelian / 100;
            
            double kembalian = pb.BayarGoPay(user_rekening, uangSaldoPembeli, totalPembelian);
            total_kembalian = kembalian - biaya_layanan;
        } else if (rbShopeepay.isSelected()) {
            biaya_layanan = 3 * totalPembelian / 100;
            
            double kembalian = pb.BayarShopee(user_rekening, uangSaldoPembeli, totalPembelian);
            total_kembalian = kembalian - biaya_layanan;
        } else if (rbQris.isSelected()) {
            biaya_layanan = 5 * totalPembelian / 100;
            
            double kembalian = pb.BayarQris(uangSaldoPembeli, "123", totalPembelian);
            total_kembalian = kembalian - biaya_layanan;
        } else if (rbEwallet.isSelected()) {
            biaya_layanan = 7 * totalPembelian / 100;
            
            double kembalian = pb.BayareWallet(uangSaldoPembeli, 1234, user_rekening, totalPembelian);
            total_kembalian = kembalian - biaya_layanan;
        } else if (rbKartuKredit.isSelected()) {
            biaya_layanan = 5000;
            
            double kembalian = pb.BayarKreditCard(uangSaldoPembeli, 1234, user_rekening, totalPembelian);
            total_kembalian = kembalian - biaya_layanan;
        } else if (rbKartuDebit.isSelected()) {
            biaya_layanan = 3000;
            
            double kembalian = pb.BayarDebitCard(uangSaldoPembeli, 1234, user_rekening, totalPembelian);
            total_kembalian = kembalian - biaya_layanan;
        } else {
            biaya_layanan = 0;
            
            double kembalian = pb.BayarCash(uangSaldoPembeli, totalPembelian);
            total_kembalian = kembalian - biaya_layanan;
        }
        
        if (total_kembalian <= 0) {
            JOptionPane.showMessageDialog(this, "Saldo atau uang Anda tidak cukup", "Peringata!", JOptionPane.ERROR_MESSAGE);
        }
        lbKembalian.setText("Rp. " + String.valueOf(total_kembalian) + "(+Rp. " + String.valueOf(biaya_layanan) + ")");
    }//GEN-LAST:event_btnHitungKembalianActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        cbNasgor.setSelected(false);
        cbSoto.setSelected(false);
        cbBakso.setSelected(false);
        cbMieAyam.setSelected(false);
        cbAyamGeprek.setSelected(false);
        cbEsTeh.setSelected(false);
        cbEsJeruk.setSelected(false);
        cbEsCampur.setSelected(false);
        
        cmbNama.setSelectedIndex(0);
        lbPembelian.setText("0");
        tbSaldoPembeli.setEditable(false);
        rbCash.setSelected(true);
        lbKembalian.setText("0 (+Rp. 0");
    }//GEN-LAST:event_btnResetActionPerformed
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
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembayaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembayaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitungKembalian;
    private javax.swing.JButton btnHitungPembelian;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox cbAyamGeprek;
    private javax.swing.JCheckBox cbBakso;
    private javax.swing.JCheckBox cbEsCampur;
    private javax.swing.JCheckBox cbEsJeruk;
    private javax.swing.JCheckBox cbEsTeh;
    private javax.swing.JCheckBox cbMieAyam;
    private javax.swing.JCheckBox cbNasgor;
    private javax.swing.JCheckBox cbSoto;
    private javax.swing.JComboBox<String> cmbNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbKembalian;
    private javax.swing.JLabel lbPembelian;
    private javax.swing.ButtonGroup pembelian;
    private javax.swing.JRadioButton rbCash;
    private javax.swing.JRadioButton rbEwallet;
    private javax.swing.JRadioButton rbGopay;
    private javax.swing.JRadioButton rbKartuDebit;
    private javax.swing.JRadioButton rbKartuKredit;
    private javax.swing.JRadioButton rbQris;
    private javax.swing.JRadioButton rbShopeepay;
    private javax.swing.JTextField tbSaldoPembeli;
    // End of variables declaration//GEN-END:variables
}
