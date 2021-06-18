package test;

import entity.AppConfig;
import entity.PjConfig;
import entity.Role;
import service.RoleService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationObj {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);

        Role role = context.getBean(Role.class);

        RoleService roleService = context.getBean(RoleService.class);

        roleService.printRoleInfo(role);

        context.close();

    }
}
