package entities;

public class Company extends TaxPayer {

	private Integer quantityOfEmployees;
	
	public Company() {
		
	}

	public Company(String name, Double anualRevenue, Integer quantityOfEmployees) {
		super(name, anualRevenue);
		this.quantityOfEmployees = quantityOfEmployees;
	}

	public Integer getQuantityOfEmployees() {
		return quantityOfEmployees;
	}

	public void setQuantityOfEmployees(Integer quantityOfEmployees) {
		this.quantityOfEmployees = quantityOfEmployees;
	}
	
	
}
