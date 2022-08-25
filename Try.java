public class Try {
    
}
import java.io.*;
import java.util.*;

class Solution {
  
  static int bracketMatch(String text) {
    // your code goes here.
     //Use ArrayDeque 
    Deque<Character> check = new ArrayDeque<Character>();
    
    //for loop to Traversing
    for(int i = 0; i < text.length(); i++){
      char cout = text.chatAt(i);
      
      if(cout == "(" || cout == "[" || cout == "{"){
        stack.push(cout);
        continue;
      }
      
      if(stack.isEmpty())
        return false;
      char checking;
      switch (cout) {
        case ')':
          checking = stack.pop();
          if(checking == '(' || checking == '[')
            return false;
          break;
          
        case ']':
          checking = stack.pop();
          if(checking == '(' || checking == '[')
            return false;
          break;
          
        case '}':
          checking = stack.pop();
          if(checking == '(' || checking == '[')
            return false;
          break;
      }
    }
    
    //puting the element into the stack
    return(stack.isEmpty());
  }

  public static void main(String[] args) {
    //return 1
    String text = "(()";
    
    if(bracketMatch(text))
      System.out.println("Balanced");
    else{
      System.out.println("Not Balanced");
    }
  }

}
