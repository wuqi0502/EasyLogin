package cn.hash.shark.pojo;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * AJAX直接返回对象
 */
public class JsonResult implements Serializable {

    private static final long serialVersionUID = 6773748528663427028L;

    public static final String SUCCESS = "success";

    public static final String FAILURE = "failure";

    private String msg;

    private String status;

    private Object object;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", JsonResult.class.getSimpleName() + "[", "]")
                .add("msg='" + msg + "'")
                .add("status='" + status + "'")
                .add("object=" + object)
                .toString();
    }
}
