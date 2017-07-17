package Tutorial;

public class Airport {
String city_name;
String airport_code;
String airport_name;
public Airport(String city_name, String airport_code, String airport_name) {
	super();
	this.city_name = city_name;
	this.airport_code = airport_code;
	this.airport_name = airport_name;
}
public String getCity_name() {
	return city_name;
}
public void setCity_name(String city_name) {
	this.city_name = city_name;
}
public String getAirport_code() {
	return airport_code;
}
public void setAirport_code(String airport_code) {
	this.airport_code = airport_code;
}
public String getAirport_name() {
	return airport_name;
}
public void setAirport_name(String airport_name) {
	this.airport_name = airport_name;
}


}
