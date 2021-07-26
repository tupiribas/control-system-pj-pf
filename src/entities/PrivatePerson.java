package entities;

public class PrivatePerson extends Person {
	private Double healthExpenditures;

	public PrivatePerson(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	@Override
	public Double impost() {
		double imp = 0;
		if (getAnnualIncome() < 20000.0) {
			imp = getAnnualIncome() * 0.15 - getHealthExpenditures() * 0.5;
		} else if (getAnnualIncome() >= 20000.0) {
			imp = getAnnualIncome() * 0.25 - getHealthExpenditures() * 0.5;
		}
		return imp;
	}

}
