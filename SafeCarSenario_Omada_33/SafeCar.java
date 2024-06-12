import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SafeCar {

	public static void main(String[] args) {

			List<Customer> customers = new ArrayList<>();

	        // Δημιουργία των τριών πελατών
	        Customer Customer1 = new Customer("Maria", "Papadopoulou", "2310264368", "maria.papadopoulou@gmail.com", "AO79432");
	        Customer Customer2 = new Customer("Evanthia", "Papagianni", "2310245368", "evanthia.papagianni@gmail.com", "AO77813");
	        Customer Customer3 = new Customer("Vasilis", "Karagiannis", "2310245668", "ioannis.karagiannis@gmail.com", "AO77814"); // Διόρθωση email
	        
	        // Προσθήκη των πελατών στη λίστα αφού πρώτα ελέγξουμε ότι δεν υπάρχει πελάτης με τον ίδιο αριθμό ταυτότητας
	        addCustomer(customers, Customer1);
	        addCustomer(customers, Customer2);
	        addCustomer(customers, Customer3);
	        
		    List<Vehicle> vehicles = new ArrayList<>();
		    
		    // Δημιουργία των τριών οχημάτων	        
		    Vehicle Vehicle1 = new Vehicle("Mercedes", "GLC", "XKP8923", "2020", "7C3FR76A515072256");
	        Vehicle Vehicle2 = new Vehicle("Subaru", "Forester", "NII4269", "2018", "7C3FR76A555071465");
	        Vehicle Vehicle3 = new Vehicle("Ford", "Ranger", "KOH4681", "2022", "7C3FR76A55504645");

	        // Προσθήκη των οχημάτων στη λίστα αφού πρώτα ελέγξουμε ότι δεν υπάρχει όχημα  με τον ίδιο αριθμό πλαισίου
	        addVehicle(vehicles, Vehicle1);
	        addVehicle(vehicles, Vehicle2);
	        addVehicle(vehicles, Vehicle3);
	        
	        List<InsurancePolicy> policies = new ArrayList<>();
	        
	        // Δημιουργία Ασφαλειας
	        InsurancePolicy InsurancePolicy1 = new InsurancePolicy("ΜI93", "Mikti asfalisi", "6");
	        InsurancePolicy InsurancePolicy2 = new InsurancePolicy("B56", "Basiki asfalisi", "6");
	        InsurancePolicy InsurancePolicy3 = new InsurancePolicy("O58", "Me odiki", "6");

	        // Προσθήκη στοιχειων στην Ασφαλεια
	        policies.add(InsurancePolicy1);
	        policies.add(InsurancePolicy2);
	        policies.add(InsurancePolicy3);
	        
	        List<InsuranceContract> contracts = new ArrayList<>();
	        
	        // Δημιουργία επαφών Ασφάλισης
	        InsuranceContract InsuranceContract1 = new InsuranceContract(Customer1,Vehicle1,InsurancePolicy2,60);
	        InsuranceContract InsuranceContract2 = new InsuranceContract(Customer2,Vehicle2,InsurancePolicy1,120);
	        InsuranceContract InsuranceContract3 = new InsuranceContract(Customer2,Vehicle3,InsurancePolicy3,80);
	     
	        // Προσθήκη στοιχειων στις επαφές ασφάλησης
	        contracts.add(InsuranceContract1);
	        contracts.add(InsuranceContract2);
	        contracts.add(InsuranceContract3);	        
	        
	        int i=1;
	        for (InsuranceContract contract : contracts) {
	        	contract.print(i);
	        	i++; 
	        }
	        
	        System.out.println("");
	        
	        Map<Customer, List<String>> customerVehiclesMap = new HashMap<>();
	        Map<Customer, Double> customerTotalCostMap = new HashMap<>();

	        for (InsuranceContract contract : contracts) {
	            String vehicleDetails = contract.oxima.Marka + " " + contract.oxima.Modelo + " (" + contract.oxima.Pinakida + ")";
	            customerVehiclesMap.computeIfAbsent(contract.pelatis, k -> new ArrayList<>()).add(vehicleDetails);
	            customerTotalCostMap.put(contract.pelatis, customerTotalCostMap.getOrDefault(contract.pelatis, 0.0) + contract.lefta);
	        }

	        for (Customer customer : customers) {
	            List<String> vehiclesInsured = customerVehiclesMap.getOrDefault(customer, new ArrayList<>());
	            double totalCost = customerTotalCostMap.getOrDefault(customer, 0.0);
	            System.out.println("Πελάτης: " + customer.Name + " " + customer.LastName + ", Οχήματα: " + vehiclesInsured + ", Συνολικό Κόστος: " + totalCost + "€");
	        }
	    }

	    private static void addCustomer(List<Customer> customers, Customer newCustomer) {
	        for (Customer customer : customers) {
	            if (customer.getArithmosTaftotitas().equals(newCustomer.getArithmosTaftotitas())) {
	                System.out.println("Πελάτης με αριθμό ταυτότητας " + newCustomer.getArithmosTaftotitas() + " υπάρχει ήδη.");
	                return;
	            }
	        }
	        customers.add(newCustomer);
	    }

	    private static void addVehicle(List<Vehicle> vehicles, Vehicle newVehicle) {
	        for (Vehicle vehicle : vehicles) {
	            if (vehicle.getArithmos_Plaisiou().equals(newVehicle.getArithmos_Plaisiou())) {
	                System.out.println("Το όχημα με αριθμό πλαισίου " + newVehicle.getArithmos_Plaisiou() + " υπάρχει ήδη.");
	                return;
	            }
	        }
	        vehicles.add(newVehicle);
	    }
}
