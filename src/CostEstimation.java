/**
 * Program to estimate cost of house
 */

/**
 * @author priyanka
 *
 */
public class CostEstimation {
	int costPerSqft;  //contains cost per sqft of the house
	/**
	 * 
	 * @param materialStandard contains 0 if we use standard materials
	 * 						   contains 1 if we use above standard materials
	 * 						   contains 2 if we use high standard materials
	 * @param area area of house
	 * @param isAutomated contains true if house is automated and false if house is not automated
	 * @return estimated cost of the house
	 */
	public double cost(int materialStandard,int area,boolean isAutomated)
	{
		if(materialStandard == 0)
		{
			costPerSqft = 1200;
		}
		else if(materialStandard == 1)
		{
			costPerSqft = 1500;
		}
		else if(materialStandard == 2 && !isAutomated)
		{
			costPerSqft = 1800;
		}
		else if(materialStandard == 2 && isAutomated)
		{
			costPerSqft = 2500;
		}
		return costPerSqft*area;
	}
}
