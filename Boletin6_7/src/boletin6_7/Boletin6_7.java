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
public class Boletin6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int opcion;
      opcion = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion \n1(cuadrado) \n2(triangulo) \n3(circulo) :"));
      switch(opcion){
          case 1: CalculaSuperficies lado = new CalculaSuperficies();
                  lado.CalcularCuadrado();
          break;
          
          case 2: CalculaSuperficies calc = new CalculaSuperficies();
                  calc.CalcularTriangulo();
          break;
          
          case 3: CalculaSuperficies calc1 = new CalculaSuperficies();
                 calc1.CalcularCirculo();
          break;
          
          case 0: 
          default : JOptionPane.showMessageDialog(null, "Opcion incorrecta");
          break;
      }while(opcion != 0);
    

    }
    
}
