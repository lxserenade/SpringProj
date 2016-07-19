package com.dianping.dptest.controller;

import com.dianping.dptest.model.AjaxResponseBody;
import com.dianping.dptest.model.PicPostData;
import com.dianping.piccenterremote.remote.dto.PictureDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.dianping.piccenterremote.remote.UserPictureService;

/**
 * Created by lixia on 16/7/11.
 */
@Controller
public class BaseController {

    @Autowired
    UserPictureService userPictureService;


    @RequestMapping(value = "/postTest", method = RequestMethod.GET)
    public ModelAndView postTest() {
        ModelAndView mv = new ModelAndView("postTest");
        mv.addObject("msg", "Hello!");
        mv.addObject("title","DP-UGC");
        mv.addObject("user", "Dper");

        mv.addObject("PicPostData", new PicPostData());
        return mv;
    }

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("msg", "Hello!");
        mv.addObject("title","DP-UGC");
        mv.addObject("user", "Dper");
        return mv;
    }

    @RequestMapping(value="pic",params={"picid"},method=RequestMethod.GET)
    public ModelAndView picShow(@RequestParam(value = "picid") int picid){
        PictureDTO pic = userPictureService.loadPicture(picid);

        ModelAndView mv= new ModelAndView("picShow");

        mv.addObject("msg", "Hello!");
        mv.addObject("title","DP-UGC");
        mv.addObject("user", "Dper");
        mv.addObject("picurl","http://i2.s2.dpfile.com"+pic.getBigPicture());

        return mv;
    }

    @RequestMapping(value="/getPostData",method = RequestMethod.POST)
    public ModelAndView getPostData(@ModelAttribute("PicPostData") PicPostData picPostData){

        int picid=picPostData.getPicId();
        PictureDTO pic = userPictureService.loadPicture(picid);

        ModelAndView mv= new ModelAndView("picShow");

        mv.addObject("msg", "Hello!");
        mv.addObject("title","DP-UGC");
        mv.addObject("user", "Dper");
        mv.addObject("picurl","http://i2.s2.dpfile.com"+pic.getBigPicture());

        return mv;

    }

}