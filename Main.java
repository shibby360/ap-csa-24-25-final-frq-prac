import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
  //Practicing with Arrays Section//
  //PART 2


  //Create 3 drink objects that cost less than $5
  Drink sprite = new Drink("Sprite", 4.9, true, false);
  Drink cocaCola = new Drink("Coca Cola", 2.5, true, false);
  Drink hotChoc = new Drink("Hot chocolate", 1, false, false);
  //***TEST YOUR CODE BY PRINTING THE NAME OF YOUR DRINK TO MAKE SURE IT WORKS***//
  System.out.println(sprite.getName());
  //Create 2 drink objects that cost more than $5
  Drink water = new Drink("water", 7, false, false);
  Drink appleJuice = new Drink("Apple juice", 8, true, false);
  
  //create an array of drinks  with size 8.
  //put all your drinks in that array.
  Drink[] drinks = new Drink[8];
  drinks[0] = sprite;
  drinks[1] = cocaCola;
  drinks[2] = hotChoc;
  drinks[3] = water;
  drinks[4] = appleJuice;
//PART 3
  //You will need to write 2 method below
  //Test your method calls here.
  
  //test your cheapItems method
  System.out.println(cheapItems(drinks));
  
  //test your longNameSale method
  longNameSale(drinks);
  for(Drink x : drinks) {
    if(x == null) {continue;}
    System.out.println(x.getName() + " is " + x.getPrice());
  }
  //Try to print the price before you use the method and after to see if it worked.

  //test your drinkAll Method here
  drinkAll(drinks);
  

  //----------------------------------------------------------
    //PART 4 // UNCOMMENT THIS ONCE YOU FINISH THE OTHER PARTS.
    //VenMac test = new VenMac();



    }
    

    
    //Part 3
  //Write a method cheapItems that will return go through an array of drinks and return a String that lists the number of items that cost less than $3
  // For example " The cheap drinks are: Fountain drinks, Snapple, green Tea "
  public static String cheapItems(Drink[] arr){
    String temp = "The cheap drinks are: ";
    for(Drink x : arr) {
      if(x != null && x.getPrice() < 3) {
        temp += x.getName() + ',';
      }
    }
    return temp;
  }
  
  
  //There is a sale on drinks with long names. Write a method that will change the price of all items with a name longer than 7 characters to half off of their original price; You will need to use a setter.
  public static void longNameSale(Drink[] arr){
    for(Drink x : arr) {
      if(x!=null && x.getName().length() > 7) {
        x.setPrice(x.getPrice()/2);
      }
    }
  }
    
  //Write a method called drinkAll() that will go through an array and drink all of the drinks we have in it.
  public static void drinkAll(Drink[] arr){
    for(Drink x : arr) {
      if(x==null) {continue;}
      x.emptyDrink();
    }
  }
}