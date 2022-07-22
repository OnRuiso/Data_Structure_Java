/*
package co.edu.usta.greeting.view;

import co.edu.usta.greeting.model.User;

import javax.swing.*;


public class Greeting
{
    User user = new User();

    public static void main(String[] args)
    {
        Greeting main = new Greeting();
        main.user = new User();

        System.out.println("Hello World");
        // atajo de [ sou + ctrl + space ] para sacar la linea de arriba
        JOptionPane.showMessageDialog(null,"Programa de Bienvenida");
        // Panel para mostrar un mensage

        boolean estado = true;
        while(estado)
        {
            int teclado = Integer.parseInt( JOptionPane.showInputDialog("Ingresara a continuacion sus datos personales \n" +
                    "[1] Continuar \n" +
                    "[2] Salir del Programa \n") );

            switch(teclado)
            {
                default:
                    JOptionPane.showMessageDialog(null, "Opcion erronea");
                    break;
                case 1:
                    main.mostrarUsuarios();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"See you later");
                    estado = false;
                    break;
            }

        }
    }

    public void mostrarUsuarios()
    {
        String nombre = JOptionPane.showInputDialog("Ingrese su Nombre de usuario");
        user.setUsername(nombre);
        int edad = Integer.parseInt( JOptionPane.showInputDialog("Ingrese su Edad") );
        user.setAge(edad);
        String correo = JOptionPane.showInputDialog("Ingrese su correo electronico");
        user.setEmail(correo);

        JOptionPane.showMessageDialog(null,"Su nombre es: "+user.getUsername()+"\n"
                +"Su edad es: "+user.getAge()+"\n"
                +"Su correo electronico: "+user.getEmail());
    }
}
*/