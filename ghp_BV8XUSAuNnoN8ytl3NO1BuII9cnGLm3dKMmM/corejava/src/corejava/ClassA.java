package corejava;

public class ClassA 
{
   void meth1()
 {
	System.out.println("meth1()called"); 
	int x=7, y=3;
    boolean  equal=x==y;
    boolean greaterthan=x>y;
    boolean lessthan =x<y;
    boolean   notequal =x!=y;
    System.out.println("is equal:"+ equal);
    System.out.println("is greterthan:"+ greaterthan);
    System.out.println("is lessthan:"+ lessthan);
    System.out.println("is not equal:"+ notequal);
    }
   void meth2() 
   {
	System.out.println("meth2()called");
	boolean p=true, q=false;
	boolean logicaland=p&&q;
	boolean logicalor=p||q;
	boolean logicalnot=!p;
	boolean logicalnot1=!q;
	System.out.println("logical and:"+logicaland);
	System.out.println("logical or:"+logicalor);
	System.out.println("logical not p:"+logicalnot );
	System.out.println("logical not q:"+logicalnot1  );
  }
void meth3() 
{
  System.out.println("meth3()called"); 
 int a=10;	
 int b=5;	
          //assingnment operators
	int equalassignment=a;
    int additionassignment=a+b;
    int substractionassignment=a=b;
    int multipicationassignment=a*b;
    System.out.println(" equal assignment"+equalassignment);
  System.out.println("addition assignment"+additionassignment);
  System.out.println("substraction assignment"+substractionassignment);
  System.out.println("multipication assignment"+ multipicationassignment);
}
 void meth4() 
 {
  System.out.println("meth4() called");
	boolean a=true,b=false,c=true,d=false ;
	boolean flag1=(a&&b)&&(c||d);
	boolean flag2=(a&&b)&&(c||d);
	boolean flag3=!(a&&b)||!(c&&d);
	boolean flag4=(a&&b) ||(c&&d);
	boolean flag5=(a&&b)||(c&&d);
	System.out.println("flag1:"+flag1);
	System.out.println("flag2:"+flag2);
	System.out.println("flag3:"+flag3);
	System.out.println("flag4:"+flag4);
	System.out.println("flag5:"+flag5);
 }
public static void main(String[] args)
{        ClassA aobj=new ClassA();
              aobj.meth1();	
	          aobj.meth2();	
              aobj.meth3();	
              aobj.meth4();	
}
}
