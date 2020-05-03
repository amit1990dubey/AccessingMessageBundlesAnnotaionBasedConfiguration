package com.ibm.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab41 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MessageConfig.class);
        TestBean tb = (TestBean)ctx.getBean("test");
        tb.showHindi();
        tb.showEnglish();
        System.out.println("done");

    }
}
