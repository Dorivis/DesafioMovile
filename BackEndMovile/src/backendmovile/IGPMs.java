package backendmovile;

import backendmovile.*;
import java.sql.*;

public class IGPMs 
{
    private MeuPreparedStatement connection;
    
    public IGPMs(String driver, String strCon, String user, String senha) throws ClassNotFoundException, SQLException
    {
        this.connection = new MeuPreparedStatement(driver, strCon, user, senha);
    }
    
    public void insert(IGPM i) throws SQLException
    {
        String q = "INSERT INTO igpm VALUES(" + 
                i.getCarrier_id() + ", " +
                i.getApplication_id() + ", " +
                i.getPrice_value() + ", " +
                i.getCarrier_tax() + ", " +
                i.getShare_movile() + ")";
        
        connection.execute(q);
        connection.commit();
    }
    
    public double select(int carrierId, int appId, double priceValue) throws SQLException
    {
        String q = "SELCET carrier_tax, share_movile FROM igpm WHERE carrier_id = " + carrierId + " AND application_id = " + appId + " AND price_value = " + priceValue;
        ResultSet rs = connection.executeQuery(q);
        if(rs.first())
        {
            return rs.getDouble(3) * rs.getDouble(4);
        }
        else
            throw new SQLException();
    }
}
