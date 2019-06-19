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
    public static Color co = null;
    Day_Note dn = new Day_Note();
    String date_update3 = "";
    int ID;

    public Homework() {
        initComponents();
        co = Day_Note.c;
        date_update3 = Day_Note.date_update;

        getContentPane().setBackground(Color.getColor(null, co));
        setBackground(Color.LIGHT_GRAY);
        setSize(400, 600);
        setTitle("StickyCalendar 2.0");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jMenu_noti.setVisible(true);
        jMenuItem_AcNotificacion.setVisible(true);
        jMenuItem_DeNotificaciones.setVisible(false);
        jMenu_TimeNotificacion.setVisible(false);
        jMenu_notificaciones.setVisible(true);

    }

    public void Tareastxt() {
        date_update3 = Day_Note.date_update;
        try {
            Connection cn = Conexion.Conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select * from calendar where Fecha = '" + date_update3 + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                ID = rs.getInt("ID");
                jLabel1.setText(rs.getString("Tarea1"));
                jLabel2.setText(rs.getString("Tarea2"));
                jLabel3.setText(rs.getString("Tarea3"));
                jLabel4.setText(rs.getString("Tarea4"));
                jLabel5.setText(rs.getString("Tarea5"));
            }
            cn.close();

        } catch (SQLException e) {
            System.err.println("Error al seleccionar fecha " + e);

        }
    }

    public void Labels() {
        String txt1 = jLabel1.getText(), txt2 = jLabel2.getText(), txt3 = jLabel3.getText(), txt4 = jLabel4.getText(), txt5 = jLabel5.getText();

        if (txt1.equals("")) {
            Delete1.setVisible(false);
            SobreEs1.setVisible(false);
            select1.setVisible(false);
        } else {
            Delete1.setVisible(true);
            SobreEs1.setVisible(true);
            select1.setVisible(true);
        }
        if (txt2.equals("")) {
            Delete2.setVisible(false);
            SobreEs2.setVisible(false);
            select2.setVisible(false);
        } else {
            Delete2.setVisible(true);
            SobreEs2.setVisible(true);
            select2.setVisible(true);
        }
        if (txt3.equals("")) {
            Delete3.setVisible(false);
            SobreEs3.setVisible(false);
            select3.setVisible(false);
        } else {
            Delete3.setVisible(true);
            SobreEs3.setVisible(true);
            select3.setVisible(true);
        }
        if (txt4.equals("")) {
            Delete4.setVisible(false);
            SobreEs4.setVisible(false);
            select4.setVisible(false);
        } else {
            Delete4.setVisible(true);
            SobreEs4.setVisible(true);
            select4.setVisible(true);
        }
        if (txt5.equals("")) {
            Delete5.setVisible(false);
            SobreEs5.setVisible(false);
            select5.setVisible(false);
        } else {
            Delete5.setVisible(true);
            SobreEs5.setVisible(true);
            select5.setVisible(true);
        }
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

        btn_add1 = new javax.swing.JButton();
        btn_add2 = new javax.swing.JButton();
        btn_add3 = new javax.swing.JButton();
        btn_add4 = new javax.swing.JButton();
        btn_add5 = new javax.swing.JButton();
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
        btn_volver = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_opciones = new javax.swing.JMenu();
        jMenuItem_Guardar = new javax.swing.JMenuItem();
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
        jMI30 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
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

        btn_add1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btn_add1.setText("ADD TAREA 1");
        btn_add1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 30));

        btn_add2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btn_add2.setText("ADD TAREA 2");
        btn_add2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 30));

        btn_add3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btn_add3.setText("ADD TAREA 3");
        btn_add3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 150, 30));

        btn_add4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btn_add4.setText("ADD TAREA 4");
        btn_add4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 150, 30));

        btn_add5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btn_add5.setText("ADD TAREA 5");
        btn_add5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_add5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 150, 30));

        Delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/papelera1.png"))); // NOI18N
        Delete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete1ActionPerformed(evt);
            }
        });
        getContentPane().add(Delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 35, 33));

        Delete2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/papelera1.png"))); // NOI18N
        Delete2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete2ActionPerformed(evt);
            }
        });
        getContentPane().add(Delete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 35, 33));

        Delete3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/papelera1.png"))); // NOI18N
        Delete3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete3ActionPerformed(evt);
            }
        });
        getContentPane().add(Delete3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 30, 33));

        Delete4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/papelera1.png"))); // NOI18N
        Delete4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete4ActionPerformed(evt);
            }
        });
        getContentPane().add(Delete4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 35, 33));

        Delete5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/papelera1.png"))); // NOI18N
        Delete5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete5ActionPerformed(evt);
            }
        });
        getContentPane().add(Delete5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 35, 33));

        SobreEs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz1.png"))); // NOI18N
        SobreEs1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SobreEs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreEs1ActionPerformed(evt);
            }
        });
        getContentPane().add(SobreEs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 35, 33));

        SobreEs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz1.png"))); // NOI18N
        SobreEs2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SobreEs2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreEs2ActionPerformed(evt);
            }
        });
        getContentPane().add(SobreEs2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 35, 33));

        SobreEs3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz1.png"))); // NOI18N
        SobreEs3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SobreEs3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreEs3ActionPerformed(evt);
            }
        });
        getContentPane().add(SobreEs3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 35, 33));

        SobreEs4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz1.png"))); // NOI18N
        SobreEs4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SobreEs4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreEs4ActionPerformed(evt);
            }
        });
        getContentPane().add(SobreEs4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 35, 33));

        SobreEs5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lapiz1.png"))); // NOI18N
        SobreEs5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SobreEs5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreEs5ActionPerformed(evt);
            }
        });
        getContentPane().add(SobreEs5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 35, 33));
        getContentPane().add(select1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 35, 33));
        getContentPane().add(select2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 35, 33));
        getContentPane().add(select3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 35, 33));
        getContentPane().add(select4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 35, 33));
        getContentPane().add(select5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 35, 33));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 25));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, 25));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 230, 25));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 230, 25));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 230, 25));

        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Volver.png"))); // NOI18N
        btn_volver.setBorder(null);
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 580));

        jMenu_opciones.setText("Opciones");
        jMenu_opciones.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem_Guardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem_Guardar.setText("Guardar Cambios");
        jMenuItem_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_GuardarActionPerformed(evt);
            }
        });
        jMenu_opciones.add(jMenuItem_Guardar);

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

        jMI30.setText("30 seg");
        jMI30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI30ActionPerformed(evt);
            }
        });
        jMenu_TimeNotificacion.add(jMI30);
        jMenu_TimeNotificacion.add(jSeparator9);

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

        jMenu_noti.setForeground(new java.awt.Color(255, 0, 51));
        jMenu_noti.setText("Notificaciones Desactivadas");
        jMenuBar1.add(jMenu_noti);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Notificaciones activas e inactivas
    private void jMenuItem_AcNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AcNotificacionActionPerformed

        if (evt.getSource() == jMenuItem_AcNotificacion) {

            jMenuItem_DeNotificaciones.setVisible(true);
            jMenuItem_AcNotificacion.setVisible(false);
            jMenu_noti.setText("Notificaciones Activadas");
            jMenu_noti.setForeground(Color.green);
            jMenu_TimeNotificacion.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem_AcNotificacionActionPerformed

    private void jMenuItem_DeNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_DeNotificacionesActionPerformed
        if (evt.getSource() == jMenuItem_DeNotificaciones) {

            jMenu_noti.setText("Notificaciones Desactivadas");
            jMenu_noti.setForeground(Color.red);
            jMenuItem_DeNotificaciones.setVisible(false);
            jMenuItem_AcNotificacion.setVisible(true);
            jMenu_TimeNotificacion.setVisible(false);
            t.cancel();
        }
    }//GEN-LAST:event_jMenuItem_DeNotificacionesActionPerformed
    //Botones de añadir tareas
    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        if (evt.getSource() == btn_add1) {

            String Tar1 = null, txt1 = jLabel1.getText();
            if (txt1.equals("")) {
                Tar1 = JOptionPane.showInputDialog(null, "Ingrese su tarea", "AÑADIR TAREA", JOptionPane.INFORMATION_MESSAGE);

                if (Tar1.isEmpty()) {
                    System.err.println("");
                    Delete1.setVisible(false);
                    SobreEs1.setVisible(false);
                    select1.setVisible(false);

                } else {
                    jLabel1.setText(Tar1);
                    Delete1.setVisible(true);
                    SobreEs1.setVisible(true);
                    select1.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe una tarea");
            }
        }
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void btn_add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add2ActionPerformed
        if (evt.getSource() == btn_add2) {

            String Tar2 = null, txt2 = jLabel2.getText();
            if (txt2.equals("")) {
                Tar2 = JOptionPane.showInputDialog(null, "Ingrese su tarea", "AÑADIR TAREA", JOptionPane.INFORMATION_MESSAGE);

                if (Tar2.isEmpty()) {
                    System.err.println("");
                    Delete2.setVisible(false);
                    SobreEs2.setVisible(false);
                    select2.setVisible(false);
                } else {
                    jLabel2.setText(Tar2);
                    Delete2.setVisible(true);
                    SobreEs2.setVisible(true);
                    select2.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe una tarea");
            }

        }
    }//GEN-LAST:event_btn_add2ActionPerformed

    private void btn_add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add3ActionPerformed
        if (evt.getSource() == btn_add3) {

            String Tar3 = null, txt3 = jLabel3.getText();
            if (txt3.equals("")) {
                Tar3 = JOptionPane.showInputDialog(null, "Ingrese su tarea", "AÑADIR TAREA", JOptionPane.INFORMATION_MESSAGE);

                if (Tar3.isEmpty()) {
                    System.err.println("");
                    Delete3.setVisible(false);
                    SobreEs3.setVisible(false);
                    select3.setVisible(false);
                } else {
                    jLabel3.setText(Tar3);
                    Delete3.setVisible(true);
                    SobreEs3.setVisible(true);
                    select3.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe una tarea");
            }
        }
    }//GEN-LAST:event_btn_add3ActionPerformed

    private void btn_add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add4ActionPerformed
        if (evt.getSource() == btn_add4) {

            String Tar4 = null, txt4 = jLabel4.getText();
            if (txt4.equals("")) {
                Tar4 = JOptionPane.showInputDialog(null, "Ingrese su tarea", "AÑADIR TAREA", JOptionPane.INFORMATION_MESSAGE);

                if (Tar4.isEmpty()) {
                    System.err.println("");
                    Delete4.setVisible(false);
                    SobreEs4.setVisible(false);
                    select4.setVisible(false);
                } else {
                    jLabel4.setText(Tar4);
                    Delete4.setVisible(true);
                    SobreEs4.setVisible(true);
                    select4.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe una tarea");
            }
        }
    }//GEN-LAST:event_btn_add4ActionPerformed

    private void btn_add5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add5ActionPerformed
        if (evt.getSource() == btn_add5) {

            String Tar5 = null, txt5 = jLabel5.getText();
            if (txt5.equals("")) {
                Tar5 = JOptionPane.showInputDialog(null, "Ingrese su tarea", "AÑADIR TAREA", JOptionPane.INFORMATION_MESSAGE);

                if (Tar5.isEmpty()) {
                    System.err.println("");
                    Delete5.setVisible(false);
                    SobreEs5.setVisible(false);
                    select5.setVisible(false);
                } else {
                    jLabel5.setText(Tar5);
                    Delete5.setVisible(true);
                    SobreEs5.setVisible(true);
                    select5.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe una tarea");
            }
        }
    }//GEN-LAST:event_btn_add5ActionPerformed
    //borrar tareas
    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete1ActionPerformed
        if (evt.getSource() == Delete1) {

            jLabel1.setText("");
            Delete1.setVisible(false);
            SobreEs1.setVisible(false);
            select1.setVisible(false);

        }
    }//GEN-LAST:event_Delete1ActionPerformed

    private void Delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete2ActionPerformed
        if (evt.getSource() == Delete2) {

            jLabel2.setText("");
            Delete2.setVisible(false);
            SobreEs2.setVisible(false);
            select2.setVisible(false);

        }
    }//GEN-LAST:event_Delete2ActionPerformed

    private void Delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete3ActionPerformed
        if (evt.getSource() == Delete3) {

            jLabel3.setText("");
            Delete3.setVisible(false);
            SobreEs3.setVisible(false);
            select3.setVisible(false);
        }
    }//GEN-LAST:event_Delete3ActionPerformed

    private void Delete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete4ActionPerformed
        if (evt.getSource() == Delete4) {

            jLabel4.setText("");
            Delete4.setVisible(false);
            SobreEs4.setVisible(false);
            select4.setVisible(false);
        }
    }//GEN-LAST:event_Delete4ActionPerformed

    private void Delete5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete5ActionPerformed
        if (evt.getSource() == Delete5) {

            jLabel5.setText("");
            Delete5.setVisible(false);
            SobreEs5.setVisible(false);
            select5.setVisible(false);
        }
    }//GEN-LAST:event_Delete5ActionPerformed
    //sobrescribir tareas
    private void SobreEs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreEs1ActionPerformed
        if (evt.getSource() == SobreEs1) {

            String SE1 = JOptionPane.showInputDialog(null, "Sobreescriba su tarea", "SOBREESCRIBIR TAREA", JOptionPane.INFORMATION_MESSAGE);
            if (SE1.isEmpty()) {
                System.err.println("");
            } else {
                jLabel1.setText(SE1);
            }
        }
    }//GEN-LAST:event_SobreEs1ActionPerformed

    private void SobreEs2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreEs2ActionPerformed
        if (evt.getSource() == SobreEs2) {

            String SE2 = JOptionPane.showInputDialog(null, "Sobreescriba su tarea", "SOBREESCRIBIR TAREA", JOptionPane.INFORMATION_MESSAGE);
            if (SE2.isEmpty()) {
                System.err.println("");
            } else {
                jLabel2.setText(SE2);
            }
        }
    }//GEN-LAST:event_SobreEs2ActionPerformed

    private void SobreEs3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreEs3ActionPerformed
        if (evt.getSource() == SobreEs3) {

            String SE3 = JOptionPane.showInputDialog(null, "Sobreescriba su tarea", "SOBREESCRIBIR TAREA", JOptionPane.INFORMATION_MESSAGE);
            if (SE3.isEmpty()) {
                System.err.println("");
            } else {
                jLabel3.setText(SE3);
            }
        }
    }//GEN-LAST:event_SobreEs3ActionPerformed

    private void SobreEs4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreEs4ActionPerformed
        if (evt.getSource() == SobreEs4) {

            String SE4 = JOptionPane.showInputDialog(null, "Sobreescriba su tarea", "SOBREESCRIBIR TAREA", JOptionPane.INFORMATION_MESSAGE);
            if (SE4.isEmpty()) {
                System.err.println("");
            } else {
                jLabel4.setText(SE4);
            }
        }
    }//GEN-LAST:event_SobreEs4ActionPerformed

    private void SobreEs5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreEs5ActionPerformed
        if (evt.getSource() == SobreEs5) {

            String SE5 = JOptionPane.showInputDialog(null, "Sobreescriba su tarea", "SOBREESCRIBIR TAREA", JOptionPane.INFORMATION_MESSAGE);
            if (SE5.isEmpty()) {
                System.err.println("");
            } else {
                jLabel5.setText(SE5);
            }
        }
    }//GEN-LAST:event_SobreEs5ActionPerformed
    //seleccion de tareas, borrar y editarlas
    private void jMenuItem_ResTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ResTareasActionPerformed
        if (evt.getSource() == jMenuItem_ResTareas) {

            Delete1.setVisible(false);
            Delete2.setVisible(false);
            Delete3.setVisible(false);
            Delete4.setVisible(false);
            Delete5.setVisible(false);

            jLabel1.setText("");
            jLabel2.setText("");
            jLabel2.setText("");
            jLabel3.setText("");
            jLabel3.setText("");

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
            
            select1.setSelected(false);
            select2.setSelected(false);
            select3.setSelected(false);
            select4.setSelected(false);
            select5.setSelected(false);
        }
    }//GEN-LAST:event_jMenuItem_ResTareasActionPerformed

    private void jMenuItem_BorrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_BorrarTActionPerformed
        if (evt.getSource() == jMenuItem_BorrarT) {
            if (select1.isSelected()) {
                select1.setVisible(false);
                Delete1.setVisible(false);
                SobreEs1.setVisible(false);
                jLabel1.setText("");
                select1.setSelected(false);
            }
            if (select2.isSelected()) {
                select2.setVisible(false);
                Delete2.setVisible(false);
                SobreEs2.setVisible(false);
                jLabel2.setText("");
                select2.setSelected(false);
            }
            if (select3.isSelected()) {
                select3.setVisible(false);
                Delete3.setVisible(false);
                SobreEs3.setVisible(false);
                jLabel3.setText("");
                select3.setSelected(false);
            }
            if (select4.isSelected()) {
                select4.setVisible(false);
                Delete4.setVisible(false);
                SobreEs4.setVisible(false);
                jLabel4.setText("");
                select4.setSelected(false);
            }
            if (select5.isSelected()) {
                select5.setVisible(false);
                Delete5.setVisible(false);
                SobreEs5.setVisible(false);
                jLabel5.setText("");
                select5.setSelected(false);
            }

        }

    }//GEN-LAST:event_jMenuItem_BorrarTActionPerformed

    private void jMenuItem_EditarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_EditarTActionPerformed
        if (evt.getSource() == jMenuItem_EditarT) {
            if (select1.isSelected()) {
                String SE1 = JOptionPane.showInputDialog(null, "Sobreescriba su tarea", "SOBREESCRIBIR TAREA", JOptionPane.INFORMATION_MESSAGE);

                if(SE1.isEmpty()){
                    select1.setSelected(true);
                }else{
                jLabel1.setText(SE1);
                select1.setSelected(false);
                }
            }
            if (select2.isSelected()) {
                String SE2 = JOptionPane.showInputDialog(null, "Sobreescriba su tarea", "SOBREESCRIBIR TAREA", JOptionPane.INFORMATION_MESSAGE);
          
                if(SE2.isEmpty()){
                    select1.setSelected(true);
                }else{
                jLabel2.setText(SE2);
                select2.setSelected(false);
                }
            }
            if (select3.isSelected()) {
                String SE3 = JOptionPane.showInputDialog(null, "Sobreescriba su tarea", "SOBREESCRIBIR TAREA", JOptionPane.INFORMATION_MESSAGE);
             
                if(SE3.isEmpty()){
                    select1.setSelected(true);
                }else{
                jLabel3.setText(SE3);
                select3.setSelected(false);
                }
            }
            if (select4.isSelected()) {
                String SE4 = JOptionPane.showInputDialog(null, "Sobreescriba su tarea", "SOBREESCRIBIR TAREA", JOptionPane.INFORMATION_MESSAGE);
           
                if(SE4.isEmpty()){
                    select1.setSelected(true);
                }else{
                jLabel4.setText(SE4);
                select4.setSelected(false);
                }
            }
            if (select5.isSelected()) {
                String SE5 = JOptionPane.showInputDialog(null, "Sobreescriba su tarea", "SOBREESCRIBIR TAREA", JOptionPane.INFORMATION_MESSAGE);
                
                if(SE5.isEmpty()){
                    select1.setSelected(true);
                }else{
                jLabel5.setText(SE5);
                select5.setSelected(false);
                }
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
                    jMenu_noti.setText("Notificaciones Desactivadas");
                    jMenu_noti.setForeground(Color.red);
                    jMenuItem_DeNotificaciones.setVisible(false);
                    jMenuItem_AcNotificacion.setVisible(true);
                    jMenu_TimeNotificacion.setVisible(false);
                }
            };
            t.schedule(t2, 300000, 300000);//5 min y cada 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMenuItem_5ActionPerformed

    private void jMenuItem_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_10ActionPerformed
        if (evt.getSource() == jMenuItem_10) {

            TimerTask t2 = new TimerTask() {
                @Override
                public void run() {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Momento de realizar tarea.");
                    jMenu_noti.setText("Notificaciones Desactivadas");
                    jMenu_noti.setForeground(Color.red);
                    jMenuItem_DeNotificaciones.setVisible(false);
                    jMenuItem_AcNotificacion.setVisible(true);
                    jMenu_TimeNotificacion.setVisible(false);
                }
            };
            t.schedule(t2, 600000, 300000);//10 min y cada 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMenuItem_10ActionPerformed

    private void jMenuItem_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_15ActionPerformed
        if (evt.getSource() == jMenuItem_5) {

            TimerTask t2 = new TimerTask() {
                @Override
                public void run() {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Momento de realizar tarea.");
                    jMenu_noti.setText("Notificaciones Desactivadas");
                    jMenu_noti.setForeground(Color.red);
                    jMenuItem_DeNotificaciones.setVisible(false);
                    jMenuItem_AcNotificacion.setVisible(true);
                    jMenu_TimeNotificacion.setVisible(false);
                }
            };
            t.schedule(t2, 900000, 300000);//15 min y cada 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMenuItem_15ActionPerformed

    private void jMenuItem_30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_30ActionPerformed
        if (evt.getSource() == jMenuItem_5) {

            TimerTask t2 = new TimerTask() {
                @Override
                public void run() {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Momento de realizar tarea.");
                    jMenu_noti.setText("Notificaciones Desactivadas");
                    jMenu_noti.setForeground(Color.red);
                    jMenuItem_DeNotificaciones.setVisible(false);
                    jMenuItem_AcNotificacion.setVisible(true);
                    jMenu_TimeNotificacion.setVisible(false);
                }
            };
            t.schedule(t2, 1800000, 300000);//30 min y cada 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMenuItem_30ActionPerformed

    private void jMenuItem_45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_45ActionPerformed
        if (evt.getSource() == jMenuItem_5) {

            TimerTask t2 = new TimerTask() {
                @Override
                public void run() {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Momento de realizar tarea.");
                    jMenu_noti.setText("Notificaciones Desactivadas");
                    jMenu_noti.setForeground(Color.red);
                    jMenuItem_DeNotificaciones.setVisible(false);
                    jMenuItem_AcNotificacion.setVisible(true);
                    jMenu_TimeNotificacion.setVisible(false);
                }
            };
            t.schedule(t2, 2700000, 300000);//45 min y cada 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMenuItem_45ActionPerformed

    private void jMenuItem_60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_60ActionPerformed
        if (evt.getSource() == jMenuItem_5) {

            TimerTask t2 = new TimerTask() {
                @Override
                public void run() {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Momento de realizar tarea.");
                    jMenu_noti.setText("Notificaciones Desactivadas");
                    jMenu_noti.setForeground(Color.red);
                    jMenuItem_DeNotificaciones.setVisible(false);
                    jMenuItem_AcNotificacion.setVisible(true);
                    jMenu_TimeNotificacion.setVisible(false);
                }
            };
            t.schedule(t2, 3600000, 300000);//60 min y cada 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMenuItem_60ActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed

        if (evt.getSource() == btn_volver) {
            Day_Note.getFrames();
            dn.setBackground(Color.getColor(null, co));
            this.dispose();
        }
    }//GEN-LAST:event_btn_volverActionPerformed

    private void jMenuItem_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_GuardarActionPerformed
        if (evt.getSource() == jMenuItem_Guardar) {
            date_update3 = Day_Note.date_update;
            String txt1 = jLabel1.getText(), txt2 = jLabel2.getText(), txt3 = jLabel3.getText(), txt4 = jLabel4.getText(), txt5 = jLabel5.getText();
            try {
                Connection cn = Conexion.Conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "update calendar set Tarea1 = ?, Tarea2 = ?, Tarea3 = ?, Tarea4 = ?, Tarea5 = ? where Fecha = '" + date_update3 + "'");
                pst.setString(1, txt1);
                pst.setString(2, txt2);
                pst.setString(3, txt3);
                pst.setString(4, txt4);
                pst.setString(5, txt5);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Tareas guardadas");
                cn.close();
            } catch (SQLException e) {
                System.err.println("Error al añadir tarea");
            }
        }
    }//GEN-LAST:event_jMenuItem_GuardarActionPerformed

    private void jMI30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI30ActionPerformed
        if (evt.getSource() == jMI30) {

            TimerTask t2 = new TimerTask() {
                @Override
                public void run() {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                    JOptionPane.showMessageDialog(null, "Momento de realizar tarea.");
                    jMenu_noti.setText("Notificaciones Desactivadas");
                    jMenu_noti.setForeground(Color.red);
                    jMenuItem_DeNotificaciones.setVisible(false);
                    jMenuItem_AcNotificacion.setVisible(true);
                    jMenu_TimeNotificacion.setVisible(false);

                }
            };
            t.schedule(t2, 30000, 300000);//30 sg y cada 5 min se repite el mensaje

        }
    }//GEN-LAST:event_jMI30ActionPerformed

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
    private javax.swing.JButton btn_add1;
    private javax.swing.JButton btn_add2;
    private javax.swing.JButton btn_add3;
    private javax.swing.JButton btn_add4;
    private javax.swing.JButton btn_add5;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JMenuItem jMI30;
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
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JCheckBox select1;
    private javax.swing.JCheckBox select2;
    private javax.swing.JCheckBox select3;
    private javax.swing.JCheckBox select4;
    private javax.swing.JCheckBox select5;
    // End of variables declaration//GEN-END:variables
}
