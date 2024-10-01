package controlventana;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ventana_1 extends javax.swing.JFrame {

    private static ArrayList<String> modulos_dam1 = new ArrayList();
    private static ArrayList<String> modulos_dam2 = new ArrayList();
    private static ArrayList<String> inscripciones = new ArrayList();

    public Ventana_1() {
        initComponents();
        modulos_dam1.add("Entornos de Desarrollo");
        modulos_dam1.add("Lenguaje de Marcas");
        modulos_dam1.add("Programacion");
        modulos_dam1.add("Base de Datos");
        modulos_dam1.add("FOL");
        modulos_dam1.add("Sistemas Informaticos");

        modulos_dam2.add("Empresa");
        modulos_dam2.add("Acceso a Datos");
        modulos_dam2.add("Ingles");
        modulos_dam2.add("Servicios y Procesos");
        modulos_dam2.add("Interfaces");
        modulos_dam2.add("Android");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lista_añadidos = new javax.swing.JComboBox<>();
        label_texto_principal = new javax.swing.JLabel();
        escribir_modulos = new javax.swing.JTextField();
        boton_añadir_modulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Combobox");

        lista_añadidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_añadidosActionPerformed(evt);
            }
        });

        label_texto_principal.setText("Introduzca los módulos:");

        escribir_modulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribir_modulosActionPerformed(evt);
            }
        });

        boton_añadir_modulo.setText("Añadir");
        boton_añadir_modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_añadir_moduloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(escribir_modulos, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lista_añadidos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(label_texto_principal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(boton_añadir_modulo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(label_texto_principal)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lista_añadidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escribir_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(boton_añadir_modulo)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escribir_modulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribir_modulosActionPerformed

    }//GEN-LAST:event_escribir_modulosActionPerformed

    private void lista_añadidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_añadidosActionPerformed

    }//GEN-LAST:event_lista_añadidosActionPerformed

    private void boton_añadir_moduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_añadir_moduloActionPerformed
        ArrayList<String> inscripciones2 = new ArrayList();
        if (inscripciones2 == null) {
            
            lista_añadidos.addItem(escribir_modulos.getText());
            escribir_modulos.setText("");
        } else {
            if (inscripciones2.contains(escribir_modulos.getText())) {
                JOptionPane.showMessageDialog(null, "El modulo que intentas añadir ya esta añadido.");
                escribir_modulos.setText("");
                return;
            } else {
                lista_añadidos.addItem(escribir_modulos.getText());
                escribir_modulos.setText("");
            }

        }

       // lista_añadidos.addItem(escribir_modulos.getText());//ENGANCHO EL TEXTO Y LO TENGO QUE AÑADIR AL COMBOBOX

    }//GEN-LAST:event_boton_añadir_moduloActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_añadir_modulo;
    private javax.swing.JTextField escribir_modulos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_texto_principal;
    private javax.swing.JComboBox<String> lista_añadidos;
    // End of variables declaration//GEN-END:variables
}
