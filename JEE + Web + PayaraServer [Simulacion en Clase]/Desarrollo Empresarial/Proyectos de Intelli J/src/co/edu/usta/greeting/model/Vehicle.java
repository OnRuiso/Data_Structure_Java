package co.edu.usta.greeting.model;

import javax.swing.*;

public class Vehicle
{
    private String plates;
    private String color;
    private Integer wheelsNumber;
    private Integer doorsNumber;
    private Integer diesel;
    private Integer battery;

    public Vehicle() {   }
    public Vehicle(String plates, String color, Integer wheelsNumber , Integer doorsNumber, Integer diesel, Integer battery)
    {
        this.plates = plates;
        this.color = color;
        this.wheelsNumber = wheelsNumber;
        this.doorsNumber = doorsNumber;
        this.diesel = diesel;
        this.battery = battery;
    }

    public String getPlates() {        return plates;    }
    public void setPlates(String plates) {        this.plates = plates;    }

    public String getColor() {        return color;    }
    public void setColor(String color) {        this.color = color;    }

    public Integer getWheelsNumber() {        return wheelsNumber;    }
    public void setWheelsNumber(Integer wheelsNumber) {        this.wheelsNumber = wheelsNumber;    }

    public Integer getDoorsNumber() {        return doorsNumber;    }
    public void setDoorsNumber(Integer doorsNumber) {        this.doorsNumber = doorsNumber;    }

    public Integer getDiesel() {        return diesel;    }
    public void setDiesel(Integer diesel) {        this.diesel = diesel;    }

    public Integer getBattery() {        return battery;    }
    public void setBattery(Integer battery) {        this.battery = battery;    }

    //-----------------------------------------METODOS------------------------------------------------------------------



    public void diagnosisModelo()
    {
        // plates = placas ; wheels = ruedas ; String plates, String color, String wheels, String doors
        boolean circulo = true , cuadrado = true;

        int diesel = 0;
        int battery = 0;

        while(cuadrado)
        {
            while(circulo)
            {
                try{
                    diesel = Integer.parseInt( JOptionPane.showInputDialog("¿Su vehiculo tiene combustible? \n [1] YES \n [2] NO") );
                    battery = Integer.parseInt( JOptionPane.showInputDialog("¿Su Vehiculo tiene la bateria cargada? \n [1] YES \n [2] NO"));
                    circulo = false;
                }catch (NumberFormatException nfe){ JOptionPane.showMessageDialog(null,"Dato no valido: " + nfe.getMessage()); }
            }
            if(diesel > 2 || battery > 2 || diesel <= 0 || battery <= 0){
                JOptionPane.showMessageDialog(null,"Esta valor no es valido");
                circulo = true;
            }else{
                JOptionPane.showMessageDialog(null,"Parametros validos");
                cuadrado = false;
            }
        }

        if( diesel == 2 || battery == 2 )
        {
            JOptionPane.showMessageDialog(null,"El vehiculo debe dejarse para diagnostico especializado.");
        }
        else{
            JOptionPane.showMessageDialog(null,"DIAGNOSTICO SATISFACTORIO" );
        }



    }
}
