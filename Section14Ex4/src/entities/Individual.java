package entities;

public class Individual extends TaxPayer {

	private Double healthSpending;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualRevenue, Double healthSpending) {
		super(name, anualRevenue);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	
}
