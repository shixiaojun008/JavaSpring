package entity;

import org.springframework.context.annotation.ComponentScan;

import service.RoleServiceImpl;

@ComponentScan(basePackageClasses = {Role.class, RoleServiceImpl.class})
public class AppConfig {

}
