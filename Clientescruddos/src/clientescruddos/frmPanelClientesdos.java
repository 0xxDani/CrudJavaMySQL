package clientescruddos;
import java.sql.Connection;                  // CONECTOR DE MY SQL
import javax.swing.table.DefaultTableModel;  // FUNCIONES DE LA LIBRERÍA JAVAX
import java.sql.Statement;                   // LIBRERÍA PARA DEFINIR EL STATEMENT
import java.sql.ResultSet;                   
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class frmPanelClientesdos extends javax.swing.JFrame {
    
    conexionMysql con = new conexionMysql();
    Connection cn = con.conectar();
    

    public frmPanelClientesdos() {
        initComponents();
        mostrardatos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtdireccion = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        comboestado = new javax.swing.JComboBox<>();
        btnregistrar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabledatos = new javax.swing.JTable();

        jMenuItem1.setFont(new java.awt.Font("MV Boli", 1, 13)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientescruddos/basura.png"))); // NOI18N
        jMenuItem1.setText("ELIMINAR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PANEL DE CONTROL");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CRUD CLIENTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESE LA SIGUIENTE INFORMACIÓN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        txtdireccion.setBackground(new java.awt.Color(204, 255, 204));
        txtdireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        txtnombre.setBackground(new java.awt.Color(204, 255, 204));
        txtnombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre y Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 12))); // NOI18N

        txtid.setEditable(false);
        txtid.setBackground(new java.awt.Color(204, 255, 204));
        txtid.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Id", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        txtemail.setBackground(new java.awt.Color(204, 255, 204));
        txtemail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        txttel.setBackground(new java.awt.Color(204, 255, 204));
        txttel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teléfono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        comboestado.setBackground(new java.awt.Color(204, 255, 204));
        comboestado.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        comboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero", "Casado", "Divorciado" }));
        comboestado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado civil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14))); // NOI18N

        btnregistrar.setBackground(new java.awt.Color(0, 51, 51));
        btnregistrar.setFont(new java.awt.Font("MV Boli", 3, 13)); // NOI18N
        btnregistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnactualizar.setBackground(new java.awt.Color(0, 51, 51));
        btnactualizar.setFont(new java.awt.Font("MV Boli", 3, 13)); // NOI18N
        btnactualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(btnactualizar))
                    .addComponent(comboestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txttel)
                    .addComponent(txtemail)
                    .addComponent(txtdireccion)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(txtnombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboestado, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE CLIENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("MV Boli", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jtabledatos.setBackground(new java.awt.Color(153, 153, 255));
        jtabledatos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jtabledatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtabledatos.setComponentPopupMenu(jPopupMenu1);
        jtabledatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtabledatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabledatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabledatos);
        if (jtabledatos.getColumnModel().getColumnCount() > 0) {
            jtabledatos.getColumnModel().getColumn(0).setMaxWidth(16);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        try {        //SE INICIA UN BLOQUE TRY CATCH Y SE CREA UN OBJETO DE TIPO PREPAREDSTATEMENT PARA
                     //EJECUTAR UNA CONSULTA SQL PREPARADA EN LA BASE DE DATOS.
            PreparedStatement ps = cn.prepareStatement("INSERT INTO clientesdos (nombre_apellido, direccion, email, telefono, estado_civil) VALUES (?,?,?,?,?)");
            ps.setString(1, txtnombre.getText());        //←SE ESTABLECEN LOS VALORES DE LOS PARÁMETROS DE LA CONSULTA 
            ps.setString(2, txtdireccion.getText());     //PREPARADA UTILIZANDO LOS MÉTODOS SETSTRING() DE PREPAREDSTATEMENT.
            ps.setString(3, txtemail.getText());         
            ps.setString(4, txttel.getText());          //←ASÍ DE ESTA FORMA SE INGRESAN LOS DATOS A LA BASE DE DATOS.
            ps.setString(5, comboestado.getSelectedItem().toString());
            ps.executeUpdate();        //←SE EJECUTA LA CONSULTA Y SE INSERTAN LOS DATOS EN LA TABLA "CLIENTES" DE LA BASE DE DATOS.
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE!!");
            //↑↑JOPTIONPANE PARA INFORMAR AL USUARIO QUE LOS DATOS HAN SIDO GUARDADOS CORRECTAMENTE
            mostrardatos(); 
            // ↑↑ SE LLAMA AL MÉTODO MOSTRARDATOS() QUE MOSTRARÁ LOS DATOS ALMACENADOS EN LA TABLA "CLIENTES".
            limpiarentradas();  
                 
        } catch (SQLException e) {
            System.out.println("ERROR AL REGISTRAR CLIENTE..");
            /*SI OCURRE UNA EXCEPCIÓN SQLEXCEPTION DURANTE LA EJECUCIÓN DEL BLOQUE TRY,
              SE CAPTURA EN ESTE BLOQUE CATCH Y SE MUESTRA UN MENSAJE EN LA CONSOLA INDICANDO
              QUE HA HABIDO UN ERROR AL REGISTRAR AL CLIENTE.*/
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        try {
            // PREPARAR UNA CONSULTA SQL PARA ACTUALIZAR LOS DATOS DEL CLIENTE EN LA TABLA 'clientes'
        PreparedStatement ps = cn.prepareStatement("UPDATE clientesdos SET nombre_apellido='" + txtnombre.getText() + "', direccion='" + txtdireccion.getText() + "', email='" + txtemail.getText() + "', telefono='" + txttel.getText() + "', estado_civil='" + comboestado.getSelectedItem() + "' WHERE id='" + txtid.getText() + "'");
            
            // EJECUTAR LA CONSULTA SQL Y GUARDAR EL NÚMERO DE FILAS ACTUALIZADAS
        int indice = ps.executeUpdate();
        
            // SI SE ACTUALIZÓ AL MENOS UNA FILA, MOSTRAR UN MENSAJE DE ÉXITO, ACTUALIZAR
            // LA LISTA DE CLIENTES Y LIMPIAR LOS CAMPOS DE ENTRADA
        if(indice>0){
            JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS CORRECTAMENTE!!");
            mostrardatos();
            limpiarentradas();
            // SI NO SE ACTUALIZÓ NINGUNA FILA, MOSTRAR UN MENSAJE DE ERROR
        }else{
            JOptionPane.showMessageDialog(null, "NO SELECCIONÓ FILA...");
        }
            // SI OCURRE UN ERROR AL ACTUALIZAR LOS DATOS, MOSTRAR UN MENSAJE DE ERROR CON LA EXCEPCIÓN LANZADA
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS..." + e);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void jtabledatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabledatosMouseClicked
        // DESACTIVAR EL BOTÓN DE REGISTRO AL QUERER HACER UNA ACTUALIZACIÓN.
        btnregistrar.setEnabled(false);

        // ACTIVAR EL BOTÓN DE ACTUALIZACIÓN
        btnactualizar.setEnabled(true);

        // OBTENER EL NÚMERO DE FILA SELECCIONADO EN LA TABLA
        int fila = this.jtabledatos.getSelectedRow();

        // ESTABLECER EL ID DEL CLIENTE SELECCIONADO EN EL CAMPO DE TEXTO 'txtid'
        this.txtid.setText(this.jtabledatos.getValueAt(fila, 0).toString());

        // ESTABLECER EL NOMBRE Y APELLIDO DEL CLIENTE SELECCIONADO EN EL CAMPO DE TEXTO 'txtnombre'
        this.txtnombre.setText(this.jtabledatos.getValueAt(fila, 1).toString());

        // ESTABLECER LA DIRECCIÓN DEL CLIENTE SELECCIONADO EN EL CAMPO DE TEXTO 'txtdireccion'
        this.txtdireccion.setText(this.jtabledatos.getValueAt(fila, 2).toString());

        // ESTABLECER EL CORREO ELECTRÓNICO DEL CLIENTE SELECCIONADO EN EL CAMPO DE TEXTO 'txtemail'
        this.txtemail.setText(this.jtabledatos.getValueAt(fila, 3).toString());

        // ESTABLECER EL NÚMERO DE TELÉFONO DEL CLIENTE SELECCIONADO EN EL CAMPO DE TEXTO 'txttel'
        this.txttel.setText(this.jtabledatos.getValueAt(fila, 4).toString());

        // ESTABLECER EL ESTADO CIVIL DEL CLIENTE SELECCIONADO EN EL CAMPO DE SELECCIÓN 'comboestado'
        this.comboestado.setSelectedItem(this.jtabledatos.getValueAt(fila, 5).toString());

    }//GEN-LAST:event_jtabledatosMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        btnactualizar.setEnabled(false);
        btnregistrar.setEnabled(true);
        limpiarentradas();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        btnactualizar.setEnabled(false);
        btnregistrar.setEnabled(true);
        limpiarentradas();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿ESTÁ SEGURO DE ELIMINAR ESTE CLIENTE?", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            //EL CUADRO DE DIÁLOGO JOPTIONPANE MUESTRA UN MENSAJE DE CONFIRMACIÓN AL USUARIO Y PERMITE
            // AL USUARIO SELECCIONAR "SÍ", "NO" O "CANCELAR".
            //SI EL USUARIO SELECCIONA "SÍ", SE EJECUTARÁ EL BLOQUE DE CÓDIGO DENTRO DEL IF.
            try {
                //SE CREA UN OBJETO PREPAREDSTATEMENT PARA ELIMINAR LOS DATOS DEL CLIENTE
                // DE LA TABLA "CLIENTES" EN LA BASE DE DATOS. 
                //SE UTILIZA EL VALOR DEL CAMPO "ID" DEL CLIENTE QUE SE ENCUENTRA EN EL OBJETO TXTID.
                PreparedStatement ps = cn.prepareStatement("DELETE FROM clientesdos where id='" + txtid.getText() + "'");
                //LA CONSULTA SE EJECUTA UTILIZANDO EXECUTEUPDATE() Y EL VALOR DEVUELTO SE ALMACENA EN LA VARIABLE "INDICE".
                int indice = ps.executeUpdate();

                //SI SE ELIMINÓ AL MENOS UNA FILA DE LA BASE DE DATOS, SE LLAMA A LA FUNCIÓN "MOSTRARDATOS()"
                // PARA ACTUALIZAR LA GUI CON LA NUEVA INFORMACIÓN Y SE LLAMA A LA FUNCIÓN "LIMPIARENTRADAS()"
                // PARA LIMPIAR LOS CAMPOS DE ENTRADA DE TEXTO.
                //DE LO CONTRARIO, SE IMPRIME UN MENSAJE EN LA CONSOLA QUE INDICA QUE NO SE SELECCIONÓ NINGUNA FILA.
                if (indice > 0) {
                    mostrardatos();
                    limpiarentradas();
                } else {
                    System.out.println("¡¡¡NO HA SELECCIONADO LA FILA!!!");
                }
            } catch (SQLException e) {
                //SI SE PRODUCE UNA EXCEPCIÓN AL INTENTAR ELIMINAR LOS DATOS DEL CLIENTE DE LA BASE DE DATOS,
                // SE IMPRIME UN MENSAJE DE ERROR EN LA CONSOLA QUE INDICA LA CAUSA DE LA EXCEPCIÓN.
                System.out.println("¡¡¡ERROR AL ELIMINAR LOS DATOS " + e + "!!!");
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmPanelClientesdos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPanelClientesdos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPanelClientesdos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPanelClientesdos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPanelClientesdos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox<String> comboestado;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabledatos;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables

   
      private void mostrardatos() {                         // Este método es privado y no devuelve ningún valor.
      DefaultTableModel modelo = new DefaultTableModel(); // Se crea un nuevo objeto de la clase DefaultTableModel.
      modelo.addColumn("id");                    // Se agregan las columnas a la tabla,
      modelo.addColumn("Nombre y apellido");     // pasando como parámetros sus respectivos nombres.
      modelo.addColumn("Dirección");
      modelo.addColumn("Email");
      modelo.addColumn("Teléfono");
      modelo.addColumn("Estado civil");
      jtabledatos.setModel(modelo);         // Se establece el modelo de la tabla con el modelo creado previamente.
      String consultasql = "select *from clientesdos"; // Se define la consulta SQL que se utilizará para obtener los datos de la tabla.
      String data[] = new String[6];                // Se crea un array de Strings con tamaño 6,
                                                    //  que se utilizará para almacenar los datos de cada fila.
      Statement st;                                 // Se crea un objeto de la clase Statement, que se utilizará para ejecutar la consulta SQL.            
        try {                                       // Se crea un objeto de la clase Connection, previamente establecida en algún otro lugar del código.
                                                    // En este caso, se asume que la conexión se llama 'cn'.
            st = cn.createStatement();              // Se ejecuta la consulta SQL y se guarda el resultado en un objeto de la clase ResultSet.
            ResultSet rs = st.executeQuery(consultasql); // Se recorre el ResultSet y se van obteniendo los datos de cada columna de cada fila.
            while(rs.next()){                       // Se recorre el ResultSet y se van obteniendo los datos de cada columna de cada fila.
            data[0]=rs.getString(1);              
            data[1]=rs.getString(2);
            data[2]=rs.getString(3);
            data[3]=rs.getString(4);
            data[4]=rs.getString(5);
            data[5]=rs.getString(6);
            modelo.addRow(data);              // Se agrega la fila a la tabla, pasando como parámetro el array con los datos.
             
            }
            
        } catch (SQLException e) {                  // Si ocurre una excepción, se imprime en la consola un mensaje de error.
            System.out.println("ERROR AL MOSTRAR DATOS!! " + e);
        }
        
    }

    private void limpiarentradas() { // EN JAVA, EL MÉTODO .SETTEXT() SE UTILIZA PARA ESTABLECER EL TEXTO
        txtid.setText("");         // DE UN COMPONENTE DE LA INTERFAZ DE USUARIO, COMO UN JLABEL, UN JTEXTFIELD O UN JTEXTAREA.
        txtnombre.setText("");     //COMO EN ESTE CASO LO VAMOS A DEJAR CON COMILLAS VACIAS LAS CAJAS QUEDAN VACIAS.
        txtdireccion.setText("");
        txtemail.setText("");
        txttel.setText("");
        comboestado.setSelectedIndex(0);
    }
    }

