package Number;

public class Demo01 {
    public static void main(String[] args) {
       float a = 1.125f;
       float b = 1.12f;
        float c = a- b;
        if(Math.abs(c)<0.2){
            System.out.println("计算有效");
            
        }else{
            System.out.println("无效");
        };
        System.out.println(a-(double)b);

    }
}
