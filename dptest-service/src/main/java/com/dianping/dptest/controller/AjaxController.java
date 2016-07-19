package com.dianping.dptest.controller;

import com.dianping.dptest.model.AjaxResponseBody;
import com.dianping.dptest.model.PicPostData;
import com.dianping.piccenterremote.remote.UserPictureService;
import com.dianping.piccenterremote.remote.dto.PictureDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by lixia on 16/7/12.
 */
@Controller
public class AjaxController {

    @Autowired
    UserPictureService userPictureService;

    @ResponseBody
    @RequestMapping(value = "/ajax/api/getResult",method= RequestMethod.GET)
    public AjaxResponseBody getResultViaAjax() {

        AjaxResponseBody result = new AjaxResponseBody();
        //logic
        result.setCode("100");
        result.setMsg("success");
        List<String> res= Arrays.asList("sup1", "sup2", "sup3");

        result.setResult(res);
        return result;

    }



}

