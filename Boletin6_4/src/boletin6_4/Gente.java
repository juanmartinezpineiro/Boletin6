package boletin6_4;

import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class Gente {

    public void pesoGente (){
    
        String nombre1, nombre2;
        double pesoPersona1, pesoPersona2;
        
        nombre1= JOptionPane.showInputDialog("Introduzca nombre de la primera persona:");
        nombre2 = JOptionPane.showInputDialog("Introduzca nombre de la segunda persona:");
        
        pesoPersona1 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el peso de la primera persona: "));
        pesoPersona2 = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el peso de la segunda persona:"));
        
        if (pesoPersona1>pesoPersona2){
            
            JOptionPane.showMessageDialog(null, "El nombre es: "+nombre1+ " la diferencia de peso es: " +(pesoPersona1-pesoPersona2));
        }
        else {
            JOptionPane.showMessageDialog(null, "El nombre es: "+nombre2+ " la diferencia de peso es: " +(pesoPersona2-pesoPersona1));
        }
        
        
        
        
        
}
}
