package corejava;

public class Marks_students 
{
   void meth1(int marks) 
   {
	if(marks>85)   
	{
   System.out.println("you got grade A");
	}
   else if (marks>=60 && marks<80)
   {
	System.out.println("you b greade  B");   
   }
   else if(marks>=50 && marks<60) 
   {
	System.out.println("you are grade  C");   
   }
   else if(marks>=45 && marks<50) 
   {
	System.out.println("you are  D");   
   }
   else if (marks>=25  && marks<45) 
   {
	 System.out.println("you are E");  
   }
   
   else  
   {
	System.out.println("you are FAIL");   
  
   }
   }

public static void main(String[] args)
	{
	Marks_students sobj=new Marks_students();	
	   sobj.meth1(20);
	}
   
}
