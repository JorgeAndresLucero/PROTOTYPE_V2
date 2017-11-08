/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prootipo;

import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Andrés
 */
public class Main {
   int numero = Integer.parseInt( JOptionPane.showInputDialog(null,"Cuantos humanos desea clonar(1-5)??",JOptionPane.QUESTION_MESSAGE) );


      public static void main(String args[]) {
          
        java.awt.EventQueue.invokeLater(new Runnable() {
     
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    
}
