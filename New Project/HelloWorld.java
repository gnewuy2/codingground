public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        int value1 = 5;
        int value2=8;
        if (value1==value2)
            System.out.println("Equality");
        else
            System.out.println("what's wrong?");
        System.out.println(Integer.toString(value1-value2));
        if (value1==(value1-value2>0? value2:value1))
            System.out.println(Integer.toString(value1));
            
        int result;
        result = (value1-value2>0? value1:value2);
        System.out.println(result); // can print string and number both
     }
}

