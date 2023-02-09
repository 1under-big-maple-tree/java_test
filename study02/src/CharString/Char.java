package CharString;

import java.util.ArrayList;
import java.util.List;

public class Char {
    public static void main(String[] args) {
        char a = '\b';
        System.out.println("lalla" + a + "\r" + a + "lalal" + '\'');
        char b = '5';
        //        判断是否为字母
        System.out.println(Character.isLetter(b));
        Character c = 'a';
        Character d = 'b';
        //        是否为字符
        System.out.println(Character.isLetter('k'));
        //        是否为空格或转移符
        System.out.println(Character.isWhitespace(' '));
        String str = "lijiahao01";
        char[] arr = str.toCharArray();
//        增强for循环
        for (char s:arr) {
//            System.out.println(s);
                if(Character.isLetter(s)){

                }else{
                    System.out.println("身份核验失败");
                    System.out.println(s);
                }
        }
//        System.out.println(str.toCharArray());    a=97,A=65,z=123
String f = "maple";
 String h = "maple0123";
        System.out.println(f.compareTo(h));
        String aa = new String("maple123");
        String bb = new String("maple123456");
        System.out.println(aa.compareTo(bb));
    }




}
//        \t  tab键
//        \r  回车
//        \b  删除
//        \n  换行
//        \'  加入单引号
//        \\  加入\
//        \"  加入“