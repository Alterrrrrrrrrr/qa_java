import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)

public class FelineTest {

@Spy
Feline feline;

@Test
    public void eatMeatTestReturnCorrectValue() throws Exception {
    List<String> expectedEatMeatResult = List.of("Животные", "Птицы", "Рыба");

    Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

    List<String> actualEatMeatResult = feline.eatMeat();

    assertEquals(expectedEatMeatResult, actualEatMeatResult);
}

@Test
        public void eatMeatTestReturnException() throws Exception {

    assertThrows("Incorrect animalKind", Exception.class, () -> feline.getFood("Человек"));
    }

@Test
    public void getFamilyTestReturnCorrectValue() {
    String expectedGetFamilyResult = "Кошачьи";

    String actualGetFamilyResult = feline.getFamily();

    assertEquals(expectedGetFamilyResult, actualGetFamilyResult);
}

@Test
    public void getKittensTestReturnCorrectValue() {
    int expectedGetKittensResult = 1;

    Mockito.when(feline.getKittens(1)).thenReturn(1);

    int actualGetKittensResult = feline.getKittens();

    assertEquals(expectedGetKittensResult, actualGetKittensResult);
}

@Test
    public void getKittensTestWithParametersCorrectValue() {

    for (int expectedGetKittensResult = -1001;
         expectedGetKittensResult <= 1001;
         expectedGetKittensResult++) {
        int actualGetKittensResult = feline.getKittens(expectedGetKittensResult);


        assertEquals("Error with " + expectedGetKittensResult + "parameter", expectedGetKittensResult, actualGetKittensResult);
    }
}

}
