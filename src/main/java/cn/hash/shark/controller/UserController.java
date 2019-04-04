package cn.hash.shark.controller;

import cn.hash.shark.pojo.JsonResult;
import cn.hash.shark.pojo.User;
import cn.hash.shark.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 跳转至用户登录页
     * @return
     */
    @GetMapping(value = "toLogin")
    public ModelAndView toLogin(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    /**
     * 跳转至用户注册页
     * @return
     */
    @GetMapping(value = "toRegister")
    public ModelAndView toRegister(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register");
        return mv;
    }

    /**
     * 用户名重复性校验
     * @param request
     * @param response
     * @return
     */
    @PostMapping(value = "checkUserName")
    @ResponseBody
    public JsonResult checkUserName(HttpServletRequest request, HttpServletResponse response){
        User user = this.userService.queryUserByUserName(request.getParameter("username"));
        JsonResult jr = new JsonResult();
        if (Optional.ofNullable(user).isPresent()) {
            jr.setStatus(JsonResult.FAILURE);
            jr.setMsg("用户名已存在，请重新输入！");
        } else {
            jr.setStatus(JsonResult.SUCCESS);
            jr.setMsg("用户名不存在，可以注册！");
        }
        return jr;
    }

    /**
     * 用户登录
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult login(HttpServletRequest request, HttpServletResponse response){
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("username", request.getParameter("username"));
        parameters.put("password", request.getParameter("password"));
        User user = this.userService.getUser(parameters);
        JsonResult jr = new JsonResult();
        if (Optional.ofNullable(user).isPresent()) {
            logger.debug("success");
            jr.setStatus(JsonResult.SUCCESS);
            jr.setMsg("登录成功！");
            jr.setObject(user);
        } else {
            logger.debug("failure");
            jr.setStatus(JsonResult.FAILURE);
            jr.setMsg("登录失败！用户名或密码错误！");
            jr.setObject(null);
        }
        return jr;
    }

    /**
     * 用户注册
     * @param request
     * @param response
     * @return
     */
    @PostMapping(value = "register")
    @ResponseBody
    public JsonResult register(HttpServletRequest request, HttpServletResponse response){
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("username", request.getParameter("username"));
        parameters.put("password", request.getParameter("password"));
        int result = this.userService.insertUser(parameters);
        JsonResult jr = new JsonResult();
        if (result > 0) {
            jr.setStatus(JsonResult.SUCCESS);
            jr.setMsg("注册成功！");
        } else {
            jr.setStatus(JsonResult.FAILURE);
            jr.setMsg("注册失败！");
        }
        return jr;
    }
}
