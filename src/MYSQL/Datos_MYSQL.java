package MYSQL;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import java.sql.*;
import com.mysql.jdbc.*;
import com.sun.org.apache.xml.internal.resolver.Catalog;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enzocv
 */
public class Datos_MYSQL extends javax.swing.JFrame {

    //CREACIÓN DE VARIABLES, Y ASIGNACIÓN DE VALORES POR DEFECTO
    private String usuario = "",clave = "", puerto = "", tipoDB = "";
    private String puertoMysql = "3306", puertoSql = "1433", puertoPostgresql = "5432";
    private int proceso = 0, numeroColumnasConsulta = 0, objetoSeleccionado = 0;
    
    //CREACIÓN DE VARIABLE PARA PODER AGREGAR ELEMENTOS A UN JLIST
    DefaultListModel modeloLista = new DefaultListModel();
    
    DefaultTableModel modeloTabla;
    
    
    public Datos_MYSQL() {
        initComponents();
        agregarItemsDB();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_VerBD = new javax.swing.JButton();
        cmbDataBase = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmb_TipoBD = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        txt_Puerto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_clave = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_datosDB = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid = new javax.swing.JTable();
        cmb_Objeto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_VerBD.setText("Ver BD");
        btn_VerBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerBDActionPerformed(evt);
            }
        });

        cmbDataBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDataBaseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Demi ITC", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("CONECTAR CON MYSQL, VER OBJETOS");

        jButton1.setText("Info DB");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo BD:");

        cmb_TipoBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_TipoBDMouseClicked(evt);
            }
        });
        cmb_TipoBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_TipoBDActionPerformed(evt);
            }
        });

        jLabel3.setText("Usuario:");

        txt_Usuario.setBackground(new java.awt.Color(153, 255, 153));

        txt_Puerto.setBackground(new java.awt.Color(153, 255, 153));

        jLabel4.setText("Puerto");

        jLabel5.setText("Clave:");

        jLabel6.setText("Bases de Datos:");

        txt_clave.setBackground(new java.awt.Color(153, 255, 153));

        list_datosDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_datosDBMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list_datosDB);

        grid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(grid);

        cmb_Objeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_ObjetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addComponent(cmb_TipoBD, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel5))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_Usuario)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(65, 65, 65)
                                            .addComponent(txt_Puerto))
                                        .addComponent(cmbDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btn_VerBD)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmb_Objeto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_TipoBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Puerto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cmbDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_VerBD)
                            .addComponent(jButton1)
                            .addComponent(cmb_Objeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void obtenerDatosFormulario(){
        //OBTENER DATOS DEL FORMULARIO
        tipoDB = cmb_TipoBD.getSelectedItem().toString();
        usuario = txt_Usuario.getText();
        clave = obtenerClave();
        puerto = txt_Puerto.getText();
    }
    
    private void btn_VerBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerBDActionPerformed
        //DECLARACIÓN DE VARIABLES PARA LA CONECCIÓN Y PARA OBTENER EL 
        //RESULTADO DE LA CONSULTA
        Connection con = null;
        ResultSet rs = null;
        
        
        
        try {
            //OBTENER DATOS DEL FORMULARIO
            obtenerDatosFormulario();
            
            //REGISTRAR EL DRIVER DE LA BD QUE USAREMOS
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            //ARMAR LA URL (TIPO DE BD, PURTO)
            String url = "jdbc:"+tipoDB+"://localhost:"+puerto+"/";
            
            //OBTENER LA CONECCIÓN CON LA BASE DE DATOS (URL, USUARIO, PASSWORD)
            con = DriverManager.getConnection(url,usuario,clave);
            
            //CREACIÓN DE LA CONSULTA
            Statement cmd = con.createStatement();
            rs = cmd.executeQuery("SHOW DATABASES");
            
            //LIMPIAR EL CMB DONDE SE UBICARAN LAS BD ENCONTRADAS
            cmbDataBase.removeAllItems();
            
            //RECORRIDO DE LA CONSULTA PARA LA OBTENCCIÓN DE LOS DATOS
            while (rs.next()) {
                String nombre = rs.getString("Database");
                
                //LLENADO DE LOS DATOS DE CMB CON LAS BD
                cmbDataBase.addItem(nombre);
            }
                
            //CERRANDO LA CONEXIÓN DEL RESULSET
            rs.close();
            
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_VerBDActionPerformed

   
    
    //OBTENER EL LA CLAVE DEL JPASSWORD
    private String obtenerClave(){
        //CREACIÓN DE UNA ARRAY DE CHARS
        char pass[] = txt_clave.getPassword();
        
        //PASADO DEL ARRAY A UN STRING
        String password = new String(pass);
        
        //RETORNADO DE LA VARIABLE QUE CONTIENE LA CLAVR UNIDA
        return  password;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = null;
       
        try {
            
            //OBTENER DATOS DEL FORMULARIO
            obtenerDatosFormulario();
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:"+tipoDB+"://localhost:"+puerto+"/";
            
            con = DriverManager.getConnection(url,usuario,clave);
            
            //OBTENCIÓN DE TODA LA INFORMACIÓN DE LA BASE DE DATOS
            DatabaseMetaData meta = con.getMetaData();
            
            String info = "Nombre del servidsor: " + meta.getDatabaseProductName() + "\n" +
                                 "Nombre de Usuario: " + usuario + "\n" +
                                 "Puerto de BD: " + puerto + "\n" +
                                 "Base de Datos Ingresada: " + tipoDB + "\n" +
                                 "Versión del servidor: " + meta.getDatabaseProductVersion() + "\n" +
                                 "Nombre del driver: " + meta.getDriverName() + "\n" + 
                                 "Versión del driver: " + meta.getDriverVersion() + "\n" +
                                 "Versión mayor del driver: " + meta.getDriverMajorVersion() + "\n" +
                                 "Versión menor del driver: " + meta.getDriverMinorVersion() + "\n" + 
                                 "Url: " + meta.getURL() + "\n" + 
                                 "Nombre del usuario:  " + meta.getUserName() + "\n";
                                 
            JOptionPane.showMessageDialog(this, info,"Informaciòn", 1);
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbDataBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDataBaseActionPerformed
        agregarItemsObjetos();
    }//GEN-LAST:event_cmbDataBaseActionPerformed

    private void cmb_TipoBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_TipoBDMouseClicked
        
    }//GEN-LAST:event_cmb_TipoBDMouseClicked

    private void cmb_TipoBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_TipoBDActionPerformed
        Object cmbItem = cmb_TipoBD.getSelectedIndex();
        if (cmbItem.equals(0)) {
            txt_Puerto.setText(puertoSql);
            txt_Usuario.setText("sa");
        }
        else if (cmbItem.equals(1)) {
            txt_Puerto.setText(puertoMysql);
            txt_Usuario.setText("root");
        }
        else if (cmbItem.equals(2)) {
            txt_Puerto.setText(puertoMysql);
            txt_Usuario.setText("SYSTEM");
        }
        else if (cmbItem.equals(3)) {
            txt_Puerto.setText(puertoPostgresql);
            txt_Usuario.setText("potsgres");
        }
    }//GEN-LAST:event_cmb_TipoBDActionPerformed

    private void list_datosDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_datosDBMouseClicked
        //OBTIENE EL VALOR SELECCIONADO DEL LIST (OBTIENE EL NOMBRE DE LA TABLA)
        String valorLista = list_datosDB.getSelectedValue();
        
        //CARGA EL MODELO DE LA TABLA (AGREGA EL NOMBRE DE LAS COLUMNAS)
        modeloTabla = new DefaultTableModel(null,getColumnas(proceso));
        
        //AGREGA LOS DATOS DE LA CONSULTA AL GRID
        setFilas(valorLista, proceso);
    }//GEN-LAST:event_list_datosDBMouseClicked

    private void cmb_ObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_ObjetoActionPerformed
        Connection con = null;
        ResultSet rs = null;
        if (cmb_Objeto.getSelectedIndex() == 0) {
            objetoSeleccionado = 1;
            hacerConsulta(con, rs, objetoSeleccionado);
        }
        else if (cmb_Objeto.getSelectedIndex() == 1) {
            objetoSeleccionado = 2;
            hacerConsulta(con, rs, objetoSeleccionado);
        }
        else if (cmb_Objeto.getSelectedIndex() == 2) {
            objetoSeleccionado = 3;
            hacerConsulta(con, rs, objetoSeleccionado);
            proceso = 3;
        }
        else if (cmb_Objeto.getSelectedIndex() == 3) {
            objetoSeleccionado = 4;
            hacerConsulta(con, rs, objetoSeleccionado);
        }
        
    }//GEN-LAST:event_cmb_ObjetoActionPerformed

    public void agregarItemsDB(){
        cmb_TipoBD.addItem("sql");
        cmb_TipoBD.addItem("mysql");
        cmb_TipoBD.addItem("postgresql");
        cmb_TipoBD.addItem("oracle");
    }
    
    public void agregarItemsObjetos(){
        cmb_Objeto.addItem("Table");
        cmb_Objeto.addItem("Procedure");
        cmb_Objeto.addItem("View");
        cmb_Objeto.addItem("Trigger");
    }
    
    private String[] getColumnas(int proceso){
        
        String columna[] = null;
        if (proceso == 1) {
            columna = new String[]{"Field","Type","Null","Key","Default","Extra"};
        }
        else if (proceso == 2) {
            columna = new String[]{"Procedure",
                "SQL_Mode",
                "Create Procedure",
                "Character Set Client",
                "Collation Connection",
                "DataBase Collation"};
        }
        else if (proceso == 3) {
            columna = new String[]{"View",
                "Create View",
                "Character Set Client",
                "Collation Connection"};
        }
        else if (proceso == 4) {
            columna = new String[]{"Trigger",
                "SQL MODE",
                "SQL Original Statement",
                "Character Set Client",
                "Collation Connection",
                "DataBase Collation"};
        }
        
	return columna;
    }
    
    private void setFilas(String valorLista, int proceso){
	Connection con = null;
        ResultSet rs = null;
        
        try{

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:"+tipoDB+"://localhost:"+puerto+"/";
            
            con = DriverManager.getConnection(url,usuario,clave);
            
            //OBTENER EL TIPO DE BD AL CUAL ESTAMOS ACCEDIENDO
            String DB = cmbDataBase.getSelectedItem().toString();
            
            //PRAPARACIÓN DE LA CONSULTA OBTIENE LOS PROCEDIMIENTOS
            //DE CADA BD
            Statement cmd = con.createStatement();
            
            if (proceso == 1) {//PROCESO PARA MOSTRAR DATOS DE UNA TABLA
                rs = cmd.executeQuery("show columns from "+ DB +"."+valorLista);
                numeroColumnasConsulta = 6;
            }
            else if (proceso == 2) {//PROCESO PARA MOSTRAR DATOS DE UN PROCEDURE
                rs = cmd.executeQuery("show create procedure "+ DB +"."+valorLista);
                numeroColumnasConsulta = 6;
            }
            else if (proceso == 3) {//PROCESO PARA MOSTRAR DATOS DE UNA VISTA
                rs = cmd.executeQuery("show create view "+ DB +"."+valorLista);
                numeroColumnasConsulta = 4;
            }
            else if (proceso == 4) {//PROCESO PARA MOSTRAR DATOS DE UNA TRIGGER
                rs = cmd.executeQuery("show create trigger  "+ DB +"."+ valorLista);
                numeroColumnasConsulta = 6;
            }

            //EN ESTE OBJETO GUARDAREMOS LOS DATOS DE LA CONSULTA
            Object datos[] = new Object[numeroColumnasConsulta];

		
            while(rs.next()){

		for(int i = 0; i < numeroColumnasConsulta; i++){
			datos[i] = rs.getObject(i+1);
		}
                //AGREGAMOS LAS FILAS AL GRID
		modeloTabla.addRow(datos);
            }
            //MOSTRAMOS LOS DATOS GUARDADOS ANTERIORMENTE EN EL GRID
            grid.setModel(modeloTabla);
            rs.close();

	}
	catch (SQLException ex){
		JOptionPane.showMessageDialog(this, ex.getMessage());
	}

    }
    
    private void hacerConsulta(Connection con, ResultSet rs, int objetoSeleccionado){
        try {
            //OBTENER DATOS DEL FORMULARIO
            obtenerDatosFormulario();
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:"+tipoDB+"://localhost:"+puerto+"/";
            
            con = DriverManager.getConnection(url,usuario,clave);
            
            //OBTENER EL TIPO DE BASE DE DATOS DESEADO
            String DB = cmbDataBase.getSelectedItem().toString();
            
            String todasTablas = "";
            
            //PREPARACIÓN DE LA CONSULTA PARA OBTENER TODAS LAS VISTAS DE LAS 
            //BD SELECCIONADAS
            Statement cmd = con.createStatement();
            
            switch (objetoSeleccionado) {
                case 1:
                    //TABLA
                    rs = cmd.executeQuery("USE "+DB);
                    rs = cmd.executeQuery("SHOW TABLES");
                    //LLENADO DE DATOS DE LA CONSULTA
                    modeloLista.removeAllElements();
                    while (rs.next()) {
                        String tablas = rs.getString("Tables_in_"+DB);
                        modeloLista.addElement(tablas);
                    }   list_datosDB.setModel(modeloLista);
                    proceso = 1;
                    rs.close();
                    break;
                case 2:
                    //PROCEDIMIENTO
                    rs = cmd.executeQuery("SELECT * FROM information_schema.routines"+
                            " WHERE ROUTINE_SCHEMA = '"+DB+"';");
                    
                    //LLENADO DE LOS RESULTADOS
                    modeloLista.removeAllElements();
                    String estructura = "";
                    while (rs.next()) {
                        String tablas = rs.getString("SPECIFIC_NAME");

                        modeloLista.addElement(tablas);
                    }

                    proceso = 2;
                    list_datosDB.setModel(modeloLista);

                    rs.close();
                    break;
                case 3:
                    //VISTA
                    rs = cmd.executeQuery("SELECT * FROM information_schema.Tables where"+
                            " TABLE_TYPE = 'VIEW' and TABLE_SCHEMA = '"+DB+"'");
                    //LLENADO DE DATOS DE LA CONSULTA
                    modeloLista.removeAllElements();
                    while (rs.next()) {
                        String tablas = rs.getString("TABLE_NAME");
                        modeloLista.addElement(tablas);
                    }   list_datosDB.setModel(modeloLista);
                    rs.close();
                    break;
                case 4:
                    //TRIGER
                    rs = cmd.executeQuery("USE " + DB);
                    rs = cmd.executeQuery("SHOW TRIGGERS");

                    //LLENADO DE DATOS DE LA CONSULTA
                    modeloLista.removeAllElements();
                    while (rs.next()) {
                        String tablas = rs.getString("Trigger");
                        modeloLista.addElement(tablas);
                    }
                    list_datosDB.setModel(modeloLista);
                    proceso = 4; 
                    rs.close();
                    break;
                default:
                    break;
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(Datos_MYSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_MYSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_MYSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_MYSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_MYSQL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_VerBD;
    private javax.swing.JComboBox<String> cmbDataBase;
    private javax.swing.JComboBox<String> cmb_Objeto;
    private javax.swing.JComboBox<String> cmb_TipoBD;
    private javax.swing.JTable grid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list_datosDB;
    private javax.swing.JTextField txt_Puerto;
    private javax.swing.JTextField txt_Usuario;
    private javax.swing.JPasswordField txt_clave;
    // End of variables declaration//GEN-END:variables
}
