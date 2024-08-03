import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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

@Mock
Feline feline;

@Test
    public void getFoodTestReturnCorrectValue() throws Exception {

    Cat cat = new Cat(feline);
    List<String> getFoodExpectedResult = List.of("Животные", "Птицы", "Рыба");

    Mockito.when(feline.eatMeat()).thenReturn(getFoodExpectedResult);
    List<String> getFoodActualResult = cat.getFood();

    assertEquals(getFoodExpectedResult, getFoodActualResult);
}

@Test
    public void getFoodTestReturnException() throws Exception {
    Animal animal = new Animal();

    assertThrows("Incorrect animalKind in getFood method", Exception.class, () -> animal.getFood("Древовидное"));

}

}
