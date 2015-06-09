import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NuPackTest {
    NuPackCalculator npc = new NuPackCalculator();
    @Test
    public void example1() {
        assertEquals(npc.calculate("$1299.99", "3 people", "food"), "$1591.58");
    }

    @Test
    public void example2() {
        assertEquals(npc.calculate("$5432.00", "1 person", "drugs"), "$6199.81");
    }

    @Test
    public void example3() {
        assertEquals(npc.calculate("$12456.95", "4 people", "books"), "$13707.63");
    }

    @Test
    public void multiCased() {
        assertEquals(npc.calculate("$1000.00", "1 person", "DrUgS"), "$1141.35");
    }
    
    @Test
    public void twoDigitPeople() {
        assertEquals(npc.calculate("$1000.00", "12 people", "video games"), "$1201.20");
    }
}