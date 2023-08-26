class RunnableClass implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行!");
    }
}
class Demo3{


    public static void main(String[] args) {
        RunnableClass runnableClass= new RunnableClass();
        //使用Thread的构造方法创建对象
        Thread thread = new Thread(runnableClass,"thread666");
        thread.start();
    }
}
