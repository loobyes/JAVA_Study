package javaStudy;

import java.util.Scanner;

/**
 * 算法1：输入一行字符，统计处中间的空格，字母，数字以及其他的字符的个数
 * Created by loon on 2017/7/26.
 */
public class JavaStudy {
    static int digital = 0;
    static int character = 0;
    static int other = 0;
    static int blank = 0;
    
    public static void main(String[] args) {
        char[] chars =null;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        chars = s.toCharArray();
        for (int i =0;i<chars.length;i++){
            if (chars[i]>='0'&&chars[i]<='9'){
                digital++;
            }else if ((chars[i] >='a'&&chars[i]<='z')||(chars[i]>='A'&&chars[i]<='Z')){
                character++;
            }else if (chars[i]==' '){
                blank++;
            }else{
                other++;
            }
        }
        System.out.print("数字个数"+digital);
        System.out.print("英文字母个数"+character);
        System.out.print("空格个数"+blank);
        System.out.print("其他字符个数"+other);
    }
}
