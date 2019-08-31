package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setTitle("StickyCalendar 2.0");
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(400, 160);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

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
    
    public void Esconder(){
    
        Object [] opciones ={"Cerrar Todo", "Cerrar Ventana Actual"};
        int eleccion = JOptionPane.showOptionDialog(rootPane,"¿En realidad desea cerrar la aplicación o sólo esta ventana? ","Mensaje de Confirmacion",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,opciones,"Cerrar Todo");
        if (eleccion == JOptionPane.YES_OPTION){
        
            System.exit(0);
        }else{
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        }
    }
       
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_setDate = new javax.swing.JButton();
        btn_getDate = new javax.swing.JButton();
        jLabel_welcome = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_setDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_setDate.setText("Fechas Añadidas");
        btn_setDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_setDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setDateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_setDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 120, 30));

        btn_getDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_getDate.setText("Nueva Fecha");
        btn_getDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_getDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getDateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_getDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 120, 30));

        jLabel_welcome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_welcome.setForeground(new java.awt.Color(51, 153, 255));
        jLabel_welcome.setText("WELCOME TO STICKY CALENDAR 2.0");
        getContentPane().add(jLabel_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_setDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setDateActionPerformed
        if (evt.getSource() == btn_setDate) {
            Dates_Add da = new Dates_Add();
            da.setVisible(true);

        }
    }//GEN-LAST:event_btn_setDateActionPerformed

    private void btn_getDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getDateActionPerformed
        if (evt.getSource() == btn_getDate) {
            Calendar c = new Calendar();
            c.setVisible(true);   

        }
    }//GEN-LAST:event_btn_getDateActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Esconder();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_getDate;
    private javax.swing.JButton btn_setDate;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JLabel jLabel_welcome;
    // End of variables declaration//GEN-END:variables
}
