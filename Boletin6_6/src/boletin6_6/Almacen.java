/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_6;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Martínez
 */
public class Almacen {
    public void ArticuloConsumo(){
        int ventas;
       
        ventas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cantidad de articulos:"));
        if (ventas>1000){
       JOptionPane.showMessageDialog(null, "primera necesidad");
        }
        else if(ventas >=500){
       JOptionPane.showMessageDialog(null, "alto");
        }
         else if(ventas >=100){
        JOptionPane.showMessageDialog(null, "medio");
        }
         else {
        JOptionPane.showMessageDialog(null, "bajo");
         }
        
    }
}
