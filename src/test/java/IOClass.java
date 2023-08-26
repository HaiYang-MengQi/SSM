import org.testng.annotations.Test;

import java.io.*;

public class IOClass {
    public IOClass() throws IOException {
    }

    //    public static void main(String[] args) throws IOException {
//        //字节流
//        //读
//        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\汪海洋\\Desktop\\AOP.txt");
//        int a = 0;
//        while ((a=fileInputStream.read()) != -1){
//            System.out.print(a);
//        }
//        fileInputStream.close();
//        //写
//        FileOutputStream out = new FileOutputStream("C:\\Users\\汪海洋\\Desktop\\test.txt");
//        String str = "hello world!";
//        out.write(str.getBytes());
//        out.close();
//    }
public static void main(String[] args) throws IOException {
    //字符流
    FileReader fileReader = new FileReader("C:\\Users\\汪海洋\\Desktop\\AOP.txt");
    int len = 0;
    while ((len = fileReader.read())!=-1){
        System.out.println((char)len);
        }
    fileReader.close();
    }
    FileWriter fileWriter = new FileWriter("C:\\Users\\汪海洋\\Desktop\\test.txt");
    //转换流
    //字节流转成字符流
    InputStreamReader in = new InputStreamReader(new FileInputStream("C:\\Users\\汪海洋\\Desktop\\AOP.txt"));
    //字符流转字节流
    OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("C:\\Users\\汪海洋\\Desktop\\AOP.txt"));
}
class Demo1{
    File file = new File("D:\\BaiDu");
    public void show() {
        String[] strings = file.list((dir,name) -> name.contains("a"));//文件过滤器
        System.out.println(strings);
    }

}
