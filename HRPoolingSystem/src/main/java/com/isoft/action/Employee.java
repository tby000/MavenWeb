package com.isoft.action;


import com.alibaba.fastjson.JSON;
import com.isoft.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

@Controller
public class Employee {
    @Autowired
    EmployeeService employeeService;
    @RequestMapping(value = "/findAllPost.do",method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, Object>> findPost(HttpServletResponse response) throws UnsupportedEncodingException{
        List<Map<String,Object>> post = employeeService.findPost();
        String jsonStr= JSON.toJSONString(post);
        response.setContentType("text/html;charset=utf-8");
//        System.out.println(new String(jsonStr.getBytes("iso-8859-1"),"utf-8"));
        return post;
    }
    @RequestMapping(value = "/findPostInfo.do",method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String,Object>> findPostInfo(String name, int postid){
        System.out.println(name+"-"+postid);
        List<Map<String, Object>> postInfo = employeeService.findPostInfo(name, postid);
        return postInfo;
    }
}
