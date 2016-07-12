package com.dianping.dptest.model;

import com.dianping.dptest.jsonview.Views;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

/**
 * Created by lixia on 16/7/12.
 */
public class AjaxResponseBody {

    @JsonView(Views.Public.class)
    String msg;

    @JsonView(Views.Public.class)
    String code;

    @JsonView(Views.Public.class)
    List<String> result;

    //getters and setters

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getResult() {
        return result;
    }

    public void setResult(List<String> result) {
        this.result = result;
    }
}
