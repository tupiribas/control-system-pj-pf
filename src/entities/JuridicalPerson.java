package entities;

public class JuridicalPerson extends Person {
	private Integer numberEmployee;

	public JuridicalPerson(String name, Double annualIncome, Integer numberEmployee) {
		super(name, annualIncome);
		this.numberEmployee = numberEmployee;
	}

	public Integer getNumberEmployee() {
		return numberEmployee;
	}

	@Override
	public Double impost() {
		double imp = 0;
		if (getNumberEmployee() >= 10) {
			imp = getAnnualIncome() * 0.14;
		} else {
			imp = getAnnualIncome() * 0.16;
		}
		return imp;
	}

}
