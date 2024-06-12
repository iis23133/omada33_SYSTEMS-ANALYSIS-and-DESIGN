public class InsuranceContract {
	
	public Customer pelatis;
	public Vehicle oxima;
	public InsurancePolicy asfalia;
	public double lefta;
	
	public InsuranceContract(Customer pelatis, Vehicle oxima, InsurancePolicy asfalia, double lefta) {
		
		this.pelatis = pelatis;
		this.oxima = oxima;
		this.asfalia = asfalia;
		this.lefta = lefta;
	}

	public void print(int i){
		System.out.println("Ασφάλιση " + i + ", Όνομα: " + pelatis.Name + " " + pelatis.LastName + ", αριθμός πινακίδας: " + oxima.Arithmos_Plaisiou + ", περιγραφή: " + asfalia.perigrafi + ", κόστος: " + lefta + "€");
	}
}
