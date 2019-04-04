import game.players.Barbarian;
import org.junit.Before;
import org.junit.Test;

public class BarbarianTest {

    private Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian();
    }

    @Test
    public void canGetPoints() {
        barbarian.getPoints();
    }
}
