package entities;

public class TaxPayer {

	private String name;
	private Double anualRevenue;
	
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
	
	
}
