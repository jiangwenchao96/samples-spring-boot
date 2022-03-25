package net.zdsoft.springboot.samples.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import net.zdsoft.springboot.samples.mybatisplus.entity.User;
import net.zdsoft.springboot.samples.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringBootSamplesMybatisPlusApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assertions.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    /**
     * 测试 QueryWrapper
     */
    @Test
    public void testSelect1() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("id", 1);
        List<User> userList = userMapper.selectList(wrapper);
        Assertions.assertEquals(1, userList.size());
        userList.forEach(System.out::println);
    }

    /**
     * 测试  UpdateWrapper
     */
    @Test
    public void testSelect2() {
        UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("id",2);
        wrapper.set("name", "jwc");
        userMapper.update(null,wrapper);
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
    }

    /**
     * 测试  Lambda
     */
    @Test
    public void testSelect3() {
        LambdaQueryWrapper<User> wrapper = new QueryWrapper<User>().lambda();
        wrapper.eq(User::getId, 2);
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
    }

}
