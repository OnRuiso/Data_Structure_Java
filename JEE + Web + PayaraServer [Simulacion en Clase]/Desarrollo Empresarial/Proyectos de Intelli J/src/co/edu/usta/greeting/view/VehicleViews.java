package co.edu.usta.greeting.view;

import co.edu.usta.greeting.controller.VehicleController;

import javax.swing.*;

public class VehicleViews
{
    public static void main(String[] args)
    {
        //String returnValue = "";
        VehicleController vehicleController = new VehicleController();

        //returnValue = vehicleController.diagnosis("qwe123","blanco","4","5");
        //JOptionPane.showMessageDialog(null,returnValue);

        boolean ciclo = true;
        while(ciclo)
        {
            JOptionPane.showMessageDialog(null,"Bienvenido al centro de Diagnostico del Vehiculo");

            boolean estado = true;
            boolean stat = true;

            String plates = JOptionPane.showInputDialog("Ingrese las placas del vehiculo: ");
            String color = JOptionPane.showInputDialog("Ingrese el color de su Vehiculo: ");

            int wheels1 = 0;
            while(estado)
            {
                try {
                    wheels1 = Integer.parseInt( JOptionPane.showInputDialog("Ingrese cuantas ruedas tiene su vehiculo: ") );
                    estado = false;
                }catch (NumberFormatException nfe){JOptionPane.showMessageDialog(null,"Error en ingreso de Ruedas, intentelo de nuevo.\n"+nfe.getMessage());}
            }

            int doors1 = 0;
            while(stat)
            {
                try{
                    doors1 = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el numero de Puertas de su vehiculo") );
                    stat = false;
                }catch (NumberFormatException nfe){JOptionPane.showMessageDialog(null,"Error en ingreso de puertas");}
            }

            String wheels = String.valueOf(wheels1);
            String doors = String.valueOf(doors1);

            vehicleController.diagnosisController(plates,color,wheels,doors);

            ciclo = false;
        }



    }
}
