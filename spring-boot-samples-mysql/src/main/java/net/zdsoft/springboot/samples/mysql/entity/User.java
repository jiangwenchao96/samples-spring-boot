package net.zdsoft.springboot.samples.mysql.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jwc
 * @date 2022/3/23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @TableId(type=IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
