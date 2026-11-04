
package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


public class InventoryTest {

    @Test
    void testEnoughIngredients() {
        // Arrange
        Inventory inventory = new Inventory();
        Recipe recipe = new Recipe();
        recipe.setAmtCoffee(5);
        recipe.setAmtMilk(5);
        recipe.setAmtSugar(5);
        recipe.setAmtChocolate(5);

        // Act
        boolean result = inventory.enoughIngredients(recipe);

        // Assert
        assertTrue(result);
    }

    @Test
    void testNotEnoughCoffee() {
        // Arrange
        Inventory inventory = new Inventory();
        Recipe recipe = new Recipe();
        recipe.setAmtCoffee(16);

        // Act
        boolean result = inventory.enoughIngredients(recipe);

        // Assert
        assertFalse(result);
    }

    @Test
    void testNotEnoughMilk() {
        // Arrange
        Inventory inventory = new Inventory();
        Recipe recipe = new Recipe();
        recipe.setAmtMilk(16);

        // Act
        boolean result = inventory.enoughIngredients(recipe);

        // Assert
        assertFalse(result);
    }

    @Test
    void testNotEnoughSugar() {
        // Arrange
        Inventory inventory = new Inventory();
        Recipe recipe = new Recipe();
        recipe.setAmtSugar(16);

        // Act
        boolean result = inventory.enoughIngredients(recipe);

        // Assert
        assertFalse(result);
    }

    @Test
    void testNotEnoughChocolate() {
        // Arrange
        Inventory inventory = new Inventory();
        Recipe recipe = new Recipe();
        recipe.setAmtChocolate(16);

        // Act
        boolean result = inventory.enoughIngredients(recipe);

        // Assert
        assertFalse(result);
    }

    @Test
    void testGetChocolate() {
        // Arrange
        Inventory inventory = new Inventory();
        inventory.setChocolate(10);

        // Act
        int result = inventory.getChocolate();

        // Assert
        assertEquals(10, result);
    }

    @Test
    void testGetCoffee() {
        // Arrange
        Inventory inventory = new Inventory();
        inventory.setCoffee(10);

        // Act
        int result = inventory.getCoffee();

        // Assert
        assertEquals(10, result);
    }

    @Test
    void testGetMilk() {
        // Arrange
        Inventory inventory = new Inventory();
        inventory.setMilk(10);

        // Act
        int result = inventory.getMilk();

        // Assert
        assertEquals(10, result);
    }

    @Test
    void testGetSugar() {
        // Arrange
        Inventory inventory = new Inventory();
        inventory.setSugar(10);

        // Act
        int result = inventory.getSugar();

        // Assert
        assertEquals(10, result);
    }

    @Test
    void testSetChocolate() {
        // Arrange
        Inventory inventory = new Inventory();

        // Act
        inventory.setChocolate(8);

        // Assert
        assertEquals(8, inventory.getChocolate());
    }

    @Test
    void testSetCoffee() {
        // Arrange
        Inventory inventory = new Inventory();

        // Act
        inventory.setCoffee(8);

        // Assert
        assertEquals(8, inventory.getCoffee());
    }

    @Test
    void testSetMilk() {
        // Arrange
        Inventory inventory = new Inventory();

        // Act
        inventory.setMilk(8);

        // Assert
        assertEquals(8, inventory.getMilk());
    }

    @Test
    void testSetSugar() {
        // Arrange
        Inventory inventory = new Inventory();

        // Act
        inventory.setSugar(8);

        // Assert
        assertEquals(8, inventory.getSugar());
    }

    @Test
    void testSetChocolateNegative() {
        // Arrange
        Inventory inventory = new Inventory();

        // Act
        inventory.setChocolate(-1);

        // Assert
        assertEquals(0, inventory.getChocolate());
    }

    @Test
    void testSetCoffeeNegative() {
        // Arrange
        Inventory inventory = new Inventory();

        // Act
        inventory.setCoffee(-1);

        // Assert
        assertEquals(0, inventory.getCoffee());
    }

    @Test
    void testSetMilkNegative() {
        // Arrange
        Inventory inventory = new Inventory();

        // Act
        inventory.setMilk(-1);

        // Assert
        assertEquals(0, inventory.getMilk());
    }

    @Test
    void testSetSugarNegative() {
        // Arrange
        Inventory inventory = new Inventory();

        // Act
        inventory.setSugar(-1);

        // Assert
        assertEquals(0, inventory.getSugar());
    }

    @Test
    void testToString() {
        // Arrange
        Inventory inventory = new Inventory();

        // Act
        String result = inventory.toString();

        // Assert
        assertEquals(
                "Coffee: 15\n" +
                "Milk: 15\n" +
                "Sugar: 15\n" +
                "Chocolate: 15\n",
                result
        );
    }
}
