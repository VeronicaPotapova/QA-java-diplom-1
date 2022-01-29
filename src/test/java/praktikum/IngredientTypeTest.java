package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTypeTest {

    @Test
    public void valuesIngredientTest() {
        assertArrayEquals(
                "Ingredient type is not correct",
                new IngredientType[]{IngredientType.SAUCE, IngredientType.FILLING},
                IngredientType.values());
    }

}