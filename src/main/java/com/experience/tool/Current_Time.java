package com.experience.tool;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.Date;

public class Current_Time {
   LocalDate current_time = LocalDate.now();
    @Test
    public void getDate(){
        System.out.println("this time is "+ current_time.toString());
        System.out.println();
    }
}
