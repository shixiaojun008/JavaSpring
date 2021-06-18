package entity;

import org.springframework.context.annotation.ComponentScan;

import service.RoleServiceImpl2;

@ComponentScan(basePackageClasses = {Role.class, RoleServiceImpl2.class})
public class AppConfig2 {

}
