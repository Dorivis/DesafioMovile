/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendmovile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
/**
 *
 * @author u14196
 */
public class LerCSV {

    public LerCSV(){  
    }
    
    public void lerArquivo(String diretorio, String tipoTabela){
        try{
            BufferedReader leitor = new BufferedReader(new FileReader(diretorio));
            String linha="";
            String csvDivisor="\\|";
            //le o cabecalho
            linha = leitor.readLine();
            String[] campos = linha.split(csvDivisor,-1);
            //le o resto
            while((linha = leitor.readLine())!=null){
                String linhaVetor[] = linha.split(csvDivisor,-1);
                for(int i=0;i<linhaVetor.length;i++){
                    if(linhaVetor[i].equals(""))
                        linhaVetor[i]="0";
                    System.out.println(linhaVetor[i]);
                }
                System.out.println('\n');
                if(tipoTabela.equals("IGPM")){
                    IGPM adicionarBancoIGPM = new IGPM(linhaVetor);
                    IGPMs inserirIGPMBanco = new IGPMs("com.microsoft.sqlserver.jdbc.SQLServerDriver",
    				        "jdbc:sqlserver://regulus;databasename=SISCOB",
    				        "SISCOB", "boston");
                    inserirIGPMBanco.insert(adicionarBancoIGPM);
                }
                if(tipoTabela.equals("Daily")){
                    Daily adicionarBancoDaily = new Daily(linhaVetor);
                    Dailies inserirDailiesBanco = new Dailies("com.microsoft.sqlserver.jdbc.SQLServerDriver",
    				        "jdbc:sqlserver://regulus;databasename=SISCOB",
    				        "SISCOB", "boston");
                    inserirDailiesBanco.insert(adicionarBancoDaily);
                }
                
            }
                
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException io){
            System.out.println(io.getMessage());
        }
        catch(SQLException sqeE){
            sqeE.printStackTrace();
            System.out.println("lalala");
        }
        catch(ClassNotFoundException cnfe){
            System.out.println(cnfe.getMessage()+"lelelel");
        }
        
    }
    
    
}


