package com.ce.spring.sms.utility;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class GeneratedSequenceNumber {

    private static AtomicLong studentGenerator = new AtomicLong(1000L);
    private static AtomicLong courseGenerator = new AtomicLong(4000L);
    private static AtomicLong teacherGenerator = new AtomicLong(8000L);

    public static String getStudentSequenceNumber(){
        return "STU"+studentGenerator.getAndIncrement();
    }

    public static String getCourseSequenceNumber(String pre){
        return pre+courseGenerator.getAndIncrement();
    }

    public static String getTeacherSequenceNumber(){
        return "TEA"+teacherGenerator.getAndIncrement();
    }
}
