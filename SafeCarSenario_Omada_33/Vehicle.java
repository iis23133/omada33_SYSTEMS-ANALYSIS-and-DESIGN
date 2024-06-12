public class Vehicle {
	
	public String Marka;
	public String Modelo;
	public String Year;
	public String Pinakida;
	public String Arithmos_Plaisiou;
	
	public Vehicle(String marka, String modelo, String year, String pinakida, String arithmos_Plaisiou) {
		
		Marka = marka;
		Modelo = modelo;
		Year = year;
		Pinakida = pinakida;
		Arithmos_Plaisiou = arithmos_Plaisiou;
	}
	
	public String getArithmos_Plaisiou() {
        return Arithmos_Plaisiou;
    }
}