import org.testng.annotations.Test;

public class StringBufferClass {
    StringBuffer sb = new StringBuffer();
@Test
    public void StringBufferIntroduce() {
    System.out.println(sb.append("2"));
    System.out.println(sb.insert(0, "0"));
    System.out.println(sb.delete(0, 1));
    System.out.println(sb.deleteCharAt(0));
    System.out.println(sb.reverse());
    System.out.println(sb.replace(0,1 , "11"));
    System.out.println(sb.toString());
    sb.setCharAt(0, '2');

}
}
