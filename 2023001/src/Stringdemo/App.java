package Stringdemo;

import javax.swing.*;
import java.util.Scanner;

public class App {



    public static void main(String[] args) {
    boolean flag = true;//开关
   StringBuffer stu = new StringBuffer();
    while(flag){
      Menu.meNu();
      Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    switch(a){
        case 1:
            System.out.println("请输入学生信息");
            String s = scanner.next();
            stu.append(addInforation(s));
            break;
        case 2:
            System.out.println("请输入要修改的信息");
            Scanner sc = new Scanner(System.in);
            updateInformation(stu, sc.next());

            break;
        case 3:
            System.out.println("请输入要删除的信息");
            delInformation(stu);
            break;
        default:
            System.out.println("输入错误");
    }
}
}
//    信息添加
    public static String addInforation(String info){
        String[] arr = info.split(",");//拆解信息
      Student student = new Student();
        student.setName(arr[0]);
        student.setGarde(arr[1]);
        student.setSchool(arr[2]);
        student.setAge(arr[3]);
        student.setSex(arr[4]);
        student.setPhoneNumber(arr[5]);

        System.out.println(student);
        return student.toString();
    }
//    信息修改
    public static int updateInformation(StringBuffer stringBuffer,String s){
        String str= stringBuffer.toString();
        String arr[] = str.split(",");
        int end = 0;
        end+=arr[0].length()+arr[1].length()+arr[2].length()+2;
        int start = end - 7;

        stringBuffer.delete(start,end-1);
        System.out.println(stringBuffer);
        stringBuffer.insert(start,s);
        System.out.println(stringBuffer);
        return 0;

    }
//    信息删除
    public static  int delInformation(StringBuffer stringBuffer){
            String str = stringBuffer.toString();

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        switch (a){
            case "名字":System.out.println(str.replace("李家豪"," "));break;
            case "年级":System.out.println(str.replace("大一"," "));break;
            case "学校":System.out.println(str.replace("北京大学"," "));break;
            case "年龄":System.out.println(str.replace("19"," "));break;
            case "性别":System.out.println(str.replace("男"," "));break;
            case "电话":System.out.println(str.replace("1253647537485"," "));
        }

        return 0;

    }
}
