import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class GroceryListTest extends TestCase { 
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  GroceryListArray grocery = new GroceryListArray();
  
  GroceryItem milk = new GroceryItem("Milk", 2);
  GroceryItem apples = new GroceryItem("Apples", 4);
  GroceryItem shampoo = new GroceryItem("Shampoo", 11);
  
  public void testRemove() {
    grocery.add(milk);
    grocery.add(apples);
    grocery.add(shampoo);
    
    assertTrue(grocery.remove("Milk"));
    assertTrue(grocery.remove("Apples"));
    assertFalse(grocery.remove("Biscuits"));
    assertFalse(grocery.remove("Soap"));
  }
  
  public void testMarkAsBought() {
    grocery.add(milk);
    grocery.add(apples);
    grocery.add(shampoo);

    assertTrue(grocery.markAsBought("Shampoo"));
    assertTrue(grocery.markAsBought("Milk"));
    assertTrue(grocery.markAsBought("Apples"));
  }
  
  public void testTotalQuantity() {
    grocery.add(milk);
    grocery.add(apples);
    grocery.add(shampoo);
    
    assertEquals(17, grocery.totalQuantity());
  }
  
  public void testReduceQuantity() {
    grocery.add(milk);
    grocery.add(apples);
    grocery.add(shampoo);
    
    assertTrue(grocery.reduceQuantity("Milk", 2));
    assertTrue(grocery.reduceQuantity("Apples", 2));
    assertTrue(grocery.reduceQuantity("Shampoo", 10));
  }*/
}

