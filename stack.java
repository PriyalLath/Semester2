class StackException extends Exception
{
StackException( String message)
{
super(message);
}
}
 class ArrayStack 
   {
      public static int[] item;
      public static int stackTop;
    
      ArrayStack( )
      {
   	 item = new int[4];      // Make array
   	 stackTop = -1;
      }
    
       static void push( int x ) throws StackException
      {
   	 if ( stackTop == item.length-1 )
   	 {
   	    throw new StackException("Stack overflow");
   	 }
         stackTop++; // Advance one slot location
   	 item[stackTop] = x;         // Store x in next slot
   	                 
      }
    
      static void  pop ( ) throws StackException
      {
   	 int returnItem;
   
   	 if ( stackTop == -1)
   	 {
   	    throw new StackException("Stack underflow");
   	 }
    
   	 returnItem = item[stackTop--];
    
   	 System.out.println(returnItem);
      }
}
class Demo
{
   public static void main( String args[] )
   {
      ArrayStack s=new ArrayStack();

      try
      {
	for(int i=0;i<4;i++)
        s.push(i);
        for(int j=0;j<5;j++)
        s.pop();
        
      }
      catch ( StackException e )
      {
         System.out.println("Error detected: " + e.getMessage() );
      }
   }
}