package lokesh;
import java.util.Scanner;
import java.util.ArrayList;

public class Login{
    
    static ArrayList<String> fruit = new ArrayList<String>();
    static ArrayList<String> price = new ArrayList<String>();
    static ArrayList<Integer> load = new ArrayList<Integer>();
    static ArrayList<Integer> sold = new ArrayList<Integer>();
    static Scanner scn = new Scanner(System.in);
    
    int sale;
    int sale1;
    int sale2;
    int sale3;
    int sale4;
    int sale5;
    
    int money;
    
    int fruit1sold;
    int fruit2sold;
    int fruit3sold;
    int fruit4sold;
    int fruit5sold;
    
    int choose8;
    int choose9;
    
    static String username;
    static String password;
    static String choose2;
    static String choose3;
    
    public void totalmoneyMethod(){
        money = money + sale;
    }
    
    public void saleresetMethod(){
        sale1 = sale2 = sale3 = sale4 = sale5 = 0;
    }
    
    public void fruitMethod(){
        
         fruit.add("1.Apple");
         fruit.add("2.Mango");
         fruit.add("3.Orange");
         fruit.add("4.Banana");
         fruit.add("5.Grapes");
        
    }
    
    public void priceMethod(){
        
         price.add("$100 Rupees");
         price.add("$150 Rupees");
         price.add("$120 Rupees");
         price.add("$50 Rupees");
         price.add("$60 Rupees");
        
    }
    
    public void loadMethod(){
        
         load.add(0);
         load.add(0);
         load.add(0);
         load.add(0);
         load.add(0);
        
    }
    
    public void soldMethod(){
        
         sold.add(0);
         sold.add(0);
         sold.add(0);
         sold.add(0);
         sold.add(0);
        
    }
    
    public void adminMethod(){
        
          username = "admin";
          password = "admin";
          System.out.println("You choice is Owner.");
          System.out.println("\nEnter Username");
          choose2 = scn.next();
          System.out.println("\nEnter Password");
          choose3 = scn.next();
          
          if (choose2.equals(username)){
              if (choose3.equals(password)){
                  System.out.println("\nYou logged in as Owner.");
              }
              else {
                  System.out.println("Password is incorrect");
              }
          }
          else {
              System.out.println("Username is incorrect");
          }
    }
      
    public void quantityMethod(){
         
         System.out.println("\nChoose any one option.\n");
         System.out.println("1.Upload fruits quantity\n2.View total fruits sold\n3.View total earnings");
         int choose4 = scn.nextInt();
         if(choose4 == 1){
             
             System.out.println("\nHere you can increase the quantity of fruits.");
             while (true){
                 
                 System.out.println("\nDo you want to select fruit\n1.Yes or 2.No");
                 
                 int choose5 = scn.nextInt();
                 if (choose5 == 1){
                     
                     System.out.println("\nChoose which fruit you want to increase the quantity.");
                     for (int i=0;i<fruit.size();i++) {
                         System.out.println(fruit.get(i) + " - " + price.get(i));
                     }
                     int choose6 = scn.nextInt();
                     
                     if (choose6 == 1){
                         System.out.println("\nEnter Apple quantity\n");
                         int choose7 = scn.nextInt();
                         load.set(0,choose7);
                     }
                     else if (choose6 == 2){
                         System.out.println("\nEnter Mango quantity\n");
                         int choose7 = scn.nextInt();
                         load.set(1,choose7);
                     }
                     else if (choose6 == 3){
                         System.out.println("\nEnter Orange quantity\n");
                         int choose7 = scn.nextInt();
                         load.set(2,choose7);
                     }
                     else if (choose6 == 4){
                         System.out.println("\nEnter Banana quantity\n");
                         int choose7 = scn.nextInt();
                         load.set(3,choose7);
                     }
                     else if (choose6 == 5){
                         System.out.println("\nEnter Grapes quantity\n");
                         int choose7 = scn.nextInt();
                         load.set(4,choose7);
                     }
                     else {
                         System.out.println("\nSelect correct fruit\n");
                     }
                 }
                 else {
                     break;
                 }
                 
             }
             
             System.out.println("\nToday's load of fruits.\n");   
             for (int i = 0;i<fruit.size();i++){
                 System.out.println(fruit.get(i) + " - " + load.get(i));
             }
             System.out.println("--------------------\n");
             
         }
         else if (choose4 == 2){
          System.out.println("\nTotal sales of fruits.");   
          for (int i=0;i<fruit.size();i++) {
                System.out.println(fruit.get(i) + " - " + sold.get(i) + " kg");
            }
          System.out.println("--------------------\n");
          
         }
         else if (choose4 == 3){
             System.out.println("\nHere you can see the total money earned.");
             System.out.println("\nTotal money earned: " + "$" + money + " Rupees");
             System.out.println("--------------------\n");
         }
         else {
             System.out.println("\nChoose correct option.");
         }
    }
    
    public void customerMethod(){
        
        while (true){
            
            System.out.println("\nselect one Fruit");
            for (int i=0;i<fruit.size();i++) {
                System.out.println(fruit.get(i) + " - " + price.get(i));
            }
            
            choose8 = scn.nextInt();
            if (choose8 <= 5){
                System.out.println("\nYour Fruit is : " + fruit.get(choose8-1));
                System.out.println("How many fruits you want?");
                choose9 = scn.nextInt();
                int a = load.get(choose8-1);
                if (choose9 <= a){
                    load.set(choose8-1, a-choose9);
                    for (int i=0;i<fruit.size();i++) {
                        System.out.println(fruit.get(i) + " - " + load.get(i) + " kg available");
                    }
                }
                else {
                    System.out.println("Choose less fruits");
                }
            }
            
            if (choose8 == 1){
                //Apple
                 sale1 = (choose9*100);
                 fruit1sold = fruit1sold + choose9;
                 sold.set(choose8-1, fruit1sold);
            }
            else if (choose8 == 2){
                //Mango
                 sale2 = choose9*150;
                 fruit2sold = fruit2sold + choose9;
                 sold.set(choose8-1, fruit2sold);
            }
            else if (choose8 == 3){
                //Orange
                 sale3 = choose9*120;
                 fruit3sold = fruit3sold + choose9;
                 sold.set(choose8-1, fruit3sold);
            }
            else if (choose8 == 4){
                //Banana
                 sale4 = choose9*50;
                 fruit4sold = fruit4sold + choose9;
                 sold.set(choose8-1, fruit4sold);
            }
            else if (choose8 == 5){
                //Grapes
                 sale5 = choose9*60;
                 fruit5sold = fruit5sold + choose9;
                 sold.set(choose8-1, fruit5sold);
            }
            
            System.out.println("\nDo you want to continue shopping?\n1.Yes or 2.No");
            
            int choose10 = scn.nextInt();
            if (choose10 == 1){
                continue;
            }
            else {
                System.out.println("\nYout total amount is: ");
                sale = sale1+sale2+sale3+sale4+sale5;
                System.out.println(sale);
                while (true){
                    int choose11=scn.nextInt();
                    if (choose11 == sale){
                        System.out.println("\nThankyou for shopping have a great day\n");
                        break;
                    }
                    else {
                        System.out.println("\nPlease pay full amount.\n");
                    }
                }
                break;
            }
        }
    }
    
    public static void main(String args[]) {
      
      Login myObj = new Login();
      myObj.fruitMethod();
      myObj.priceMethod();
      myObj.loadMethod();
      myObj.soldMethod();
      
      while (true){
          
          System.out.println("\nWelcome to ABC fruits shop.\n");
          System.out.println("Are you 1.Owner or 2.Customer");
          
          int choose1 = scn.nextInt();
          if (choose1 == 1){
              myObj.adminMethod();
              if (choose2.equals(username)){
                  if (choose3.equals(password)){
                      myObj.quantityMethod();
                  }
              }
              else {
                  System.out.println("Username and Password incorrect");
              }
          }
          else if (choose1 == 2){
              System.out.println("You Logged in as Customer.");
              myObj.customerMethod();
              myObj.totalmoneyMethod();
              myObj.saleresetMethod();
          }
          else{
              System.out.println("Make correct choice.");
              break;
          }
      }
    }
}