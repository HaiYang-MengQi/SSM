class ThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行!");
    }
}
class Demo2{
    public static void main(String[] args) {
        ThreadClass thread = new ThreadClass();
        thread.start();
        ThreadClass thread2 = new ThreadClass();
        thread2.start();
    }
}

