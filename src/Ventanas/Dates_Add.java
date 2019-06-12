package Ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import java.sql.*;
import Clases.Conexion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Dates_Add extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    public static String date_update1 = "";
    
    public Dates_Add() {
        initComponents();
        
        setTitle("StickyCalendar 2.0");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(Color.LIGHT_GRAY);
        
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper.png");

        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper.getWidth(),
                jLabel_wallpaper.getHeight(), Image.SCALE_DEFAULT));

        jLabel_wallpaper.setIcon(icono);
        this.repaint();

        try {
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select Fecha from calendar");

            ResultSet rs = pst.executeQuery();

            jTable_fecha = new JTable(model);
            jScrollPane1.setViewportView(jTable_fecha);
            
            model.addColumn("Fecha");

            while (rs.next()) {
                Object[] fila = new Object[1];

                for (int i = 0; i < 1; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al llenar tabla" + e);
            JOptionPane.showMessageDialog(null, "Error al mostrar información.");
        }

        jTable_fecha.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_fecha.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    date_update1 = (String) model.getValueAt(fila_point, columna_point);
                    setVisible(false);
                    
                    Day_Note dn = new Day_Note();
                    dn.setVisible(true);
                    dn.setTitle("StickyCalendar 2.0 - " + date_update1);
                    dn.date_update = date_update1;
                    
                }
            } 
        });
    }
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));

        return retValue;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_fecha = new javax.swing.JTable();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Volver.png"))); // NOI18N
        btn_volver.setBorder(null);
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Seleccionar Fecha");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jTable_fecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable_fecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jTable_fecha.setEnabled(false);
        jTable_fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_fechaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_fecha);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 120, 210));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed

        if (evt.getSource() == btn_volver) {
            Principal.getFrames();
            this.dispose();
        }
    }//GEN-LAST:event_btn_volverActionPerformed

    private void jTable_fechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_fechaMouseClicked
        
    }//GEN-LAST:event_jTable_fechaMouseClicked

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
            java.util.logging.Logger.getLogger(Dates_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dates_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dates_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dates_Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dates_Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_fecha;
    // End of variables declaration//GEN-END:variables
}
