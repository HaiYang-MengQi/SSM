import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 对集合和数组进行聚合操作
 */
public class StreamClass {
    //数组创建流的三种方式
    Integer[] data = {1, 2, 3, 4, 5};
    //将数组转化为list集合
    List<Integer> list = Arrays.asList(data);
    //紧接着使用集合创建Stream对象
    Stream<Integer> stream = list.stream();
    //    2.使用Stream接口的of静态方法
    Stream<Integer> stream2 = Stream.of(data);
    //    3.使用Arrays数组的工具类的stream的静态方法创建stream流对象
    Stream<Integer> stream3 = Arrays.stream(data);

    public static void main(String[] args) {
        Integer[] data = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(data);
        Stream<Integer> stream = list.stream();
        stream.forEach(obj -> System.out.println(obj));
        //TODO 不懂下面的这一行
        System.out.println(list.stream().limit(2));
        //聚合操作
        list.stream().filter(i -> i < 2).forEach(n -> System.out.println(n));
        System.out.println("*******************");
        ParallelStream parallelStream = new ParallelStream();
        parallelStream.demo();
    }

     static class ParallelStream {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc");
        Stream<String> parallelStream1 = list.parallelStream();
//        创建串行流
        Stream<String> stream = Stream.of("zzz","xxx","ccc");
        Stream<String> parallelStream2 = stream.parallel();
         void demo() {
            System.out.println(this.parallelStream1.isParallel());
            System.out.println(this.parallelStream2.isParallel());
        }
    }

}
