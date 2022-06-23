/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroprodutos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoMySql {
    private static Connection con = null;
    
    //ALTERAR VARIÁVEIS ABAIXO COM AS INFORMAÇÕES DO SEU BANCO
    private static String urlBanco = "jdbc:mysql://localhost/projeto";
    private static String login = "softpharma";
    private static String senha = "NwSoftPs1843";
    
    public static Connection conectarBanco(){
        try{
            con = DriverManager.getConnection(urlBanco, login, senha);
            return con;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Verique a conexão com o banco!");
            return null;
        }
    }
}

