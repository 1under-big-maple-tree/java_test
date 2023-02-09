package Stringdemo;

import javax.swing.*;
import java.util.Scanner;

public class app {


    //    public  static void main
public static void main(String[] args) {
boolean flag = true;
while(flag){
    Menu.meNu();
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    switch(a){
        case 1:
            System.out.println("请输入学生信息");
            String s = scanner.next();
            addInforation(s);
            break;
        case 2:
            updateInformation();
            break;
        case 3:
            delInformation();
            break;
        default:
            System.out.println("wrong");
    }
}
}
//    信息添加
    public static int addInforation(String info){
        String[] arr = info.split(";");
        Student student = new Student("lijiahao","1","清华大学","19","男","18291825986");
        student.setName(arr[0]);
        student.setGarde(arr[1]);
        student.setSchool(arr[2]);
         student.setAge(arr[3]);
         student.setSex(arr[4]);
         student.setPhoneNumber(arr[5]);
        return 0;
    }
//    信息修改
    public static int updateInformation(){

        return 0;

    }
//    信息删除
    public static  int delInformation(){

        return 0;

    }
}
