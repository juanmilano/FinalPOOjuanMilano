/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.*;
import Clases.Operaciones;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author juanmilano
 */
@SuppressWarnings("serial")
public class CargarVacaciones extends JFrame {
    private Vacaciones objVacaciones;

    /**
     * Creates new form CargarLicencia
     */
    public CargarVacaciones() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    //M�todo privado para Limpiar los campos de Vacaciones//
    private void Limpiar_Campos(){
	    dniEmpleadoValue.setText("");
        diasValue.setText("");
        inicioValue.setText("");
        finValue.setText("");
        periodoValue.setText("");
        //jTextField1.setSelectedIndex(0);
        semanasValue.setText("");
        estadoVacacionesValue.setSelectedIndex(0);
        		
    } 
    
       //Método para validar que los campos tengan información//
    private boolean ValidarCampos(){
        boolean estado = true;       
        if (dniEmpleadoValue.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Ingrese el Dni",
            "ArrayList",JOptionPane.ERROR_MESSAGE);
            dniEmpleadoValue.requestFocus();
            estado = false;
        }
        
        if (diasValue.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Ingrese la Cantidad de D�as",
            "ArrayList",JOptionPane.ERROR_MESSAGE);
            diasValue.requestFocus();
            estado = false;
        }
        
        if (inicioValue.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Ingrese la Fecha de Inicio",
            "ArrayList",JOptionPane.ERROR_MESSAGE);
            inicioValue.requestFocus();
            estado = false;
        }
        
        if (finValue.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Ingrese la Fecha de Fin",
            "ArrayList",JOptionPane.ERROR_MESSAGE);
            finValue.requestFocus();
            estado = false;
        }
        
        if (periodoValue.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Ingrese el Periodo al que corresponden",
            "ArrayList",JOptionPane.ERROR_MESSAGE);
            periodoValue.requestFocus();
            estado = false;
        }    
	/**
        if (jTextField1.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null,"Ingrese la Antiguedad",
            "ArrayList",JOptionPane.ERROR_MESSAGE);
	    jTextField1.requestFocus();
	    return false;
	}**/
        
        if (semanasValue.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Ingrese la Cantidad de Semanas",
            "ArrayList",JOptionPane.ERROR_MESSAGE);
            semanasValue.requestFocus();
            estado = false;
        }
        
        if (estadoVacacionesValue.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null,"Ingrese el estado en el que se encuentran",
            "ArrayList",JOptionPane.ERROR_MESSAGE);
            estadoVacacionesValue.requestFocus();
            estado = false;
        }
        
        return (estado);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloVacaciones = new JLabel();
        labelDias = new JLabel();
        diasValue = new JTextField();
        jLabel3 = new JLabel();
        labelInicio = new JLabel();
        inicioValue = new JTextField();
        labelFin = new JLabel();
        finValue = new JTextField();
        labelPeriodo = new JLabel();
        guardarVacaciones = new JButton();
        volverMenu = new JButton();
        periodoValue = new JTextField();
        antiguedadValue = new JComboBox<>();
        labelSemanas = new JLabel();
        semanasValue = new JTextField();
        dniEmpleadoValue = new JTextField();
        labelDniEmpleado = new JLabel();
        estadoVacacionesValue = new JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloVacaciones.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        tituloVacaciones.setText("Cargar Vacaciones");

        labelDias.setText("Cantidad de D�as");
        labelDias.setToolTipText("");

        labelInicio.setText("Fecha de Inicio:");

        labelFin.setText("Fecha de Fin:");

        labelPeriodo.setText("Periodo de Vacaciones:");

        guardarVacaciones.setText(" Guardar Vacaciones");
        guardarVacaciones.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guardarVacacionesActionPerformed(evt);
            }
        });

        volverMenu.setText("Volver al Men�");
        volverMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                volverMenuActionPerformed(evt);
            }
        });

        periodoValue.setText("Indique el a�o al que corresponde sus Vacaciones");
        periodoValue.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                periodoValueMouseEntered(evt);
            }
        });

                
        antiguedadValue.addItem("Antiguedad del Empleado");
        antiguedadValue.addItem("1");
        antiguedadValue.addItem("2");
        antiguedadValue.addItem("3");
        antiguedadValue.addItem("4");
        antiguedadValue.addItem("5");
        antiguedadValue.addItem("6");
        antiguedadValue.addItem("7");
        antiguedadValue.addItem("8");
        antiguedadValue.addItem("9");
        antiguedadValue.addItem("10");
        antiguedadValue.addItem("11");
        antiguedadValue.addItem("12");
        antiguedadValue.addItem("13");
        antiguedadValue.addItem("14");
        antiguedadValue.addItem("15");
        antiguedadValue.addItem("16");
        antiguedadValue.addItem("17");
        antiguedadValue.addItem("18");
        antiguedadValue.addItem("19");
        antiguedadValue.addItem("20");
        
        labelSemanas.setText("Semanas Disponibles:");

        dniEmpleadoValue.setToolTipText("");

        labelDniEmpleado.setText("DNI Empleado:");

        
        estadoVacacionesValue.addItem("Estado de las Vacaciones");
        estadoVacacionesValue.addItem("Enviada");
        estadoVacacionesValue.addItem("Pediente de Revisi�n");
        estadoVacacionesValue.addItem("Aprobada");
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(220, 220, 220)
            .addComponent(tituloVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
            .addGap(73, 73, 73)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(guardarVacaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(volverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(antiguedadValue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
            .addComponent(labelSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(semanasValue, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(labelPeriodo)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(periodoValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
            .addComponent(labelFin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(finValue, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(estadoVacacionesValue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(labelDniEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(3, 3, 3)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(dniEmpleadoValue, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
            .addComponent(diasValue)))
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(labelDias, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(labelInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(inicioValue, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(tituloVacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(47, 47, 47)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(dniEmpleadoValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(labelDniEmpleado))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDias)
            .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addComponent(inicioValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(labelInicio)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(labelFin)
            .addComponent(finValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(periodoValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(labelPeriodo))
            .addGap(18, 18, 18)
            .addComponent(antiguedadValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(labelSemanas)
            .addComponent(semanasValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(diasValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(214, 214, 214)))
            .addComponent(estadoVacacionesValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(9, 9, 9)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(guardarVacaciones)
            .addComponent(volverMenu))
            .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMenuActionPerformed
       MenuPrincipal MenuPrincipal = new MenuPrincipal ();
       MenuPrincipal.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_volverMenuActionPerformed

    private void guardarVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarVacacionesActionPerformed
       		//Invocamos el mètodo validar campos		
		if (ValidarCampos()==false){
                    return;
                }
                //Creamos una instancia de la Clase Operaciones
                Operaciones objOperaciones = new Operaciones();
                 objVacaciones = new Vacaciones (Integer.parseInt(semanasValue.getText()),
                                                 Integer.parseInt(antiguedadValue.getSelectedItem().toString()),
                                                 Integer.parseInt(periodoValue.getText()),
                                                 Integer.parseInt(dniEmpleadoValue.getText()),
                                                 Integer.parseInt(diasValue.getText()),
                                                 inicioValue.getText(), 
                                                 finValue.getText(),
                                                 estadoVacacionesValue.getSelectedItem().toString()
                 
                 );
                        //Invocamos el método Insertar del Objeto Operaciones
                        if (objOperaciones.Insertar_Vacaciones(objVacaciones)){
                            JOptionPane.showMessageDialog(null,"Sus vacaciones se han cargado correctamente",
                                                          "ArrayList",JOptionPane.INFORMATION_MESSAGE);
                            //Limpiamos los Campos
                            Limpiar_Campos();
                        }else{
                             JOptionPane.showMessageDialog(null,"Ocurrio un error", "ArrayList",JOptionPane.ERROR_MESSAGE);   
                        }
    }//GEN-LAST:event_guardarVacacionesActionPerformed

    private void periodoValueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_periodoValueMouseEntered
        periodoValue.setText("");
    }//GEN-LAST:event_periodoValueMouseEntered

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
            java.util.logging.Logger.getLogger(CargarVacaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarVacaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarVacaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarVacaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarVacaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> antiguedadValue;
    private javax.swing.JTextField diasValue;
    private javax.swing.JTextField dniEmpleadoValue;
    private javax.swing.JComboBox<String> estadoVacacionesValue;
    private javax.swing.JTextField finValue;
    private javax.swing.JButton guardarVacaciones;
    private javax.swing.JTextField inicioValue;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelDias;
    private javax.swing.JLabel labelDniEmpleado;
    private javax.swing.JLabel labelFin;
    private javax.swing.JLabel labelInicio;
    private javax.swing.JLabel labelPeriodo;
    private javax.swing.JLabel labelSemanas;
    private javax.swing.JTextField periodoValue;
    private javax.swing.JTextField semanasValue;
    private javax.swing.JLabel tituloVacaciones;
    private javax.swing.JButton volverMenu;
    // End of variables declaration//GEN-END:variables
}
