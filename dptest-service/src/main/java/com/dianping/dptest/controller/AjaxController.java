package com.dianping.dptest.controller;

import com.dianping.dptest.model.AjaxResponseBody;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by lixia on 16/7/12.
 */
@Controller
public class AjaxController {

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

    @ResponseBody
    @RequestMapping(value="/ajax/api/getPostData",method = RequestMethod.POST)
    public AjaxResponseBody getPostData(@RequestBody Map<String,String> body){

        AjaxResponseBody result = new AjaxResponseBody();
        //logic
        result.setCode("101");
        result.setMsg("success");
        List<String> res= Arrays.asList("sup1", "sup2", "sup3");

        result.setResult(res);
        return result;

    }

}

