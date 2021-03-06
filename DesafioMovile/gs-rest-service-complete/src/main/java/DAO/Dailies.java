package DAO;

import hello.*;
import DBO.*;
import java.sql.*;
import java.util.ArrayList;

public class Dailies 
{
    //SISCOB
    //boston
    private MeuPreparedStatement connection;
    
    public Dailies(String driver, String strCon, String user, String senha) throws ClassNotFoundException, SQLException
    {
        this.connection = new MeuPreparedStatement(driver, strCon, user, senha);
    }
    public Dailies(MeuPreparedStatement con)
    {
    	this.connection = con;
    }
    
    public void insert(Daily d) throws SQLException
    {
        String q = "INSERT INTO dashboard_daily VALUES('" +
                d.getInserted_date() + "', " + 
                d.getCarrier_id() + ", '" +
                d.getCarrier_name() + "', " +
                d.getApplication_id() +  ", '" +
                d.getApplication_name() +  "', " +
                d.getPrice_value() +  ", " +
                d.getCarrier_gross_revenue_value() +  ", " +
                d.isActive_base_total() +  ", " +
                d.isNew_subscriber_total() +  ", " +
                d.isCancelation_total() +  ", " +
                d.getCancellation_type() + ")";
        
        connection.execute(q);
    }
    
    public ArrayList<item1> select(int day) throws SQLException
    {
        String q = "SELECT * FROM dashboard_daily WHERE inserted_date = " + day;
        connection.prepareStatement(q);
        ResultSet rs = connection.executeQuery();
        ArrayList<item1> da = new ArrayList<item1>();
      /*  System.out.println(rs.next());
        rs.first();*/
        while(rs.next())
        {
        	
        	
            Daily d = new Daily(
                    rs.getString("inserted_date"),
                    rs.getInt("carrier_id"),
                    rs.getString("carrier_name"),
                    rs.getInt("application_id"),
                    rs.getString("application_name"),
                    rs.getDouble("price_value"),
                    rs.getDouble("carrier_gross_revenue_value"),
                    rs.getInt("active_base_total"),
                    rs.getInt("new_subscriber_total"),
                    rs.getInt("cancellation_total"),
                    rs.getString("cancellation_type").charAt(0));
            
        
            da.add(new item1(rs.getInt("active_base_total"), rs.getString("carrier_name"), day));
           //ystem.out.println("Criou daily");
            //return d;
        }
        return da;
    }
    
    
    public ArrayList<item2> select2(int day) throws SQLException
    {
        String q = "SELECT * FROM dashboard_daily WHERE inserted_date = " + day;
        connection.prepareStatement(q);
        ResultSet rs = connection.executeQuery();
        ArrayList<item2> da = new ArrayList<item2>();
      /*  System.out.println(rs.next());
        rs.first();*/
        while(rs.next())
        {
        	
        	
            Daily d = new Daily(
                    rs.getString("inserted_date"),
                    rs.getInt("carrier_id"),
                    rs.getString("carrier_name"),
                    rs.getInt("application_id"),
                    rs.getString("application_name"),
                    rs.getDouble("price_value"),
                    rs.getDouble("carrier_gross_revenue_value"),
                    rs.getInt("active_base_total"),
                    rs.getInt("new_subscriber_total"),
                    rs.getInt("cancellation_total"),
                    rs.getString("cancellation_type").charAt(0));
            
        
            da.add(new item2(rs.getInt("cancellation_total"), rs.getString("carrier_name"), day));
           //ystem.out.println("Criou daily");
            //return d;
        }
        return da;
    }
    
    
}
