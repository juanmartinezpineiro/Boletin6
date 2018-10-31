package boletin6_3;

import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class Numero {
    
    public void addSimbolo (){
         double num1;
    
          num1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el número: "));
          
          if (num1 > 0){
              JOptionPane.showMessageDialog(null, "+");
          }
          else if (num1 < 0){
              JOptionPane.showMessageDialog(null, "-");
          }
          else {
              JOptionPane.showMessageDialog(null, "0");
    }
    }
  
    
}

   
    
