/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_7;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Martínez
 */
public class CalculaSuperficies {
   public void CalcularCuadrado (){
       int lado;
       lado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca lado: "));
       lado = lado * lado;
       JOptionPane.showMessageDialog(null, "La superficie del cuadrado es: "+lado);
   }
   public void CalcularTriangulo (){
       int base,altura,calc;
       base = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la base: "));
       altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura:"));
       calc = base*altura/2;
       JOptionPane.showMessageDialog(null, "La superficie del triangulo es: "+calc);
   }
   public void CalcularCirculo(){
       int radio,calc;
       radio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el radio:"));
       calc = (int) (radio * Math.PI);
       JOptionPane.showMessageDialog(null, "La superficie del circulo es: "+calc);
       
   }
}
