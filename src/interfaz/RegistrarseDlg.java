package interfaz;

import Exception.DAOException;
import control.Control;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import objectosNegocio.Sexo;
import objectosNegocio.Usuario;
import servidorfb.Cliente;
import servidorfb.Servidor;

public class RegistrarseDlg extends javax.swing.JDialog {

    Control control = new Control();
    static Usuario usuario;
    public static Usuario u;
    Cliente cliente = new Cliente();

    public RegistrarseDlg() throws DAOException {

        initComponents();
        setLocationRelativeTo(null);
        TextoPreliminar();
        llenarComboboxSexoUsuario(comboSexo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaNacimiento = new com.github.lgooddatepicker.components.DatePicker();
        jLabel5 = new javax.swing.JLabel();
        comboSexo = new javax.swing.JComboBox<>();
        botonCuentaNueva = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 190, 340, 50));

        txtCelular.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCelular.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 250, 340, 50));

        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombre.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtNombre.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNombreCaretUpdate(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 340, 50));

        txtContraseña.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtContraseña.setToolTipText("");
        txtContraseña.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtContraseña.setPreferredSize(new java.awt.Dimension(111, 25));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, 340, 50));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Sexo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 390, -1, -1));

        txtFechaNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        txtFechaNacimiento.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jPanel1.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, 210, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, -1, -1));

        comboSexo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        comboSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSexoActionPerformed(evt);
            }
        });
        jPanel1.add(comboSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 410, 100, 30));

        botonCuentaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/3.png"))); // NOI18N
        botonCuentaNueva.setText("jButton1");
        botonCuentaNueva.setBorder(null);
        botonCuentaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuentaNuevaActionPerformed(evt);
            }
        });
        jPanel1.add(botonCuentaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 490, 400, 60));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 340, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/4.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, -1, 452));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fb.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 580, 410));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/4.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, -1, 452));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1344, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCuentaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuentaNuevaActionPerformed

        agregarUsuario();
        InicioDlg inicio = new InicioDlg();
        inicio.setVisible(true);

    }//GEN-LAST:event_botonCuentaNuevaActionPerformed

    private void txtNombreCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNombreCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCaretUpdate

    private void comboSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSexoActionPerformed

    private void TextoPreliminar() {
        TextPrompt placeholder1 = new TextPrompt("Correo electronico", txtEmail);
        TextPrompt placeholder2 = new TextPrompt("Contraseña", txtContraseña);
        TextPrompt placeholder3 = new TextPrompt("Número de celular", txtCelular);
        TextPrompt placeholder4 = new TextPrompt("Nombre completo", txtNombre);

        placeholder1.changeAlpha(0.45f);
        placeholder2.changeAlpha(0.45f);
        placeholder3.changeAlpha(0.45f);
        placeholder4.changeAlpha(0.45f);

    }

    private void llenarComboboxSexoUsuario(JComboBox comboBox) throws DAOException {

    }

    private void agregarUsuario(){
//        String nombre = this.txtNombre.getText();
//        String celular = this.txtCelular.getText();
//        String email = this.txtEmail.getText();
//        String contraseña = this.txtContraseña.getText();
//        Sexo sexoUsuario = (Sexo) this.comboSexo.getSelectedItem();
//        String fechaNacimiento = txtFechaNacimiento.getDate().toString();
//        int edad = 2021 - txtFechaNacimiento.getDate().getYear();
//
//        usuario = new Usuario(nombre, email, Sexo.H, celular, contraseña, edad, new Date(fechaNacimiento));
//        u = usuario;

        cliente.main(null);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCuentaNueva;
    private javax.swing.JComboBox<Sexo> comboSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtEmail;
    private com.github.lgooddatepicker.components.DatePicker txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
