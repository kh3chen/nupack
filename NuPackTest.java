import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NuPackTest {
    NuPackCalculator npc = new NuPackCalculator();
    @Test
    public void emptyTest() {
        assertEquals(npc.calculate("a", "a", "a"), 0);
    }
}