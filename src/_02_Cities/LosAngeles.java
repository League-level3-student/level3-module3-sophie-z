package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double bonus = 25 * 10000;
		double taxes = getPopulation() * getGrowthRate() + bonus;
		System.out.println("LOS ANGELES TAXES: " + taxes);
		return taxes;
	}
	
}
