import java.nio.charset.StandardCharsets;
import java.util.SplittableRandom;

public class Demo {

    private String str ="little tree";


    public static void main(String[] args) {
        System.out.println();
        String s1 = "maple";
        String s2 = "maple";
        String s3 = new String("maple");
        String s4 = "maple";
        String s5 = new String("maple");
        Integer a = 5;
        System.out.println(a.equals(s5));
        if(s1==s3){
            System.out.println("s1与s2相同");
        }else{
            System.out.println("s1与s2不同");
        }
int e = 5;

        System.out.println(s1.getBytes());
        System.out.println(s2.getBytes());
        System.out.println(s3.getBytes());
        System.out.println(s4.getBytes());
        System.out.println(s5.getBytes());
//        那么，由此我们看见了看似自相矛盾的一幕，equals方法判断 s3 与 s5 相同，可是if的布尔逻辑判断 s3 与 s5 不同，明明一样的数据连地址也是一样的，其实理由很简单：
//        equals（）是判断两个Object包装类的数据是否相等的函数，只是单单的看看两个数据的包装类型一不一样，包装类型一样的两个数据的值一不一样；
//        然而if判断中我用的是(s3==s5)，这表示s3和s5完全相同才能算对，也就是说不单单取决于两个数据是否相等，还取决于其他因素，这一点上我做出了许多的实验
//        我首先想到了内存空间，我把内存空间想象成一个多阶而带锁的抽屉柜，锁是打印（也就是输出）某一对象的值时而调用内存空间的调用地址，抽屉就是内存空间，钥匙无限
//        比如我举的 s3 和 s5 的例子，大家可以自己试试，一次只输出一个随机对象的地址，结束，发现地址都是一样的；再一次输出所有对象的地址，结束，之后调换顺序再输出地址，结束，
//        发现地址的顺序都不可被调换；这也说明了抽屉的“锁”都是一样的。
//        经过查阅资料，都说String数据中使用==比较的是内存地址，而我觉得也是如此，正如我刚刚实验的，在“两个=”两边的两个数据做比较时可以认为是同时被调用，此时，他们的地址分别是[B@119d7047，[B@776ec8df，不同，所以不相等。


    }





}
