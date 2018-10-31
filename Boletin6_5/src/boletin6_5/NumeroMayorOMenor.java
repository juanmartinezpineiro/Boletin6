package boletin6_5;

import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class NumeroMayorOMenor {

    public void MayorOMenor(){
        int num1,num2,num3;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tercer numero"));
        
        if (num1>num2){
            JOptionPane.showMessageDialog(null, "El mayor es "+num1);
            
        }
        
          else if (num2>num3){
            JOptionPane.showMessageDialog(null, "El mayor es "+num2);
        }
          
        else if (num3>num2){
            JOptionPane.showMessageDialog(null, "El mayor es "+num3);
        }
        
      
        
        
    }
}
