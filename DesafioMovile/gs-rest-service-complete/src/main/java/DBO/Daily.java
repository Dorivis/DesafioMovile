package DBO;

import java.util.Date;
import java.util.Objects;

public class Daily 
{
    private String inserted_date;
    private int carrier_id;
    private String carrier_name;
    private int application_id;
    private String application_name;
    private double price_value;
    private double carrier_gross_revenue_value;
    private Integer active_base_total;
    private int new_subscriber_total;
    private int cancelation_total;
    private char cancellation_type;  

    public Daily(String inserted_date, int carrier_id, String carrier_name, int application_id, String application_name, double price_value, double carrier_gross_revenue_value, Integer active_base_total, int new_subscriber_total,int cancelation_total, char cancellation_type) {
        this.inserted_date = inserted_date;
        this.carrier_id = carrier_id;
        this.carrier_name = carrier_name;
        this.application_id = application_id;
        this.application_name = application_name;
        this.price_value = price_value;
        this.carrier_gross_revenue_value = carrier_gross_revenue_value;
        this.active_base_total = active_base_total;
        this.new_subscriber_total = new_subscriber_total;
        this.cancelation_total = cancelation_total;
        this.cancellation_type = cancellation_type;
    }

    public String getInserted_date() {
        return inserted_date;
    }

    public int getCarrier_id() {
        return carrier_id;
    }

    public String getCarrier_name() {
        return carrier_name;
    }

    public int getApplication_id() {
        return application_id;
    }

    public String getApplication_name() {
        return application_name;
    }

    public double getPrice_value() {
        return price_value;
    }

    public double getCarrier_gross_revenue_value() {
        return carrier_gross_revenue_value;
    }

    public Integer isActive_base_total() {
        return active_base_total;
    }

    public int isNew_subscriber_total() {
        return new_subscriber_total;
    }

    public int isCancelation_total() {
        return cancelation_total;
    }

    public char getCancellation_type() {
        return cancellation_type;
    }

    public void setInserted_date(String inserted_date) {
        this.inserted_date = inserted_date;
    }

    public void setCarrier_id(int carrier_id) {
        this.carrier_id = carrier_id;
    }

    public void setCarrier_name(String carrier_name) {
        this.carrier_name = carrier_name;
    }

    public void setApplication_id(int application_id) {
        this.application_id = application_id;
    }

    public void setApplication_name(String application_name) {
        this.application_name = application_name;
    }

    public void setPrice_value(double price_value) {
        this.price_value = price_value;
    }

    public void setCarrier_gross_revenue_value(double carrier_gross_revenue_value) {
        this.carrier_gross_revenue_value = carrier_gross_revenue_value;
    }

    public void setActive_base_total(Integer active_base_total) {
        this.active_base_total = active_base_total;
    }

    public void setNew_subscriber_total(int new_subscriber_total) {
        this.new_subscriber_total = new_subscriber_total;
    }

    public void setCancelation_total(int cancelation_total) {
        this.cancelation_total = cancelation_total;
    }

    public void setCancellation_type(char cancellation_type) {
        this.cancellation_type = cancellation_type;
    }

    @Override
    public String toString() {
        return "Daily{" + "inserted_date=" + inserted_date + ", carrier_id=" + carrier_id + ", carrier_name=" + carrier_name + ", application_id=" + application_id + ", application_name=" + application_name + ", price_value=" + price_value + ", carrier_gross_revenue_value=" + carrier_gross_revenue_value + ", active_base_total=" + active_base_total + ", new_subscriber_total=" + new_subscriber_total + ", cancelation_total=" + cancelation_total + ", cancellation_type=" + cancellation_type + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Daily other = (Daily) obj;
        if (this.carrier_id != other.carrier_id) {
            return false;
        }
        if (this.application_id != other.application_id) {
            return false;
        }
        if (Double.doubleToLongBits(this.price_value) != Double.doubleToLongBits(other.price_value)) {
            return false;
        }
        if (Double.doubleToLongBits(this.carrier_gross_revenue_value) != Double.doubleToLongBits(other.carrier_gross_revenue_value)) {
            return false;
        }
        if (this.active_base_total != other.active_base_total) {
            return false;
        }
        if (this.new_subscriber_total != other.new_subscriber_total) {
            return false;
        }
        if (this.cancelation_total != other.cancelation_total) {
            return false;
        }
        if (this.cancellation_type != other.cancellation_type) {
            return false;
        }
        if (!Objects.equals(this.inserted_date, other.inserted_date)) {
            return false;
        }
        if (!Objects.equals(this.carrier_name, other.carrier_name)) {
            return false;
        }
        if (!Objects.equals(this.application_name, other.application_name)) {
            return false;
        }
        return true;
    }
    
   
}
