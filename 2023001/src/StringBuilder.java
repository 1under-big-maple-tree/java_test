public class StringBuilder {
    public static void main(String[] args) {
        String res = new String("sss");
        StringBuilder builder = new StringBuilder();
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }
}
