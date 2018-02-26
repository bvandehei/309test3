package test;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import logic.WeightConversion;

public class TestWeightConversion {
	@Test
	public void TestKilosToPounds() {
		WeightConversion w = new WeightConversion();
		assertTrue(w.KilosToPounds(0.454) == 1.0);
	}
	@Test
	public void TestPoundsToKilos() {
		WeightConversion w = new WeightConversion();
		assertTrue(w.PoundsToKilos(1.0) == 0.454);
	}
}
