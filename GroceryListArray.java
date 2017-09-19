class GroceryListArray implements IGroceryList {
  
  int max = 10;
  GroceryItem items[] = new GroceryItem[max];
  int size = 0;
  
  GroceryListArray() {}
    
  
  public boolean add(GroceryItem item) {
    if (size == max) {
      // create new array with bigger length
      // int max = max + 10;
      // GroceryItems bigger[] = new GroceryItem[max]
      // copy items to new array
      // assign new array to items
      
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
  
   
  // String -> int
  // Given the name of a GroceryItem, returns the
  // corresponding GroceryItem index from the list. If it is not in the list,
  //  returns -1
  int indexOf(String name) {
    for (int i = 0; i < this.size; i++) {
      if (this.items[i].equals(new GroceryItem(name, 0))) {
        return i;
      }
    }
    
    return -1;
  }
  
  
  public boolean remove(String name) {
    return false;
  }
  
  public boolean markAsBought(String name) {
    return false;
  }
  
  public void display() {
    for (int i = 0; i < this.size; i++) {
      System.out.println(items[i]);
    }
  }
}