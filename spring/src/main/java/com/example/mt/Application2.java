package com.example.mt;

import com.example.mt.pojo.Customer;
import com.example.mt.pojo.Student;
import com.example.mt.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author chenhongxiang
 * @Date 2021/5/7 14:06
 * @Version 1.0
 */
public class Application2 {

    public static void main(String[] args) {
        //所有bean都已经被spring实例化创建，默认只有一个实例
        ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        System.out.println("对象已经创建好");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

}
