import java.util.*;

public class Main {
    public static void main(String[] args)

    {
        calculator cal = new calculator();
        cal.addvalue(20, 23);

        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.multiply());
        System.out.println(cal.division());


    }
}