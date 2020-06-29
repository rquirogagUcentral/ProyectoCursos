package Singleton;


import java.sql.Connection;
import java.sql.DriverManager;


public class Singleton {
	
private static Connection conn=null;
    
    private static String dbname;
    public static String host;
    public static String password;
    public static String port;
    public static String user;
    
    private Singleton()
    {
        host="localhost";
        port="5432";
        dbname="cursosuc";
        user="postgres";
        password="password";
        try{
            conn=getConnectionString();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static Connection getConnectionString() {
        try {
        	Class.forName("org.postgresql.Driver");
        	String connectionString = createConnectionString();
        	Connection connection = DriverManager.getConnection(connectionString);
            System.out.println("Connection class ===>" + connection.getClass().getName());
            return connection;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }    
     }
    
    private static String createConnectionString(){
        
        String connectionString = "jdbc:postgresql://"+host+":"+port+"/"+dbname+"?user="+user+"&password="+password;
        System.out.println("ConnectionString===>"+connectionString);
        return connectionString;        
    } 
	
	public static Connection getConnection() {
        if(conn==null)
        {
         new Singleton();
        }
        return conn;
    }

}
