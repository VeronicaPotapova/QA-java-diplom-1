package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Mock
    private Bun bun;

    @Mock
    private Ingredient ingredient;

    @Test
    public void addBurgerIngredientTest() {
        Burger burger = new Burger();
        burger.addIngredient(ingredient);

        assertEquals("Ingredient doesn't add", 1, burger.ingredients.size());
    }

    @Test
    public void removeBurgerIngredientTest() {
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);

        assertEquals("Ingredient doesn't remove", 0, burger.ingredients.size());
    }

    @Test
    public void moveBurgerIngredientTest() {
        Burger burger = new Burger();
        burger.addIngredient(new Ingredient(IngredientType.FILLING, "cutlet", 100));
        burger.addIngredient(new Ingredient(IngredientType.SAUCE, "chili sauce", 300));
        burger.moveIngredient(0, 1);

        assertEquals("Ingredient doesn't move", "cutlet", burger.ingredients.get(1).name);
    }

    @Test
    public void getBurgerPriceTest() {
        Burger burger = new Burger();
        float price = 100f;
        Mockito.when(bun.getPrice()).thenReturn(price);
        Mockito.when(ingredient.getPrice()).thenReturn(price);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        assertEquals("Burger price is not correct",price * 2 + price, burger.getPrice(), 0);
    }

    @Test
    public void getBurgerReceiptTest() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getName()).thenReturn("black bun");
        Mockito.when(bun.getPrice()).thenReturn(100f);
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(ingredient.getName()).thenReturn("sausage");
        Mockito.when(ingredient.getPrice()).thenReturn(300f);
        String expected = "(==== black bun ====)\r\n" +
                "= filling sausage =\r\n" +
                "(==== black bun ====)\r\n" +
                "\r\n" +
                "Price: 500.000000\r\n";

        assertEquals("Burger receipt is not correct", expected, burger.getReceipt());
    }
}
