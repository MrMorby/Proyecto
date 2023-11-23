/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import Controlador.ListarJugador;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Jugador;

/**
 *
 * @author Sergi
 */
public class vista_ListarJugadores extends javax.swing.JFrame {

    /**
     * Creates new form Listar
     */
    public vista_ListarJugadores() throws Exception {
        initComponents();
        ConsultarJugador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jtxt_busqueda = new javax.swing.JTextField();
        jbttn_buscarFiltro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTbl_tablafiltroquemeenseñoahacerdonGabrielcreo = new javax.swing.JTable();
        jCombobox_EleccionBusqueda = new javax.swing.JComboBox<>();

        jMenuItem1.setText("Editar Jugador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel20.setText("Listado de Jugadores");

        jtxt_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_busquedaActionPerformed(evt);
            }
        });

        jbttn_buscarFiltro.setText("Actualizar");
        jbttn_buscarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbttn_buscarFiltroActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTbl_tablafiltroquemeenseñoahacerdonGabrielcreo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Sexo", "Edad", "Id"
            }
        ));
        jTbl_tablafiltroquemeenseñoahacerdonGabrielcreo.setComponentPopupMenu(jPopupMenu1);
        jTbl_tablafiltroquemeenseñoahacerdonGabrielcreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jTbl_tablafiltroquemeenseñoahacerdonGabrielcreo);

        jScrollPane4.setViewportView(jScrollPane1);

        jCombobox_EleccionBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nombre", "Apellido", "Edad", "Id" }));
        jCombobox_EleccionBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombobox_EleccionBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jtxt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jCombobox_EleccionBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jbttn_buscarFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(166, 166, 166))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCombobox_EleccionBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jbttn_buscarFiltro)
                        .addGap(31, 464, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbttn_buscarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbttn_buscarFiltroActionPerformed
        ListarJugador regJug = new ListarJugador();
        String condicion = "";
        String txtBusqueda = jtxt_busqueda.getText(); 
        DefaultTableModel modelo = (DefaultTableModel) this.jTbl_tablafiltroquemeenseñoahacerdonGabrielcreo.getModel();
        modelo.setRowCount(0);
        String comboCondicion = (String) jCombobox_EleccionBusqueda.getSelectedItem();

      switch (comboCondicion) {
          
          case "Nombre":
             try {condicion = "nombre";
                for (Jugador jugador : regJug.buscarPorFiltro(condicion, txtBusqueda)) {
                    modelo.addRow(new Object[]{jugador.getNombre(),
                        jugador.getApellido(),
                        jugador.getSexo(),
                        jugador.getEdad(),
                        jugador.getId()});
                    
                }   } catch (Exception ex) {
                Logger.getLogger(vista_ListarJugadores.class.getName()).log(Level.SEVERE, null, ex);
            }
             
             break;     
          case "Apellido":
              try {condicion = "apellido";
                for (Jugador jugador : regJug.buscarPorFiltro(condicion, txtBusqueda)) {
                    modelo.addRow(new Object[]{jugador.getNombre(),
                        jugador.getApellido(),
                        jugador.getSexo(),
                        jugador.getEdad(),
                        jugador.getId()});
                    
                }   } catch (Exception ex) {
                Logger.getLogger(vista_ListarJugadores.class.getName()).log(Level.SEVERE, null, ex);
            }
              break;
          case "Sexo":
             try {condicion = "sexo";
                for (Jugador jugador : regJug.buscarPorFiltro(condicion, txtBusqueda)) {
                    modelo.addRow(new Object[]{jugador.getNombre(),
                        jugador.getApellido(),
                        jugador.getSexo(),
                        jugador.getEdad(),
                        jugador.getId()});
                    
                }   } catch (Exception ex) {
                Logger.getLogger(vista_ListarJugadores.class.getName()).log(Level.SEVERE, null, ex);
            }
             break;     
          case "Edad":
              try {condicion = "edad";
                for (Jugador jugador : regJug.buscarPorFiltro(condicion, txtBusqueda)) {
                    modelo.addRow(new Object[]{jugador.getNombre(),
                        jugador.getApellido(),
                        jugador.getSexo(),
                        jugador.getEdad(),
                        jugador.getId()});
                    
                }   } catch (Exception ex) {
                Logger.getLogger(vista_ListarJugadores.class.getName()).log(Level.SEVERE, null, ex);
            }
              break;
          case "Id":
             try {condicion = "id";
                for (Jugador jugador : regJug.buscarPorFiltro(condicion, txtBusqueda)) {
                    modelo.addRow(new Object[]{jugador.getNombre(),
                        jugador.getApellido(),
                        jugador.getSexo(),
                        jugador.getEdad(),
                        jugador.getId()});
                    
                }   } catch (Exception ex) {
                Logger.getLogger(vista_ListarJugadores.class.getName()).log(Level.SEVERE, null, ex);
            }
             break;     
         
          
          case "Todos":
            if ("Todos".equals(comboCondicion)) {
            try {
                for (Jugador jugador : regJug.buscarTodos()) {
                    modelo.addRow(new Object[]{jugador.getNombre(),
                        jugador.getApellido(),
                        jugador.getSexo(),
                        jugador.getEdad(),
                        jugador.getId()}
                    );
                }
                break;
            } catch (Exception ex) {
                Logger.getLogger(vista_ListarJugadores.class.getName()).log(Level.SEVERE, null, ex);
            }
          }
        }
    }//GEN-LAST:event_jbttn_buscarFiltroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtxt_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_busquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_busquedaActionPerformed

    private void jCombobox_EleccionBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombobox_EleccionBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCombobox_EleccionBusquedaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            // TODO add your handling code here:
            DefaultTableModel modelo = (DefaultTableModel) this.jTbl_tablafiltroquemeenseñoahacerdonGabrielcreo.getModel();
            int id  = (Integer) modelo.getValueAt(jTbl_tablafiltroquemeenseñoahacerdonGabrielcreo.getSelectedRow(), 4);
            ListarJugador regJug = new ListarJugador();
            List<Jugador> lista = regJug.buscarJugadorId(id);
            
            
            new vista_EditarJugador().setVisible(true);
            for (Jugador j : lista) {
            vista_EditarJugador.jText_BuscarId.setText(j.getId()+"");
            vista_EditarJugador.jText_NombreEdit.setText(j.getNombre());
            vista_EditarJugador.jText_ApellidoEdit.setText(j.getApellido());
            vista_EditarJugador.jComboBox_SexoEdit.setSelectedItem(j.getSexo());
            vista_EditarJugador.jText_EdadEdit.setText(String.valueOf(j.getEdad()));
            }
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(vista_ListarJugadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCombobox_EleccionBusqueda;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTbl_tablafiltroquemeenseñoahacerdonGabrielcreo;
    private javax.swing.JButton jbttn_buscarFiltro;
    private javax.swing.JTextField jtxt_busqueda;
    // End of variables declaration//GEN-END:variables

private void ConsultarJugador() throws Exception{
        
        DefaultTableModel modelo = (DefaultTableModel) this.jTbl_tablafiltroquemeenseñoahacerdonGabrielcreo.getModel();
        modelo.setRowCount(0);
        
        ListarJugador regJug = new ListarJugador();
        
        List<Jugador> lista = regJug.buscarTodos();
         Object[] datos = new Object[5];
        modelo = (DefaultTableModel) jTbl_tablafiltroquemeenseñoahacerdonGabrielcreo.getModel();
        
        for (Jugador j : lista){
            datos[0] = j.getNombre();
            datos[1] = j.getApellido();
            datos[2] = j.getSexo();
            datos[3] = j.getEdad();
            datos[4] = j.getId();
            modelo.addRow(datos);
        
        }

    }

}
