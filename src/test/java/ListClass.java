import java.util.*;

public class ListClass {
    //单列集合根接口
    Collection collection = new ArrayList();
    Collection collection2 = new LinkedList();
    //List接口继承自Collection接口
    List list0 = new ArrayList();//元素有序,可重复,查找效率高
    List list1 = new LinkedList();//元素有序,可重复,增删效率高
    HashSet hashset = new HashSet();//元素无序,不可重复
    TreeSet treeSet = new TreeSet();//元素无序,不可重复
    Map<Integer,String> map = new HashMap();//双列集合
    Map<Integer,String> map1 = new TreeMap<>();//双列集合
    //Iterator遍历
    public static void main(String[] args) {
        List<String> list2 = new ArrayList();
        list2.add("hello");
        list2.add("world");
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
class Data<T>{//泛型
    T a;
    T b;

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }



}
