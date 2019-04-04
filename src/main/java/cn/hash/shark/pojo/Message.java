package cn.hash.shark.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Message implements Serializable {

    private static final long serialVersionUID = -8217136403950237307L;

    private Long id;

    private String name;

    private String email;

    private String subject;

    private Integer status;
}
