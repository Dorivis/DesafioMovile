package backendmovile;

import java.sql.*;

public class Insert 
{
    private MeuPreparedStatement stms;
    
    public Insert(String drv, String strCon, String usr, String senha)
    {
        
    }
    
    public double ARPU(double taxaOperadoras, double taxaMovile)
    {
        return taxaOperadoras * taxaMovile;
    }
    
    String inserted_date;
    int carrier_id;

    String carrier_name;
    int application_id;
    String application_name;
    double price_value;
    double carrier_gross_revenue_value;
    double active_base_total;
    boolean new_subscriber_total;
    boolean cancelation_total;
    
    
    boolean cancellation_type;
    
    public void insertDaily()
    {
        
    }
}
