import java.util.Scanner;

/**算法：有n个整数，使其前面的各数顺序向后移动m个位置，最后m个数变成最前面的m个数
 * Created by loon on 2017/7/26.
 */
public class JavaStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入总长度N");
        int N = scanner.nextInt();
        int[] Nnum = new int[N];
        for (int i=0;i<N;i++){
            System.out.print("请输入第"+(i+1)+"个数字");
            Nnum[i] = scanner.nextInt();
        }
        System.out.print(Nnum);
        System.out.print("请输入您要调换位置的数量");
        int M = scanner.nextInt();
        int[] b = new int[M];
        int[] c = new int[N-M];
        for (int i=0;i<M;i++){  //这是前面要调换的数字
            b[i] = Nnum[i];
        }
        for (int i=M,j=0;i<N;i++,j++){
            c[j] = Nnum[i];  //这是后面不变的数字
        }
        /*数字替换*/
        for (int i=0;i<N-M;i++){
            Nnum[i] = c[i];   //这是以前后面的数字换到了前面
        }
        for (int i=M,j=0;i<N;i++,j++){
            Nnum[i] = b[j];   //这是转换后后面的数字
        }
        for (int i=0;i<Nnum.length;i++){
            System.out.print(Nnum[i]+"");
        }
    }
}
