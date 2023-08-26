import org.testng.annotations.Test;

@FunctionalInterface
public interface LambadClass {
     void show();
}
class LambdaClass{
     public void method(LambadClass lambadClass){
          lambadClass.show();
     }

     public static void main(String[] args) throws Exception {
          LambdaClass lambdaClass = new LambdaClass();
          //lambda表达式方法
          lambdaClass.method(() -> System.out.println("hello world!"));
          //构造器方法

     }
}
