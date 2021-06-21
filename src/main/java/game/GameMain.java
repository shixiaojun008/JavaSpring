package game;

import service.RoleService;
import service.RoleServiceImpl;

import entity.*;

public class GameMain {

    public static void main(String[] args) {

        RoleService roleService = new RoleServiceImpl();
        Interceptor interceptor = new RoleInterceptor();

        RoleService proxy = ProxyBeanFactory.getBean(roleService, interceptor);

        System.out.println("**********************测试 afterReturning 方法开始 ******************");
        Role role = new Role(11L, "role_name_11", "role_note_11");
        proxy.printRoleInfo(role);
        System.out.println("**********************测试 afterReturning 方法结束 ******************");


        System.out.println("**********************测试 afterThrowing 方法开始 ******************");
        role = null;
        proxy.printRoleInfo(role);
        System.out.println("**********************测试 afterThrowing 方法结束 ******************");

    }
}
