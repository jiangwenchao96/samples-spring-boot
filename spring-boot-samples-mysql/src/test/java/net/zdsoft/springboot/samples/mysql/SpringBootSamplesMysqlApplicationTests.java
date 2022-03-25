package net.zdsoft.springboot.samples.mysql;

import net.zdsoft.springboot.samples.mysql.entity.User;
import net.zdsoft.springboot.samples.mysql.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootSamplesMysqlApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void testSelect() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void testInsert() {
        User user = new User();
        user.setName("jwc");
        user.setAge(25);
        user.setEmail("testEmail");
        userMapper.insert(user);
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void testUpdate() {
        User user = new User();
        user.setId(6L);
        user.setName("update");
        user.setAge(99);
        user.setEmail("updateEmail");
        userMapper.updateById(user);
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    void testDelete() {
        User user = new User();
        user.setId(6L);
        userMapper.deleteById(user);
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

}
