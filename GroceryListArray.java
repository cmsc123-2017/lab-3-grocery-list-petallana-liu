class GroceryListArray implements IGroceryList {
 
  int max = 10;
  GroceryItem items[] = new GroceryItem[max];
  int size = 0;
 
  GroceryListArray() {}
   
 
  public boolean add(GroceryItem item) {
    if (size == max) {
      // create new array with bigger length
       max = max + 10;
       GroceryItem bigger[] = new GroceryItem[max];
      /* copy items to new array
        assign new array to items */
       for(int j = 0; j < items.length; j++){ // copies old array contents and transfers it to a nother bigger array without changing the old one.
            bigger[j] = items[j];
       }
      return false; // don't return instead
    }
   
    int i = indexOf(item.name);
    if (i > -1) {
      items[i].addQuantity(item.quantity);
    } else {    
      items[this.size] = item;
      this.size++;
     
    }
    return true;
  }
 
  // TEMPLATE
  /*  Fields:
   *    this.max
   *    this.items   --GroceryItem[]
   *    this.size
   *
   *  Methods:
   *    this.add
   *    this.indexOf
   *    this.remove
   *    this.markAsBought
   *    this.display
   *
   *  Methods on this.items[i]:
   *    this.items[i].addQuantity()
   *    this.items[i].equals()
   *    this.items[i].toString()
   */
 
   
  /* String -> int
  * Given the name of a GroceryItem, returns the
  * corresponding GroceryItem index from the list. If it is not in the list,
  * returns -1.
  */
 
  int indexOf(String name) {
    for (int i = 0; i < this.size; i++) {
      if (this.items[i].equals(new GroceryItem(name, 0))) {
        return i;
      }
    }
   
    return -1;
  }
  
  /* String -> boolean
   * Determines whether 
   * Purpose: Gets a string name and removes name&quantity from the list; Arranges items in the array to fill in squence what was removed.
   * boolean remove (String a) {
      return false;
    }
  */
  public boolean remove(String name) {  
    int count = 0;
    for (int i = 0; i < items.length; i++) {
      if (items[i].name.equals(name)) {
        for (int j = i; j < items.length - 1; j++) {
          items[j] = items[j + 1];
        }
        count++;
        break;
      }
    }
    
    if (count == 0) {
      return false;
    } else {
      return true;
    }
  }
  
  /* String -> boolean
   * Determines whether an item is already bought or not.
   * public boolean markasBought(String name) {
   *   return false;
   * }
   */
     
  public boolean markAsBought(String name) {
    int i = indexOf(name);
    if (i > -1) {
      items[i].isBought = true;
      return true;
    } else {
      return false;
    }
  }
 
  public void display() {
    for (int i = 0; i < this.size; i++) {
      System.out.println(items[i]);
    }
  }
  
  /* -> int
   * Returns the total quantity of the Grocery Item in the list.
   * 
   * int totalQuantity() {
   *   return 0;
   * }
   */
  
  public int totalQuantity() {
    int total = 0;
    for (int i = 0; i < this.size; i++) {
      total += items[i].quantity;
    }
    return total;
  }
  
  /* String, int -> void
   * Reduces the quantity of an item by the given quantity, then
   * if the result quantity is zero or less than, it then removes the item on the list.
   */
  
  public void reduceQuantity(String itemName, int quantity) {
    
  }
}
