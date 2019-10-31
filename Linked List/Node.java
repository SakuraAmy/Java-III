import java.sql.*;
import java.util.*;
/**
   *Amina Mahmood
   *ISTE 222.01
   *Mr. Floeser
   *Java III
*/
public class Node
{
   public Node next;
   public String value;
    
   public Node()
   {
   
   }
   
   Node(String _value)
   {
      value = _value;
      next = null;
   }
}