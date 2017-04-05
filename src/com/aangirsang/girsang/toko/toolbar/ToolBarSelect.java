/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aangirsang.girsang.toko.toolbar;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @author ITSUSAHBRO
 */
public class ToolBarSelect extends javax.swing.JPanel {

    /**
     * Creates new form Button
     */
    public ToolBarSelect() {
        initComponents();
    }

    public JButton getBtnPilih() {
        return btnPilih;
    }
    public JButton getBtnBaru() {
        return btnBaru;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JButton getBtnHapus() {
        return btnHapus;
    }

    public JButton getBtnKeluar() {
        return btnKeluar;
    }

    public JButton getBtnRefresh() {
        return btnRefresh;
    }

    public JToolBar getToolBar() {
        return toolbar;
    }

    public JTextField getTxtCari() {
        return txtCari;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolbar = new javax.swing.JToolBar();
        btnPilih = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnBaru = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnRefresh = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnKeluar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();

        toolbar.setFloatable(false);
        toolbar.setAutoscrolls(true);
        toolbar.setBorderPainted(false);
        toolbar.setDoubleBuffered(true);
        toolbar.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btnPilih.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/app-download-icon-32.png"))); // NOI18N
        btnPilih.setText("Pilih");
        btnPilih.setFocusable(false);
        btnPilih.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPilih.setMaximumSize(new java.awt.Dimension(55, 57));
        btnPilih.setMinimumSize(new java.awt.Dimension(55, 57));
        btnPilih.setPreferredSize(new java.awt.Dimension(55, 57));
        btnPilih.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbar.add(btnPilih);
        toolbar.add(jSeparator3);

        btnBaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/app-icon-32.png"))); // NOI18N
        btnBaru.setText("Baru");
        btnBaru.setFocusable(false);
        btnBaru.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBaru.setMaximumSize(new java.awt.Dimension(55, 57));
        btnBaru.setMinimumSize(new java.awt.Dimension(55, 57));
        btnBaru.setPreferredSize(new java.awt.Dimension(55, 57));
        btnBaru.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbar.add(btnBaru);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/app-edit-icon-32.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setFocusable(false);
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.setMaximumSize(new java.awt.Dimension(55, 57));
        btnEdit.setMinimumSize(new java.awt.Dimension(55, 57));
        btnEdit.setPreferredSize(new java.awt.Dimension(55, 57));
        btnEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbar.add(btnEdit);

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/app-delete-icon-32.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setFocusable(false);
        btnHapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHapus.setMaximumSize(new java.awt.Dimension(55, 57));
        btnHapus.setMinimumSize(new java.awt.Dimension(55, 57));
        btnHapus.setPreferredSize(new java.awt.Dimension(55, 57));
        btnHapus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbar.add(btnHapus);
        toolbar.add(jSeparator2);

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/database_refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setFocusable(false);
        btnRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefresh.setMaximumSize(new java.awt.Dimension(55, 57));
        btnRefresh.setMinimumSize(new java.awt.Dimension(55, 57));
        btnRefresh.setPreferredSize(new java.awt.Dimension(55, 57));
        btnRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbar.add(btnRefresh);
        toolbar.add(jSeparator1);

        btnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logout-icon-32.png"))); // NOI18N
        btnKeluar.setText("Tutup");
        btnKeluar.setFocusable(false);
        btnKeluar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKeluar.setMaximumSize(new java.awt.Dimension(55, 57));
        btnKeluar.setMinimumSize(new java.awt.Dimension(55, 57));
        btnKeluar.setPreferredSize(new java.awt.Dimension(55, 57));
        btnKeluar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbar.add(btnKeluar);

        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbar.add(jButton1);

        txtCari.setText("jTextField1");
        txtCari.setAutoscrolls(false);
        txtCari.setMaximumSize(new java.awt.Dimension(200, 20));
        txtCari.setMinimumSize(new java.awt.Dimension(200, 20));
        txtCari.setPreferredSize(new java.awt.Dimension(200, 20));
        toolbar.add(txtCari);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaru;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnPilih;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton jButton1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar toolbar;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables
}
