package boletin6_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class NumeroPositivo {

    public void numeroPositivo(){
        
        int num1;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Teclea un número"));
        if (num1 > 0){
            JOptionPane.showInputDialog(null, (num1+ " es un número positivo"));
        }
    }
}
