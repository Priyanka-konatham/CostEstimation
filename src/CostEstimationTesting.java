import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CostEstimationTesting {

	@Test
	void test() {
		CostEstimation c = new CostEstimation();
		assertEquals(12000000,c.cost(0, 10000 , false));
		assertEquals(30000000,c.cost(1, 20000 , false));
		assertEquals(54000000,c.cost(2, 30000 , false));
		assertEquals(75000000,c.cost(3, 30000 , true));
		
	}

}
