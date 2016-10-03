package backendmovile;

import backendmovile.MeuPreparedStatement;
import backendmovile.*;
import java.sql.*;

public class Dailies 
{
    //SISCOB
    //boston
    private MeuPreparedStatement connection;
    
    public Dailies(String driver, String strCon, String user, String senha) throws ClassNotFoundException, SQLException
    {
        this.connection = new MeuPreparedStatement(driver, strCon, user, senha);
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
                d.getActive_base_total() +  ", " +
                d.getNew_subscriber_total() +  ", " +
                d.getCancelation_total() +  ", '" +
                d.getCancellation_type() + "')";
        
        connection.execute(q);
        connection.commit();
    }
    /*
    public Daily select(int day) throws SQLException
    {
        String q = "SELECT * FROM dashboard_daily WHERE inserted_date = " + day;
        ResultSet rs = connection.executeQuery(q);
        
        if(rs.first())
        {
            Daily d = new Daily(
                    rs.getString(0),
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getString(4),
                    rs.getDouble(5),
                    rs.getDouble(6),
                    rs.getBoolean(7),
                    rs.getBoolean(8),
                    rs.getBoolean(9),
                    rs.getString(10).charAt(10));
            return d;
        }
        else
            throw new SQLException();
    }
*/
}
