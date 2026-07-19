
// this is the implementation of shortest path in a 2D plane
//
 public class shortpath{

   public static float getpath(String path){

      int x=0,y=0;

      for(int i=0;i<path.length();i++){
         char dir=path.charAt(i); // get the direction
         // South 
         if(dir=='S'){
            y--;

         }
         // North
         else if(dir=='N'){
            y++;
         }
         // East
         else if(dir=='E'){
            x++;
         }
         // West
         else{
            x--;
         }

      }
      int x2=x*x; // x^2
      int y2=y*y; // y^2
      return  (float)Math.sqrt(x2+y2); // sqrt(x^2+y^2)

   }
    public static void main(String args[]){

      String path="WNEENESENNN";
      System.out.println(getpath(path));
    }
 }