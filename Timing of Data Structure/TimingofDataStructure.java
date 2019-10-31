import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.concurrent.TimeUnit;

/**
   *Amina Mahmood
   *ISTE 222-01
   *Mr. Floeser
   *Data Structure Timing
*/

// Create a class Data Structure Timing
public class TimingofDataStructure
{
   // Instance variables
   static final int LIST_WORDS = 50000;
   static File file = new File("words_alpha.txt");
   static ArrayList<String> readingAllWords = new ArrayList<String>();
   static ArrayList<String> listOfWords = new ArrayList<String>();
   static HashMap<Long, String> loadingWords = new HashMap<>();
   static HashMap<Long, String> searchingWords = new HashMap<>();
   static String wd;
   //static long startTime;
   //static long endTime;
   //static long diff;
   static Random rand = new Random();
    
   // Main method throws Exception
   public static void main(String[] args) throws Exception
   {
      try
      {
         // Use a file from word.txt
         BufferedReader br = new BufferedReader(new FileReader(file));
         int num = 0;
         
         while((wd = br.readLine()) != null)
         {
            readingAllWords.add(wd);
         }
         
         // Use a power, floor, and square root for readingAllWords
         int math = (int)Math.pow(Math.floor(Math.sqrt(readingAllWords.size())), 2);
         
         while(readingAllWords.size() > math)
         {
            int randomOfWords = rand.nextInt(readingAllWords.size());
            readingAllWords.remove(randomOfWords);
         }
         
         //Output all for each of the data structure
         System.out.println("Result of 1D Array");
         oDArrayLoadWords();
         oDArraySearchWords();
         
         System.out.println("--------------------------");
         
         System.out.println("Result of ArrayList");
         arrayListLoadWords();
         arrayListSearchWords();
         
         System.out.println("--------------------------");
         
         System.out.println("Result of Vector");
         vectorLoadWords();
         vectorSearchWords();
         
         System.out.println("--------------------------");
         
         System.out.println("Result of LinkedList");
         linkedListLoadWords(); 
         linkedListSearchWords();
         
         System.out.println("--------------------------");
         
         System.out.println("Result of HashSet");
         hashSetLoadWords(); 
         hashSetSearchWords();
         
         System.out.println("--------------------------");
         
         System.out.println("Result of TreeSet");
         treeSetLoadWords(); 
         treeSetSearchWords();
         
         System.out.println("--------------------------");
         
         System.out.println("Result of 2D array");
         twDArrayLoadWords();
         twDArraySearchWords();
         
         System.out.println("--------------------------");
         
         System.out.println("Result of Stored Result");
         storedResult();
      }
      catch(IOException ioe)
      {
         System.out.println(ioe);
      }
   }
   
   // oDArrayLoadWords method
   static String[] array = new String[LIST_WORDS];
   public static void oDArrayLoadWords()
   {
      System.out.println("Loading:");
      long startTime = System.nanoTime();
      
      int x = 0; int y = 0;
      while(x < readingAllWords.size() && y < LIST_WORDS)
      {
         int randNum = rand.nextInt(25);
         
         if(randNum > 10 && randNum < 14)
         {
            array[y] = readingAllWords.get(x);
            y++;
         }
         x++;
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
      loadingWords.put(diff, "1DArray");
   }
   
   // oDArraySearchWords method for search word with one parameter
   public static void oDArraySearchWords()
   {
      System.out.println("\nSearching: ");
      
      String st =  "aaa"; 
      int findWords = Arrays.binarySearch(array, st);
      long startTime = System.nanoTime();   
         
      if(findWords >= 0)
      {
         System.out.println("Yes, it is found " + findWords);
      }
      else
      {
         System.out.println("Sorry, it not found " + findWords);
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
      searchingWords.put(diff, "1DArray");
   }
   
   // arrayListLoadWords method for loading words
   public static void arrayListLoadWords()
   {
      System.out.println("Loading: ");
      long startTime = System.nanoTime();
      
      int x = 0; int y = 0;
      while(x < readingAllWords.size() && y < LIST_WORDS)
      {
         int randNum = rand.nextInt(25);
         
         if(randNum > 10 && randNum < 14)
         {
            listOfWords.add(readingAllWords.get(y));
            y++;
         }
         x++;
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds");
      loadingWords.put(diff, "1DArray");
   }
   
   static ArrayList<String> words = new ArrayList<String>();
   // arrayListSearchWords method for search word with one parameter
   public static void arrayListSearchWords()
   {
      System.out.println("\nSearching: ");
      wd =  "aaa"; 
      long startTime = System.nanoTime();
         
      if(listOfWords.contains(wd))
      {
         System.out.println("Yes, it is found");
      }
      else
      {
         System.out.println("Sorry, it not found");
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
      searchingWords.put(diff, "1DArray");
   }
   
    static Vector vec = new Vector();
   // vectorLoadWords method for loading words
   public static void vectorLoadWords()
   {
      System.out.println("Loading: ");
      long startTime = System.nanoTime();
      
      int x = 0; int y = 0;
      while(x < readingAllWords.size() && y < LIST_WORDS)
      {
         int randNum = rand.nextInt(25);
         
         if(randNum > 10 && randNum < 14)
         {
            vec.add(readingAllWords.get(y));
            y++;
         }
         x++;
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
   }
   
   // vectorSearchWords method for seach words with one parameter
   public static void vectorSearchWords()
   {
      System.out.println("\nSearching: ");
      wd =  "aaa"; 
      long startTime = System.nanoTime();
         
      if(vec.contains(wd))
      {
         System.out.println("Yes, it is found");
      }
      else
      {
         System.out.println("Sorry, it not found");
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
   }
   
   // Create a node class for linkedListLoadWords
   private static class Node
   {
      Node next;
      String value;
    
      public Node()
      {
      
      }
   
      Node(String _value)
      {
         value = _value;
         next = null;
      }
   }
   
   // linkedListLoadWords method for loading words
   static  Node nodeA = new Node("");
   public static void linkedListLoadWords()
   {
      System.out.println("Loading: ");
      long startTime = System.nanoTime();
     
      Node currNode = nodeA;
      
      int x = 0; int y = 0;
      while(x < readingAllWords.size() && y < LIST_WORDS)
      {
         int randNum = rand.nextInt(25);
         
         if(randNum > 10 && randNum < 14)
         {
            nodeA = new Node(readingAllWords.get(x));
            currNode.next = nodeA;
            currNode = nodeA;
            y++;
         }
         x++;
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime; 
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
   }
   
   // LinkedListSearchWords method for search words with one parameter
   public static void linkedListSearchWords()
   {
      Node listOfWords = new Node();
      System.out.println("\nSearching: ");
      wd =  "love"; 
      long startTime = System.nanoTime();
       
      while(listOfWords != null)
      {   
         if(nodeA.value.equals(wd))
         {
            System.out.println("Valid, it is there");
            break;
         }
         listOfWords = listOfWords.next;
      }
      if(listOfWords == null)
      {
         System.out.println("Sorry, it not found");
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
   }
   
   static HashSet<String> set = new HashSet<String>();
   // hashSetLoadWords method for loading words
   public static void hashSetLoadWords()
   {
      System.out.println("Loading: ");
      long startTime = System.nanoTime();
      Set<String> wd = new HashSet<>();
      
      int x = 0; int y = 0;
      while(x < readingAllWords.size() && y < LIST_WORDS)
      {
         int randNum = rand.nextInt(20);
         
         if(randNum > 10 && randNum < 14)
         {
            set.add(readingAllWords.get(y));
            y++;
         }
         x++;
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
   }
   
   // hashSetSearchWords method for search words with one parameter
   public static void hashSetSearchWords()
   {
      System.out.println("\nSearching");
      wd =  "abandonedly"; 
      long startTime = System.nanoTime();
         
      if(set.contains(wd))
      {
         System.out.println("Found ");
      }
      else
      {
         System.out.println("Sorry, it not found");
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
   }
   
   static TreeSet<String> tree = new TreeSet<String>();
   // treeSetLoadWords method for loading word
   public static void treeSetLoadWords()
   {
      System.out.println("Loading: ");
      long startTime = System.nanoTime();
      TreeSet<String> wd = new TreeSet<String>();
      
      int x = 0; int y = 0;
      while(x < readingAllWords.size() && y < LIST_WORDS)
      {
         int randNum = rand.nextInt(25);
         
         if(randNum > 10 && randNum < 14)
         {
            tree.add(readingAllWords.get(y));
            y++;
         }
         x++;
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
   }
   
   // treeSetSearchWords method for search words with one parameter
   public static void treeSetSearchWords()
   {
      System.out.println("\nSearching: ");
      wd =  "banana"; 
      long startTime = System.nanoTime();
         
      if(tree.contains(wd))
      {
         System.out.println("Found ");
      }
      else
      {
         System.out.println("Sorry, it not found");
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
   }
   
   static String[][] twoDArr = new String[5000][10];
   // twDArrayLoadWords method for loading words
   public static void twDArrayLoadWords()
   {
      System.out.println("Loading: ");
      
      int x = 0; 
      int y = 0;
      int r = 0;
      int c = 0;
      
      //String[][] listWords = new String[5000][10];
      long startTime = System.nanoTime();
      
      while(x < readingAllWords.size() && y < LIST_WORDS)
      {
         int randNum = rand.nextInt(20);
         
         if(randNum > 10 && randNum < 14)
         {
            if(c == 10)
            {
               c = 0;
               r++;
            }
            twoDArr[r][c] = readingAllWords.get(x);
            y++;
            c++;
         }
         x++;
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
   }
   
   // twDArraySearchWords method for search words with one parameter
   public static void twDArraySearchWords()
   {
      System.out.println("\nSearching: ");
      wd =  "aardwolf"; 
      long startTime = System.nanoTime();
      
      int x = 0; 
      int r = 0;
      int c = 0;
      boolean find = false;
      
      while (r < 5000 && twoDArr[r][c] != null) 
      {
         x++;
         if(twoDArr[r][c].equals(wd))
         {
            find = true;
            System.out.println("Found");
            break;
         }
         c++; 
                
         if(c == 10){
            c = 0;
            r++;
         }
      }
         
      if(find == false)
      {
         System.out.println("Sorry, it not found");
      }
      
      long endTime = System.nanoTime();
      long diff = endTime - startTime;
      System.out.println(diff + " total of nanoseconds"); // total of nanosec
   }
   
      
      
   public static void storedResult()
   {
      Map<Long, String> maps = new TreeMap<Long, String>(loadingWords);
      Set set = maps.entrySet();
      Iterator iter = set.iterator();

      while(iter.hasNext())
      {   
         Map.Entry me = (Map.Entry)iter.next();
         System.out.println(me.getKey() + " : " + me.getValue());     
      }
   }
}