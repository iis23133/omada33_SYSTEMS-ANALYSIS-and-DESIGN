public class Customer {
	
	public String Name;
	public String LastName;
	public String Phone;
	public String email;
	public String Arithmos_Taftotitas;
	
    public Customer(String name, String lastName, String phone, String email, String arithmos_Taftotitas) {
		super();
		Name = name;
		LastName = lastName;
		Phone = phone;
		this.email = email;
		Arithmos_Taftotitas = arithmos_Taftotitas;
	}

	public String getArithmosTaftotitas() {
        return Arithmos_Taftotitas;
    }
}