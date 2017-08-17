/**算法2：一个数如果恰好等于他的因子之和，这个数就成为完数，例如 6=1+2=3 找出1000以内的完数
 * Created by loon on 2017/7/26.
 */
public class JavaStudy {
    public static void main(String[] args) {
        System.out.print("1到1000的所有完数有：");
        for (int i =1;i<=1000;i++){
            int m=0;
            for (int j=1;j<=i/2;j++){  //一个数的因子除了自己本身后最大的就是自己的一半
               if(i%j==0){
                   m=m+j;
               }
               
            }
            if (m==i){
                System.out.print(i+"\n");
            }
        }
    }
}
