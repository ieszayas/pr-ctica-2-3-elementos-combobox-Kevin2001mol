package controlventana;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ventana_1 extends javax.swing.JFrame {

    private static ArrayList<String> modulos_dam1 = new ArrayList();
    private static ArrayList<String> modulos_dam2 = new ArrayList();
    private static String dam1 = "DAM1";
    private static String dam2 = "DAM2";

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
        //Ventana_1.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lista_añadidos = new javax.swing.JComboBox<>();
        label_texto_principal = new javax.swing.JLabel();
        boton_añadir_modulo = new javax.swing.JButton();
        boton_agregar_todo = new javax.swing.JButton();
        boton_eliminar_todo = new javax.swing.JButton();
        combobox_curso = new javax.swing.JComboBox<>();
        escribir_modulos = new javax.swing.JTextField();
        boton_borrar_seleccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Combobox");

        lista_añadidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_añadidosActionPerformed(evt);
            }
        });

        label_texto_principal.setText("Introduzca su curso y los módulos correspondientes:");

        boton_añadir_modulo.setText("Añadir");
        boton_añadir_modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_añadir_moduloActionPerformed(evt);
            }
        });

        boton_agregar_todo.setText("Agregar todo");
        boton_agregar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregar_todoActionPerformed(evt);
            }
        });

        boton_eliminar_todo.setText("Eliminar todo");
        boton_eliminar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminar_todoActionPerformed(evt);
            }
        });

        combobox_curso.setMaximumRowCount(2);
        combobox_curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DAM1", "DAM2" }));
        combobox_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_cursoActionPerformed(evt);
            }
        });

        escribir_modulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escribir_modulosActionPerformed(evt);
            }
        });

        boton_borrar_seleccion.setText("borrar");
        boton_borrar_seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrar_seleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(escribir_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lista_añadidos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_texto_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combobox_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(boton_añadir_modulo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boton_eliminar_todo)
                                    .addComponent(boton_agregar_todo))))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boton_borrar_seleccion)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_texto_principal)
                    .addComponent(combobox_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lista_añadidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escribir_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(boton_añadir_modulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_borrar_seleccion)
                .addGap(48, 48, 48)
                .addComponent(boton_agregar_todo)
                .addGap(18, 18, 18)
                .addComponent(boton_eliminar_todo)
                .addContainerGap(52, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
        boolean estan_todos_ya = false;
        int contador = 0;
        if (escribir_modulos.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No has introducido ningun modulo.");
            return;
        }
        if (combobox_curso.getSelectedItem().equals(dam1)) {
            if (lista_añadidos.getItemCount() == modulos_dam1.size()) {
                for (int i = 0; i < lista_añadidos.getItemCount(); i++) {
                    for (int j = 0; j < lista_añadidos.getItemCount(); j++) {
                        if (lista_añadidos.getItemAt(i).equalsIgnoreCase(modulos_dam1.get(j))) {
                            contador++; //si encuentra un modulo en el comoboc que se llame igual en modulos_dam1 se suma al contador,
                        }
                    }
                }
                if (contador == lista_añadidos.getItemCount()) {//si el contador es igual que la longitud del combobox significa que ya estan todos los modulos
                    JOptionPane.showMessageDialog(null, "Ya estan introducidos todos los modulos posibles del ciclo.");
                    escribir_modulos.setText("");
                    return;
                }
            } else {

                for (int i = 0; i < lista_añadidos.getItemCount(); i++) {
                    if (lista_añadidos.getItemAt(i).equals(escribir_modulos.getText())) {
                        JOptionPane.showMessageDialog(null, "El modulo " + escribir_modulos.getText() + " ya esta introducido.");
                        escribir_modulos.setText("");
                        return;
                    }
                }
            }
        } else {
            if (lista_añadidos.getItemCount() == modulos_dam2.size()) {
                for (int i = 0; i < lista_añadidos.getItemCount(); i++) {
                    for (int j = 0; j < lista_añadidos.getItemCount(); j++) {
                        if (lista_añadidos.getItemAt(i).equalsIgnoreCase(modulos_dam2.get(j))) {
                            contador++; //si encuentra un modulo en el comoboc que se llame igual en modulos_dam1 se suma al contador,
                        }
                    }
                }
                if (contador == lista_añadidos.getItemCount()) {//si el contador es igual que la longitud del combobox significa que ya estan todos los modulos
                    JOptionPane.showMessageDialog(null, "Ya estan introducidos todos los modulos posibles del ciclo.");
                    escribir_modulos.setText("");
                    return;
                }
            } else {

                for (int i = 0; i < lista_añadidos.getItemCount(); i++) {
                    if (lista_añadidos.getItemAt(i).equals(escribir_modulos.getText())) {
                        JOptionPane.showMessageDialog(null, "El modulo " + escribir_modulos.getText() + " ya esta introducido.");
                        escribir_modulos.setText("");
                        return;
                    }
                }
            }

        }

        lista_añadidos.addItem(escribir_modulos.getText());
        escribir_modulos.setText("");
        // lista_añadidos.addItem(escribir_modulos.getText());//ENGANCHO EL TEXTO Y LO TENGO QUE AÑADIR AL COMBOBOX

    }//GEN-LAST:event_boton_añadir_moduloActionPerformed

    private void boton_agregar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregar_todoActionPerformed
        if (combobox_curso.getSelectedItem().equals(dam1)) {
            if (lista_añadidos.getItemCount() == 0) {
                for (String modulo : modulos_dam1) {
                    lista_añadidos.addItem(modulo);
                }
            } else {

                JOptionPane.showMessageDialog(null, "Para acceder a esta opcion, elimina los modulos que has añadido previamente.");

            }
        }
        if (combobox_curso.getSelectedItem().equals(dam2)) {
            if (lista_añadidos.getItemCount() == 0) {
                for (String modulo : modulos_dam2) {
                    lista_añadidos.addItem(modulo);
                }
            } else {

                JOptionPane.showMessageDialog(null, "Para acceder a esta opcion, elimina los modulos que has añadido previamente.");

            }

        }
    }//GEN-LAST:event_boton_agregar_todoActionPerformed

    private void boton_eliminar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminar_todoActionPerformed
        if (lista_añadidos.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "La lista ya esta vacia.");
        } else {
            lista_añadidos.removeAllItems();

        }


    }//GEN-LAST:event_boton_eliminar_todoActionPerformed

    private void combobox_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_cursoActionPerformed

    }//GEN-LAST:event_combobox_cursoActionPerformed

    private void boton_borrar_seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrar_seleccionActionPerformed

        lista_añadidos.removeItem(lista_añadidos.getSelectedItem());
    }//GEN-LAST:event_boton_borrar_seleccionActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_1().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregar_todo;
    private javax.swing.JButton boton_añadir_modulo;
    private javax.swing.JButton boton_borrar_seleccion;
    private javax.swing.JButton boton_eliminar_todo;
    private javax.swing.JComboBox<String> combobox_curso;
    private javax.swing.JTextField escribir_modulos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_texto_principal;
    private javax.swing.JComboBox<String> lista_añadidos;
    // End of variables declaration//GEN-END:variables
}
