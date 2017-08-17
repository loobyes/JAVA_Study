/**算法3：一球从100米的高度自由落下，每次落地后反跳回原高度的一半
 * ；再落下，那么它第十次落地时，共经过了多少米。第十次反弹多高。
 * Created by loon on 2017/7/26.
 */
public class JavaStudy {
    static double hightMeters = 100;
    static double totalMeters = 100;
    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            totalMeters =totalMeters + hightMeters;
            
            hightMeters = hightMeters/2;
        }
        System.out.print("一共经过了"+totalMeters+"米");
        System.out.print("高度"+hightMeters+"米");
        
        
    }
}
