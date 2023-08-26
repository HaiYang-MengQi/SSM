public class MathException extends Exception{//自定义异常类

    public MathException(){
        System.out.println("你的除数是0啦!");
    }
}
class Demo{
    public static int myDemo(int x, int y) throws MathException{
        if(y == 0)
        throw new MathException();
        else {
            return x / y;
        }
    }
    public static void main(String[] args){
        try {
            myDemo(1, 0);
        } catch (MathException e) {
        }
    }
}
