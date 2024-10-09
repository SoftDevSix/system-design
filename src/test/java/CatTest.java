import org.example.Animals.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CatTest {

    private Cat youngCatSleep;
    private Cat oldCatNotSleep;
    @BeforeEach
    void setUp() {
        youngCatSleep = new Cat("name", 1, true);
        oldCatNotSleep = new Cat("name2", 20, false);
    }

    @Test
    public void VerifyCatAge() {

        int age = youngCatSleep.getAge();
        assertEquals(1, age);

        int age2 = oldCatNotSleep.getAge();
        assertEquals(20, age2);
    }

    @Test
    public void VerifyCatName() {
        String name1 = youngCatSleep.getName();
        assertEquals("name", name1);

        String name2 = oldCatNotSleep.getName();
        assertEquals("name2", name2);
    }

    @Test
    public void VerifyIsSleep() {
        String status1 = youngCatSleep.isSleep();
        assertEquals("cat is sleep.", status1);

        String status2 = oldCatNotSleep.isSleep();
        assertEquals("cat is not sleep.", status2);

    }
}
