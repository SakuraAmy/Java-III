import java.util.*;
import java.io.*;
import java.util.Map;

// Create a class HashMapsFromHell
public class HashMapsFromHell
{
   // Main method
   public static void main(String[] args)
   {   
      // Create some hashmap   
      Map<String, Object> firstMap = new HashMap<>();      
      Map<String, Object> secMap = new HashMap<>();      
      Map<String, Object> thirdMap = new HashMap<>();
      Map<String, Object> fourthMap = new HashMap<>();
      Map<String, Object> fourth2Map = new HashMap<>();
      Map<String, Object> fourth3Map = new HashMap<>();
      Map<String, Object> fourth4Map = new HashMap<>();
      Map<String, Object> fifthMap = new HashMap<>();
      Map<String, Object> sixthMap = new HashMap<>();
      
      sixthMap.put("O", null);    
      fifthMap.put("I", sixthMap); 
      
      fourth2Map.put("E", null);
      fourth2Map.put("T", null);
      fourth3Map.put("B", null);
      fourth3Map.put("D", fifthMap);
      fourth4Map.put("E", null);

      thirdMap.put("M", null);
      thirdMap.put("N", fourth2Map);
      thirdMap.put("R", fourth3Map);
      thirdMap.put("S", fourth4Map);
      
      secMap.put("A", thirdMap);
      firstMap.put("C", secMap);
      
      // Try and Catch statement
      try
      {
         Map<String, Object> current = firstMap;
         
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         String line = "";
         String adder = "";
         
         while(line.equalsIgnoreCase("quit") == false)
         {
            // Enter a letter 
            System.out.print("Please enter a letter: ");
            line = in.readLine().toUpperCase();
            
            // If it is empty, then continue
            if(line.equals(null) || line.equals(""))
            {
               continue;
            }
            // If it it quit, then break
            if(line.equals("quit"))
            {
               break;
            }
            else
            {
               if(current == null || !current.containsKey(line))
               {
                  System.out.println("Error, the letter is not available. Try again.");
                  continue;
               }
               else if(current.containsKey(line))
               {
                  current = (Map<String, Object>) current.get(line);
                  
                  ArrayList<String> getLine = new ArrayList<String>();
                  getLine.add(adder);
                  System.out.println("List of words");
                  
                  listofWord(current, getLine, line);
                  for(int i = 0; i < getLine.size(); i++)
                  {
                     System.out.println(getLine.get(i));
                  }
                  
                  adder += line;
                  System.out.println("\nUser types in the letter: " + adder);
                  
                  // If adder is a word
                  switch(adder)
                  {
                     case "CAM":
                        System.out.println( adder + " is a word!");
                        break;
                     case "CAN":
                        System.out.println(adder + " is a word!");
                        break;
                     case "CANE":
                        System.out.println(adder + " is a word!");
                        break;
                     case "CANT":
                        System.out.println(adder + " is a word!");
                        break;
                     case "CAR":
                        System.out.println(adder + " is a word!");
                        break;
                     case "CARB":
                        System.out.println(adder + " is a word!");
                        break;
                     case "CARD":
                        System.out.println(adder + " is a word!");
                        break;
                     case "CARDIO":
                        System.out.println(adder + " is a word!");
                        break;
                     case "CASE":
                        System.out.println(adder + " is a word!");
                        break;
                     default:
                        break;
                  }
               }
               else
               {
                  System.out.println("Error, the letter C is only available.");
               }
            }
         }
      }
      catch(Exception e)
      {
         e.printStackTrace();
      }
      
      // End of the program
      System.out.println("End program");
   }
   
   // Create a method listofWord with three parameters
   public static void listofWord(Map<String, Object> listofAllWord, ArrayList<String> line, String current)
   {
      if(listofAllWord == null)
      {
         line.add(current);
         return;
      }
      
      for(String word : listofAllWord.keySet())
      {
         listofWord((Map<String, Object>) listofAllWord.get(word), line, current + word);
      }
   }
}