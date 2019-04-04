package cn.hash.shark.controller;

import cn.hash.shark.pojo.JsonResult;
import cn.hash.shark.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "send", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult sendMessage(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String content = request.getParameter("content");
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", name);
        parameters.put("email", email);
        parameters.put("subject", subject);
        parameters.put("content", content);
        int result = this.messageService.insertMessage(parameters);
        JsonResult jr = new JsonResult();
        if (result > 0) {
            jr.setStatus(JsonResult.SUCCESS);
            jr.setMsg("发送成功！");
        } else {
            jr.setStatus(JsonResult.FAILURE);
            jr.setMsg("发送失败！");
        }
        return jr;
    }
}
