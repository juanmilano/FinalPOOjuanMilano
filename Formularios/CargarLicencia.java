/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Clases.*;
import Clases.Operaciones;
/**
 *
 * @author juanmilano
 */
@SuppressWarnings("serial")
public class CargarLicencia extends javax.swing.JFrame {
    private LicenciaEspecial objLicenciaEspecial;

    /**
     * Creates new form CargarLicencia
     */
    
    public CargarLicencia() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    //Método privado para Limpiar los campos de Licencia
    	private void Limpiar_Campos(){
    		dniEmpleadoValue.setText("");
    		motivoLicenciaValue.setSelectedIndex(0);
    		diasValue.setText("");
    		inicioValue.setText("");
    		finValue.setText("");
    		estadoDeLicenciaValue.setSelectedIndex(0);
    		justificarValue.setText("");
    	}

         //Mètodo para validar que los campos tengan información
    	private boolean ValidarCampos(){
    		if (dniEmpleadoValue.getText().length() == 0){
    			JOptionPane.showMessageDialog(null,"Ingrese el Dni",
    			"ArrayList",JOptionPane.ERROR_MESSAGE);
    			dniEmpleadoValue.requestFocus();
    			return (false);
    		}
        
    		if (motivoLicenciaValue.getSelectedIndex()== 0){
    			JOptionPane.showMessageDialog(null,"Ingrese el Motivo de su Licencia",
    			"ArrayList",JOptionPane.ERROR_MESSAGE);
    			motivoLicenciaValue.requestFocus();
    		return false;
    		}
        
    		if (diasValue.getText().length() == 0){
    			JOptionPane.showMessageDialog(null,"Ingrese la Cantidad de Días",
    			"ArrayList",JOptionPane.ERROR_MESSAGE);
    			diasValue.requestFocus();
    			return false;
    		}
        
    		if (inicioValue.getText().length() == 0){
    			JOptionPane.showMessageDialog(null,"Ingrese la Fecha de Inicio",
    			"ArrayList",JOptionPane.ERROR_MESSAGE);
    			inicioValue.requestFocus();
    			return false;
    		}
            if (finValue.getText().length() == 0){
            	JOptionPane.showMessageDialog(null,"Ingrese la Fecha de Fin",
            	"ArrayList",JOptionPane.ERROR_MESSAGE);
            	finValue.requestFocus();
            	return false;
            }
	
            if (estadoDeLicenciaValue.getSelectedIndex()== 0){
            	JOptionPane.showMessageDialog(null,"Ingrese el estado en el que se encuentran",
            	"ArrayList",JOptionPane.ERROR_MESSAGE);
            	estadoDeLicenciaValue.requestFocus();
            	return false;
            }
        if (justificarValue.getText().length() == 0){
            	JOptionPane.showMessageDialog(null,"Justifique su Licencia",
            	"ArrayList",JOptionPane.ERROR_MESSAGE);
            	justificarValue.requestFocus();
            	return false;
        }
        return true;        
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLicencia = new JLabel();
        diasLabel = new JLabel();
        diasValue = new JTextField();
        labelInicio = new JLabel();
        inicioValue = new JTextField();
        labelFin = new JLabel();
        finValue = new JTextField();
        LabelJustificar = new JLabel();
        guardarLicencia = new JButton();
        volverMenu = new JButton();
        dniEmpleadoValue = new JTextField();
        labelDniEmpleado = new JLabel();
        estadoDeLicenciaValue = new JComboBox<>();
        motivoLicenciaValue = new JComboBox<>();
        jScrollPane1 = new JScrollPane();
        justificarValue = new JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloLicencia.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        tituloLicencia.setText("Cargar Licencia");

        diasLabel.setText("Cantidad de D�as");
        diasLabel.setToolTipText("");

        labelInicio.setText("Fecha de Inicio:");

        labelFin.setText("Fecha de Fin:");

        LabelJustificar.setText("Justifique la Licencia debajo:");

        guardarLicencia.setText(" Guardar Licencia");
        guardarLicencia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                guardarLicenciaActionPerformed(evt);
            }
        });

        volverMenu.setText("Volver al Men�");
        volverMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                volverMenuActionPerformed(evt);
            }
        });

        labelDniEmpleado.setText("Dni Empleado:");

        
        estadoDeLicenciaValue.addItem("Estado de Licencia");
        estadoDeLicenciaValue.addItem("Enviada");
        estadoDeLicenciaValue.addItem("Pendiente de Revisi�n");
        estadoDeLicenciaValue.addItem("Aprobada");
                
        motivoLicenciaValue.addItem("Motivo de Licencia");
        motivoLicenciaValue.addItem("Maternidad");
        motivoLicenciaValue.addItem("Enfermedad");
        motivoLicenciaValue.addItem("D�a de Ex�men");
        
        justificarValue.setColumns(20);
        justificarValue.setRows(5);
        jScrollPane1.setViewportView(justificarValue);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(220, 220, 220)
            .addComponent(tituloLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
            .addGap(73, 73, 73)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addComponent(labelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(diasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(diasValue)
            .addComponent(inicioValue, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
            .addComponent(LabelJustificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(guardarLicencia, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(volverMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(labelDniEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(dniEmpleadoValue, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
            .addComponent(labelFin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(finValue))
            .addComponent(estadoDeLicenciaValue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(motivoLicenciaValue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1))))
            .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(tituloLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(2, 2, 2)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(dniEmpleadoValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(labelDniEmpleado))
            .addGap(11, 11, 11)
            .addComponent(motivoLicenciaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(diasLabel)
            .addComponent(diasValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(22, 22, 22)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(labelInicio)
            .addComponent(inicioValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(labelFin)
            .addComponent(finValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(23, 23, 23)
            .addComponent(estadoDeLicenciaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(LabelJustificar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(guardarLicencia)
            .addComponent(volverMenu))
            .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverMenuActionPerformed
       MenuPrincipal MenuPrincipal = new MenuPrincipal ();
       MenuPrincipal.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_volverMenuActionPerformed

    private void guardarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarLicenciaActionPerformed
       		//Invocamos el mètodo validar campos		
		if (ValidarCampos()==false){
                    return;
                }
               
                
                //Creamos una instancia de la Clase Operaciones
                Operaciones objOperaciones = new Operaciones();
                
                objLicenciaEspecial = new LicenciaEspecial (motivoLicenciaValue.getSelectedItem().toString(),
                                                            justificarValue.getText(),
                                                            Integer.parseInt(dniEmpleadoValue.getText()),                                      
                                                            Integer.parseInt(diasValue.getText()),
                                                            inicioValue.getText(), 
                                                            finValue.getText(),
                                                            estadoDeLicenciaValue.getSelectedItem().toString()
                                                            );                       
                //Invocamos el método Insertar del Objeto Operaciones
                	if (objOperaciones.Insertar_Licencia_Especial(objLicenciaEspecial)){
                		JOptionPane.showMessageDialog(null,"Licencia Cargada Correctamente",
                        "ArrayList",JOptionPane.INFORMATION_MESSAGE);
                		//Limpiamos los Campos
                		Limpiar_Campos();
                    }
                	else{
                        JOptionPane.showMessageDialog(null,"Ocurrio un error", "ArrayList",JOptionPane.ERROR_MESSAGE);   
                        }
    }//GEN-LAST:event_guardarLicenciaActionPerformed

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CargarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargarLicencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel LabelJustificar;
    private JLabel diasLabel;
    private JTextField diasValue;
    private JTextField dniEmpleadoValue;
    private JComboBox<String> estadoDeLicenciaValue;
    private JTextField finValue;
    private JButton guardarLicencia;
    private JTextField inicioValue;
    private JScrollPane jScrollPane1;
    private JTextArea justificarValue;
    private JLabel labelDniEmpleado;
    private JLabel labelFin;
    private JLabel labelInicio;
    private JComboBox<String> motivoLicenciaValue;
    private JLabel tituloLicencia;
    private JButton volverMenu;
    // End of variables declaration//GEN-END:variables
}
