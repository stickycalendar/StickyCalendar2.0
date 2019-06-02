package Ventanas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.WindowConstants;
import Clases.Conexion;
import java.sql.*;

public class Day_Note extends javax.swing.JFrame {

    int t = 14, s = 0;
    Font f = null;
    String[] Array = {"Arial", "Calibri", "Times New Roman", "Segoe Script"};
    String fon;
    public static Color c = null;

    public Day_Note() {
        initComponents();
        setSize(430, 400);
        setTitle("StickyCalendar 2.0");
        setLocationRelativeTo(null);
        setBackground(c);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jTextArea1.setFont(f = new Font(fon = Array[2], s, t));

    }

    //Cambiar Icono:
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icon.png"));

        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton_getDate = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_opciones = new javax.swing.JMenu();
        jMenuItem_Guardar = new javax.swing.JMenuItem();
        jMenuItem_cerrar = new javax.swing.JMenuItem();
        jMenu_ventana = new javax.swing.JMenu();
        jMenu_colorFondo = new javax.swing.JMenu();
        Amarillo = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        Azul = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        Rojo = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        Verde = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        Naranja = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        Negro = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        Blanco = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        Rosa = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        Magenta = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        Gris = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu_tamanioVentana = new javax.swing.JMenu();
        jMenuItem_tamanio1 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_tamanio2 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_tamanio3 = new javax.swing.JMenuItem();
        jMenu_escritura = new javax.swing.JMenu();
        jMenu_tipoLetra = new javax.swing.JMenu();
        jMenuItem_1 = new javax.swing.JMenuItem();
        jMenuItem_2 = new javax.swing.JMenuItem();
        jMenuItem_3 = new javax.swing.JMenuItem();
        jMenuItem_4 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu_tamanioLetra = new javax.swing.JMenu();
        TML10 = new javax.swing.JMenuItem();
        TML12 = new javax.swing.JMenuItem();
        TML14 = new javax.swing.JMenuItem();
        TML16 = new javax.swing.JMenuItem();
        TML18 = new javax.swing.JMenuItem();
        TML20 = new javax.swing.JMenuItem();
        jMenu_tareas = new javax.swing.JMenu();
        jMenuItem_interfazTarea = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Notas:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 80, 400, 240));

        jButton_getDate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_getDate.setText("Nueva Fecha");
        jButton_getDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_getDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_getDateActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_getDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 100, 30));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 429, 380));

        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

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

        jMenu_ventana.setText("Ventana");
        jMenu_ventana.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenu_colorFondo.setText("Color de Fondo");
        jMenu_colorFondo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenu_colorFondo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_colorFondoActionPerformed(evt);
            }
        });

        Amarillo.setBackground(new java.awt.Color(255, 255, 51));
        Amarillo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Amarillo.setText("Amarillo");
        Amarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AmarilloMouseClicked(evt);
            }
        });
        Amarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmarilloActionPerformed(evt);
            }
        });
        jMenu_colorFondo.add(Amarillo);
        jMenu_colorFondo.add(jSeparator4);

        Azul.setBackground(new java.awt.Color(0, 153, 255));
        Azul.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Azul.setText("Azul");
        Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AzulActionPerformed(evt);
            }
        });
        jMenu_colorFondo.add(Azul);
        jMenu_colorFondo.add(jSeparator5);

        Rojo.setBackground(new java.awt.Color(255, 0, 51));
        Rojo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Rojo.setText("Rojo");
        Rojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RojoActionPerformed(evt);
            }
        });
        jMenu_colorFondo.add(Rojo);
        jMenu_colorFondo.add(jSeparator6);

        Verde.setBackground(new java.awt.Color(0, 204, 0));
        Verde.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Verde.setText("Verde");
        Verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerdeActionPerformed(evt);
            }
        });
        jMenu_colorFondo.add(Verde);
        jMenu_colorFondo.add(jSeparator7);

        Naranja.setBackground(new java.awt.Color(255, 153, 0));
        Naranja.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Naranja.setText("Naranja");
        Naranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaranjaActionPerformed(evt);
            }
        });
        jMenu_colorFondo.add(Naranja);
        jMenu_colorFondo.add(jSeparator8);

        Negro.setBackground(new java.awt.Color(0, 0, 0));
        Negro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Negro.setText("Negro");
        Negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegroActionPerformed(evt);
            }
        });
        jMenu_colorFondo.add(Negro);
        jMenu_colorFondo.add(jSeparator9);

        Blanco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Blanco.setText("Blanco");
        Blanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlancoActionPerformed(evt);
            }
        });
        jMenu_colorFondo.add(Blanco);
        jMenu_colorFondo.add(jSeparator10);

        Rosa.setBackground(new java.awt.Color(255, 0, 255));
        Rosa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Rosa.setText("Rosa");
        Rosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RosaActionPerformed(evt);
            }
        });
        jMenu_colorFondo.add(Rosa);
        jMenu_colorFondo.add(jSeparator11);

        Magenta.setBackground(new java.awt.Color(102, 0, 204));
        Magenta.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Magenta.setText("Magenta");
        Magenta.setActionCommand("");
        Magenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MagentaActionPerformed(evt);
            }
        });
        jMenu_colorFondo.add(Magenta);
        jMenu_colorFondo.add(jSeparator12);

        Gris.setBackground(new java.awt.Color(153, 153, 153));
        Gris.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Gris.setText("Gris");
        Gris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GrisActionPerformed(evt);
            }
        });
        jMenu_colorFondo.add(Gris);

        jMenu_ventana.add(jMenu_colorFondo);
        jMenu_ventana.add(jSeparator2);

        jMenu_tamanioVentana.setText("Tamaño Ventana\n");
        jMenu_tamanioVentana.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenu_tamanioVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_tamanioVentanaActionPerformed(evt);
            }
        });

        jMenuItem_tamanio1.setText("400x300");
        jMenuItem_tamanio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_tamanio1MouseClicked(evt);
            }
        });
        jMenuItem_tamanio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_tamanio1ActionPerformed(evt);
            }
        });
        jMenu_tamanioVentana.add(jMenuItem_tamanio1);
        jMenu_tamanioVentana.add(jSeparator13);

        jMenuItem_tamanio2.setText("450x350");
        jMenuItem_tamanio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_tamanio2ActionPerformed(evt);
            }
        });
        jMenu_tamanioVentana.add(jMenuItem_tamanio2);
        jMenu_tamanioVentana.add(jSeparator14);

        jMenuItem_tamanio3.setText("500x450");
        jMenuItem_tamanio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_tamanio3ActionPerformed(evt);
            }
        });
        jMenu_tamanioVentana.add(jMenuItem_tamanio3);

        jMenu_ventana.add(jMenu_tamanioVentana);

        jMenuBar1.add(jMenu_ventana);

        jMenu_escritura.setText("Escritura");
        jMenu_escritura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenu_tipoLetra.setText("Tipo de Letra\n");
        jMenu_tipoLetra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenu_tipoLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_tipoLetraActionPerformed(evt);
            }
        });

        jMenuItem_1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jMenuItem_1.setText("Arial");
        jMenuItem_1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenuItem_1ItemStateChanged(evt);
            }
        });
        jMenuItem_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_1ActionPerformed(evt);
            }
        });
        jMenu_tipoLetra.add(jMenuItem_1);

        jMenuItem_2.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jMenuItem_2.setText("Calibri");
        jMenuItem_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_2ActionPerformed(evt);
            }
        });
        jMenu_tipoLetra.add(jMenuItem_2);

        jMenuItem_3.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jMenuItem_3.setText("Times New Roman");
        jMenuItem_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_3ActionPerformed(evt);
            }
        });
        jMenu_tipoLetra.add(jMenuItem_3);

        jMenuItem_4.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jMenuItem_4.setText("Segoe Script");
        jMenuItem_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_4ActionPerformed(evt);
            }
        });
        jMenu_tipoLetra.add(jMenuItem_4);

        jMenu_escritura.add(jMenu_tipoLetra);
        jMenu_escritura.add(jSeparator1);

        jMenu_tamanioLetra.setText("Tamaño de Letra");
        jMenu_tamanioLetra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        TML10.setText("10\n");
        TML10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TML10ActionPerformed(evt);
            }
        });
        jMenu_tamanioLetra.add(TML10);

        TML12.setText("12");
        TML12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TML12ActionPerformed(evt);
            }
        });
        jMenu_tamanioLetra.add(TML12);

        TML14.setText("14");
        TML14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TML14ActionPerformed(evt);
            }
        });
        jMenu_tamanioLetra.add(TML14);

        TML16.setText("16");
        TML16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TML16ActionPerformed(evt);
            }
        });
        jMenu_tamanioLetra.add(TML16);

        TML18.setText("18");
        TML18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TML18ActionPerformed(evt);
            }
        });
        jMenu_tamanioLetra.add(TML18);

        TML20.setText("20");
        TML20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TML20ActionPerformed(evt);
            }
        });
        jMenu_tamanioLetra.add(TML20);

        jMenu_escritura.add(jMenu_tamanioLetra);

        jMenuBar1.add(jMenu_escritura);

        jMenu_tareas.setText("Tareas");
        jMenu_tareas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem_interfazTarea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem_interfazTarea.setText("Abrir Interfaz de Tareas");
        jMenuItem_interfazTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_interfazTareaActionPerformed(evt);
            }
        });
        jMenu_tareas.add(jMenuItem_interfazTarea);

        jMenuBar1.add(jMenu_tareas);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // opcion interfaz tareas
    private void jMenuItem_interfazTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_interfazTareaActionPerformed

        Homework tarea = new Homework();
        tarea.setVisible(true);

    }//GEN-LAST:event_jMenuItem_interfazTareaActionPerformed

    private void jMenu_colorFondoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_colorFondoActionPerformed

    }//GEN-LAST:event_jMenu_colorFondoActionPerformed

    //cambio de color de fondo
    private void AmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmarilloActionPerformed

        if (evt.getSource() == Amarillo) {
            getContentPane().setBackground(c = Color.yellow);
            jLabel1.setForeground(Color.black);
        }


    }//GEN-LAST:event_AmarilloActionPerformed

    private void AmarilloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmarilloMouseClicked

    }//GEN-LAST:event_AmarilloMouseClicked

    private void AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AzulActionPerformed
        if (evt.getSource() == Azul) {
            getContentPane().setBackground(c = Color.blue);
            jLabel1.setForeground(Color.white);
        }
    }//GEN-LAST:event_AzulActionPerformed

    private void RojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RojoActionPerformed
        if (evt.getSource() == Rojo) {
            getContentPane().setBackground(c = Color.red);
            jLabel1.setForeground(Color.black);
        }
    }//GEN-LAST:event_RojoActionPerformed

    private void VerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerdeActionPerformed
        if (evt.getSource() == Verde) {
            getContentPane().setBackground(c = Color.green);
            jLabel1.setForeground(Color.black);
        }
    }//GEN-LAST:event_VerdeActionPerformed

    private void NaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaranjaActionPerformed
        if (evt.getSource() == Naranja) {
            getContentPane().setBackground(c = Color.orange);
            jLabel1.setForeground(Color.black);
        }
    }//GEN-LAST:event_NaranjaActionPerformed

    private void NegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegroActionPerformed
        if (evt.getSource() == Negro) {
            getContentPane().setBackground(c = Color.black);
            jLabel1.setForeground(Color.white);
        }
    }//GEN-LAST:event_NegroActionPerformed

    private void BlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlancoActionPerformed
        if (evt.getSource() == Blanco) {
            getContentPane().setBackground(c = Color.white);
            jLabel1.setForeground(Color.black);
        }
    }//GEN-LAST:event_BlancoActionPerformed

    private void RosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RosaActionPerformed
        if (evt.getSource() == Rosa) {
            getContentPane().setBackground(c = Color.pink);
            jLabel1.setForeground(Color.black);
        }
    }//GEN-LAST:event_RosaActionPerformed

    private void MagentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MagentaActionPerformed
        if (evt.getSource() == Magenta) {
            getContentPane().setBackground(c = Color.MAGENTA);
            jLabel1.setForeground(Color.black);
        }
    }//GEN-LAST:event_MagentaActionPerformed

    private void GrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GrisActionPerformed
        if (evt.getSource() == Gris) {
            getContentPane().setBackground(c = Color.gray);
            jLabel1.setForeground(Color.black);
        }
    }//GEN-LAST:event_GrisActionPerformed

    private void jMenu_tamanioVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_tamanioVentanaActionPerformed

    }//GEN-LAST:event_jMenu_tamanioVentanaActionPerformed

    //tamaño de ventana
    private void jMenuItem_tamanio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_tamanio1ActionPerformed
        if (evt.getSource() == jMenuItem_tamanio1) {
            this.setBounds(590, 230, 400, 300);
            jLabel_Wallpaper.setBounds(0, 0, 399, 280);
            jScrollPane1.setBounds(10, 60, 360, 165);
            jTextArea1.setBounds(10, 60, 360, 165);
            jButton_getDate.setBounds(250, 30, 100, 30);
            jLabel1.setBounds(20, 25, 60, 20);

        }
    }//GEN-LAST:event_jMenuItem_tamanio1ActionPerformed

    private void jMenuItem_tamanio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_tamanio2ActionPerformed
        if (evt.getSource() == jMenuItem_tamanio2) {
            this.setBounds(565, 230, 450, 350);
            jLabel_Wallpaper.setBounds(0, 0, 449, 330);
            jScrollPane1.setBounds(8, 80, 420, 200);
            jTextArea1.setBounds(8, 80, 420, 200);

        }
    }//GEN-LAST:event_jMenuItem_tamanio2ActionPerformed

    private void jMenuItem_tamanio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_tamanio3ActionPerformed
        if (evt.getSource() == jMenuItem_tamanio3) {
            this.setBounds(535, 230, 500, 450);
            jLabel_Wallpaper.setBounds(0, 0, 499, 430);
            jScrollPane1.setBounds(8, 80, 455, 300);
            jTextArea1.setBounds(8, 80, 455, 300);
            jButton_getDate.setBounds(320, 40, 100, 30);

        }
    }//GEN-LAST:event_jMenuItem_tamanio3ActionPerformed

    private void jMenuItem_tamanio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem_tamanio1MouseClicked

    }//GEN-LAST:event_jMenuItem_tamanio1MouseClicked

    //cerrar
    private void jMenuItem_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrarActionPerformed

        if (evt.getSource() == jMenuItem_cerrar) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem_cerrarActionPerformed

    private void jMenu_tipoLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_tipoLetraActionPerformed

    }//GEN-LAST:event_jMenu_tipoLetraActionPerformed
    //letra y tamaño de letra
    private void jMenuItem_1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenuItem_1ItemStateChanged

    }//GEN-LAST:event_jMenuItem_1ItemStateChanged

    private void jMenuItem_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_1ActionPerformed
        f = new Font(fon = Array[0], s, t);

        if (evt.getSource() == jMenuItem_1) {
            jTextArea1.setFont(f);

        }
    }//GEN-LAST:event_jMenuItem_1ActionPerformed

    private void jMenuItem_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_2ActionPerformed

        f = new Font(fon = Array[1], s, t);

        if (evt.getSource() == jMenuItem_2) {
            jTextArea1.setFont(f);
        }
    }//GEN-LAST:event_jMenuItem_2ActionPerformed

    private void jMenuItem_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_3ActionPerformed
        f = new Font(fon = Array[2], s, t);

        if (evt.getSource() == jMenuItem_3) {
            jTextArea1.setFont(f);

        }
    }//GEN-LAST:event_jMenuItem_3ActionPerformed

    private void jMenuItem_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_4ActionPerformed
        f = new Font(fon = Array[3], s, t);

        if (evt.getSource() == jMenuItem_4) {
            jTextArea1.setFont(f);
        }
    }//GEN-LAST:event_jMenuItem_4ActionPerformed

    private void TML10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TML10ActionPerformed

        if (evt.getSource() == TML10) {
            t = 10;

            jTextArea1.setFont(f = new Font(fon, s, t));
        }
    }//GEN-LAST:event_TML10ActionPerformed

    private void TML12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TML12ActionPerformed
        if (evt.getSource() == TML12) {
            t = 12;
            jTextArea1.setFont(f = new Font(fon, s, t));
        }
    }//GEN-LAST:event_TML12ActionPerformed

    private void TML14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TML14ActionPerformed
        if (evt.getSource() == TML14) {
            t = 14;
            jTextArea1.setFont(f = new Font(fon, s, t));
        }
    }//GEN-LAST:event_TML14ActionPerformed

    private void TML16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TML16ActionPerformed
        if (evt.getSource() == TML16) {
            t = 16;
            jTextArea1.setFont(f = new Font(fon, s, t));
        }
    }//GEN-LAST:event_TML16ActionPerformed

    private void TML18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TML18ActionPerformed
        if (evt.getSource() == TML18) {
            t = 18;
            jTextArea1.setFont(f = new Font(fon, s, t));
        }
    }//GEN-LAST:event_TML18ActionPerformed

    private void TML20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TML20ActionPerformed
        if (evt.getSource() == TML20) {
            t = 20;
            jTextArea1.setFont(f = new Font(fon, s, t));
        }
    }//GEN-LAST:event_TML20ActionPerformed

    private void jButton_getDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_getDateActionPerformed
        if(evt.getSource() == jButton_getDate){
            Calendar c = new Calendar();
            c.setVisible(true);
        }
    }//GEN-LAST:event_jButton_getDateActionPerformed

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
            java.util.logging.Logger.getLogger(Day_Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Day_Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Day_Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Day_Note.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Day_Note().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Amarillo;
    private javax.swing.JMenuItem Azul;
    private javax.swing.JMenuItem Blanco;
    private javax.swing.JMenuItem Gris;
    private javax.swing.JMenuItem Magenta;
    private javax.swing.JMenuItem Naranja;
    private javax.swing.JMenuItem Negro;
    private javax.swing.JMenuItem Rojo;
    private javax.swing.JMenuItem Rosa;
    private javax.swing.JMenuItem TML10;
    private javax.swing.JMenuItem TML12;
    private javax.swing.JMenuItem TML14;
    private javax.swing.JMenuItem TML16;
    private javax.swing.JMenuItem TML18;
    private javax.swing.JMenuItem TML20;
    private javax.swing.JMenuItem Verde;
    private javax.swing.JButton jButton_getDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_1;
    private javax.swing.JMenuItem jMenuItem_2;
    private javax.swing.JMenuItem jMenuItem_3;
    private javax.swing.JMenuItem jMenuItem_4;
    private javax.swing.JMenuItem jMenuItem_Guardar;
    private javax.swing.JMenuItem jMenuItem_cerrar;
    private javax.swing.JMenuItem jMenuItem_interfazTarea;
    private javax.swing.JMenuItem jMenuItem_tamanio1;
    private javax.swing.JMenuItem jMenuItem_tamanio2;
    private javax.swing.JMenuItem jMenuItem_tamanio3;
    private javax.swing.JMenu jMenu_colorFondo;
    private javax.swing.JMenu jMenu_escritura;
    private javax.swing.JMenu jMenu_opciones;
    private javax.swing.JMenu jMenu_tamanioLetra;
    private javax.swing.JMenu jMenu_tamanioVentana;
    private javax.swing.JMenu jMenu_tareas;
    private javax.swing.JMenu jMenu_tipoLetra;
    private javax.swing.JMenu jMenu_ventana;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
