/** 
 * Creates an Array of 5 Animals which stores their location and speed
 * Then moves each animals and checks if any of them are touching each other
 * if the animals are touching, they fight. 
 * Then prints out total amount of Fights and rounds(each time they move).
 * 
 * @author Blezyl Santos
 * @version 1.7 (Jan 7 2019)
 */

import java.util.Arrays;
public class Assign1{
   public static void main(String args[])
   {
      Animal[] zoo = new Animal[5];
      int fight = 0, round = 0;
      
             
      zoo[0] = new Animal("dog", 2, 3, 3);  
      zoo[1] = new Animal("cat", 1, 0, 2);
      zoo[2] = new Animal("pig", -11, 12, 4);
      zoo[3] = new Animal("cow", -8, 6, 7);
      zoo[4] = new Animal("ape", 0, 0, 3);

      for (int i = 0; i<5;i++){
         System.out.println(zoo[i].toString()); 
      }
      System.out.println();
      while (fight < 5){
         for (int i=0; i<5 ; i++){
            zoo[i].move();
         }
         for (int i=0; i<5 ; i++){
            for (int j=i+1; j<5;j++){
               if (zoo[i].touching(zoo[j]) == true){
                  System.out.println("FIGHT");
                  System.out.println(zoo[i].getName() + " vs. " + zoo[j].getName());
                  fight++;
               }
            }
         } 
         for (int i = 0; i<5;i++){
            System.out.println(zoo[i].toString());
         }
         System.out.println("+-+-+-+-+-+-+-+-+-+-+-+");
         round++;
      }
      System.out.println("Fight: " + fight + "\nRounds: " +round);
      for (int i = 0; i<5;i++){
            System.out.println(zoo[i].toString());
      }
   }
 }
 