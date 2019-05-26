package Ventanas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import Clases.Conexion;
import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;

public class Homework extends javax.swing.JFrame {

    Timer t = new Timer();

    public Homework() {
        initComponents();
        Color c = Day_Note.c;

        getContentPane().setBackground(Color.getColor(null, c));
        setSize(400, 370);
        setTitle("StickyCalendar 2.0");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jMenu_noti.setVisible(false);
        jMenuItem_AcNotificacion.setVisible(true);
        jMenuItem_DeNotificaciones.setVisible(false);
        jMenu_TimeNotificacion.setVisible(false);
        jMenu_notificaciones.setVisible(false);
        Delete1.setVisible(false);
        Delete2.setVisible(false);
        Delete3.setVisible(false);
        Delete4.setVisible(false);
        Delete5.setVisible(false);

        SobreEs1.setVisible(false);
        SobreEs2.setVisible(false);
        SobreEs3.setVisible(false);
        SobreEs4.setVisible(false);
        SobreEs5.setVisible(false);

        select1.setVisible(false);
        select2.setVisible(false);
        select3.setVisible(false);
        select4.setVisible(false);
        select5.setVisible(false);

        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);

    }

    //cambiar Icono:
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));

        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_add1 = new javax.swing.JButton();
        jButton_add2 = new javax.swing.JButton();
        jButton_add3 = new javax.swing.JButton();
        jButton_add4 = new javax.swing.JButton();
        jButton_add5 = new javax.swing.JButton();
        Delete1 = new javax.swing.JButton();
        Delete2 = new javax.swing.JButton();
        Delete3 = new javax.swing.JButton();
        Delete4 = new javax.swing.JButton();
        Delete5 = new javax.swing.JButton();
        SobreEs1 = new javax.swing.JButton();
        SobreEs2 = new javax.swing.JButton();
        SobreEs3 = new javax.swing.JButton();
        SobreEs4 = new javax.swing.JButton();
        SobreEs5 = new javax.swing.JButton();
        select1 = new javax.swing.JCheckBox();
        select2 = new javax.swing.JCheckBox();
        select3 = new javax.swing.JCheckBox();
        select4 = new javax.swing.JCheckBox();
        select5 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_opciones = new javax.swing.JMenu();
        jMenuItem_Guardar = new javax.swing.JMenuItem();
        jMenuItem_cerrar = new javax.swing.JMenuItem();
        jMenu_tareas = new javax.swing.JMenu();
        jMenuItem_ResTareas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_BorrarT = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_EditarT = new javax.swing.JMenuItem();
        jMenu_notificaciones = new javax.swing.JMenu();
        jMenuItem_AcNotificacion = new javax.swing.JMenuItem();
        jMenuItem_DeNotificaciones = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu_TimeNotificacion = new javax.swing.JMenu();
        jMenuItem_5 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_10 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_15 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_30 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_45 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_60 = new javax.swing.JMenuItem();
        jMenu_noti = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_add1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton_add1.setText("ADD TAREA 1");
        jButton_add1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_add1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 30));

        jButton_add2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton_add2.setText("ADD TAREA 2");
        jButton_add2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, 30));

        jButton_add3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton_add3.setText("ADD TAREA 3");
        jButton_add3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 30));

        jButton_add4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton_add4.setText("ADD TAREA 4");
        jButton_add4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 30));

        jButton_add5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton_add5.setText("ADD TAREA 5");
        jButton_add5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_add5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_add5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 30));

        Delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/papelera1.png"))); // NOI18N
        Delete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete1ActionPerformed(evt);
            }
        });
        getContentPane().add(Delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 45, 35, 33));

        Delete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/papelera1.png"))); // NOI18N
        Delete2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete2ActionPerformed(evt);
            }
        });
        getContentPane().add(Delete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 95, 35, 33));

        Delete3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/papelera1.png"))); // NOI18N
        Delete3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete3ActionPerformed(evt);
            }
        });
        getContentPane().add(Delete3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 145, 30, 33));

        Delete4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/papelera1.png"))); // NOI18N
        Delete4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete4ActionPerformed(evt);
            }
        });
        getContentPane().add(Delete4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 195, 35, 33));

        Delete5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/papelera1.png"))); // NOI18N
        Delete5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete5ActionPerformed(evt);
            }
        });
        getContentPane().add(Delete5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 245, 35, 33));

        SobreEs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz1.png"))); // NOI18N
        SobreEs1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SobreEs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreEs1ActionPerformed(evt);
            }
        });
        getContentPane().add(SobreEs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 45, 35, 33));

        SobreEs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz1.png"))); // NOI18N
        SobreEs2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SobreEs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreEs2ActionPerformed(evt);
            }
        });
        getContentPane().add(SobreEs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 95, 35, 33));

        SobreEs3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz1.png"))); // NOI18N
        SobreEs3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SobreEs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreEs3ActionPerformed(evt);
            }
        });
        getContentPane().add(SobreEs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 145, 35, 33));

        SobreEs4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz1.png"))); // NOI18N
        SobreEs4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SobreEs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreEs4ActionPerformed(evt);
            }
        });
        getContentPane().add(SobreEs4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 195, 35, 33));

        SobreEs5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz1.png"))); // NOI18N
        SobreEs5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SobreEs5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreEs5ActionPerformed(evt);
            }
        });
        getContentPane().add(SobreEs5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 245, 35, 33));
        getContentPane().add(select1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 45, 35, 33));
        getContentPane().add(select2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 95, 35, 33));
        getContentPane().add(select3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 145, 35, 33));
        getContentPane().add(select4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 195, 35, 33));
        getContentPane().add(select5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 245, 35, 33));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, 25));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 25));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 25));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 25));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        jMenu_opciones.setText("Opciones");
        jMenu_opciones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem_Guardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem_Guardar.setText("Guardar");
        jMenu_opciones.add(jMenuItem_Guardar);

        jMenuItem_cerrar.setText("Cerrar");
        jMenuItem_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerrarActionPerformed(evt);
            }
        });
        jMenu_opciones.add(jMenuItem_cerrar);

        jMenuBar1.add(jMenu_opciones);

        jMenu_tareas.setText("Tareas");
        jMenu_tareas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem_ResTareas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem_ResTareas.setText("Restablecer Tareas\n");
        jMenuItem_ResTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ResTareasActionPerformed(evt);
            }
        });
        jMenu_tareas.add(jMenuItem_ResTareas);
        jMenu_tareas.add(jSeparator2);

        jMenuItem_BorrarT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem_BorrarT.setText("Borrar Tarea");
        jMenuItem_BorrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_BorrarTActionPerformed(evt);
            }
        });
        jMenu_tareas.add(jMenuItem_BorrarT);
        jMenu_tareas.add(jSeparator3);

        jMenuItem_EditarT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem_EditarT.setText("Editar Tarea");
        jMenuItem_EditarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_EditarTActionPerformed(evt);
            }
        });
        jMenu_tareas.add(jMenuItem_EditarT);

        jMenuBar1.add(jMenu_tareas);

        jMenu_notificaciones.setText("Notificaciones");
        jMenu_notificaciones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem_AcNotificacion.setText("Activar Notificaciones");
        jMenuItem_AcNotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AcNotificacionActionPerformed(evt);
            }
        });
        jMenu_notificaciones.add(jMenuItem_AcNotificacion);

        jMenuItem_DeNotificaciones.setText("Desactivar Notificaciones");
        jMenuItem_DeNotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_DeNotificacionesActionPerformed(evt);
            }
        });
        jMenu_notificaciones.add(jMenuItem_DeNotificaciones);
        jMenu_notificaciones.add(jSeparator1);

        jMenu_TimeNotificacion.setText("Tiempo de Notificacion");

        jMenuItem_5.setText("5 Min");
        jMenuItem_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_5ActionPerformed(evt);
            }
        });
        jMenu_TimeNotificacion.add(jMenuItem_5);
        jMenu_TimeNotificacion.add(jSeparator4);

        jMenuItem_10.setText("10 Min");
        jMenuItem_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_10ActionPerformed(evt);
            }
        });
        jMenu_TimeNotificacion.add(jMenuItem_10);
        jMenu_TimeNotificacion.add(jSeparator5);

        jMenuItem_15.setText("15 Min");
        jMenuItem_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_15ActionPerformed(evt);
            }
        });
        jMenu_TimeNotificacion.add(jMenuItem_15);
        jMenu_TimeNotificacion.add(jSeparator6);

        jMenuItem_30.setText("30 Min");
        jMenuItem_30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_30ActionPerformed(evt);
            }
        });
        jMenu_TimeNotificacion.add(jMenuItem_30);
        jMenu_TimeNotificacion.add(jSeparator7);

        jMenuItem_45.setText("45 Min");
        jMenuItem_45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_45ActionPerformed(evt);
            }
        });
        jMenu_TimeNotificacion.add(jMenuItem_45);
        jMenu_TimeNotificacion.add(jSeparator8);

        jMenuItem_60.setText("60 Min");
        jMenuItem_60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_60ActionPerformed(evt);
            }
        });
        jMenu_TimeNotificacion.add(jMenuItem_60);

        jMenu_notificaciones.add(jMenu_TimeNotificacion);

        jMenuBar1.add(jMenu_notificaciones);

        jMenu_noti.setForeground(new java.awt.Color(102, 255, 0));
        jMenuBar1.add(jMenu_noti);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //cerrar
    private void jMenuItem_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrarActionPerformed
        if (evt.getSource() == jMenuItem_cerrar) {
            this.setVisible(false);

        }
    }//GEN-LAST:event_jMenuItem_cerrarActionPerformed
    //Notificaciones activas e inactivas
    private void jMenuItem_AcNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AcNotificacionActionPerformed

        if (evt.getSource() == jMenuItem_AcNotificacion) {
            jMenu_noti.setVisible(true);
            jMenuItem_DeNotificaciones.setVisible(true);
            jMenuItem_AcNotificacion.setVisible(false);
            jMenu_noti.setText("Notificaciones Activadas");
            jMenu_noti.setForeground(Color.green);
            jMenu_TimeNotificacion.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem_AcNotificacionActionPerformed

    private void jMenuItem_DeNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_DeNotificacionesActionPerformed
        if (evt.getSource() == jMenuItem_DeNotificaciones) {
            jMenu_noti.setVisible(true);
            jMenu_noti.setText("Notificaciones Desactivadas");
            jMenu_noti.setForeground(Color.red);
            jMenuItem_DeNotificaciones.setVisible(false);
            jMenuItem_AcNotificacion.setVisible(true);
            jMenu_TimeNotificacion.setVisible(false);
            t.cancel();
        }
    }//GEN-LAST:event_jMenuItem_DeNotificacionesActionPerformed
    //Botones de añadir tareas
    private void jButton_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add1ActionPerformed
        if (evt.getSource() == jButton_add1) {
            String Tar1 = null;
            Tar1 = JOptionPane.showInputDialog("Ingrese su tarea");
            jLabel1.setText(Tar1);
            jLabel1.setVisible(true);
            jButton_add1.setVisible(false);
            Delete1.setVisible(true);
            SobreEs1.setVisible(true);
            select1.setVisible(true);
            jMenu_notificaciones.setVisible(true);

        }
    }//GEN-LAST:event_jButton_add1ActionPerformed

    private void jButton_add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add2ActionPerformed
        if (evt.getSource() == jButton_add2) {
            String Tar2 = null;
            Tar2 = JOptionPane.showInputDialog("Ingrese su tarea");
            jLabel2.setText(Tar2);
            jLabel2.setVisible(true);
            jButton_add2.setVisible(false);
            Delete2.setVisible(true);
            SobreEs2.setVisible(true);
            select2.setVisible(true);
            jMenu_notificaciones.setVisible(true);

        }
    }//GEN-LAST:event_jButton_add2ActionPerformed

    private void jButton_add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add3ActionPerformed
        if (evt.getSource() == jButton_add3) {
            String Tar3 = null;
            Tar3 = JOptionPane.showInputDialog("Ingrese su tarea");
            jLabel3.setText(Tar3);
            jLabel3.setVisible(true);
            jButton_add3.setVisible(false);
            Delete3.setVisible(true);
            SobreEs3.setVisible(true);
            select3.setVisible(true);
            jMenu_notificaciones.setVisible(true);

        }
    }//GEN-LAST:event_jButton_add3ActionPerformed

    private void jButton_add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add4ActionPerformed
        if (evt.getSource() == jButton_add4) {
            String Tar4 = null;
            Tar4 = JOptionPane.showInputDialog("Ingrese su tarea");
            jLabel4.setText(Tar4);
            jLabel4.setVisible(true);
            jButton_add4.setVisible(false);
            Delete4.setVisible(true);
            SobreEs4.setVisible(true);
            select4.setVisible(true);
            jMenu_notificaciones.setVisible(true);

        }
    }//GEN-LAST:event_jButton_add4ActionPerformed

    private void jButton_add5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_add5ActionPerformed
        if (evt.getSource() == jButton_add5) {
            String Tar5 = null;
            Tar5 = JOptionPane.showInputDialog("Ingrese su tarea");
            jLabel5.setText(Tar5);
            jLabel5.setVisible(true);
            jButton_add5.setVisible(false);
            Delete5.setVisible(true);
            SobreEs5.setVisible(true);
            select5.setVisible(true);
            jMenu_notificaciones.setVisible(true);

        }
    }//GEN-LAST:event_jButton_add5ActionPerformed
    //borrar tareas
    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete1ActionPerformed
        if (evt.getSource() == Delete1) {
            jLabel1.setVisible(false);
            jLabel1.setText(null);
            jButton_add1.setVisible(true);
            Delete1.setVisible(false);
            SobreEs1.setVisible(false);
            select1.setVisible(false);
            
        }
    }//GEN-LAST:event_Delete1ActionPerformed

    private void Delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete2ActionPerformed
        if (evt.getSource() == Delete2) {
            jLabel2.setVisible(false);
            jLabel2.setText(null);
            jButton_add2.setVisible(true);
            Delete2.setVisible(false);
            SobreEs2.setVisible(false);
            select2.setVisible(false);
            
        }
    }//GEN-LAST:event_Delete2ActionPerformed

    private void Delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete3ActionPerformed
        if (evt.getSource() == Delete3) {
            jLabel3.setVisible(false);
            jLabel3.setText(null);
            jButton_add3.setVisible(true);
            Delete3.setVisible(false);
            SobreEs3.setVisible(false);
            select3.setVisible(false);
        }
    }//GEN-LAST:event_Delete3ActionPerformed

    private void Delete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete4ActionPerformed
        if (evt.getSource() == Delete4) {
            jLabel4.setVisible(false);
            jLabel4.setText(null);
            jButton_add4.setVisible(true);
            Delete4.setVisible(false);
            SobreEs4.setVisible(false);
            select4.setVisible(false);
        }
    }//GEN-LAST:event_Delete4ActionPerformed

    private void Delete5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete5ActionPerformed
        if (evt.getSource() == Delete5) {
            jLabel5.setVisible(false);
            jLabel5.setText(null);
            jButton_add5.setVisible(true);
            Delete5.setVisible(false);
            SobreEs5.setVisible(false);
            select5.setVisible(false);
        }
    }//GEN-LAST:event_Delete5ActionPerformed
    //sobrescribir tareas
    private void SobreEs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreEs1ActionPerformed
        if (evt.getSource() == SobreEs1) {

            String SE1 = JOptionPane.showInputDialog("Sobreescriba la tarea");
            jLabel1.setText(SE1);

        }
    }//GEN-LAST:event_SobreEs1ActionPerformed

    private void SobreEs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreEs2ActionPerformed
        if (evt.getSource() == SobreEs2) {

            String SE2 = JOptionPane.showInputDialog("Sobreescriba la tarea");
            jLabel2.setText(SE2);

        }
    }//GEN-LAST:event_SobreEs2ActionPerformed

    private void SobreEs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreEs3ActionPerformed
        if (evt.getSource() == SobreEs3) {

            String SE3 = JOptionPane.showInputDialog("Sobreescriba la tarea");
            jLabel3.setText(SE3);

        }
    }//GEN-LAST:event_SobreEs3ActionPerformed

    private void SobreEs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreEs4ActionPerformed
        if (evt.getSource() == SobreEs4) {

            String SE4 = JOptionPane.showInputDialog("Sobreescriba la tarea");
            jLabel4.setText(SE4);

        }
    }//GEN-LAST:event_SobreEs4ActionPerformed

    private void SobreEs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreEs5ActionPerformed
        if (evt.getSource() == SobreEs5) {

            String SE5 = JOptionPane.showInputDialog("Sobreescriba la tarea");
            jLabel5.setText(SE5);

        }
    }//GEN-LAST:event_SobreEs5ActionPerformed
    //seleccion de tareas, borrar y editarlas
    private void jMenuItem_ResTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ResTareasActionPerformed
        if (evt.getSource() == jMenuItem_ResTareas) {
            jButton_add1.setVisible(true);
            jButton_add2.setVisible(true);
            jButton_add3.setVisible(true);
            jButton_add4.setVisible(true);
            jButton_add5.setVisible(true);

            Delete1.setVisible(false);
            Delete2.setVisible(false);
            Delete3.setVisible(false);
            Delete4.setVisible(false);
            Delete5.setVisible(false);

            jLabel1.setVisible(false);
            jLabel1.setText(null);
            jLabel2.setVisible(false);
            jLabel2.setText(null);
            jLabel2.setVisible(false);
            jLabel2.setText(null);
            jLabel3.setVisible(false);
            jLabel3.setText(null);
            jLabel3.setVisible(false);
            jLabel3.setText(null);

            SobreEs1.setVisible(false);
            SobreEs2.setVisible(false);
            SobreEs3.setVisible(false);
            SobreEs4.setVisible(false);
            SobreEs5.setVisible(false);

            select1.setVisible(false);
            select2.setVisible(false);
            select3.setVisible(false);
            select4.setVisible(false);
            select5.setVisible(false);
        }
    }//GEN-LAST:event_jMenuItem_ResTareasActionPerformed

    private void jMenuItem_BorrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_BorrarTActionPerformed
        if (evt.getSource() == jMenuItem_BorrarT) {
            if (select1.isSelected()) {
                select1.setVisible(false);
                jButton_add1.setVisible(true);
                Delete1.setVisible(false);
                SobreEs1.setVisible(false);
                jLabel1.setText(null);
                jLabel1.setVisible(false);
            }
            if (select2.isSelected()) {
                select2.setVisible(false);
                jButton_add2.setVisible(true);
                Delete2.setVisible(false);
                SobreEs2.setVisible(false);
                jLabel2.setText(null);
                jLabel2.setVisible(false);
            }
            if (select3.isSelected()) {
                select3.setVisible(false);
                jButton_add3.setVisible(true);
                Delete3.setVisible(false);
                SobreEs3.setVisible(false);
                jLabel3.setText(null);
                jLabel3.setVisible(false);
            }
            if (select4.isSelected()) {
                select4.setVisible(false);
                jButton_add4.setVisible(true);
                Delete4.setVisible(false);
                SobreEs4.setVisible(false);
                jLabel4.setText(null);
                jLabel4.setVisible(false);
            }
            if (select5.isSelected()) {
                select5.setVisible(false);
                jButton_add5.setVisible(true);
                Delete5.setVisible(false);
                SobreEs5.setVisible(false);
                jLabel5.setText(null);
                jLabel5.setVisible(false);
            }

        }

    }//GEN-LAST:event_jMenuItem_BorrarTActionPerformed

    private void jMenuItem_EditarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EditarTActionPerformed
        if (evt.getSource() == jMenuItem_EditarT) {
            if (select1.isSelected()) {
                String SE1 = JOptionPane.showInputDialog("Sobreescriba la tarea");
                jLabel1.setText(SE1);
            }
            if (select2.isSelected()) {
                String SE2 = JOptionPane.showInputDialog("Sobreescriba la tarea");
                jLabel2.setText(SE2);
            }
            if (select3.isSelected()) {
                String SE3 = JOptionPane.showInputDialog("Sobreescriba la tarea");
                jLabel3.setText(SE3);
            }
            if (select4.isSelected()) {
                String SE4 = JOptionPane.showInputDialog("Sobreescriba la tarea");
                jLabel4.setText(SE4);
            }
            if (select5.isSelected()) {
                String SE5 = JOptionPane.showInputDialog("Sobreescriba la tarea");
                jLabel5.setText(SE5);
            }
        }
    }//GEN-LAST:event_jMenuItem_EditarTActionPerformed

    //tiempo de notificación
    private void jMenuItem_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_5ActionPerformed
        if (evt.getSource() == jMenuItem_5) {

            TimerTask t2 = new TimerTask() {
                @Override
                public void run() {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Momento de realizar tarea.");
                }
            };
            t.schedule(t2, 300000, 300000);//5 min y en 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMenuItem_5ActionPerformed

    private void jMenuItem_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_10ActionPerformed
        if (evt.getSource() == jMenuItem_10) {

            TimerTask t2 = new TimerTask() {
                @Override
                public void run() {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Momento de realizar tarea.");
                }
            };
            t.schedule(t2, 600000, 300000);//10 min y en 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMenuItem_10ActionPerformed

    private void jMenuItem_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_15ActionPerformed
        if (evt.getSource() == jMenuItem_5) {

            TimerTask t2 = new TimerTask() {
                @Override
                public void run() {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Momento de realizar tarea.");
                }
            };
            t.schedule(t2, 900000, 300000);//15 min y en 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMenuItem_15ActionPerformed

    private void jMenuItem_30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_30ActionPerformed
        if (evt.getSource() == jMenuItem_5) {

            TimerTask t2 = new TimerTask() {
                @Override
                public void run() {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Momento de realizar tarea.");
                }
            };
            t.schedule(t2, 1800000, 300000);//30 min y en 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMenuItem_30ActionPerformed

    private void jMenuItem_45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_45ActionPerformed
        if (evt.getSource() == jMenuItem_5) {

            TimerTask t2 = new TimerTask() {
                @Override
                public void run() {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Momento de realizar tarea.");
                }
            };
            t.schedule(t2, 2700000, 300000);//45 min y en 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMenuItem_45ActionPerformed

    private void jMenuItem_60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_60ActionPerformed
        if (evt.getSource() == jMenuItem_5) {

            TimerTask t2 = new TimerTask() {
                @Override
                public void run() {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Momento de realizar tarea.");
                }
            };
            t.schedule(t2, 3600000, 300000);//60 min y en 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMenuItem_60ActionPerformed

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
            java.util.logging.Logger.getLogger(Homework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homework().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete1;
    private javax.swing.JButton Delete2;
    private javax.swing.JButton Delete3;
    private javax.swing.JButton Delete4;
    private javax.swing.JButton Delete5;
    private javax.swing.JButton SobreEs1;
    private javax.swing.JButton SobreEs2;
    private javax.swing.JButton SobreEs3;
    private javax.swing.JButton SobreEs4;
    private javax.swing.JButton SobreEs5;
    private javax.swing.JButton jButton_add1;
    private javax.swing.JButton jButton_add2;
    private javax.swing.JButton jButton_add3;
    private javax.swing.JButton jButton_add4;
    private javax.swing.JButton jButton_add5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_10;
    private javax.swing.JMenuItem jMenuItem_15;
    private javax.swing.JMenuItem jMenuItem_30;
    private javax.swing.JMenuItem jMenuItem_45;
    private javax.swing.JMenuItem jMenuItem_5;
    private javax.swing.JMenuItem jMenuItem_60;
    private javax.swing.JMenuItem jMenuItem_AcNotificacion;
    private javax.swing.JMenuItem jMenuItem_BorrarT;
    private javax.swing.JMenuItem jMenuItem_DeNotificaciones;
    private javax.swing.JMenuItem jMenuItem_EditarT;
    private javax.swing.JMenuItem jMenuItem_Guardar;
    private javax.swing.JMenuItem jMenuItem_ResTareas;
    private javax.swing.JMenuItem jMenuItem_cerrar;
    private javax.swing.JMenu jMenu_TimeNotificacion;
    private javax.swing.JMenu jMenu_noti;
    private javax.swing.JMenu jMenu_notificaciones;
    private javax.swing.JMenu jMenu_opciones;
    private javax.swing.JMenu jMenu_tareas;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JCheckBox select1;
    private javax.swing.JCheckBox select2;
    private javax.swing.JCheckBox select3;
    private javax.swing.JCheckBox select4;
    private javax.swing.JCheckBox select5;
    // End of variables declaration//GEN-END:variables
}
