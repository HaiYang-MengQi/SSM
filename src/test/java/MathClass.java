public class MathClass {
    private static final int data = -9;
    public static void main(String[] args) {
        System.out.println("Π\t"+Math.PI);
        System.out.println("绝对值"+Math.abs(data));
        System.out.println("sin"+Math.sin(data));
        System.out.println("cos"+Math.cos(data));
        System.out.println("tan"+Math.tan(data));
        System.out.println("平方根"+Math.abs(Math.sqrt(data)));
        System.out.println("立方根"+Math.cbrt(data));
        System.out.println("乘方"+Math.pow(data, 2));
        System.out.println("小于data的最大整数"+Math.floor(data));
        System.out.println("大于data的最小整数"+Math.ceil(data));
        System.out.println("对小数进行四舍五入"+Math.round(data));
        System.out.println("最大值"+Math.max(data, 123));
        System.out.println("最小值"+Math.min(data, 0));
        System.out.println("大于等于0.0小于1.0的随机值"+Math.random());
    }
}
