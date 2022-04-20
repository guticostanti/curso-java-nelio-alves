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

	@Override
	public double tax() {
		if (quantityOfEmployees > 10) {
			return anualRevenue * 0.14;
		} else {
			return anualRevenue * 0.16;
		}
	}
}
