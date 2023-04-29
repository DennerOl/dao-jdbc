package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conn = null;

	public static Connection getConnection() {
		
// se a conexão for nula pegue o arquivo do metodo Properties		
		if (conn == null) {
// pegando o metodo props			
			try {
				Properties props = loadProperties();
// dentro do arquivo pego a url do banco 	
				String url = props.getProperty("dburl");
// aqui atributo para o metodo conn para mudar seu valor de null					
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn;
	}
	
// metodo para fechar a conexão com o banco de dados
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
/* metodo para ler o aquivo do banco de dados db.properties 	
*/
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	public static void closeStatement(Statement st) {
		if (st != null) {

			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

/*O Resultset é uma classe da API JAVA que permite percorrermos 
 * um DataTable de alguma consulta em um banco de dados
 */
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {

			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
}	