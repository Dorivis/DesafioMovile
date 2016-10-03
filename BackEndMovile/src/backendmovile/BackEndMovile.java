/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendmovile;

/**
 *
 * @author u14196
 */
public class BackEndMovile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LerCSV gravadorBanco = new LerCSV();
        gravadorBanco.lerArquivo("C:/Users/u14196/Desktop/material-cotuca-master/igpm/igpmWithHeader.csv", "IGPM");
        gravadorBanco.lerArquivo("C:/Users/u14196/Desktop/material-cotuca-master/daily/dailyWithHeader.csv", "Daily");
    }
    
}
