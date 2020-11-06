package how2j;

public class HelloWorld {
	 
    public void method1(final int j) {
        //j = 5; //cannot be assigned
    }
    
    public static void main(String[] args) {
    	new HelloWorld().method1(4);
    	int i = 1;
    	boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
    	System.out.println(b);
    	System.out.println(i);
    }
}
