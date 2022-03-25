package net.zdsoft.springboot.samples.openapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import net.zdsoft.springboot.samples.openapi.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jwc
 * @date 2022/3/25
 */
@RestController
@RequestMapping("/api")
@Tag(name="ApiController", description = "api控制器")
public class ApiController {

    @GetMapping("/getUser")
    @Operation(summary = "查询用户", description = "获取用户")
    public User getUser() {
        User user = new User(1L,"jwc", 26, "testEmail");
        return user;
    }
}
