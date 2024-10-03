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
        modulos_dam1.add("ENTORNOS DE DESARROLLO");
        modulos_dam1.add("LENGUAJE DE MARCAS");
        modulos_dam1.add("PROGRAMACION");
        modulos_dam1.add("BASE DE DATOS");
        modulos_dam1.add("FOL");
        modulos_dam1.add("SISTEMAS INFORMATICOS");

        modulos_dam2.add("EMPRESA");
        modulos_dam2.add("ACCESO A DATOS");
        modulos_dam2.add("INGLES");
        modulos_dam2.add("SERVICIOS Y PROCESOS");
        modulos_dam2.add("INTERFACES");
        modulos_dam2.add("ANDROID");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_principal = new javax.swing.JPanel();
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

        boton_borrar_seleccion.setText("Borrar");
        boton_borrar_seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrar_seleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_principalLayout = new javax.swing.GroupLayout(Panel_principal);
        Panel_principal.setLayout(Panel_principalLayout);
        Panel_principalLayout.setHorizontalGroup(
            Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_principalLayout.createSequentialGroup()
                .addComponent(escribir_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lista_añadidos, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Panel_principalLayout.createSequentialGroup()
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_principalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_texto_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combobox_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_principalLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_eliminar_todo)
                            .addComponent(boton_agregar_todo))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(Panel_principalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(boton_añadir_modulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_borrar_seleccion)
                .addGap(101, 101, 101))
        );
        Panel_principalLayout.setVerticalGroup(
            Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_principalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_texto_principal)
                    .addComponent(combobox_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lista_añadidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escribir_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_añadir_modulo)
                    .addComponent(boton_borrar_seleccion))
                .addGap(77, 77, 77)
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
                .addComponent(Panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void escribir_modulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escribir_modulosActionPerformed

    }//GEN-LAST:event_escribir_modulosActionPerformed

    private void lista_añadidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_añadidosActionPerformed

    }//GEN-LAST:event_lista_añadidosActionPerformed

    private void boton_añadir_moduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_añadir_moduloActionPerformed

        if (escribir_modulos.getText().isEmpty()) { // si lo que va a añadir esta vacio se le manda un mensaje
            JOptionPane.showMessageDialog(null, "No has introducido ningun modulo.");
            return;
        }

        if (combobox_curso.getSelectedItem().equals(dam1)) {// si la eleccion del curso es dam1 entra
            if (!(esModulo(escribir_modulos.getText(), modulos_dam1))) {//si no es un modulo contemplado en el arraylist fuera

                return;
            }

            if (!lleno(modulos_dam1)) {//si el curso de dam1 no esta lleno entra
                if (existeEnLista()) {//si existe lo que intenta introducir entra y le retorna 
                    return;
                }
            }
        } else {// si la eleccion del curso no es dam1 entra
            if (!(esModulo(escribir_modulos.getText(), modulos_dam2))) {//si no es un modulo contemplado en el arraylist fuera

                return;
            }

            if (!lleno(modulos_dam2)) {
                if (existeEnLista()) {
                    return;
                }
            }

        }

        lista_añadidos.addItem(escribir_modulos.getText().toUpperCase());//añade el item 
        reseteartexto();


    }//GEN-LAST:event_boton_añadir_moduloActionPerformed
    public void reseteartexto() {
        escribir_modulos.setText("");//reseteamos el texto
    }

    public boolean esModulo(String modulo, ArrayList<String> curso) {
        for (String mod_curso : curso) {
            if (modulo.equalsIgnoreCase(mod_curso)) {
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "El modulo " + escribir_modulos.getText() + " no existe.");
        reseteartexto();
        return false;

    }

    public boolean existeEnLista() {
        for (int i = 0; i < lista_añadidos.getItemCount(); i++) {
            if (lista_añadidos.getItemAt(i).equalsIgnoreCase((escribir_modulos.getText()))) {
                JOptionPane.showMessageDialog(null, "El modulo " + escribir_modulos.getText() + " ya esta introducido.");
                escribir_modulos.setText("");
                return true;
            }
        }

        return false;
    }

    public boolean lleno(ArrayList<String> curso) {
        if (lista_añadidos.getItemCount() == curso.size()) {

            JOptionPane.showMessageDialog(null, "Ya estan introducidos todos los modulos posibles del ciclo.");
            reseteartexto();

            return true;
        } else {
            return false;
        }
    }

    private void boton_agregar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregar_todoActionPerformed
        if (combobox_curso.getSelectedItem().equals(dam1)) {
            crear_todo(modulos_dam1);

        }
        if (combobox_curso.getSelectedItem().equals(dam2)) {
            crear_todo(modulos_dam2);

        }
    }//GEN-LAST:event_boton_agregar_todoActionPerformed
    public void crear_todo(ArrayList<String> curso) {

        if (lista_añadidos.getItemCount() == 0) {
            for (String modulo : curso) {
                lista_añadidos.addItem(modulo);
            }
        } else {

            JOptionPane.showMessageDialog(null, "Para acceder a esta opcion, elimina los modulos que has añadido previamente.");

        }

    }


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
    private javax.swing.JPanel Panel_principal;
    private javax.swing.JButton boton_agregar_todo;
    private javax.swing.JButton boton_añadir_modulo;
    private javax.swing.JButton boton_borrar_seleccion;
    private javax.swing.JButton boton_eliminar_todo;
    private javax.swing.JComboBox<String> combobox_curso;
    private javax.swing.JTextField escribir_modulos;
    private javax.swing.JLabel label_texto_principal;
    private javax.swing.JComboBox<String> lista_añadidos;
    // End of variables declaration//GEN-END:variables
}
