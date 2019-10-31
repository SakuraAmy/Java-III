import java.sql.*;
import java.util.*;
/**
   *Amina Mahmood
   *ISTE 222.01
   *Mr. Floeser
   *Java III
*/
// Create a class LList
public class LList
{
   // Instance variables
   static Node headA, headB, headC, headD;
   public static void main(String[] args)
   {
      LList list = new LList();  
      // Create nodes for all words   
      Node secA, thiA, secB, thiB, fouthB, fifthB, sixthB, secC, thiC, secD, thiD, fourthD;
      String intersect = "";
      
      // HeadA
      list.headA = new Node("E");
      secA = new Node("N");
      thiA = new Node("D");
      
      list.headA.next = secA;
      secA.next = thiA;
      
      // HeadB
      list.headB = new Node("E");
      secB = new Node("F");
      thiB = new Node("F");
      fouthB = new Node("O");
      fifthB = new Node("R");
      sixthB = new Node("T");
      
      list.headB.next = secB;
      secB.next = thiB;
      thiB.next = fouthB;
      fouthB.next = fifthB;
      fifthB.next = sixthB;
      
      // HeadC
      list.headC = new Node("H");
      secC = new Node("E");
      thiC = new Node("A");
      
      list.headC.next = secC;
      secC.next = thiC;
      
      // This is for CH
//       list.headC = new Node("C");
//       secC = new Node("H");
//       list.headC.next = secC;
      
      // HeadD
      list.headD = new Node("L");
      secD = new Node("E");
      thiD = new Node("S");
      fourthD = new Node("S");
      
      list.headD.next = secD;
      secD.next = thiD;
      thiD.next = fourthD;
      
      thiA.next = list.headD;
      sixthB.next = list.headD;
      thiC.next = fouthB;
      //secC.next = secD; This is for CH
      
      Node nodeFirst = headA;
      Node nodeSecound = headB;
      Node nodeThird = headC;
      
      // Use three whiles to find the intersection
      while(headB != null)
      {
         while(headA != null)
         {
            while(headC != null)
            {
               if(headA == headB && headC == headB)
               {
                  intersect += headA.value;
               }
               headC = headC.next;
            }
            headC = nodeThird;
            headA = headA.next;
         }
         headA = nodeFirst;
         headB = headB.next;
      }
      
      if(intersect.equals(""))
      {
         intersect = "Lists do not intersect";
      }
      else
      {
         intersect = "Lists intersect \nInterection segment: " + intersect;
      }
      System.out.println(intersect);
   }
}