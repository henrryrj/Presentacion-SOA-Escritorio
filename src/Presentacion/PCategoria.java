/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import static Presentacion.PCategoria.PAHT;
import Servicios.ServicioRest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author henrr
 */
public class PCategoria extends javax.swing.JPanel {
    public static final String PAHT = "https://arqui-sw.herokuapp.com/apiRest/categoria/";
    ServicioRest servicios = new Servicios.ServicioRest();
    DefaultTableModel modelo;
    String idCategoria = "-1";

    public PCategoria() {
        initComponents();
        getCategorias();
        
        
    }
    public void getCategorias() {
        resetTable();
        ArrayList<Object[]> categorias = servicios.getCategorias();
        modelo = (DefaultTableModel) tableCategorias.getModel();
        for (int i = 0; i < categorias.size(); i++) {
            modelo.addRow(categorias.get(i));
        }
        tableCategorias.setModel(modelo);
    }

        private void resetTable() {
        while (tableCategorias.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnBorrarCategoria = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarCategoria = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnEditarCategoria = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCategorias = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(710, 620));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setPreferredSize(new java.awt.Dimension(710, 620));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insertar Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre Categoria:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 51, 158, 41));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 235, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 235, 10));

        body.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 140));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBorrarCategoria.setBackground(new java.awt.Color(255, 0, 51));
        btnBorrarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarCategoria.setPreferredSize(new java.awt.Dimension(130, 40));
        btnBorrarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarCategoriaMouseClicked(evt);
            }
        });
        btnBorrarCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Borrar");
        btnBorrarCategoria.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel3.add(btnBorrarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 130, 40));

        btnAgregarCategoria.setBackground(new java.awt.Color(0, 153, 0));
        btnAgregarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCategoria.setPreferredSize(new java.awt.Dimension(130, 40));
        btnAgregarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCategoriaMouseClicked(evt);
            }
        });
        btnAgregarCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Agregar");
        btnAgregarCategoria.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel3.add(btnAgregarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 40));

        btnEditarCategoria.setBackground(new java.awt.Color(18, 90, 173));
        btnEditarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCategoria.setPreferredSize(new java.awt.Dimension(130, 40));
        btnEditarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarCategoriaMouseClicked(evt);
            }
        });
        btnEditarCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Editar");
        btnEditarCategoria.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel3.add(btnEditarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, 40));

        body.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 700, 90));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableCategorias.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre Categoria"
            }
        ));
        tableCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCategorias);
        if (tableCategorias.getColumnModel().getColumnCount() > 0) {
            tableCategorias.getColumnModel().getColumn(0).setMinWidth(50);
            tableCategorias.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableCategorias.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 680, 250));

        body.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 700, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCategoriaMouseClicked
                String nombre = txtNombre.getText();
        try {
            if (nombre.length() == 0) {
                JOptionPane.showMessageDialog(null, "Ingrese el nombre de la categoria!");
            } else {
                HashMap<String, Object> paramatros = new HashMap<>();
                paramatros.put("nombre", nombre);
                servicios.servicoRest(PAHT + "/save", "POST", paramatros, "Categoria agregada exitosamente");
                getCategorias();
                txtNombre.setText("");
            }

        } catch (IOException ex) {
            Logger.getLogger(PCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarCategoriaMouseClicked

    private void btnEditarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarCategoriaMouseClicked
        String nombre = txtNombre.getText();
        try {
            if (idCategoria.equals("-1") && nombre.length() == 0) {
                JOptionPane.showMessageDialog(null, "Selecione una categoria de la tabla");
            } else {
                HashMap<String, Object> paramatros = new HashMap<>();
                paramatros.put("nombre", nombre);
                servicios.servicoRest(PAHT + "/edit/" + idCategoria, "PUT", paramatros, "Categoria editada exitosamente");
                getCategorias();
                txtNombre.setText("");
                idCategoria = "-1";
            }

        } catch (IOException ex) {
            Logger.getLogger(PCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarCategoriaMouseClicked

    private void tableCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCategoriasMouseClicked
         int filaSelecionada = tableCategorias.getSelectedRow();
        if (filaSelecionada == -1) {
            JOptionPane.showInputDialog(null, "Seleccione una categoria");
        } else {
            idCategoria = tableCategorias.getValueAt(filaSelecionada, 0).toString();
            String nombreCategoria = tableCategorias.getValueAt(filaSelecionada, 1).toString();
            txtNombre.setText(nombreCategoria);
        }
    }//GEN-LAST:event_tableCategoriasMouseClicked

    private void btnBorrarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarCategoriaMouseClicked
         HashMap<String, Object> paramatros = new HashMap<>();
        try {
            if (idCategoria.equals("-1")) {
                JOptionPane.showMessageDialog(null, "Selecione una categoria de la tabla");
            } else {
                int resCliente
                        = JOptionPane.showConfirmDialog(null,
                                "¿Seguro que quiere eliminar la categoria?",
                                "Eliminar Categoria",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.WARNING_MESSAGE);
                if (resCliente == 0) {
                    servicios.servicoRest(PAHT + "/delete/" + idCategoria, "DELETE", paramatros, "Categoria Eliminada");
                }
                getCategorias();
                txtNombre.setText("");
            }

        } catch (IOException ex) {
            Logger.getLogger(PCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBorrarCategoriaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnAgregarCategoria;
    private javax.swing.JPanel btnBorrarCategoria;
    private javax.swing.JPanel btnEditarCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableCategorias;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
