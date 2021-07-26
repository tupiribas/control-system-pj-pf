package entities;

public abstract class Person {
	private String name;
	private Double anualIncome;

	public Person(String name, Double annualIncome) {
		this.name = name;
		this.anualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public Double getAnnualIncome() {
		return anualIncome;
	}
	
	public abstract Double impost();
	
	
}
