package Number;

import java.awt.print.PrinterGraphics;

public class Demo01 {
    public static void main(String[] args) {
       float a = 1.125f;
       float b = 1.212f;
        double c = a- b;
       Integer d = 6;
        System.out.println(d.compareTo(509986768));
        System.out.println(d.equals(900));
        Demo01 demo01 = new Demo01();
        System.out.println(d.equals(demo01));
        Integer l = Integer.valueOf("121",5);
        System.out.println(c = Double.parseDouble("121"));
        System.out.println(c = Integer.parseInt("121",10));
        System.out.println(l);
        System.out.println( Math.abs(l));

//      System.out.println(Double.valueOf());
//compareTo可以比较大小
//equals可以判断是否与该数字相等
        if(Math.abs(c)<0.2){
            System.out.println("计算有效");
            return;
        }else{
            System.out.println("无效");
        };
        System.out.println(Math.round(b));
//floor取小的
//round四舍五入(给该数字加上0.5后再对其使用floor)
//ceil取大的
        Student student = new Student("lijiahao","19");
        System.out.println(student.toString());
        int intBits = (int)a;
        System.out.println(intBits);


    }
}
