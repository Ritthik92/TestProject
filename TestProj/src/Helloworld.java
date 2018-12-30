import java.lang.reflect.Method;

class A
{
	public void disp()
	{
		System.out.println("i am display");
	}
}
public class Helloworld {

public static void main(String[] args) 

{
	A a=new A();
	String s1= new String("Durga");
	String s2= new String("Durga");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	StringBuffer sb1=new StringBuffer("dura");
	StringBuffer sb2=new StringBuffer("dura");
	System.out.println(sb1==sb2);
	System.out.println(sb1.equals(sb2));
	Object o=a.getClass();
	System.out.println(o);
	Object ob=new String("ksg");
	Class c=ob.getClass();
	System.out.println(c.getName());
	Method[] m=c.getDeclaredMethods();
	
	int count=0;
	for(Method m1:m)
	{
		count++;
		System.out.println(m1.getName());
	}
	System.out.println(count);
	System.out.println("hello old");

	}

}
