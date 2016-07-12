package com.dianping.dptest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by lixia on 16/7/11.
 */
@Controller
public class BaseController {

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "Hello!");
        mv.addObject("title","DP-UGC");
        mv.addObject("user", "Dper");
        return mv;
    }

}