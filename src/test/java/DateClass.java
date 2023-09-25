import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class DateClass {
    @Test
    public void DateTest(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        Date date = new Date();
        System.out.println("Date类"+date.toString());
        Instant instant = Instant.now();
        System.out.println("时间戳"+instant.toString());
        LocalDate localDate = LocalDate.now();
        System.out.println("只显示日期"+localDate.toString());
        LocalTime localTime = LocalTime.now();
        System.out.println("只显示时间"+localTime.toString());
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("显示日期和时间"+localDateTime.toString());
        Duration duration = Duration.ofDays(1);
        System.out.println("持续时间/时间差"+duration.toString());
         System.out.println("标准时间/返回时间戳"+System.currentTimeMillis());
         SimpleDateFormat simpleDateFormat =   new SimpleDateFormat("yyyy-MM-dd '@' HH:mm:ss");
        System.out.println("格式化的时间"+simpleDateFormat.format(date));

    }
}
