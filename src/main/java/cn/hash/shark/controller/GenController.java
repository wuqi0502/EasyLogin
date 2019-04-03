package cn.hash.shark.controller;

import cn.hash.shark.service.GenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 通用控制层
 */
@RestController
public class GenController {

    @Autowired
    private GenService genService;

    @GetMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/blog")
    public ModelAndView blog(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("blog");
        return mv;
    }
}
