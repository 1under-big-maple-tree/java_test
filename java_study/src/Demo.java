import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  System.out.println("请输入内容：");
        int a = sc.nextInt();

        if (a==1)
        {
            System.out.println("这是1");
        }else if (a ==2){
            System.out.println("这是2");
        }
        else if (a==3){
            System.out.println("这是3");
        }
        else{
            System.out.println("550s无法理解");
        }
    }


    public static Boolean createdata(int b)
    {
        System.out.println("正在判断");
        if (b==2){
            System.out.println("关闭");
            return false;


        }else{return true;}
    }












}
