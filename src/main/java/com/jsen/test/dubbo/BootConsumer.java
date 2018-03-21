package com.jsen.test.dubbo;

import com.jsen.test.dubbo.iface.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootConsumer {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/dubbo-consumer.xml"});

        context.start();

        HelloService helloService = (HelloService)context.getBean("demoService");
        int i = 0;
        while (true) {
            Thread.sleep(1000);
            System.out.println(helloService.hello("jsen" + ++i));
        }
    }
}
