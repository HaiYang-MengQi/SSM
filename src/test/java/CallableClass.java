import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class CallableClass implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        return "null";
    }
}
class Demo4{
    public static void main(String[] args) {
        CallableClass c1 = new CallableClass();
        FutureTask<Object> futureTask = new FutureTask<>(c1);
        Thread thread = new Thread(futureTask,"原神");
        thread.start();
        System.out.println(Thread.currentThread().getName()+"启动!");
        FutureTask<Object> futureTask1 = new FutureTask<>(c1);
        Thread thread1 = new Thread(futureTask1,"王者");
        thread1.start();
        System.out.println(Thread.currentThread().getName()+"启动!");
    }
}
