package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTest {

    @Test
    public void getPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "cutlet", 100);
        float expected = 100;
        assertEquals("Ingredient price is not correct", expected,ingredient.getPrice(), 0);
    }

    @Test
    public void getNameTest() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "cutlet", 100);
        String expected = "cutlet";
        assertEquals("Ingredient name is not correct",expected,ingredient.getName());
    }

    @Test
    public void getType() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "cutlet", 100f);
        IngredientType expected = IngredientType.FILLING;
        assertEquals("Ingredient type is not correct", expected,ingredient.getType());
    }
}