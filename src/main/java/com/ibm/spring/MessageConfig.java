package com.ibm.spring;


import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class MessageConfig {

    @Bean

    public TestBean test()
    {
        return new TestBean();
    }
//UTF-8	A character in UTF8 can be from 1 to 4 bytes long. UTF-8 can represent any character in the Unicode standard. UTF-8 is
// backwards compatible with ASCII. UTF-8 is the preferred encoding for e-mail and web pages
//UTF-16	16-bit Unicode Transformation Format is a variable-length character encoding for Unicode, capable of encoding
// the entire Unicode repertoire. UTF-16 is used in major operating systems and environments, like Microsoft Windows, Java
// and .NET.

   // Default Character encoding in Java or charset is the character encoding used by JVM to convert bytes into Strings or
   // characters when you don't define java system property "file. encoding". Java gets character encoding by calling System.
  //      ... encoding","UTF-8") at the time of JVM start-up. So if Java doesn't
  //  get any file.

    @Bean

    public MessageSource messageSource()
    {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
