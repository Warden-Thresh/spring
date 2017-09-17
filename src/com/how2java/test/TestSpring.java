package com.how2java.test;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"});
        Category category = (Category) context.getBean("c");
        System.out.println(category.getName());
        Product product = (Product) context.getBean("p");
        System.out.println(product.getName());
        System.out.println(product.getCategory().getName());
    }
}
