package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entity.Role;
import entity.PjConfig;

public class TestAnnotation {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(PjConfig.class);
        Role role = context.getBean(Role.class);

        System.out.println("ID is "+ role.getId());

    }

}
