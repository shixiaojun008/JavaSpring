package test;

import mapper.RoleMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import  entity.*;

public class TestSqlSessionTpt {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cfg.xml");

        //SqlSessionTemplate sqlSessionTemplate = ctx.getBean(SqlSessionTemplate.class);

        RoleMapper roleMapper = ctx.getBean(RoleMapper.class);

        Role role = new Role();
        role.setRoleName("role_name_sqlSessionTemplate");
        role.setNote("role_note_sqlSessionTemplate");

        roleMapper.insertRole(role);

        //sqlSessionTemplate.insert("mapper.RoleMapper.insertRole", role);

//        Long id = role.getId();
//
//        sqlSessionTemplate.selectOne("mapper.RoleMapper.getRole", id);
//
//        role.setNote("update_sqlSessionTemplate");
//        sqlSessionTemplate.update("mapper.RoleMapper.updateRole", role);
//
//        sqlSessionTemplate.delete("mapper.RoleMapper.getRole", id);



    }

}
