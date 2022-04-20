package entities;

public abstract class TaxPayer {

	protected String name;
	protected Double anualRevenue;
	
	public TaxPayer() {
		
	}

	public TaxPayer(String name, Double anualRevenue) {
		super();
		this.name = name;
		this.anualRevenue = anualRevenue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualRevenue() {
		return anualRevenue;
	}

	public void setAnualRevenue(Double anualRevenue) {
		this.anualRevenue = anualRevenue;
	}
	
	public abstract double tax();
	
	public String toString() {
		return name + ": $ " + tax();
	}
}
