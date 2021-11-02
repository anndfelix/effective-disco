
package interfaz;

import Excepcion.DAOException;

import java.time.LocalDate;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import objetosNegocio.Sexo;
import objetosNegocio.Usuario;
import control.Control;

public class PerfilDlg extends javax.swing.JDialog {

    static Usuario usuario = InicioDlg.usuario;
    Control control = new Control();

    public PerfilDlg() {
        initComponents();
        setLocationRelativeTo(null);
        llenarComboboxSexoUsuario(comboSexo);
    }

    public void llenarComboboxSexoUsuario(JComboBox comboBox) throws DAOException {
        control.llenarComboboxSexoUsuario(comboSexo);
    }

    public void mostrar() {

        this.txtNombreCompleto.setText(usuario.getNombre());
        this.txtCelular.setText(usuario.getNumeroCelular());
        this.txtEmail.setText(usuario.getEmail());
        this.txtEdad.setText(String.valueOf(usuario.getEdad()));
        this.fechaNacimiento.setDate(usuario.getFechaNacimiento());
       this.comboSexo.getModel().setSelectedItem(usuario.getSexo());
        
        
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEmail());
    }
  public void actualizar(){
       LocalDate fechaN=this.fechaNacimiento.getDate();
      usuario.setNombre(this.txtNombreCompleto.getText());
      usuario.setFechaNacimiento(fechaN);
      usuario.setSexo((Sexo) this.comboSexo.getModel().getSelectedItem());     
      int edad = 2021 - fechaNacimiento.getDate().getYear();
      usuario.setEdad(edad);
      
        dispose();
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();
        panelPublicaciones = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        fechaNacimiento = new com.github.lgooddatepicker.components.DatePicker();
        comboSexo = new javax.swing.JComboBox<>();
        panelComentarios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        botonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/volver.png"))); // NOI18N
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        panelPublicaciones.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Perfil");
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N

        jLabel3.setText("Nombre completo:");
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jLabel4.setText("Correo electronico:");
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jLabel5.setText("Sexo:");
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jLabel6.setText("Número de celular:");
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jLabel7.setText("Fecha de nacimiento:");
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        jLabel8.setText("Edad:");
        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N

        txtNombreCompleto.setText("Usuario 1");
        txtNombreCompleto.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtEmail.setEditable(false);
        txtEmail.setText("usuario1@gmail.com");
        txtEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtCelular.setEditable(false);
        txtCelular.setText("6441234567");
        txtCelular.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        txtEdad.setEditable(false);
        txtEdad.setText("20");
        txtEdad.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fechaNacimiento.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        comboSexo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPublicacionesLayout = new javax.swing.GroupLayout(panelPublicaciones);
        panelPublicaciones.setLayout(panelPublicacionesLayout);
        panelPublicacionesLayout.setHorizontalGroup(
            panelPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPublicacionesLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(panelPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboSexo, 0, 382, Short.MAX_VALUE)
                    .addGroup(panelPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombreCompleto)))
                .addGap(95, 95, 95)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelPublicacionesLayout.setVerticalGroup(
            panelPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPublicacionesLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPublicacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(txtNombreCompleto))
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelComentarios.setBackground(new java.awt.Color(23, 22, 22));
        panelComentarios.setForeground(new java.awt.Color(23, 22, 22));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/perfil_1.png"))); // NOI18N
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout panelComentariosLayout = new javax.swing.GroupLayout(panelComentarios);
        panelComentarios.setLayout(panelComentariosLayout);
        panelComentariosLayout.setHorizontalGroup(
            panelComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelComentariosLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        panelComentariosLayout.setVerticalGroup(
            panelComentariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelComentariosLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelPublicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelPublicaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed

    }//GEN-LAST:event_txtEdadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.actualizar();
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolver;
    private javax.swing.JComboBox<Sexo> comboSexo;
    private com.github.lgooddatepicker.components.DatePicker fechaNacimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelComentarios;
    private javax.swing.JPanel panelPublicaciones;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombreCompleto;
    // End of variables declaration//GEN-END:variables
}
