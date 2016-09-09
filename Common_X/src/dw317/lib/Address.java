/**
* Defines an Address type.
*/
package dw317.lib;
/**
* @author nasro
*/
public class Address {

	private String city = "";
	private String civicNumber = "";
	private String province = "";
	private String code = "";
	private String streetName = "";


public Address() { }
public Address (String civicNumber, String streetName, String city) {
this.civicNumber = civicNumber;
this.streetName = streetName;
this.city = city;
}

/**
* Returns a String representation of the address. 
* 
* @return address a formatted address.
*/
	public String getAddress() {
		String address = civicNumber + " " + streetName + "\n" + city;
		address += (province.equals("")?"": (", " + province)) +
			 (code.equals("")?"":("\n" + code));

		return address;
	}
	@Override
	public String toString() {
		return (civicNumber + "*" +	streetName + "*" +
				city + "*" +province + "*" +	code);
	}

public String getCity() {
	return city;
}
public String getCivicNumber() {
	return civicNumber;
}
public String getProvince() {
	return province;
}
public String getCode() {
	return code;
}
public String getStreetName() {
	return streetName;
}
public void setCity(String city) {
	this.city = city;
}
public void setCivicNumber(String civicNumber) {
	this.civicNumber = civicNumber;
}
public void setProvince(String province) {
	this.province = province;
}
public void setCode(String code) {
	this.code = code;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}

}