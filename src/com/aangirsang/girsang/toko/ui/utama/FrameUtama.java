/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aangirsang.girsang.toko.ui.utama;


import com.aangirsang.girsang.toko.popup.PopUpMenuMaster;
import com.aangirsang.girsang.toko.popup.PopUpMenuTransaksi;
import com.aangirsang.girsang.toko.service.MasterService;
import com.aangirsang.girsang.toko.service.TransaksiService;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import org.apache.log4j.Logger;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.openide.util.Exceptions;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ITSUSAHBRO
 */
public class FrameUtama extends javax.swing.JFrame {

    private static final Logger log = Logger.getLogger(FrameUtama.class);
    private static FrameUtama instance;
    private static MasterService masterService;
    private static TransaksiService transaksiService;

    public static FrameUtama getInstance() {
        return instance;
    }

    public static MasterService getMasterService() {
        return masterService;
    }

    public static TransaksiService getTransaksiService() {
        return transaksiService;
    }

    public static void jam(JDateChooser jdc) {
        Thread t = new Thread(() -> {
            while(true){
                jdc.setDateFormatString("EEE, MMM dd yyyy HH:mm:ss");
                jdc.setDate(new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        });
        t.start();
    }
    /**
     * Creates new form FrameUtama
     */
    public FrameUtama() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPopupMenu popUpMenuMaster = new JPopupMenu();
        JPopupMenu popUpMenuTransaksi = new JPopupMenu();
        PopUpMenuMaster MenuMaster = new PopUpMenuMaster(tabbedPane, popUpMenuMaster, btnMaster);
        PopUpMenuTransaksi MenuTransaksi = new PopUpMenuTransaksi(tabbedPane, popUpMenuTransaksi, btnTransaksi);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        btnTransaksi = new javax.swing.JButton();
        btnMaster = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();
        panelHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblJam = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        btnTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Mutasi 32.png"))); // NOI18N
        btnTransaksi.setText("Transaksi");
        btnTransaksi.setFocusable(false);
        btnTransaksi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTransaksi.setPreferredSize(new java.awt.Dimension(55, 65));
        btnTransaksi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnTransaksi);

        btnMaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/shop.png"))); // NOI18N
        btnMaster.setText("Master");
        btnMaster.setFocusable(false);
        btnMaster.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaster.setMaximumSize(new java.awt.Dimension(51, 57));
        btnMaster.setMinimumSize(new java.awt.Dimension(51, 57));
        btnMaster.setPreferredSize(new java.awt.Dimension(55, 65));
        btnMaster.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnMaster);

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1026, Short.MAX_VALUE)
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Home", panelHome);

        jLabel2.setText("USER");

        lblJam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJam.setText("USER");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblJam, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJam)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.generalNoTranslucencyShadow;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
            UIManager.put("RootPane.setupButtonVisible", Boolean.FALSE);

            AbstractApplicationContext ctx
                    = new ClassPathXmlApplicationContext("classpath*:/applicationContext.xml");
            ctx.registerShutdownHook();

            masterService = (MasterService) ctx.getBean("MasterService");
            transaksiService = (TransaksiService) ctx.getBean("TransaksiService");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Terjadi Masalah Pada Database","Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            System.exit(0);
        }    
        
        java.awt.EventQueue.invokeLater(() -> {
            FrameUtama fu = new FrameUtama();
            fu.setExtendedState(JFrame.MAXIMIZED_BOTH);
            fu.setVisible(true);
            fu.jam();
        });
    }

    public JTabbedPane getTabbedPanel() {
        return tabbedPane;
    }
    private void jam(){
        Thread t = new Thread(() -> {
            while(true){
                lblJam.setText(new SimpleDateFormat(
                        "EEE, MMM dd yyyy HH:mm:ss")
                        .format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        });
        t.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMaster;
    private javax.swing.JButton btnTransaksi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblJam;
    private javax.swing.JPanel panelHome;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
