package co.edu.usta.greeting.controller;

import co.edu.usta.greeting.model.Vehicle;

import javax.swing.*;

public class VehicleController
{
    Vehicle car = new Vehicle();

    //private Vehicle myVehicle;

    /*
    public VehicleController(){
        this.myVehicle = new Vehicle();
    }

    public VehicleController(String plates, String wheels, String color, String doors,String diesel,String battery)
    {
        int wheelsInt = 0;
        int doorsInt = 0;
        int dieselInt  = 0;
        int batteryInt = 0;
        try{
            wheelsInt = Integer.parseInt(wheels);
            doorsInt = Integer.parseInt(doors);
            dieselInt = Integer.parseInt(diesel);
            batteryInt = Integer.parseInt(battery);
        }catch (NumberFormatException nfe){ }

        this.myVehicle = new Vehicle(plates, color, wheelsInt, doorsInt, dieselInt, batteryInt);
    }

    public Vehicle getMyVehicle() {        return myVehicle;    }
    public void setMyVehicle(Vehicle myVehicle) {        this.myVehicle = myVehicle;    }
    */

    /*
    public String diagnosis(String plates, String color, String wheels, String doors)
    {

        int wheelsInt = 0;
        int doorsInt = 0;
        try{
            wheelsInt = Integer.parseInt(wheels);
            doorsInt = Integer.parseInt(doors);
        }catch (NumberFormatException nfe){
            return "Numero de puertas o ruedas invalido";
        }
        this.myVehicle.setColor(color);
        this.myVehicle.setPlates(plates);
        this.myVehicle.setDoorsNumber(doorsInt);
        this.myVehicle.setWheelsNumber(wheelsInt);

        return "El Vehiculo fue creado satisfactoramente";

    }*/
    public void diagnosisController(String plates, String color, String wheels, String doors)
    {
        int numberWheels = Integer.parseInt(wheels);
        int numberDoors = Integer.parseInt(doors);

        if(numberWheels > 4 || numberWheels < 1)
        {
            JOptionPane.showMessageDialog(null,"Este tipo de Vehiculo no se puede antender en este sitio");
        }
        if(numberWheels > 0 && numberWheels <= 4)
        {
            JOptionPane.showMessageDialog(null,"El Vehiculo Ingresado tiene los siguientes parametros: \n" +
                    "1). Placas del Vehiculo: " + plates + "\n"+
                    "2). Color del Vehiculo: " + color  + "\n"+
                    "3). Numero de Ruedas del Vehiculo: " + wheels  + "\n"+
                    "4). Numero de Puertas del Vehiculo: " + doors  + "\n");

            int trip = 0;


            boolean circle  = true;
            int wing = 0;
            while(circle)
            {
                try{wing = Integer.parseInt( JOptionPane.showInputDialog("Cuantas alas tiene tu vehiculo: ") ); circle = false; }
                catch (NumberFormatException nfe){ JOptionPane.showMessageDialog(null, "Dato no valido: "+nfe.getMessage());}
            }
            if(wing > 0)
            {
                JOptionPane.showMessageDialog(null, "Este Vehiculo no se puede recibir");
            }else{
                JOptionPane.showMessageDialog(null,"Este Vehiculo si puede ser ingresado");
                car.diagnosisModelo();
                createVehicle(plates,color,numberWheels,numberDoors);
            }

            /*
            switch (wing)
            {
                default:
                    JOptionPane.showMessageDialog(null,"Esto no corresponde a una opcion valida");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Este Vehiculo no se puede recibir");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Este Vehiculo si puede ser ingresado");
                    car.diagnosisModelo();
                    break;
            }
            */



        }



    }

    public void createVehicle(String plates, String color, Integer wheelsNumber , Integer doorsNumber)
    {
        /*
        this.plates = plates;
        this.color = color;
        this.wheelsNumber = wheelsNumber;
        this.doorsNumber = doorsNumber;

        return "Vehiculo creado exitosamente";

         */
        car.setPlates(plates);
        car.setColor(color);
        car.setWheelsNumber(wheelsNumber);
        car.setDoorsNumber(doorsNumber);

        JOptionPane.showMessageDialog(null,"Creacion de Vehiculo EXITOSA: \n" +
                car.getPlates() + car.getColor() + car.getWheelsNumber() + car.getDoorsNumber() );

    }
}
