package br.edu.eteczl.projetojavacombanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
        Connection instanciaDeConexaoValida = Conexao.getInstance();
        System.out.println(instanciaDeConexaoValida);
        
        
        try {
        	
        	Statement stmt = instanciaDeConexaoValida.createStatement();
        	ResultSet rs = stmt.executeQuery("select * from nome");
        	
        	while(rs.next()) {
        		String n = rs.getString("nome");
        		System.out.println(n);
        	}
        	
        } catch (SQLException e) {
        	// TODO Auto-generated catch block
        	e.printStackTrace();
        }
        
        Connection segundCon = Conexao.getInstance();
        System.out.println(segundCon);
        
        
    }
}
