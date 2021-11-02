package interfaz;

import DAO.PublicacionDAO;
import Excepcion.DAOException;
import control.Control;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import objetosNegocio.Usuario;
import DAO.UsuarioDAO;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objetosNegocio.Publicacion;
import java.net.*;
import java.io.*;
import java.awt.event.*;
import objetosNegocio.Chat;

public class MuroDlg extends javax.swing.JDialog {

    Control control = new Control();
    UsuarioDAO udao = new UsuarioDAO();
    PublicacionDAO pdao = new PublicacionDAO();
    public static Usuario usuario = InicioDlg.usuario;
    static Publicacion publicacionBuscada;
    ServerSocket servidor = null;
    Socket socket = null;
    BufferedReader lector = null;
    PrintWriter escritor = null;

    public MuroDlg() {
        initComponents();
        setLocationRelativeTo(null);
        TextoPreliminar();
        MuroPreliminar();

        llenarComboboxUsuarios(comboUsuarios);

        try {
            publicaciones();
        } catch (BadLocationException ex) {
            Logger.getLogger(MuroDlg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMuro = new javax.swing.JPanel();
        panelBusqueda = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPublicaciones = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        botonCerrarBusqueda = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        panelPublicaciones = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        botonPublicar = new javax.swing.JButton();
        botonAdjuntar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPublicacion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        checkNotificar = new javax.swing.JCheckBox();
        botonEtiquetar = new javax.swing.JButton();
        panelChat = new javax.swing.JPanel();
        labelChat = new javax.swing.JLabel();
        comboUsuarios = new javax.swing.JComboBox<>();
        txtMensaje = new javax.swing.JTextField();
        botonEnviar = new javax.swing.JButton();
        botonCerrarChat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        botonNotificaciones = new javax.swing.JButton();
        botonNuevaPublicacion = new javax.swing.JButton();
        botonChat = new javax.swing.JButton();
        botonPerfil = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelMuro.setBackground(new java.awt.Color(0, 0, 0));
        panelMuro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBusqueda.setBackground(new java.awt.Color(23, 22, 22));

        tablaPublicaciones.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tablaPublicaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Publicación 1"},
                {"Publicación 2"},
                {"Publicación 3"}
            },
            new String [] {
                "Publicaciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPublicaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPublicacionesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaPublicaciones);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Busqueda");

        botonCerrarBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        botonCerrarBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar.png"))); // NOI18N
        botonCerrarBusqueda.setToolTipText("");
        botonCerrarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBusquedaLayout = new javax.swing.GroupLayout(panelBusqueda);
        panelBusqueda.setLayout(panelBusquedaLayout);
        panelBusquedaLayout.setHorizontalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCerrarBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panelBusquedaLayout.setVerticalGroup(
            panelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBusquedaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCerrarBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMuro.add(panelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 85, 390, 780));

        botonBuscar.setBackground(new java.awt.Color(0, 0, 0));
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        panelMuro.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 32, 41, 35));

        txtBusqueda.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        panelMuro.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 32, 221, 35));

        panelPublicaciones.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel2.setText("Nueva publicación");

        botonPublicar.setBackground(new java.awt.Color(255, 255, 255));
        botonPublicar.setText("Publicar");
        botonPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPublicarActionPerformed(evt);
            }
        });

        botonAdjuntar.setText("Adjuntar");

        txtPublicacion.setColumns(20);
        txtPublicacion.setRows(5);
        jScrollPane4.setViewportView(txtPublicacion);

        jScrollPane1.setViewportView(jTextPane1);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        checkNotificar.setText("Notificar etiquetados");
        checkNotificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNotificarActionPerformed(evt);
            }
        });

        botonEtiquetar.setText("Etiquetar");
        botonEtiquetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEtiquetarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPublicacionesLayout = new javax.swing.GroupLayout(panelPublicaciones);
        panelPublicaciones.setLayout(panelPublicacionesLayout);
        panelPublicacionesLayout.setHorizontalGroup(
            panelPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPublicacionesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPublicacionesLayout.createSequentialGroup()
                        .addComponent(checkNotificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEtiquetar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonAdjuntar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelPublicacionesLayout.setVerticalGroup(
            panelPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPublicacionesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonAdjuntar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(checkNotificar)
                        .addComponent(botonEtiquetar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonPublicar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        panelMuro.add(panelPublicaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 85, -1, 780));

        panelChat.setBackground(new java.awt.Color(23, 22, 22));

        labelChat.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        labelChat.setForeground(new java.awt.Color(255, 255, 255));
        labelChat.setText("Chat");

        comboUsuarios.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensajeActionPerformed(evt);
            }
        });

        botonEnviar.setText("Enviar");
        botonEnviar.setToolTipText("");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });

        botonCerrarChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar.png"))); // NOI18N
        botonCerrarChat.setToolTipText("");
        botonCerrarChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarChatActionPerformed(evt);
            }
        });

        txtChat.setEditable(false);
        txtChat.setColumns(20);
        txtChat.setRows(5);
        jScrollPane2.setViewportView(txtChat);

        javax.swing.GroupLayout panelChatLayout = new javax.swing.GroupLayout(panelChat);
        panelChat.setLayout(panelChatLayout);
        panelChatLayout.setHorizontalGroup(
            panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChatLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonEnviar)
                    .addComponent(labelChat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboUsuarios, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(botonCerrarChat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panelChatLayout.setVerticalGroup(
            panelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChatLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(labelChat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEnviar)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCerrarChat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMuro.add(panelChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1073, 85, 340, 780));

        botonNotificaciones.setBackground(new java.awt.Color(0, 0, 0));
        botonNotificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/notificaciones.png"))); // NOI18N
        botonNotificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNotificacionesActionPerformed(evt);
            }
        });
        panelMuro.add(botonNotificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 32, 41, 35));

        botonNuevaPublicacion.setBackground(new java.awt.Color(0, 0, 0));
        botonNuevaPublicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/publicacion.png"))); // NOI18N
        botonNuevaPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaPublicacionActionPerformed(evt);
            }
        });
        panelMuro.add(botonNuevaPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 32, 41, 35));

        botonChat.setBackground(new java.awt.Color(0, 0, 0));
        botonChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/mensaje.png"))); // NOI18N
        botonChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonChatActionPerformed(evt);
            }
        });
        panelMuro.add(botonChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 32, 41, 35));

        botonPerfil.setBackground(new java.awt.Color(0, 0, 0));
        botonPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/perfil.png"))); // NOI18N
        botonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPerfilActionPerformed(evt);
            }
        });
        panelMuro.add(botonPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 32, 41, 35));

        botonCerrarSesion.setBackground(new java.awt.Color(0, 0, 0));
        botonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrarsesion.png"))); // NOI18N
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });
        panelMuro.add(botonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1338, 32, 41, 35));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logofb.png"))); // NOI18N
        panelMuro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        panelBusqueda.setVisible(true);
        tablaPublicaciones();
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonNotificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNotificacionesActionPerformed
        NotificacionesDlg notificaciones = new NotificacionesDlg();
        notificaciones.setVisible(true);
    }//GEN-LAST:event_botonNotificacionesActionPerformed

    private void botonNuevaPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaPublicacionActionPerformed
        MisPublicacionesDlg publicaciones = new MisPublicacionesDlg();
        publicaciones.setVisible(true);
    }//GEN-LAST:event_botonNuevaPublicacionActionPerformed

    private void botonChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonChatActionPerformed
        panelChat.setVisible(true);
    }//GEN-LAST:event_botonChatActionPerformed

    private void botonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPerfilActionPerformed
        PerfilDlg perfil = new PerfilDlg();
        perfil.setVisible(true);
        perfil.mostrar();
    }//GEN-LAST:event_botonPerfilActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        dispose();

        InicioDlg inicio = new InicioDlg();
        inicio.setVisible(true);
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void botonCerrarChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarChatActionPerformed
        panelChat.setVisible(false);
    }//GEN-LAST:event_botonCerrarChatActionPerformed

    private void tablaPublicacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPublicacionesMouseClicked

        int fila = tablaPublicaciones.getSelectedRow();
        publicacionBuscada = (Publicacion) tablaPublicaciones.getValueAt(fila, 0);

        PublicacionDlg publicacion = new PublicacionDlg();
        publicacion.setVisible(true);
    }//GEN-LAST:event_tablaPublicacionesMouseClicked

    private void botonCerrarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarBusquedaActionPerformed
        panelBusqueda.setVisible(false);
    }//GEN-LAST:event_botonCerrarBusquedaActionPerformed

    private void checkNotificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNotificarActionPerformed

    }//GEN-LAST:event_checkNotificarActionPerformed

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed

        inicioMensaje();

    }//GEN-LAST:event_botonEnviarActionPerformed

    private void botonPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPublicarActionPerformed
        agregarPublicacion();
        try {
            publicaciones();
        } catch (BadLocationException ex) {
            Logger.getLogger(MuroDlg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonPublicarActionPerformed

    private void botonEtiquetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEtiquetarActionPerformed
        usuariosEtiquetadosDlg etiquetar = new usuariosEtiquetadosDlg();
        etiquetar.setVisible(true);

    }//GEN-LAST:event_botonEtiquetarActionPerformed

    private void txtMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensajeActionPerformed

    private void TextoPreliminar() {
        TextPrompt placeholder1 = new TextPrompt("Buscar algo en faceboot...", txtBusqueda);
        placeholder1.changeAlpha(0.45f);

        TextPrompt placeholder2 = new TextPrompt("Escriba el mensaje...", txtMensaje);
        placeholder2.changeAlpha(0.45f);

        TextPrompt placeholder3 = new TextPrompt("Escriba algo...", txtPublicacion);
        placeholder3.changeAlpha(0.45f);
    }

    private void MuroPreliminar() {
        panelChat.setVisible(false);
        panelBusqueda.setVisible(false);
    }

    private void publicaciones() throws BadLocationException {

        ArrayList<String> publicaciones = control.listaPublicacionesString();
        jTextPane1.setText("");

        StyledDocument doc = jTextPane1.getStyledDocument();

        for (String p : publicaciones) {
            doc.insertString(doc.getLength(), p, null);
            jTextPane1.setCaretPosition(jTextPane1.getDocument().getLength());
            jTextPane1.insertComponent(new JButton("Comentar"));
            jTextPane1.insertComponent(new JButton("Eliminar"));
            doc.insertString(doc.getLength(), "\n", null);
        }

        jTextPane1.setEditable(false);
    }

    private void llenarComboboxUsuarios(JComboBox comboBox) throws DAOException {
        control.llenarComboboxUsuarios(comboUsuarios);
    }

    private void agregarPublicacion() {

        List<Usuario> usuariosEtiquetados = control.listaEtiquetados();
        LocalDateTime fechaHoraCreacion = LocalDateTime.now();
        usuario = InicioDlg.usuario;
        String contenido = txtPublicacion.getText();
        List<String> etiquetas = control.listaEtiquetas(contenido);

        Publicacion p = new Publicacion(contenido, usuario, fechaHoraCreacion, etiquetas, usuariosEtiquetados);

        try {
            pdao.agrega(p);
        } catch (DAOException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Datos incorrectos",
                    "Error de agregar", JOptionPane.ERROR_MESSAGE);
        }

        if (checkNotificar.isSelected()) {
            control.notificarEtiquetas();
        }

        txtPublicacion.setText("");
        checkNotificar.setSelected(false);
    }

    private void tablaPublicaciones() throws DAOException {
        List<Publicacion> listaPublicaciones = control.listaPublicacionesBuscadas(txtBusqueda.getText());
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPublicaciones.getModel();
        modeloTabla.setRowCount(0);

        for (Publicacion publicacion : listaPublicaciones) {

            Object[] filaDatos = new Object[1];

            filaDatos[0] = publicacion;

            modeloTabla.addRow(filaDatos);
        }

    }

    // Metodos de Chat para implementar con sockets.
    
    public void leerMensaje() {

        Thread leerHilo = new Thread(new Runnable() {
            @Override
            public void run() {

                try {

                    lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                    while (true) {

                        String mensajeRecibido = lector.readLine();
                        txtChat.append("Usuario: " + mensajeRecibido);

                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });

        leerHilo.start();

    }

    public void escribirMensaje() {

        Thread escribirHilo = new Thread(new Runnable() {
            @Override
            public void run() {

                try {

                    escritor = new PrintWriter(socket.getOutputStream(), true);
                    botonEnviar.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {

                            String enviarMensaje = txtMensaje.getText();
                            escritor.println(enviarMensaje);
                            txtMensaje.setText(" ");

                        }

                    });

                } catch (Exception ex) {

                }

            }

        });

        escribirHilo.start();

    }

    public void inicioMensaje() {

        Thread principal = new Thread(new Runnable() {
            @Override
            public void run() {

                try {

                    servidor = new ServerSocket(9000);
                    while (true) {
                        socket = servidor.accept();
                        leerMensaje();
                        escribirMensaje();
                    }

                } catch (Exception ex) {

                }

            }
        });

        principal.start();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdjuntar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCerrarBusqueda;
    private javax.swing.JButton botonCerrarChat;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonChat;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton botonEtiquetar;
    private javax.swing.JButton botonNotificaciones;
    private javax.swing.JButton botonNuevaPublicacion;
    private javax.swing.JButton botonPerfil;
    private javax.swing.JButton botonPublicar;
    private javax.swing.JCheckBox checkNotificar;
    private javax.swing.JComboBox<Usuario> comboUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelChat;
    private javax.swing.JPanel panelBusqueda;
    private javax.swing.JPanel panelChat;
    private javax.swing.JPanel panelMuro;
    private javax.swing.JPanel panelPublicaciones;
    private javax.swing.JTable tablaPublicaciones;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextArea txtPublicacion;
    // End of variables declaration//GEN-END:variables
}
