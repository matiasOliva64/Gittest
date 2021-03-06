/*
 * Codigo practica manipulacion de archivos. Crear y escribir archivo
 * */

package timer;

import javax.swing.*;
import java.io.*;

public class Archivos {


    public static void main(String[] args) {


        int result = JOptionPane.showConfirmDialog(null, "Preciona OK para ingresar", "Bienvenido al programa!", JOptionPane.DEFAULT_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            int confirm = JOptionPane.showConfirmDialog(null, "OK para continuar, CANCEL para salir", "Confirmación!", JOptionPane.OK_CANCEL_OPTION);

            if (confirm == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa!");
                System.exit(0);

            } else if (confirm == JOptionPane.OK_OPTION) {
                File archivo;
                FileWriter escribir;
                PrintWriter linea;
                String nombre, apellido, email;


                archivo = new File("archivo.txt");

                if (!archivo.exists()) {
                    try {

                        archivo.createNewFile();
                        escribir = new FileWriter(archivo);
                        linea = new PrintWriter(escribir);
                        nombre = JOptionPane.showInputDialog("Digite su nombre", "Ingrese nombre aqui");
                        apellido = JOptionPane.showInputDialog("Digite su apellido", "Ingrese apellido aqui");
                        email = JOptionPane.showInputDialog("Digite su email", "ingrese email aqui");
                        linea.println("Nombre: " + nombre);
                        linea.println("Apellido: " + apellido);
                        linea.println("Email: " + email);
                        linea.println("");
                        linea.close();
                        escribir.close();

                    } catch (IOException e) {
                        System.err.println("No se a podido crear el archivo");

                    }
                } else {
                    try {
                        escribir = new FileWriter(archivo, true); //true para escribir archivo abajo de las lineas ya escritas
                        linea = new PrintWriter(escribir);
                        nombre = JOptionPane.showInputDialog("Digite su nombre", "Ingrese nombre aqui");
                        apellido = JOptionPane.showInputDialog("Digite su apellido", "Ingrese apellido aqui");
                        email = JOptionPane.showInputDialog("Digite su email", "Ingrese email aqui");
                        linea.println("Nombre: " + nombre);
                        linea.println("Apellido: " + apellido);
                        linea.println("Email: " + email);
                        linea.println("");
                        linea.close();
                        escribir.close();
                    } catch (IOException e) {
                        System.err.println("No se a podido crear el archivo");
                    }

                }


            }


        }


    }
}
