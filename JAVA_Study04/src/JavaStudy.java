import java.util.Scanner;

/**算法五:输入一个不大5位的正整数，
 * 1、求他是几位数 2、逆序打印出各位数字
 * Created by loon on 2017/7/26.
 */
public class JavaStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long nextLong = scanner.nextLong();
        String str = Long.toString(nextLong);
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.print(stringBuffer.reverse());
        
        char[] chars = str.toCharArray();
        System.out.print("你输入的是"+chars.length+"位数");
        for (int i=chars.length-1;i>=-0;i--){
            System.out.print(chars[i]);
        }
    }
  
}
