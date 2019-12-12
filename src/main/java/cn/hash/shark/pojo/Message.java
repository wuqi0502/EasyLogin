package cn.hash.shark.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "message")
public class Message implements Serializable {

    private static final long serialVersionUID = -8217136403950237307L;

    private Long id;

    private String name;

    private String email;

    private String subject;

    private Integer status;
}
