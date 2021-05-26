package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double bonus = -0.15 * getPopulation();
		double taxes = getPopulation() * getGrowthRate() + bonus;
		System.out.println("ATLANTA TAXES: " + taxes);
		return taxes;
	}

}
