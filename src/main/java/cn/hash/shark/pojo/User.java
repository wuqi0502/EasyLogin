package cn.hash.shark.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    private long id;

    private String username;

    private String password;

    private Integer del;


}
