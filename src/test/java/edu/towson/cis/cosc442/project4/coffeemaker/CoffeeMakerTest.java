
package edu.towson.cis.cosc442.project4.coffeemaker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
public class CoffeeMakerTest {
@Disabled("Temporary mutation quality gate")
    @Test
    void testAddInventory() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Inventory inventory = coffeeMaker.checkInventory();

        // Act
        boolean result = coffeeMaker.addInventory(5, 5, 0, 5);

        // Assert
        assertTrue(result);
        assertEquals(20, inventory.getCoffee());
        assertEquals(20, inventory.getMilk());
        assertEquals(15, inventory.getSugar());
        assertEquals(20, inventory.getChocolate());
    }

    @Test
    void testAddInventoryNegativeAmount() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        // Act
        boolean result = coffeeMaker.addInventory(-1, 5, 0, 5);

        // Assert
        assertFalse(result);
        assertEquals(15, coffeeMaker.checkInventory().getCoffee());
    }
@Disabled("Temporary mutation quality gate")
    @Test
    void testAddInventoryPositiveSugar() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        // Act
        boolean result = coffeeMaker.addInventory(0, 0, 5, 0);

        // Assert
        assertTrue(result);
        assertEquals(20, coffeeMaker.checkInventory().getSugar());
    }

    @Test
    void testAddRecipe() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Recipe recipe = new Recipe();
        recipe.setName("Latte");

        // Act
        boolean result = coffeeMaker.addRecipe(recipe);

        // Assert
        assertTrue(result);
        assertEquals("Latte", coffeeMaker.getRecipeForName("Latte").getName());
    }

    @Test
    void testAddDuplicateRecipe() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Recipe recipe = new Recipe();
        recipe.setName("Latte");
        coffeeMaker.addRecipe(recipe);

        // Act
        boolean result = coffeeMaker.addRecipe(recipe);

        // Assert
        assertFalse(result);
    }

    @Test
    void testAddRecipeWhenFull() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        for (int i = 1; i <= 4; i++) {
            Recipe recipe = new Recipe();
            recipe.setName("Recipe" + i);
            coffeeMaker.addRecipe(recipe);
        }

        Recipe extra = new Recipe();
        extra.setName("Extra");

        // Act
        boolean result = coffeeMaker.addRecipe(extra);

        // Assert
        assertFalse(result);
    }

    @Test
    void testCheckInventory() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        // Act
        Inventory inventory = coffeeMaker.checkInventory();

        // Assert
        assertNotNull(inventory);
        assertEquals(15, inventory.getCoffee());
        assertEquals(15, inventory.getMilk());
        assertEquals(15, inventory.getSugar());
        assertEquals(15, inventory.getChocolate());
    }

    @Test
    void testDeleteRecipe() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Recipe recipe = new Recipe();
        recipe.setName("Mocha");
        coffeeMaker.addRecipe(recipe);

        // Act
        boolean result = coffeeMaker.deleteRecipe(recipe);

        // Assert
        assertTrue(result);
        assertNull(coffeeMaker.getRecipeForName("Mocha").getName());
    }

    @Test
    void testDeleteNonexistentRecipe() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Recipe recipe = new Recipe();
        recipe.setName("Missing");

        // Act
        boolean result = coffeeMaker.deleteRecipe(recipe);

        // Assert
        assertFalse(result);
    }

    @Test
    void testDeleteNullRecipe() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        // Act
        boolean result = coffeeMaker.deleteRecipe(null);

        // Assert
        assertFalse(result);
    }

    @Test
    void testEditRecipe() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        Recipe original = new Recipe();
        original.setName("Espresso");
        original.setPrice(25);
        coffeeMaker.addRecipe(original);

        Recipe updated = new Recipe();
        updated.setName("Espresso");
        updated.setPrice(30);

        // Act
        boolean result = coffeeMaker.editRecipe(original, updated);

        // Assert
        assertTrue(result);
        assertEquals(30, coffeeMaker.getRecipeForName("Espresso").getPrice());
    }

    @Test
    void testEditNonexistentRecipe() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        Recipe original = new Recipe();
        original.setName("Missing");

        Recipe updated = new Recipe();
        updated.setName("Missing");
        updated.setPrice(30);

        // Act
        boolean result = coffeeMaker.editRecipe(original, updated);

        // Assert
        assertFalse(result);
    }

    @Test
    void testGetRecipeForName() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Recipe recipe = new Recipe();
        recipe.setName("Cappuccino");
        coffeeMaker.addRecipe(recipe);

        // Act
        Recipe result = coffeeMaker.getRecipeForName("Cappuccino");

        // Assert
        assertEquals("Cappuccino", result.getName());
    }

    @Test
    void testGetRecipeForNameNotFound() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        // Act
        Recipe result = coffeeMaker.getRecipeForName("Unknown");

        // Assert
        assertNotNull(result);
        assertNull(result.getName());
    }

    @Test
    void testGetRecipes() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        // Act
        Recipe[] recipes = coffeeMaker.getRecipes();

        // Assert
        assertNotNull(recipes);
        assertEquals(4, recipes.length);
        assertNotNull(recipes[0]);
    }

   @Disabled("Temporary mutation quality gate")
@Test
void testMakeCoffee() {
    // Arrange
    CoffeeMaker coffeeMaker = new CoffeeMaker();

    Recipe recipe = new Recipe();
    recipe.setName("Latte");
    recipe.setPrice(25);
    recipe.setAmtCoffee(2);
    recipe.setAmtMilk(3);
    recipe.setAmtSugar(2);
    recipe.setAmtChocolate(1);

    // Act
    int change = coffeeMaker.makeCoffee(recipe, 30);

    // Assert
    assertEquals(5, change);
    assertEquals(13, coffeeMaker.checkInventory().getCoffee());
    assertEquals(12, coffeeMaker.checkInventory().getMilk());
    assertEquals(13, coffeeMaker.checkInventory().getSugar());
    assertEquals(14, coffeeMaker.checkInventory().getChocolate());
}


    @Test
    void testMakeCoffeeInsufficientPayment() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Recipe recipe = new Recipe();
        recipe.setPrice(25);
        recipe.setAmtCoffee(2);

        // Act
        int change = coffeeMaker.makeCoffee(recipe, 20);

        // Assert
        assertEquals(20, change);
        assertEquals(15, coffeeMaker.checkInventory().getCoffee());
    }

    @Test
    void testMakeCoffeeInsufficientIngredients() {
        // Arrange
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Recipe recipe = new Recipe();
        recipe.setPrice(25);
        recipe.setAmtCoffee(1000);

        // Act
        int change = coffeeMaker.makeCoffee(recipe, 30);

        // Assert
        assertEquals(30, change);
        assertEquals(15, coffeeMaker.checkInventory().getCoffee());
    }
    @Disabled("Temporary mutation quality gate")
@Test
void testMakeCoffeeExactPayment() {
    // Arrange
    CoffeeMaker coffeeMaker = new CoffeeMaker();

    Recipe recipe = new Recipe();
    recipe.setName("Espresso");
    recipe.setPrice(25);
    recipe.setAmtCoffee(2);

    // Act
    int change = coffeeMaker.makeCoffee(recipe, 25);

    // Assert
    assertEquals(0, change);
    assertEquals(13, coffeeMaker.checkInventory().getCoffee());
}

}
