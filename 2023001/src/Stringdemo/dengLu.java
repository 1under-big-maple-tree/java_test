package Stringdemo;

public class dengLu {

    public static void isMail(String mail)
    {
        char[] arr = mail.toCharArray();
        boolean isCheck=false;
        for (char s : arr){
            if (s=='@'){
                System.out.println("合法");
                isCheck = true;
            }
        }
        if (!isCheck){
            System.out.println("不合法");
        }
    }
    public static void main(String[] args) {
        String mail = "1069bushi861462114514@qq.com";
        isMail(mail);
    }


    }
