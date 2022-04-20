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
	
	@Override
	public double tax() {
		if (anualRevenue < 20000) {
			return (anualRevenue * 0.15) - (healthSpending * 0.5);
		} else {
			return anualRevenue * 0.25 - (healthSpending * 0.5);
		}
	}
}
