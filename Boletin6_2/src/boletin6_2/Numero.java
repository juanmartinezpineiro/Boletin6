package boletin6_2;

import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class Numero {
public void numeroMayorIgual(){
    
    Short num1, num2;
    //Ya que InputDialog usa String hay que parsearlo a Short RECORDAR!
    num1 = Short.parseShort(JOptionPane.showInputDialog("Intruduce el primer número"));
    num2 = Short.parseShort(JOptionPane.showInputDialog("Introduzca el segundo número:"));
    
    if (num1 >= num2){
        JOptionPane.showMessageDialog(null,"La resta es " + (num1-num2));
    }
    else{
        JOptionPane.showMessageDialog(null, "La suma es " +(num1+num2));
    }
    
    
    
    
}
}
