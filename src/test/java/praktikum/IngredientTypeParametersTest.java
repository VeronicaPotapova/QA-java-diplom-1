package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeParametersTest {

    private final int indexIngredient;
    private final int expectedIndex;

    public IngredientTypeParametersTest(int indexIngredient, int expectedIndex){
        this.indexIngredient = indexIngredient;
        this.expectedIndex = expectedIndex;
    }

    @Parameterized.Parameters
    public static Object[][] maneData() {
        return new Object[][] {
                { IngredientType.SAUCE.ordinal(), 0},
                { IngredientType.FILLING.ordinal(), 1},
        };
    }

    @Test
    public void valueOfIngredientTest() {
        assertEquals(expectedIndex, indexIngredient);
    }
}