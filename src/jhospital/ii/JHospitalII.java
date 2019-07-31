/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhospital.ii;

import jhospital.view.TelaPrincipal;

/**
 *
 * @author admin
 */
public class JHospitalII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.validate();
        telaPrincipal.pack();
        telaPrincipal.setVisible(true);
   }
    
}
