import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

@Test
    public void getSoundTestReturnCorrectValue() {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);
    String getSoundExpectedResult = "Мяу";

    String getSoundActualResult = cat.getSound();

    assertEquals(getSoundExpectedResult, getSoundActualResult);
}

@Test
    public void getFoodTestReturnCorrectValue() throws Exception {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);
    List<String> getFoodExpectedResult = List.of("Животные", "Птицы", "Рыба");
try {
    List<String> getFoodActualResult = cat.getFood();

    assertEquals(getFoodExpectedResult, getFoodActualResult);
}
catch (Exception exception) {
    System.out.println("Exception occured in method getFoodTestReturnCorrectValue");
}
}
}
