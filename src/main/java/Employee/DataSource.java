package Employee;

import org.apache.commons.dbcp.BasicDataSource;
import java.sql.Connection;

public class DataSource {
	
	  Connection      connection = null;
	  BasicDataSource bdSource   = new BasicDataSource();

	  public DataSource()
	  {

	    bdSource.setUrl("jdbc:mysql://localhost:3306/RamJ2EE");
	    bdSource.setUsername("root");
	    bdSource.setPassword("ididntpo");
//	    bdSource.setDriverClassName("com.mysql.jdbc.Driver");
	    bdSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	                                                             
	  }

	  public Connection createConnection()
	  {
	    Connection con = null;
	    try
	    {
	      if( connection != null )
	      {
	        System.out.println("Cant create a New Connection");
	      }
	      else
	      {
	        con = bdSource.getConnection();
	      }
	    }
	    catch( Exception e )
	    {
	      System.out.println("Error Occured " + e.toString());
	    }
	    return con;
	  }
	}