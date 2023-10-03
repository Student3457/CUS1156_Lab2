

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)    {
		 
	   
	    	  List<Boolean> list1=new ArrayList<Boolean>(Arrays.asList(new Boolean[10]));
	    	  Collections.fill(list1, Boolean.TRUE);
	    	  
	    	  boolean[] array = new boolean[list.size()];
	          int j = 0;
	          int i = 0;
	          int count = 0;
	          for (i = 0; i < array.length; i++) {
	              if (array[i]) {
	                  count++;
	                  for (j = i + 1; j < array.length; j++) {
	                      if (array.length[i] == array.length[j]) {
	                          array[j] = true;
	                          count--;
	                      }
	                  }
	              }
	          }
	          return count;
	      }
	    	  
		
   
   


public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
	
	
	 
      System.out.println(words + " has " + unique + " unique words");
   }
}
