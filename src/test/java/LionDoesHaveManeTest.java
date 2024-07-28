import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)

public class LionDoesHaveManeTest {
    private final String sex;
    private final boolean expected;

    public LionDoesHaveManeTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getParamsLionManeTest() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"Небинариха", false}
        };
    }

    @Test
    public void checkResult() throws Exception {
        try {
            Lion lion = new Lion(sex);

            boolean actualResult = lion.doesHaveMane();

            assertEquals(expected, actualResult);
        }
        catch (Exception exception) {
            System.out.println("sex = " + sex);
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
        }
}
