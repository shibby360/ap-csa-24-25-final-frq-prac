public class Drink{
  //PART 1
    //Create attributes for the drink class here.
      
    /* Give it attirbutes:
    name
    price with decimals
    if it's cold or not (isCold)
    if it's empty (isEmpty)
    */
    private String name;
    private double price;
    private boolean isCold;
    private boolean isEmpty;
    //Write the constructor for the Drink class. (THIS IS WHAT CREATES an object when its run in the main) 
    //the order for the parameters must be (String, double, boolean, boolean)
    //After creating a constructor test your code in the main to see if you can create some drink.
    public Drink(String nName, double nPrice, boolean nIsCold, boolean nIsEmpty) {
      name = nName;
      price = nPrice;
      isCold = nIsCold;
      isEmpty = nIsEmpty;
    }
    //Write getters/setters for the methods
    public String getName() {
      return name;
    }
    public double getPrice() {
      return price;
    }
    public String getCold() {
      return isCold;
    }
    public String getEmpty() {
      return isEmpty;
    }
    public void setName(String nName) {
      name = nName;
    }
    public void setPrice(double nPrice) {
      price = nPrice;
    }
    public void setCold(boolean nIsCold) {
      isCold = nIsCold;
    }
    public void setEmpty(boolean nIsEmpty) {
      isEmpty = nIsEmpty;
    }
    // Write the method emptyDrink which prints out the message: NameOfDrink "has been drank" and then changes the attribute to be empty
    public void emptyDrink() {
      System.out.println(name + " has been drank");
      isEmpty = true;
    }
}