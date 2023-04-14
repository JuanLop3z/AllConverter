/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.allconverter;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanSebastianLopezGa
 */
public class Inicio {

    public static void main(String[] args) {
        
        int opcion_menu = 0;
        
        String[] botones = {"1.Libras a Kilos", "2.Temperatura", "3.Calorias", "4.Minutos a Dias"};

        do {
            String opcion = (String) JOptionPane.showInputDialog(null, "Convertidor", "Menu Principal", JOptionPane.INFORMATION_MESSAGE,
                    null, botones, botones[0]);

            for (int i = 0; i < botones.length; i++) {
                if (opcion.equals(botones[i])) {
                    opcion_menu = i;
                }
            }

            switch (opcion_menu) {
                
                case 0:
                    Procesos.librasxKilos();
                    break;

                case 1:
                    Procesos.Temperatura();
                    break;

                case 2:
                    Procesos.Calorias();

                    break;
                case 3:
                    Procesos.tiempo();

                    break;
                default:
                    break;
            }
            
        } while (opcion_menu == 4);
        
    }
}
