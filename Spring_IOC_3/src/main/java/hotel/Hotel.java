package hotel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Hotel {

	@Value("101")
	int h_id;
	@Value("Taj")
	String h_name;
	@Value("Mumbai")
	String city;
	@Value("veg-nonVeg")
	String h_type;
	
	public int getH_id() {
		return h_id;
	}
	public void setH_id(int h_id) {
		this.h_id = h_id;
	}
	public String getH_name() {
		return h_name;
	}
	public void setH_name(String h_name) {
		this.h_name = h_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getH_type() {
		return h_type;
	}
	public void setH_type(String h_type) {
		this.h_type = h_type;
	}
	@Override
	public String toString() {
		return "Hotel [h_id=" + h_id + ", h_name=" + h_name + ", city=" + city + ", h_type=" + h_type + "]";
	}
	public Hotel(int h_id, String h_name, String city, String h_type) {
		super();
		this.h_id = h_id;
		this.h_name = h_name;
		this.city = city;
		this.h_type = h_type;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
