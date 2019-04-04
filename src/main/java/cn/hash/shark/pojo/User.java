package cn.hash.shark.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = 380892906048416127L;

    private Long id;

    private String username;

    private String password;

    private Integer del;


}
