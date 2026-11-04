
package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RecipeTest {

    @Test
    void testEquals() {
        // Arrange
        Recipe recipe1 = new Recipe();
        recipe1.setName("Latte");

        Recipe recipe2 = new Recipe();
        recipe2.setName("Latte");

        // Act
        boolean result = recipe1.equals(recipe2);

        // Assert
        assertTrue(result);
    }

    @Test
    void testEqualsDifferentNames() {
        // Arrange
        Recipe recipe1 = new Recipe();
        recipe1.setName("Latte");

        Recipe recipe2 = new Recipe();
        recipe2.setName("Mocha");

        // Act
        boolean result = recipe1.equals(recipe2);

        // Assert
        assertFalse(result);
    }

    @Test
    void testEqualsNullNameInOtherRecipe() {
        // Arrange
        Recipe recipe1 = new Recipe();
        recipe1.setName("Latte");

        Recipe recipe2 = new Recipe();

        // Act
        boolean result = recipe1.equals(recipe2);

        // Assert
        assertFalse(result);
    }

    @Test
    void testEqualsNullNameInCurrentRecipe() {
        // Arrange
        Recipe recipe1 = new Recipe();

        Recipe recipe2 = new Recipe();
        recipe2.setName("Latte");

        // Act
        boolean result = recipe1.equals(recipe2);

        // Assert
        assertFalse(result);
    }

    @Test
    void testGetAmtChocolate() {
        // Arrange
        Recipe recipe = new Recipe();
        recipe.setAmtChocolate(5);

        // Act
        int result = recipe.getAmtChocolate();

        // Assert
        assertEquals(5, result);
    }

    @Test
    void testGetAmtCoffee() {
        // Arrange
        Recipe recipe = new Recipe();
        recipe.setAmtCoffee(5);

        // Act
        int result = recipe.getAmtCoffee();

        // Assert
        assertEquals(5, result);
    }

    @Test
    void testGetAmtMilk() {
        // Arrange
        Recipe recipe = new Recipe();
        recipe.setAmtMilk(5);

        // Act
        int result = recipe.getAmtMilk();

        // Assert
        assertEquals(5, result);
    }

    @Test
    void testGetAmtSugar() {
        // Arrange
        Recipe recipe = new Recipe();
        recipe.setAmtSugar(5);

        // Act
        int result = recipe.getAmtSugar();

        // Assert
        assertEquals(5, result);
    }

    @Test
    void testGetName() {
        // Arrange
        Recipe recipe = new Recipe();
        recipe.setName("Latte");

        // Act
        String result = recipe.getName();

        // Assert
        assertEquals("Latte", result);
    }

    @Test
    void testGetPrice() {
        // Arrange
        Recipe recipe = new Recipe();
        recipe.setPrice(25);

        // Act
        int result = recipe.getPrice();

        // Assert
        assertEquals(25, result);
    }

    @Test
    void testSetAmtChocolate() {
        // Arrange
        Recipe recipe = new Recipe();

        // Act
        recipe.setAmtChocolate(8);

        // Assert
        assertEquals(8, recipe.getAmtChocolate());
    }

    @Test
    void testSetAmtChocolateNegative() {
        // Arrange
        Recipe recipe = new Recipe();

        // Act
        recipe.setAmtChocolate(-1);

        // Assert
        assertEquals(0, recipe.getAmtChocolate());
    }

    @Test
    void testSetAmtCoffee() {
        // Arrange
        Recipe recipe = new Recipe();

        // Act
        recipe.setAmtCoffee(8);

        // Assert
        assertEquals(8, recipe.getAmtCoffee());
    }

    @Test
    void testSetAmtCoffeeNegative() {
        // Arrange
        Recipe recipe = new Recipe();

        // Act
        recipe.setAmtCoffee(-1);

        // Assert
        assertEquals(0, recipe.getAmtCoffee());
    }

    @Test
    void testSetAmtMilk() {
        // Arrange
        Recipe recipe = new Recipe();

        // Act
        recipe.setAmtMilk(8);

        // Assert
        assertEquals(8, recipe.getAmtMilk());
    }

    @Test
    void testSetAmtMilkNegative() {
        // Arrange
        Recipe recipe = new Recipe();

        // Act
        recipe.setAmtMilk(-1);

        // Assert
        assertEquals(0, recipe.getAmtMilk());
    }

    @Test
    void testSetAmtSugar() {
        // Arrange
        Recipe recipe = new Recipe();

        // Act
        recipe.setAmtSugar(8);

        // Assert
        assertEquals(8, recipe.getAmtSugar());
    }

    @Test
    void testSetAmtSugarNegative() {
        // Arrange
        Recipe recipe = new Recipe();

        // Act
        recipe.setAmtSugar(-1);

        // Assert
        assertEquals(0, recipe.getAmtSugar());
    }

    @Test
    void testSetName() {
        // Arrange
        Recipe recipe = new Recipe();

        // Act
        recipe.setName("Espresso");

        // Assert
        assertEquals("Espresso", recipe.getName());
    }

    @Test
    void testSetPrice() {
        // Arrange
        Recipe recipe = new Recipe();

        // Act
        recipe.setPrice(30);

        // Assert
        assertEquals(30, recipe.getPrice());
    }

    @Test
    void testSetPriceNegative() {
        // Arrange
        Recipe recipe = new Recipe();

        // Act
        recipe.setPrice(-1);

        // Assert
        assertEquals(0, recipe.getPrice());
    }

    @Test
    void testToString() {
        // Arrange
        Recipe recipe = new Recipe();
        recipe.setName("Cappuccino");

        // Act
        String result = recipe.toString();

        // Assert
        assertEquals("Cappuccino", result);
    }
}
