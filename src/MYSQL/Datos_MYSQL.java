package MYSQL;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import java.sql.*;
//import javax.swing.*;
import com.mysql.jdbc.*;
//import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
//import javax.sound.midi.MidiDevice.Info;

/**
 *
 * @author Enzocv
 */
public class Datos_MYSQL extends javax.swing.JFrame {

    
    public Datos_MYSQL() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_VerBD = new javax.swing.JButton();
        cmbDataBase = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObjetos = new javax.swing.JTextArea();
        btn_VerTablas = new javax.swing.JButton();
        btn_VerVistas = new javax.swing.JButton();
        btn_VerTrigers = new javax.swing.JButton();
        btn_VerProcedures = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_VerBD.setText("Ver BD");
        btn_VerBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerBDActionPerformed(evt);
            }
        });

        jLabel1.setText("CONECTAR CON MYSQL, VER OBJETOS");

        txtObjetos.setColumns(20);
        txtObjetos.setRows(5);
        jScrollPane1.setViewportView(txtObjetos);

        btn_VerTablas.setText("Tablas");
        btn_VerTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerTablasActionPerformed(evt);
            }
        });

        btn_VerVistas.setText("Vistas");
        btn_VerVistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerVistasActionPerformed(evt);
            }
        });

        btn_VerTrigers.setText("Trigers");
        btn_VerTrigers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerTrigersActionPerformed(evt);
            }
        });

        btn_VerProcedures.setText("Procedures");
        btn_VerProcedures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VerProceduresActionPerformed(evt);
            }
        });

        jButton1.setText("Info DB");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_VerBD)
                                    .addComponent(btn_VerVistas))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_VerTablas)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_VerProcedures))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_VerTrigers)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_VerBD)
                    .addComponent(btn_VerTablas)
                    .addComponent(btn_VerProcedures))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_VerVistas)
                    .addComponent(btn_VerTrigers)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbDataBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VerBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerBDActionPerformed
        Connection con = null;
        ResultSet rs = null;
       
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3306/";
            
            con = DriverManager.getConnection(url,"root","ecv96h11");
            
            Statement cmd = con.createStatement();
            rs = cmd.executeQuery("SHOW DATABASES");
            
            while (rs.next()) {
                String nombre = rs.getString("Database");
                cmbDataBase.addItem(nombre);
            }

            rs.close();
            
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_VerBDActionPerformed

    private void btn_VerTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerTablasActionPerformed
        Connection con = null;
        ResultSet rs = null;
       
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3306/";
            
            con = DriverManager.getConnection(url,"root","ecv96h11");
            
            String DB = cmbDataBase.getSelectedItem().toString();
            String todasTablas = "";
            Statement cmd = con.createStatement();
            
            rs = cmd.executeQuery("USE "+DB);
            rs = cmd.executeQuery("SHOW TABLES");
            
            while (rs.next()) {
                String tablas = rs.getString("Tables_in_"+DB);
                todasTablas += tablas +"\n";
            }
            txtObjetos.setText(todasTablas);

            rs.close();
            
            
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_VerTablasActionPerformed

    private void btn_VerVistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerVistasActionPerformed
        Connection con = null;
        ResultSet rs = null;
       
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3306/";
            
            con = DriverManager.getConnection(url,"root","ecv96h11");
            
            String DB = cmbDataBase.getSelectedItem().toString();
            String todasTablas = "";
            Statement cmd = con.createStatement();
            
            rs = cmd.executeQuery("SELECT * FROM information_schema.Tables where"+
                                 " TABLE_TYPE = 'VIEW' and TABLE_SCHEMA = '"+DB+"'");
            
            while (rs.next()) {
                String tablas = rs.getString("TABLE_NAME");
                todasTablas += tablas +"\n";
            }
            txtObjetos.setText(todasTablas);

            rs.close();
            
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_VerVistasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = null;
        ResultSet rs = null;
       
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3306/";
            
            con = DriverManager.getConnection(url,"root","ecv96h11");
            
            DatabaseMetaData meta = con.getMetaData();
            
            String info = "Nombre del servidsor: " + meta.getDatabaseProductName() + "\n" + 
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

    private void btn_VerTrigersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerTrigersActionPerformed
        Connection con = null;
        ResultSet rs = null;
       
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3306/";
            
            con = DriverManager.getConnection(url,"root","ecv96h11");
            
            String DB = cmbDataBase.getSelectedItem().toString();
            String todasTablas = "";
            Statement cmd = con.createStatement();
            rs = cmd.executeQuery("USE " + DB);
            rs = cmd.executeQuery("SHOW TRIGGERS");
            
            while (rs.next()) {
                String tablas = rs.getString("Trigger");
                todasTablas += tablas +"\n";
            }
            txtObjetos.setText(todasTablas);

            rs.close();
            
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_VerTrigersActionPerformed

    private void btn_VerProceduresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VerProceduresActionPerformed
        /*SELECT *
FROM information_schema.routines
WHERE ROUTINE_SCHEMA = 'prueba1';*/
        Connection con = null;
        ResultSet rs = null;
       
        
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3306/";
            
            con = DriverManager.getConnection(url,"root","ecv96h11");
            
            String DB = cmbDataBase.getSelectedItem().toString();
            String todasTablas = "";
            Statement cmd = con.createStatement();
            rs = cmd.executeQuery("SELECT SPECIFIC_NAME FROM information_schema.routines"+
                                  " WHERE ROUTINE_SCHEMA = '"+DB+"';");
            
            while (rs.next()) {
                String tablas = rs.getString("SPECIFIC_NAME");
                todasTablas += tablas +"\n";
            }
            txtObjetos.setText(todasTablas);

            rs.close();
            
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btn_VerProceduresActionPerformed

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
    private javax.swing.JButton btn_VerProcedures;
    private javax.swing.JButton btn_VerTablas;
    private javax.swing.JButton btn_VerTrigers;
    private javax.swing.JButton btn_VerVistas;
    private javax.swing.JComboBox<String> cmbDataBase;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtObjetos;
    // End of variables declaration//GEN-END:variables
}
