package br.com.champtech.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author denis_stiehler
 */
public final class ConnectionFactory {
    
    private static Connection connection = null;
    
    private static Connection createConnection() {
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_champtech?useSSL=false";
            String usuario = "root";
            String senha = "";
            
            connection = DriverManager.getConnection(url, usuario, senha);
            
        } catch (ClassNotFoundException ex) {
            
            System.err.println("Driver não carregado!");
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
   
    private static Connection getConnection() {
        
        return connection != null ? connection : createConnection();
    }
    
    public static Statement getStatement() {
        
        try {
            
            return getConnection().createStatement();
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
