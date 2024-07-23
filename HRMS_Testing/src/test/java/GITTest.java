import org.junit.jupiter.api.*;

public class GITTest {

    static GIT g;

    @BeforeAll
    public static void init() {
        g = new GIT();
    }

    @Test
    public void AddTest(){
        int res = g.add(2, 4);
        Assertions.assertEquals(6, res);
    }
}
