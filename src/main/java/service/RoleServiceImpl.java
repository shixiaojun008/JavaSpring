package service;

import entity.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImpl implements RoleService{

    @Override
    public void printRoleInfo(Role role) {
        System.out.println("ID = " + role.getId() + "\t roleName =" + role.getRoleName() + "\t roleNote =" + role.getNote());
    }
}
