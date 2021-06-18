package test;

import entity.AppConfig2;
import entity.Role;
import service.RoleService2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationObj2 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig2.class);

        RoleService2 roleService = context.getBean(RoleService2.class);

        roleService.printRoleInfo();

        context.close();

    }
}
