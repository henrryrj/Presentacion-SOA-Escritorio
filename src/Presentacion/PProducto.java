/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import static Presentacion.PProducto.PAHT;
import Servicios.ServicioRest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONObject;

/**
 *
 * @author henrr
 */
public class PProducto extends javax.swing.JPanel {

    public static final String PAHT = "https://arqui-sw.herokuapp.com/apiRest/producto/";
    ServicioRest servicios = new Servicios.ServicioRest();
    DefaultTableModel modelo;
    int idProducto = -1;
    ArrayList<JSONObject> listaCategorias = new ArrayList<>();

    public PProducto() {
        initComponents();
        getProductos();
        cargarCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtPrecioProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jcmCategorias = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btnBorrarProducto = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnEditarProducto = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        listaProductos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(710, 570));
        setPreferredSize(new java.awt.Dimension(710, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setMinimumSize(new java.awt.Dimension(700, 520));
        body.setPreferredSize(new java.awt.Dimension(710, 620));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insertar Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecioProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrecioProducto.setBorder(null);
        jPanel2.add(txtPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 200, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selecione una Categoria:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 180, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Id: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 100, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 100, 30));

        txtIdProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtIdProducto.setBorder(null);
        jPanel2.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 90, 30));

        txtNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreProducto.setBorder(null);
        jPanel2.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Precio:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, 30));

        jcmCategorias.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(jcmCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 170, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 200, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 90, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 200, 10));

        body.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 180));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBorrarProducto.setBackground(new java.awt.Color(255, 0, 51));
        btnBorrarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarProducto.setPreferredSize(new java.awt.Dimension(130, 40));
        btnBorrarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarProductoMouseClicked(evt);
            }
        });
        btnBorrarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Borrar");
        btnBorrarProducto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel4.add(btnBorrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 130, 40));

        btnEditarProducto.setBackground(new java.awt.Color(18, 90, 173));
        btnEditarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProducto.setPreferredSize(new java.awt.Dimension(130, 40));
        btnEditarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarProductoMouseClicked(evt);
            }
        });
        btnEditarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Editar");
        btnEditarProducto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel4.add(btnEditarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, 40));

        btnAgregarProducto.setBackground(new java.awt.Color(0, 153, 0));
        btnAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProducto.setPreferredSize(new java.awt.Dimension(130, 40));
        btnAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMouseClicked(evt);
            }
        });
        btnAgregarProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Agregar");
        btnAgregarProducto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel4.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 40));

        body.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 700, 100));

        listaProductos.setBackground(new java.awt.Color(255, 255, 255));
        listaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de categorias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        listaProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableProductos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre Producto", "Precio", "Categoria"
            }
        ));
        tableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProductos);
        if (tableProductos.getColumnModel().getColumnCount() > 0) {
            tableProductos.getColumnModel().getColumn(0).setMinWidth(50);
            tableProductos.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableProductos.getColumnModel().getColumn(0).setMaxWidth(50);
            tableProductos.getColumnModel().getColumn(2).setMinWidth(50);
            tableProductos.getColumnModel().getColumn(2).setPreferredWidth(50);
            tableProductos.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        listaProductos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 680, 200));

        body.add(listaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 700, 230));

        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarProductoMouseClicked
        HashMap<String, Object> paramatros = new HashMap<>();
        try {
            if (idProducto == -1) {
                JOptionPane.showMessageDialog(null, "Selecione una producto de la tabla");
            } else {
                int resCliente
                        = JOptionPane.showConfirmDialog(null,
                                "¿Seguro que quiere eliminar el producto?",
                                "Eliminar producto",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.WARNING_MESSAGE);
                if (resCliente == 0) {
                    servicios.servicoRest(PAHT + "/delete/" + txtIdProducto.getText(), "DELETE", paramatros, "Producto eliminado");
                }
                getProductos();
                limpiarCampos();
            }

        } catch (IOException ex) {
            Logger.getLogger(PCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBorrarProductoMouseClicked

    private void btnEditarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarProductoMouseClicked
        try {
            if (idProducto == -1) {
                JOptionPane.showMessageDialog(null, "Selecione un producto de la tabla");
            } else {
                if (camposValidos()) {
                    String idProducto = txtIdProducto.getText();
                    String nombreProducto = txtNombreProducto.getText();
                    float precioProducto = Float.valueOf(txtPrecioProducto.getText());
                    int id_categoria = getIdCategoria(jcmCategorias.getSelectedItem().toString());
                    HashMap<String, Object> paramatros = new HashMap<>();
                    paramatros.put("id", idProducto);
                    paramatros.put("nombre", nombreProducto);
                    paramatros.put("precio", precioProducto);
                    paramatros.put("id_categoria", id_categoria);
                    servicios.servicoRest(PAHT + "/edit/" + idProducto, "PUT", paramatros, "Producto editado exitosamente");
                    getProductos();
                    limpiarCampos();
                    this.idProducto = -1;

                } else {
                    JOptionPane.showMessageDialog(null, "Llene todos los campos correespondientes");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(PProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarProductoMouseClicked

    private void btnAgregarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMouseClicked
        try {
            if (camposValidos()) {
                String idProducto = txtIdProducto.getText();
                String nombreProducto = txtNombreProducto.getText();
                float precioProducto = Float.valueOf(txtPrecioProducto.getText());
                int id_categoria = getIdCategoria(jcmCategorias.getSelectedItem().toString());
                HashMap<String, Object> paramatros = new HashMap<>();
                paramatros.put("id", idProducto);
                paramatros.put("nombre", nombreProducto);
                paramatros.put("precio", precioProducto);
                paramatros.put("id_categoria", id_categoria);
                servicios.servicoRest(PAHT + "/save/", "POST", paramatros, "Producto agregado exitosamente");
                getProductos();
                limpiarCampos();

            } else {
                JOptionPane.showMessageDialog(null, "Llene todos los campos correespondientes");
            }
        } catch (IOException ex) {
            Logger.getLogger(PProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarProductoMouseClicked

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked
        int filaSelecionada = tableProductos.getSelectedRow();
        if (filaSelecionada == -1) {
            JOptionPane.showInputDialog(null, "Seleccione un Producto");
        } else {
            String nombreCategoria = tableProductos.getValueAt(filaSelecionada, 3).toString();
            idProducto = getIdCategoria(nombreCategoria);
            txtIdProducto.setText(tableProductos.getValueAt(filaSelecionada, 0).toString());
            txtNombreProducto.setText(tableProductos.getValueAt(filaSelecionada, 1).toString());
            txtPrecioProducto.setText(tableProductos.getValueAt(filaSelecionada, 2).toString());

        }        // TODO add your handling code here:
    }//GEN-LAST:event_tableProductosMouseClicked

    public void getProductos() {
        resetTable();
        ArrayList<Object[]> Productos = servicios.getProductos();
        modelo = (DefaultTableModel) tableProductos.getModel();
        for (int i = 0; i < Productos.size(); i++) {
            modelo.addRow(Productos.get(i));
        }
        tableProductos.setModel(modelo);
    }

    public void cargarCategorias() {
        jcmCategorias.removeAllItems();
        ArrayList<Object[]> categorias = servicios.getCategorias();
        for (int i = 0; i < categorias.size(); i++) {
            Object[] unaCategoria = categorias.get(i);
            JSONObject categoriaJson = new JSONObject();
            categoriaJson.put("id", unaCategoria[0]);  
            categoriaJson.put("nombre", unaCategoria[1]);
            listaCategorias.add(categoriaJson);
            jcmCategorias.addItem(unaCategoria[1].toString());
        }

    }

    private int getIdCategoria(String nombreCategoria) {
        for (int i = 0; i < listaCategorias.size(); i++) {
            String nombreAnalizar = listaCategorias.get(i).getString("nombre");
            if (nombreAnalizar.equals(nombreCategoria)) {
                return (int) listaCategorias.get(i).getInt("id");
            }
        }
        return -1;
    }

    private void resetTable() {
        while (tableProductos.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    private boolean camposValidos() {
        if (txtIdProducto.getText().length() == 0) {
            return false;
        }
        if (txtNombreProducto.getText().length() == 0) {
            return false;
        }
        if (txtPrecioProducto.getText().length() == 0) {
            return false;
        }
        return true;
    }

    private void limpiarCampos() {
        txtIdProducto.setText("");
        txtNombreProducto.setText("");
        txtPrecioProducto.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnAgregarProducto;
    private javax.swing.JPanel btnBorrarProducto;
    private javax.swing.JPanel btnEditarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> jcmCategorias;
    private javax.swing.JPanel listaProductos;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    // End of variables declaration//GEN-END:variables
}
