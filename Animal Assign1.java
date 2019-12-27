import java.util.Random;
/**
 * An Animal Class that stores name, location(x and y coordinates), and Speed.
 * location is within -10 < x < 10 and -10 < y < 10
 * Speed is within 2 and 5
 *
 *@author Blezyl Santos
 *@version 1.7 (Jan 7 2019)
 */
public class Animal{
   private String name; //
   private int x;
   private int y;
   private int speed;
   /**
    * Constructor that initializes the name, location, and speed.
    * fills name as unknown, the location at the origin
    * and the speed as 2
    */
   public Animal(){
      name = "unknown";
      x = 0;
      y = 0;
      speed = 2;
   }
   /**
    * Constructor that initializes the name, location, and speed 
    * by the given parameters. If x or y coordinates
    * is out of bounds the location will be given a fix location
    * at 0 depends on which axis it has past. Speed also has a boundary 
    * between 2 and 5, if not within boundary it is given a speed of 5.
    *
    * @param name the name of the animal
    * @param a the x-coordinate of the animal
    * @param b the y-coordinate of the animal
    * @param speed the nax speed the animal can go
    */
    
   public Animal(String Name, int a, int b, int Speed){
      this.name = Name;
      if( a <= 10 && a >= -10){     // within x bounderies
         this.x = a;
      } else { this.x = 0; }        // if not within bounderies, will be set at 0
      
      if( b <= 10 && b >= -10){     // within y bounderies
         this.y = b;
      } else { this.y = 0; }        // if not within bounderies, will be set to 0
      
      if( Speed <= 5 && Speed >= 2){// speed has to be between 2 and 5
         this.speed = Speed;
      } else { speed = 5; }         // if not within 2 and 5, will be set to 5
   }
   /**
    * return an integer that is the x-coordinate of the Animal 
    *@return the x-coordinate 
    */
   public int getX(){
      return x;
   }
   /**
    * returns an integer that is the y-coordinate of the Animal 
    *@return the y-coordinate 
    */
   public int getY(){
      return y;
   }
   /**
    * returns a String that is the name of the Animal 
    *@returns the name of the animal
    */
   public String getName(){
      return name;
   }
   /**
    * Checks if the location of the Animal and the Animal a 
    * is at the same location (same x and y coordinates)
    * and it returns true if they are at the same location
    * 
    *@param a the Second animal to compare with the first animal
    *@return true if the Animals have the same location, else false 
    */
   public boolean touching(Animal a){
      if (this.x == a.x && this. y == a.y){
         return true;
      } else { return false; }
   }
   /**
    * @Override
    */
   public String toString(){
      return name + " is at ( " + x + " , " + y + " )" ;
   }
   /**
    * Moves the location of the Animal in one direction
    * either up, down, left, or right. It will move the Animal an 
    * x number of units between 1 and the max speed of the animal
    * if it goes out of bounds of the grid, it will go the opposite way
    * of the initially given direction.
    */
   public void move(){
      Random rand = new Random();
      int direction = rand.nextInt(4);
      int dist = rand.nextInt(speed) + 1;
      if(direction == 0){           //up
         y = y + dist;              //if goes over -10 or 10, goes down
         if( y <= 10 && y >= -10){
            this.y = y;
         } else { y = y - (2*dist) ; }
         
      } else if ( direction == 1 ){ //down
         y = y - dist;              //if goes over -10 or 10, goes up
         if( y<= 10 && y >= -10){
            this.y = y;
         } else { y = y + (2*dist) ; }

      } else if ( direction == 2 ){ //right
         x = x + dist;              //if goes over -10 or 10, goes left
         if( x <= 10 && x >= -10){
            this.x = x;
         } else { x = x - (2*dist); }

      } else if ( direction == 3 ){ //left
         x = x - dist;              //if goes over -10 or 10, goes right
         if( x <= 10 && x >= -10){
            this.x = x;
         } else { x = x + (2*dist); }
      }
   }
}