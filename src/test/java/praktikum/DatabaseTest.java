package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

public class DatabaseTest {

    Database database = new Database();

    @Test
    public void availableBuns() {
        assertFalse("List of buns should contain some data", database.availableBuns().isEmpty());
    }

    @Test
    public void availableIngredients() {
        assertFalse("List of buns should contain some data", database.availableIngredients().isEmpty());
    }
}