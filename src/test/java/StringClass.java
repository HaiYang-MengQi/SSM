import com.alibaba.druid.support.json.JSONUtils;
import org.testng.annotations.Test;

public class StringClass {
    private static String str = "hello.js";
    @Test
    public void StringIntroduce(){
        System.out.println("返回指定角标字符的字符符号"+str.indexOf(0));
        System.out.println("返回指定字符在此字符串中首次出现的索引"+str.indexOf('h'));
        System.out.println("返回指定子字符串在此字符串中首次出现的索引"+str.indexOf("he"));
        System.out.println("返回指定字符在此字符串中最后一次出现的索引"+str.lastIndexOf('s'));
        System.out.println("返回子字符在字符串中最后一次出现的角标索引"+str.lastIndexOf("js"));
        System.out.println("字符串是否是以指定字符串开始"+str.startsWith("aaa"));
        System.out.println("字符串是否是以指定字符串结束"+str.endsWith("bbb"));
        System.out.println("字符串重复"+str.repeat(2));
        System.out.println("判断字符串是否为空"+str.isEmpty());
        System.out.println("字符串大写"+str.toUpperCase());
        System.out.println("字符串小写"+str.toLowerCase());
        System.out.println("字符串包含"+str.contains("js"));
        System.out.println("将此字符串转换为字符数组"+str.toCharArray());
        System.out.println("返回一个新的字符串"+str.replace("hello.js", "world.js"));
        System.out.println("********************");
        System.out.println(str);
        System.out.println("根据参数分割字符串"+str.split("-"));
    }


}
