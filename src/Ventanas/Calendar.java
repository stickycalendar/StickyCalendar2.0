package Ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.WindowConstants;
import Clases.Conexion;
import java.sql.*;
import java.text.DateFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class Calendar extends javax.swing.JFrame {
    
    DateFormat df = DateFormat.getDateInstance();
    
    public Calendar() {
        initComponents();
        Color c = Day_Note.c;

        getContentPane().setBackground(Color.getColor(null, c));
        setSize(400, 300);
        setTitle("StickyCalendar 2.0");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        
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
        Button_validar = new javax.swing.JButton();
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
        getContentPane().add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 120, 25));

        jButton_CN.setBackground(new java.awt.Color(255, 255, 255));
        jButton_CN.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton_CN.setText("Crear Nota");
        jButton_CN.setBorder(null);
        jButton_CN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CNActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_CN, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 200, 90, 25));

        Button_validar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Button_validar.setText("Validar Fecha");
        Button_validar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_validarActionPerformed(evt);
            }
        });
        getContentPane().add(Button_validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_validarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_validarActionPerformed
            
        String fechaO = df.format(Date1.getDate());
        txt_fecha.setText(fechaO);
    }//GEN-LAST:event_Button_validarActionPerformed

    private void jButton_CNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CNActionPerformed
        int validar = 0;    
        String fecha1;
            
            fecha1 = txt_fecha.getText().trim();
            
            if (fecha1.equals("")) {
            txt_fecha.setBackground(Color.red);
            validar++;
        }
            if(validar == 0){
                try{
             Connection cn = Conexion.Conectar();
             
             PreparedStatement pst = cn.prepareStatement("insert into calendar values (?,?)");
             
             pst.setInt(1, 0);
             pst.setString(2, fecha1);
             
             pst.executeUpdate();
             cn.close();
             Limpiar();
             this.dispose();
             
             Day_Note dn = new Day_Note();
             dn.setVisible(true);
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Error al añadir fecha");
         }
            }else{
                JOptionPane.showMessageDialog(null, "Fecha no añadida");
            }
            
            
            
    }//GEN-LAST:event_jButton_CNActionPerformed

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
    private javax.swing.JButton Button_validar;
    private com.toedter.calendar.JDateChooser Date1;
    private javax.swing.JButton jButton_CN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_fecha;
    // End of variables declaration//GEN-END:variables
}
