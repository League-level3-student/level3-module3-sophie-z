package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double bonus = 0.5 * getPopulation();
		double taxes = getPopulation() * getGrowthRate() + bonus;
		System.out.println("BOSTON TAXES: " + taxes);
		return taxes;
	}

}
