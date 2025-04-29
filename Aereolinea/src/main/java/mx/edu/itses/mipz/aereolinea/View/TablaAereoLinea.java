/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.edu.itses.mipz.aereolinea.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mx.edu.itses.mipz.aereolinea.Controller.AereolinaController;
import mx.edu.itses.mipz.aereolinea.Model.Gestion;

/**
 *
 * @author marti
 */
public class TablaAereoLinea extends javax.swing.JFrame {
    
    
    
public static DefaultTableModel tablita;
private int renglon;
    /**
     * Creates new form TablaAereoLinea
     */

    


   
    public TablaAereoLinea(Gestion model) {
        initComponents();
        tablita = (DefaultTableModel) tblVuelos.getModel();
     
        setLocationRelativeTo(null);
        
/////////////////////////////////////////////////

        btnCreate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                   AereolinaController.createFly();
            }
        });
        
//////////////////////////////////////////////////

         btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               AereolinaController.deleteFly();
            }
        });
         
////////////////////////////////////////////////////    

         btnRead.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               AereolinaController.readFly();
            }
        });
         
//////////////////////////////////////////////////

          btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               AereolinaController.updateFly();
            }
        });
////////////////////////////////////////////////////
        btnBuscarVuelo.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String nombreVuelo = txtIngresarBusqueda.getText().trim(); 
        buscarVuelo(nombreVuelo); 
    }
});
///////////////////////////////////////////////////////     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBotones = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        jpnExtras = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbOrder = new javax.swing.JComboBox<>();
        txtIngresarBusqueda = new javax.swing.JTextField();
        btnBuscarVuelo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVuelos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCreate.setText("Crear");
        jpnBotones.add(btnCreate);

        btnActualizar.setText("Actualizar");
        jpnBotones.add(btnActualizar);

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jpnBotones.add(btnDelete);

        btnRead.setText("Leer");
        jpnBotones.add(btnRead);

        jLabel1.setText("Ordenar por: ");
        jpnExtras.add(jLabel1);

        cmbOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jpnExtras.add(cmbOrder);

        txtIngresarBusqueda.setText("Buscar por: ");
        jpnExtras.add(txtIngresarBusqueda);

        btnBuscarVuelo.setText("Buscar");
        jpnExtras.add(btnBuscarVuelo);

        tblVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posicion", "Nombre", "Origen", "Destino", "Fecha de llegada", "Hora de llegada", "Cantidad de pasajeros"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblVuelosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblVuelos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnExtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jpnExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblVuelosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVuelosMousePressed
       JTable tabla = (JTable) evt.getSource();//Poliformismo
        renglon = tabla.rowAtPoint(evt.getPoint());

        if (evt.getClickCount() == 2) {
            renglon = tabla.rowAtPoint(evt.getPoint());
        }
        System.out.println(renglon);
   
    }//GEN-LAST:event_tblVuelosMousePressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      DefaultTableModel model = (DefaultTableModel) tblVuelos.getModel();
        if(tblVuelos.getSelectedRow()== -1){
          JOptionPane.showMessageDialog(null, "No ha seleccionado un registro");
          
      }else{
          model.removeRow(tblVuelos.getSelectedRow());
      }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
 
    public void updateTabla(Gestion model) {
 
    DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
    
        TablaAereoLinea.tablita.getRowCount();
        int row = TablaAereoLinea.tablita.getRowCount();
        this.tablita.addRow(new Object[]{row + 1,model.getNombre(),model.getOrigen(),model.getDestino(),model.getFechaLlegada().toString(),model.getHoraLlegada().toString(),model.getCantidadPasajeros()});
    
    }
    /////////////////


    public void buscarVuelo(String nombre) {
    DefaultTableModel modelo = (DefaultTableModel) tblVuelos.getModel();
    modelo.setRowCount(0); 

    Gestion vuelo = AereolinaController.buscarVuelo(nombre); 

    if (vuelo != null) {
        modelo.addRow(new Object[]{
            vuelo.getNombre(),
            vuelo.getOrigen(),
            vuelo.getDestino(),
            vuelo.getFechaLlegada().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")),
            vuelo.getHoraLlegada().format(DateTimeFormatter.ofPattern("HH:mm")),
            vuelo.getCantidadPasajeros()
        });
    } else {
        JOptionPane.showMessageDialog(null, "Vuelo no encontrado");
    }
} 
//////////////
   public void getTableRow(Gestion model) {
    
    
    model.setNombre(TablaAereoLinea.tablita.getValueAt(renglon, 1).toString());
    model.setOrigen(TablaAereoLinea.tablita.getValueAt(renglon, 2).toString());
    model.setDestino(TablaAereoLinea.tablita.getValueAt(renglon, 3).toString());
    DateTimeFormatter fechaFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
    LocalDate fechaVuelo = LocalDate.parse(TablaAereoLinea.tablita.getValueAt(renglon, 4).toString(), fechaFormatter);
    model.setFechaLlegada(fechaVuelo);
    
    DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm"); 
    LocalTime horaVuelo = LocalTime.parse(TablaAereoLinea.tablita.getValueAt(renglon, 5).toString(), horaFormatter);
    model.setHoraLlegada(horaVuelo);
    
    int cantidadPasajeros = Integer.parseInt(TablaAereoLinea.tablita.getValueAt(renglon, 6).toString());
    model.setCantidadPasajeros(cantidadPasajeros);
}
   
   public static DefaultTableModel getTableModel() {
    return tablita;
}

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscarVuelo;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JComboBox<String> cmbOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnBotones;
    private javax.swing.JPanel jpnExtras;
    private javax.swing.JTable tblVuelos;
    private javax.swing.JTextField txtIngresarBusqueda;
    // End of variables declaration//GEN-END:variables
}
