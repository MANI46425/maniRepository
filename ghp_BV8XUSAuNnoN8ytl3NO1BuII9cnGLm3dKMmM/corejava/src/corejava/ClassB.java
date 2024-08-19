package corejava;

public class ClassB 
{
  int c=34;
   static int e=21;
   void classA()
 {
  System.out.println(++c);		
  System.out.println(++e);
 }
public static void main(String[] args) 
{
  int a=34;
  int b=21;
 new ClassB().c=a++ + ++b;
 int d=--a+--b+new ClassB().c--;	
 e=a + +b +new ClassB().c+d--;	
 int f=-a +b--+new ClassB().c-d++;	
 int sum= a+b+ new ClassB().c+d+e+f;	
 System.out.println("sum="+sum);
}	
}
