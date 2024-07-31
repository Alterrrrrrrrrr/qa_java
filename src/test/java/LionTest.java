import com.example.Lion;
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

public class LionTest {

@Mock
Feline feline;

@Test
    public void getKittensLionTestReturnCorrectValue() throws Exception {
    Lion lion = new Lion("Самка", feline);
    int expectedGetKittensResult = 1;

    Mockito.when(feline.getKittens()).thenReturn(1);

    int actualGetKittensResult = lion.getKittens();

    assertEquals(expectedGetKittensResult, actualGetKittensResult);
}

@Test
    public void getFoodLionTestReturnCorrectValue() throws Exception {
    Lion lion = new Lion("Самка", feline);
    List<String> getFoodExpectedResult = List.of("Животные", "Птицы", "Рыба");
try {
    Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

    List<String> getFoodActualResult = lion.getFood();

    assertEquals(getFoodExpectedResult, getFoodActualResult);
}
catch (Exception exception) {
    System.out.println("Exception occurred in method getFoodLionTestReturnCorrectValue");
}
}

@Test
    public void doesHaveManeExceptionTest() throws Exception {

    assertThrows("Используйте допустимые значения пола животного - самец или самка", Exception.class, () -> new Lion("Небинариха", feline));
}

}
