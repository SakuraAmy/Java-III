import java.util.*;
/**
   *Amina Mahmood
   *ISTE 222.01
   *Mr. Floeser
   *Java III
*/

// Create a class QueueStackDequeHW part 2 for Stack
public class QueueStackDequeHW_2
{
   public static void main(String[] args)
   {
      // Instance variables
      Stack s = new Stack();
      int total = 0;
         
      // Do 2-D array
      int[][] trans = {{100, 15, 0}, {20, 24, 0}, {110, 35, 0}, {150, 30, 1}, {50, 28, 0}, {70, 25, 1}};
      
      // FIFO method   
      for(int[] arrayS : trans)
      {
         if(arrayS[2] == 0)
         {
            s.push(arrayS);
         }
         else
         {
            // Instance variables
            int[] seller = arrayS;
            int[] currentNum = null;
            int quantity = seller[0];
            int remain = seller[0];
            ArrayList<int[]> remainHold = new ArrayList<int[]>();
            
            // try and catch statement
            try
            {    
               while((currentNum = (int[])s.pop()) != null)
               {  
                  // Check for comparsion 
                  if(remain >= currentNum[0])
                  {
                     quantity = currentNum[0];
                     remain = remain - currentNum[0];
                  }
                  else if(remain == 0) // Check if remain is equals to 0
                  {
                     break;
                  }
                  else
                  {
                     quantity = remain;
                     
                     // Add the remain    
                     int subtract = currentNum[0] - remain;
                     int[] hold = new int[] {subtract, currentNum[1], currentNum[2]};
                     remainHold.add(hold);
                     remain = 0;
                  }
                  
                  // Difference
                  int difference = seller[1] - currentNum[1];
                  total += (quantity * difference);
               }
            
            }
            catch(EmptyStackException ese)
            {
            
            }
            // Any remain then go back to stack
            for(int[] array2 : remainHold)
            {
               s.push(array2);
            }
         }
      }
      // Print out for result
      if(total >= 0)
      {
         System.out.println("The Captical Gain: $" + total);
      }
      else
      {
         System.out.println("The Captical Lose: $" + total);
      }              
   }
}