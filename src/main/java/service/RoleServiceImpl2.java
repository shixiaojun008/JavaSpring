package service;

import entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl2 implements RoleService2{

    @Autowired
    private Role role = null;

    @Autowired
    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public void printRoleInfo() {
        System.out.println("ID = " + role.getId() + "\t roleName =" + role.getRoleName() + "\t roleNote =" + role.getNote());
    }
}
