/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Servicios.ServicioRest;
import java.io.IOException;
import java.time.LocalDate;
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
public class PFactura extends javax.swing.JPanel {

    ServicioRest servicios = new Servicios.ServicioRest();
    public static final String PAHT = "https://arqui-sw.herokuapp.com/apiRest/factura/";
    float montoTotal = 0;
    int idDetalleSelect = -1;
    int idFacturaSelect = -1;
    String nombreProductoSelect;
    String nroFactura;
    DefaultTableModel modeloDetalle;
    DefaultTableModel modeloFactura;
    ArrayList<JSONObject> listaDeProductos = new ArrayList<>();
    ArrayList<JSONObject> listaDetalles = new ArrayList<>();

    public PFactura() {
        initComponents();
        lblFecha.setText(getFecha());
        cargarProductos();
        getFacturas();
    }

    public void cargarProductos() {
        jcmProductos.removeAllItems();
        ArrayList<Object[]> productos = servicios.getProductos();
        for (int i = 0; i < productos.size(); i++) {
            Object[] unProducto = productos.get(i);
            JSONObject productoJson = new JSONObject();
            productoJson.put("id", unProducto[0]);
            productoJson.put("nombre", unProducto[1]);
            productoJson.put("precio", unProducto[2]);
            productoJson.put("idCategoria", unProducto[3]);
            listaDeProductos.add(productoJson);
            jcmProductos.addItem(productoJson.get("nombre").toString());
        }
    }

    public void getFacturas() {
        resetTableFactura();
        ArrayList<Object[]> facturas = servicios.getFacturas();
        modeloFactura = (DefaultTableModel) tableFacturas.getModel();
        for (int i = 0; i < facturas.size(); i++) {
            modeloFactura.addRow(facturas.get(i));
        }
        tableFacturas.setModel(modeloFactura);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        listaProductos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDetallesProductos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jcmProductos = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        lblPrecioProducto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCantidadProducto = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnAgregarDetalle = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnBorrarDetalle = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        DatosFactura = new javax.swing.JPanel();
        txtNroFactura = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblMontoTotal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEditarFac = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnAgregarFac = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnBorrarFac = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFacturas = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(710, 570));
        setPreferredSize(new java.awt.Dimension(710, 620));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setMinimumSize(new java.awt.Dimension(700, 570));
        body.setPreferredSize(new java.awt.Dimension(710, 620));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaProductos.setBackground(new java.awt.Color(255, 255, 255));
        listaProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de la factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        listaProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDetallesProductos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableDetallesProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre Producto", "cantidades", "Sub Total"
            }
        ));
        tableDetallesProductos.getTableHeader().setReorderingAllowed(false);
        tableDetallesProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDetallesProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDetallesProductos);
        if (tableDetallesProductos.getColumnModel().getColumnCount() > 0) {
            tableDetallesProductos.getColumnModel().getColumn(0).setMinWidth(60);
            tableDetallesProductos.getColumnModel().getColumn(0).setPreferredWidth(60);
            tableDetallesProductos.getColumnModel().getColumn(0).setMaxWidth(60);
            tableDetallesProductos.getColumnModel().getColumn(1).setMinWidth(90);
            tableDetallesProductos.getColumnModel().getColumn(1).setPreferredWidth(90);
            tableDetallesProductos.getColumnModel().getColumn(1).setMaxWidth(90);
            tableDetallesProductos.getColumnModel().getColumn(2).setMinWidth(90);
            tableDetallesProductos.getColumnModel().getColumn(2).setPreferredWidth(90);
            tableDetallesProductos.getColumnModel().getColumn(2).setMaxWidth(90);
        }

        listaProductos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 680, 110));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad");
        listaProductos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 70, 20));

        jcmProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcmProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmProductosActionPerformed(evt);
            }
        });
        listaProductos.add(jcmProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 160, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Productos disponibles");
        listaProductos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 20));

        lblPrecioProducto.setBackground(new java.awt.Color(255, 255, 255));
        lblPrecioProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPrecioProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecioProducto.setText("Bs: 350.5050");
        listaProductos.add(lblPrecioProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 130, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Precio del producto");
        listaProductos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 140, 20));

        txtCantidadProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCantidadProducto.setBorder(null);
        listaProductos.add(txtCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 90, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        listaProductos.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 20, 70));

        jSeparator5.setForeground(new java.awt.Color(0, 153, 255));
        listaProductos.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 90, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        listaProductos.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 20, 70));

        btnAgregarDetalle.setBackground(new java.awt.Color(0, 153, 0));
        btnAgregarDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarDetalle.setPreferredSize(new java.awt.Dimension(130, 40));
        btnAgregarDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarDetalleMouseClicked(evt);
            }
        });
        btnAgregarDetalle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Agregar");
        btnAgregarDetalle.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        listaProductos.add(btnAgregarDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 130, 30));

        btnBorrarDetalle.setBackground(new java.awt.Color(255, 0, 51));
        btnBorrarDetalle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarDetalle.setPreferredSize(new java.awt.Dimension(130, 40));
        btnBorrarDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarDetalleMouseClicked(evt);
            }
        });
        btnBorrarDetalle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Borrar");
        btnBorrarDetalle.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        listaProductos.add(btnBorrarDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 130, 28));

        body.add(listaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 700, 240));

        DatosFactura.setBackground(new java.awt.Color(255, 255, 255));
        DatosFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        DatosFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNroFactura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNroFactura.setBorder(null);
        DatosFactura.add(txtNroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 90, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 255));
        DatosFactura.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 90, 10));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("Monto Total:");
        DatosFactura.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 100, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("NIT:");
        DatosFactura.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 30, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        DatosFactura.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 60, 30));

        txtNit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNit.setBorder(null);
        DatosFactura.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 190, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        DatosFactura.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 190, 10));

        jSeparator3.setForeground(new java.awt.Color(0, 153, 255));
        DatosFactura.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 190, 10));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        DatosFactura.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 30));

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DatosFactura.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 130, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Fecha:");
        DatosFactura.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 60, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Nro factura:");
        DatosFactura.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 30));

        lblMontoTotal.setBackground(new java.awt.Color(255, 255, 255));
        lblMontoTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblMontoTotal.setText("Bs: 0");
        DatosFactura.add(lblMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 100, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opreraciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditarFac.setBackground(new java.awt.Color(18, 90, 173));
        btnEditarFac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarFac.setPreferredSize(new java.awt.Dimension(130, 40));
        btnEditarFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarFacMouseClicked(evt);
            }
        });
        btnEditarFac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Editar");
        btnEditarFac.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel3.add(btnEditarFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        btnAgregarFac.setBackground(new java.awt.Color(0, 153, 0));
        btnAgregarFac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarFac.setPreferredSize(new java.awt.Dimension(130, 40));
        btnAgregarFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarFacMouseClicked(evt);
            }
        });
        btnAgregarFac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Agregar");
        btnAgregarFac.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel3.add(btnAgregarFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        btnBorrarFac.setBackground(new java.awt.Color(255, 0, 51));
        btnBorrarFac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrarFac.setPreferredSize(new java.awt.Dimension(130, 40));
        btnBorrarFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarFacMouseClicked(evt);
            }
        });
        btnBorrarFac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Borrar");
        btnBorrarFac.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel3.add(btnBorrarFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        DatosFactura.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 190, 170));

        body.add(DatosFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 210));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Facturas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14)))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableFacturas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Fecha", "NIT", "Nombre", "Monto Total"
            }
        ));
        tableFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableFacturasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableFacturas);
        if (tableFacturas.getColumnModel().getColumnCount() > 0) {
            tableFacturas.getColumnModel().getColumn(0).setMinWidth(60);
            tableFacturas.getColumnModel().getColumn(0).setPreferredWidth(60);
            tableFacturas.getColumnModel().getColumn(0).setMaxWidth(60);
            tableFacturas.getColumnModel().getColumn(1).setMinWidth(90);
            tableFacturas.getColumnModel().getColumn(1).setPreferredWidth(90);
            tableFacturas.getColumnModel().getColumn(1).setMaxWidth(90);
            tableFacturas.getColumnModel().getColumn(2).setMinWidth(90);
            tableFacturas.getColumnModel().getColumn(2).setPreferredWidth(90);
            tableFacturas.getColumnModel().getColumn(2).setMaxWidth(90);
            tableFacturas.getColumnModel().getColumn(4).setMinWidth(150);
            tableFacturas.getColumnModel().getColumn(4).setPreferredWidth(150);
            tableFacturas.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 670, 110));

        body.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 690, 150));

        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void tableDetallesProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDetallesProductosMouseClicked
        int filaSelecionada = tableDetallesProductos.getSelectedRow();
        if (filaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una la filla del detalle");
        } else {
            idDetalleSelect = 1;
            nombreProductoSelect = tableDetallesProductos.getValueAt(filaSelecionada, 1).toString();
        }
    }//GEN-LAST:event_tableDetallesProductosMouseClicked

    private void tableFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableFacturasMouseClicked
        int filaSelecionada = tableFacturas.getSelectedRow();
        if (filaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una la filla de facturas");
        } else {
            idFacturaSelect = 1;
            nroFactura = tableFacturas.getValueAt(filaSelecionada, 0).toString();
            txtNit.setText(tableFacturas.getValueAt(filaSelecionada, 2).toString());
            txtNombre.setText(tableFacturas.getValueAt(filaSelecionada, 3).toString());
        }
    }//GEN-LAST:event_tableFacturasMouseClicked

    private void btnAgregarDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarDetalleMouseClicked
        if (txtCantidadProducto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese la cantidad de productos");
            return;
        }
        Object[] detalle = new Object[5];
        montoTotal = montoTotal + getSubTotal();
        lblMontoTotal.setText("Bs: " + montoTotal);
        int idDetalle = listaDetalles.size() + 1;
        String nombreProducto = jcmProductos.getSelectedItem().toString();
        float subTotal = getSubTotal();
        int cantidad = Integer.valueOf(txtCantidadProducto.getText());
        detalle[0] = idDetalle;
        detalle[1] = nombreProducto;
        detalle[2] = cantidad;
        detalle[3] = subTotal;
        addDetalle(detalle);
        modeloDetalle = (DefaultTableModel) tableDetallesProductos.getModel();
        modeloDetalle.addRow(detalle);
        txtCantidadProducto.setText("");

    }//GEN-LAST:event_btnAgregarDetalleMouseClicked

    private void btnBorrarFacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarFacMouseClicked
        HashMap<String, Object> paramatros = new HashMap<>();
        try {
            if (idFacturaSelect == -1) {
                JOptionPane.showMessageDialog(null, "Selecione una factura de la tabla");
            } else {
                int resCliente
                        = JOptionPane.showConfirmDialog(null,
                                "¿Seguro que quiere eliminar la factura?",
                                "Eliminar factura",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.WARNING_MESSAGE);
                if (resCliente == 0) {
                    servicios.servicoRest(PAHT + "/delete/" + nroFactura, "DELETE", paramatros, "Factura eliminada");
                }
                getFacturas();
                resetCampos();
            }

        } catch (IOException ex) {
            Logger.getLogger(PCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBorrarFacMouseClicked

    private void btnEditarFacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarFacMouseClicked
        try {
            if (idFacturaSelect == -1) {
                JOptionPane.showMessageDialog(null, "Selecione una factura de la tabla");
            } else {
                HashMap<String, Object> paramatros = new HashMap<>();
                paramatros.put("nit", txtNit.getText());
                paramatros.put("nombre", txtNombre.getText());
                servicios.servicoRest(PAHT + "/edit/" + nroFactura, "PUT", paramatros, "Factura editada exitosamente");
                getFacturas();
                resetCampos();
            }
        } catch (IOException ex) {
            Logger.getLogger(PCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarFacMouseClicked

    private void btnAgregarFacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarFacMouseClicked
        try {
            if (!camposValido()) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos correespondientes");
                return;
            }
            if (listaDetalles.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe agregar almenos un producto");
                return;
            }
            HashMap<String, Object> paramatros = new HashMap<>();
            paramatros.put("nro", txtNroFactura.getText());
            paramatros.put("fecha", getFecha());
            paramatros.put("monto_total", montoTotal);
            paramatros.put("nit", txtNit.getText());
            paramatros.put("nombre", txtNombre.getText());
            paramatros.put("detalles", listaDetalles);
            servicios.servicoRest(PAHT + "/save/", "POST", paramatros, "Factura Registrada exitosamente");
            resetCampos();
            listaDetalles = new ArrayList<>();
            resetTableDetalle();
            getFacturas();

        } catch (IOException ex) {
            Logger.getLogger(PFactura.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAgregarFacMouseClicked

    private void jcmProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmProductosActionPerformed
        for (JSONObject producto : listaDeProductos) {
            String productoSelecionado = jcmProductos.getSelectedItem().toString();
            String pAnalizar = producto.getString("nombre");
            if (pAnalizar.equals(productoSelecionado)) {
                lblPrecioProducto.setText("Bs: " + String.valueOf(producto.getFloat("precio")));
            }
        }
    }//GEN-LAST:event_jcmProductosActionPerformed

    private void btnBorrarDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarDetalleMouseClicked
        if (idDetalleSelect == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una la filla del detalle");
            return;
        }
        delDetalle(nombreProductoSelect);
        idDetalleSelect = -1;

    }//GEN-LAST:event_btnBorrarDetalleMouseClicked

    private void resetTableFactura() {
        while (tableFacturas.getRowCount() > 0) {
            modeloFactura.removeRow(0);
        }
    }

    private void resetTableDetalle() {
        while (tableDetallesProductos.getRowCount() > 0) {
            modeloDetalle.removeRow(0);
        }
    }

    private String getKeyProducto(String nombre) {
        for (JSONObject unPro : listaDeProductos) {
            String nombreAnalizar = unPro.getString("nombre");
            if (nombreAnalizar.equals(nombre)) {
                return unPro.getString("id");
            }
        }
        return "-1";
    }

    private boolean camposValido() {
        if (txtNroFactura.getText().length() == 0) {
            return false;
        }
        if (txtNit.getText().length() == 0) {
            return false;
        }
        if (txtNombre.getText().length() == 0) {
            return false;
        }
        return true;
    }

    private void resetCampos() {
        txtNroFactura.setText("");
        txtNit.setText("");
        txtNombre.setText("");
        lblMontoTotal.setText("Bs: 0");
        montoTotal = 0;
        idFacturaSelect = -1;
        idDetalleSelect = -1;
    }

    private float getSubTotal() {
        return (float) (Float.valueOf(lblPrecioProducto.getText().substring(4)) * Integer.valueOf(txtCantidadProducto.getText()));
    }

    private void addDetalle(Object[] detalle) {
        JSONObject unDetalle = new JSONObject();
        unDetalle.put("id_producto", getKeyProducto(detalle[1].toString()));
        unDetalle.put("cantidad", detalle[2]);
        unDetalle.put("sub_total", detalle[3]);
        listaDetalles.add(unDetalle);
    }

    private void delDetalle(String nombre) {
        for (int i = 0; i < listaDeProductos.size(); i++) {
            String nombreAnalizar = listaDeProductos.get(i).getString("nombre");
            if (nombreAnalizar.equals(nombre)) {
                for (int j = 0; j < listaDetalles.size(); j++) {
                    String idProducto = listaDeProductos.get(i).getString("id");
                    if (idProducto.equals(listaDetalles.get(j).getString("id_producto"))) {
                        montoTotal = montoTotal - listaDetalles.get(j).getFloat("sub_total");
                        lblMontoTotal.setText("Bs: " + montoTotal);
                        listaDetalles.remove(j);
                        modeloDetalle.removeRow(j);
                        return;
                    }
                }
            }
        }
    }

    private String getFecha() {
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        return "" + dia + "/" + month + "/" + year;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DatosFactura;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnAgregarDetalle;
    private javax.swing.JPanel btnAgregarFac;
    private javax.swing.JPanel btnBorrarDetalle;
    private javax.swing.JPanel btnBorrarFac;
    private javax.swing.JPanel btnEditarFac;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JComboBox<String> jcmProductos;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMontoTotal;
    private javax.swing.JLabel lblPrecioProducto;
    private javax.swing.JPanel listaProductos;
    private javax.swing.JTable tableDetallesProductos;
    private javax.swing.JTable tableFacturas;
    private javax.swing.JTextField txtCantidadProducto;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNroFactura;
    // End of variables declaration//GEN-END:variables
}
