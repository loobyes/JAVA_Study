import java.lang.reflect.Field;

/**
 * Created by loon on 2017/8/16.
 */
public class JavaStudy {
    
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    
        String a = "chenssy";
        String b = "chenssy";
        String c = new String("chenssy");
        System.out.println("--------------修改前值-------------------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        //修改String的值
        Field a_ = String.class.getDeclaredField("value");
        a_.setAccessible(true);
        char[] value=(char[])a_.get(a);
        value[4]='_';   //修改a所指向的值
    
        System.out.println("--------------修改后值-------------------");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("chenssy");
        System.out.println("c = " + c);
    }
}
