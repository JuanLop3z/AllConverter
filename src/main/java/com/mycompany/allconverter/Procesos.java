/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.allconverter;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JuanSebastianLopezGa
 */
public class Procesos {

    public static void librasxKilos() {

        double kilos = 2.2046;
        String num = JOptionPane.showInputDialog("Ingrese las libras");

        double libras = Integer.parseInt(num);

        double resultado = libras / kilos;

        DecimalFormat df = new DecimalFormat();
        JOptionPane.showMessageDialog(null, "Kilos: " + df.format(resultado));
        librasxKilos();
    }

    public static void Temperatura() {

        double farenheit = 32;
        double kelvin = 273.15;
        int opcion_menu = 0;
        String[] botones = {"1.Farenheit", "2.Kelvin", "3.Salir"};
        DecimalFormat df = new DecimalFormat();
        
        String num = JOptionPane.showInputDialog("Ingrese los grados Celsius");
        double celsius = Integer.parseInt(num);

        do {
            String opcion = (String) JOptionPane.showInputDialog(null, "Convertidor", "Menu", JOptionPane.INFORMATION_MESSAGE,
                    null, botones, botones[0]);

            for (int i = 0; i < botones.length; i++) {
                if (opcion.equals(botones[i])) {
                    opcion_menu = i;
                }
            }

            switch (opcion_menu) {

                case 0:
                    double resultado = (celsius*9/5)+farenheit;

                    JOptionPane.showMessageDialog(null,df.format(resultado)+"Fº");
                    break;

                case 1:
                    double resultado2 = celsius+ kelvin;
                    JOptionPane.showMessageDialog(null,df.format(resultado2) + "Kº");
                    break;

                default:
                    break;
            }
        } while (opcion_menu == 3);
        Temperatura();
    }

    public static void Calorias() {


        String num1 = JOptionPane.showInputDialog("Ingrese su peso:");
        String num2 = JOptionPane.showInputDialog("Ingrese altura:");
        String num3 = JOptionPane.showInputDialog("Ingrese edad:");

        double peso = Integer.parseInt(num1);
        double altura = Integer.parseInt(num2);
        double edad = Integer.parseInt(num3);

        double hombres = 66 + (13.7 * peso) + (5 * altura) - (6.75 * edad);
        double mujeres = 655 + (9.6 * peso) + (1.8 * altura) - (4.7 * edad);


        int opcion_menu = 0;
        String[] botones = {"1.Hombre", "2.Mujer", "3.Salir"};
        DecimalFormat df = new DecimalFormat();
        do {
            String opcion = (String) JOptionPane.showInputDialog(null, "Convertidor", "Menu", JOptionPane.INFORMATION_MESSAGE,
                    null, botones, botones[0]);

            for (int i = 0; i < botones.length; i++) {
                if (opcion.equals(botones[i])) {
                    opcion_menu = i;
                }
            }

            switch (opcion_menu) {

                case 0:
                    JOptionPane.showMessageDialog(null,df.format(hombres)+" Calorias");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null,df.format(mujeres) + " Calorias");
                    break;
                default:
                    break;
            }
        } while (opcion_menu == 3);
        Calorias();
    }

    public static void tiempo(){
        double min = 1440;
        String num = JOptionPane.showInputDialog("Ingrese los minutos");

        double minutos = Integer.parseInt(num);

        double resultado = minutos / min;

        DecimalFormat df = new DecimalFormat();
        JOptionPane.showMessageDialog(null, "Dias: " + df.format(resultado));
        tiempo();
    }

}
