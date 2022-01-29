package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BunTest {

   @Mock
   Bun bun;

    @Test
    public void getNameTest() {
        String expected = "black bun";
        Mockito.when(bun.getName()).thenReturn("black bun");

        assertEquals("Name does not match", expected, bun.getName());
    }

    @Test
    public void getPriceTest() {
        float expected = 100f;
        Mockito.when(bun.getPrice()).thenReturn(100f);

        assertEquals("Price does not match", expected, bun.getPrice(), 0);
    }
}