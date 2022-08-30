public class DemoWrapper
{
    public static void main(String[] args) {

        //Primitive to object

        Integer number1=Integer.valueOf(10);
        Integer fromString=Integer.valueOf("55");
        Integer directlyFromPrimitive=20;

        //Object to Primitive
        //type      typeValue();
        //int       intValue();
        //double    doubleValue();

        int n1= number1.intValue();
        double d1=number1.doubleValue();

        Long l1=Long.valueOf(983743868756L);
        long longFromObject=l1.longValue();


        //autoboxing and auto-unboxing

        Integer i1=10;//autoboxing

        int num1=i1;//auto-unboxing

       // System.out.println(Integer.MAX_VALUE);
       // System.out.println(Integer.MIN_VALUE);
       // System.out.println(Double.MAX_VALUE);
       // System.out.println(Double.MIN_VALUE);

        Boolean b1=Boolean.valueOf(true);
        Boolean b2=Boolean.valueOf(false);

        Boolean b3=Boolean.valueOf("true");
        Boolean b4=Boolean.valueOf("False");
        Boolean b5=Boolean.valueOf("True");

        System.out.println("b5 = " + b5);
        System.out.println("b4 = " + b4);
        System.out.println("b3 = " + b3);

        Character c1=Character.valueOf('c');
        Character c2=Character.valueOf('V');
        char c3=c1;
        Character c4='m';






    }

}
