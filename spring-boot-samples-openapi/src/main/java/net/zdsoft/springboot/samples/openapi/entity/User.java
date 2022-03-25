package net.zdsoft.springboot.samples.openapi.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jwc
 * @date 2022/3/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name="User", description = "用户")
public class User {
    @Schema(name="id", description = "id")
    private Long id;
    @Schema(name="name", description = "姓名")
    private String name;
    @Schema(name="age", description = "年龄")
    private Integer age;
    @Schema(name="email", description = "电子邮箱")
    private String email;
}
