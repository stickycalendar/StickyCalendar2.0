package Ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.WindowConstants;
import Clases.Conexion;
import java.sql.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Calendar extends javax.swing.JFrame {

    DateFormat df = DateFormat.getDateInstance();
    public static String date_update2 = "";

    public Calendar() {
        initComponents();
        date_update2 = Dates_Add.date_update;
        setSize(400, 250);
        setTitle("StickyCalendar 2.0");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper.png");

        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_wallpaper.getWidth(),
                jLabel_wallpaper.getHeight(), Image.SCALE_DEFAULT));

        jLabel_wallpaper.setIcon(icono);
        this.repaint();

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));

        return retValue;
    }

    public void Limpiar() {
        txt_fecha.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Date1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jButton_CN = new javax.swing.JButton();
        btn_validar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Date1.setMinSelectableDate(new java.util.Date(-62135744308000L));
        getContentPane().add(Date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 150, 25));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Ingrese La Fecha Que Desee");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        txt_fecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_fecha.setEnabled(false);
        getContentPane().add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, 25));

        jButton_CN.setBackground(new java.awt.Color(255, 255, 255));
        jButton_CN.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton_CN.setText("Crear Nota");
        jButton_CN.setBorder(null);
        jButton_CN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CNActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 90, 25));

        btn_validar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_validar.setText("Validar Fecha");
        btn_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Volver.png"))); // NOI18N
        btn_volver.setBorder(null);
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validarActionPerformed

        String fecha2 = df.format(Date1.getDate());
        txt_fecha.setText(fecha2);
    }//GEN-LAST:event_btn_validarActionPerformed

    private void jButton_CNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CNActionPerformed
        int validar = 0;

        date_update2 = txt_fecha.getText().trim();

        if (date_update2.equals("")) {
            validar++;
        }

        try {
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select Fecha from calendar where Fecha = '" + date_update2 + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Fecha no disponible");
                cn.close();
            } else {
                cn.close();

                if (validar == 0) {
                    try {
                        Connection cn2 = Conexion.Conectar();

                        PreparedStatement pst2 = cn2.prepareStatement("insert into calendar values (?,?)");

                        pst2.setInt(1, 0);
                        pst2.setString(2, date_update2);

                        pst2.executeUpdate();

                        Day_Note dn = new Day_Note();
                        dn.setVisible(true);
                        this.dispose();

                        cn2.close();
                        Limpiar();

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error al añadir fecha");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha no añadida");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error en validar fecha" + e);
        }


    }//GEN-LAST:event_jButton_CNActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        if (evt.getSource() == btn_volver) {
            Principal.getFrames();
            this.dispose();
        }
    }//GEN-LAST:event_btn_volverActionPerformed

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
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date1;
    private javax.swing.JButton btn_validar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JButton jButton_CN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_fecha;
    // End of variables declaration//GEN-END:variables
}
