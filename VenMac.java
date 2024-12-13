// UNCOMMENT EVERYTHING BELOW WHEN 
// YOU HAVE COMPLETED THE PREVIOUS 3 PARTS.


// PART 4
import java.util.Scanner;
import java.util.ArrayList;
public class VenMac{
    ArrayList<Drink> stock;

    String[] drinkNames = {"Coke","Diet Coke","Water","Mountain Dew","Iced Tea"}; //What is the purpose here?
    // this makes a string array named drinkNames for possible names of drinks in the vending machine

    //The constructor for a venMach is  below. This code is ran everytime a venMachine is created.
    public VenMac(){ //What happens whenever a vending machine object is created.
        stock = new ArrayList<Drink>();
    
        for(int i=0;i<(int)(Math.random()*4+1);i++){ //What is the possible range of values for i?  from 1-4 inclusive
            double randPrice = (Math.random()*4+1);
            double roundedPrice = (double)((int)(randPrice*100))/100; //What is this piece of code doing. this truncates everything to 2 decimal places
            int randIndex  = (int)(Math.random()*drinkNames.length); //What is the purpose of this section?  this picks a random index from drinkNames
            int ranQuant =(int)(Math.random()*3+1); //What is the purpose of this variable?    random quantiity of randIndex drinks in the vending machine
            for(int j=0;j<ranQuant;j++){
                stock.add(new Drink(drinkNames[randIndex],roundedPrice,true,true)); //What happens here?
                // this adds a random quanrity of the drink at randIndex to the vending machine
            }

        }
        
        listContents(); //What does this method do?
        // lists all drinks and their attributes in vending machine
    }


    public void listContents(){
        for(int i=0;i<stock.size();i++){
            System.out.println("|Item #: "+ i +"| Item name: "+ stock.get(i).getName()+ "| Price: "+stock.get(i).getPrice());
        }
    }

    //Part 4
    //this method should return a random drink from the arrayList for the user. and remove it from the vending machine. 
    //Challenge, prompt the user to input a price and  give them change  if they have enough, and reject them if theydont.
    public Drink getDrink(){
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        int randIndex = (int)(Math.random()*stock.size());
        Drink randDrink = stock.remove(randIndex);
        if(randDrink.getPrice()) {
                
        }
    }

    //twoFor1
        // generate a random index within the arrayList of drinks. then return a String that contains the name of a random drink and the one to the right of it in the array.
        // Make sure your method does not go out of bounds. It shouldd return a string for example: "You got Coke and Mountain Dew!"

        public String twoFor1(){
            return null;//Change this when you write your method.
        }

}