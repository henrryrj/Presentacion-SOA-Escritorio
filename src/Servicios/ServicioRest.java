/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.io.*;
import java.net.*;
import java.util.*;
import org.json.*;
import javax.swing.JOptionPane;

/**
 *
 * @author henrr
 */
public class ServicioRest {

    public ServicioRest() {
    }

    public ArrayList<Object[]> getCategorias() {
        ArrayList<Object[]> listCategorias = new ArrayList<>();
        try {
            URL urlServicio;
            urlServicio = new URL("https://arqui-sw.herokuapp.com/apiRest/categoria/getCategorias");
            HttpURLConnection connect = (HttpURLConnection) urlServicio.openConnection();
            connect.setRequestMethod("GET");
            connect.connect();
            int resStatus = connect.getResponseCode();
            if (resStatus == 200) {
                StringBuilder respuesta = new StringBuilder();
                Scanner scaner = new Scanner(urlServicio.openStream());
                if (scaner.hasNext()) {
                    respuesta.append(scaner.nextLine());
                }
                scaner.close();
                JSONArray listaArray = new JSONArray(respuesta.toString());
                for (int i = 0; i < listaArray.length(); i++) {
                    JSONObject unaCategoria = listaArray.getJSONObject(i);
                    Object[] categoriaObject = new Object[2];
                    // System.out.println(categoria);
                    categoriaObject[0] = unaCategoria.getInt("id");
                    categoriaObject[1] = unaCategoria.getString("nombre");
                    listCategorias.add(categoriaObject);
                }
            } else {
                return new ArrayList<>();
            }
        } catch (IOException ex) {
            System.err.println("Algo paso" + ex.getMessage());
        }
        return listCategorias;
    }

    public ArrayList<Object[]> getProductos() {
        ArrayList<Object[]> listProductos = new ArrayList<>();
        try {
            URL urlServicio;
            urlServicio = new URL("https://arqui-sw.herokuapp.com/apiRest/producto/getProductos");
            HttpURLConnection connect = (HttpURLConnection) urlServicio.openConnection();
            connect.setRequestMethod("GET");
            connect.connect();
            int resStatus = connect.getResponseCode();
            if (resStatus == 200) {
                StringBuilder respuesta = new StringBuilder();
                Scanner scaner = new Scanner(urlServicio.openStream());
                if (scaner.hasNext()) {
                    respuesta.append(scaner.nextLine());
                }
                scaner.close();
                JSONArray listaArray = new JSONArray(respuesta.toString());
                for (int i = 0; i < listaArray.length(); i++) {
                    JSONObject unProducto = listaArray.getJSONObject(i);
                    Object[] productoObject = new Object[4];
                    productoObject[0] = unProducto.getString("id");
                    productoObject[1] = unProducto.getString("nombre");
                    productoObject[2] = unProducto.getFloat("precio");
                    productoObject[3] =unProducto.getString("nombre_categoria");
                    listProductos.add(productoObject);
                }
            } else {
                return new ArrayList<>();
            }
        } catch (IOException ex) {
            System.err.println("Algo paso" + ex.getMessage());
        }
        return listProductos;
    }

    public ArrayList<Object[]> getFacturas() {
        ArrayList<Object[]> listaFacturas = new ArrayList<>();
        try {
            URL urlServicio;
            urlServicio = new URL("https://arqui-sw.herokuapp.com/apiRest/factura/getFacturas");
            HttpURLConnection connect = (HttpURLConnection) urlServicio.openConnection();
            connect.setRequestMethod("GET");
            connect.connect();
            int resStatus = connect.getResponseCode();
            if (resStatus == 200) {
                StringBuilder respuesta = new StringBuilder();
                Scanner scaner = new Scanner(urlServicio.openStream());
                if (scaner.hasNext()) {
                    respuesta.append(scaner.nextLine());
                }
                scaner.close();
                JSONArray listaArray = new JSONArray(respuesta.toString());
                for (int i = 0; i < listaArray.length(); i++) {
                    JSONObject unaFactura = listaArray.getJSONObject(i);
                    Object[] fanturaObject = new Object[5];
                    fanturaObject[0] = unaFactura.getString("nro");
                    fanturaObject[1] = unaFactura.getString("fecha");
                    fanturaObject[2] = unaFactura.getString("nit");
                    fanturaObject[3] = unaFactura.getString("nombre");
                    fanturaObject[4] = unaFactura.getFloat("monto_total");

                    listaFacturas.add(fanturaObject);
                }
            } else {
                return new ArrayList<>();
            }
        } catch (IOException ex) {
            System.err.println("Algo paso" + ex.getMessage());
        }
        return listaFacturas;
    }

    public void servicoRest(String path, String metodo, HashMap<String, Object> paramatros, String msgRespuesta)
            throws MalformedURLException, ProtocolException, IOException {
        URL urlServicio;
        urlServicio = new URL(path);
        HttpURLConnection connect = (HttpURLConnection) urlServicio.openConnection();
        connect.setRequestMethod(metodo);
        connect.setRequestProperty("Content-Type", "application/json");
        connect.setRequestProperty("Accept", "application/json");
        connect.setDoOutput(true);
        if (!paramatros.isEmpty()) {
            // info que se envia tipo json
            JSONObject reqBodyJson = new JSONObject(paramatros);
            byte[] reqBodyJsonByte = reqBodyJson.toString().getBytes("UTF-8");
            //Enviando la informacion
            connect.getOutputStream().write(reqBodyJsonByte);
        }
        // analizando la respuesta!
        connect.connect();
        int resStatus = connect.getResponseCode();
        if (resStatus == 200) {
            if (!msgRespuesta.equals("-1")) {
                JOptionPane.showMessageDialog(null, msgRespuesta);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la petiicion :c");
        }
    }

}
