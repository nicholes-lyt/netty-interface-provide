package com.soa.web;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 
 * @ClassName: PostController   
 * @Description: Post请求测试
 * @author liyut
 * @version 1.0 
 * @date 2017年2月20日 下午5:03:26
 */
@Controller
public class PostController {
	
	@RequestMapping(method=RequestMethod.POST,value="/soa/post.htm")
    public void postJSON(HttpServletRequest request,HttpServletResponse resp) {
        try {
        	String jsonParam = request.getParameter("data");
        	JSONObject json = JSON.parseObject(jsonParam);
			Map<String,Object> data=new HashMap<String,Object>();
			data.put("name", json.getString("name"));
			data.put("age", 23);
			data.put("address", "中国");
			data.put("activetime", new Date());
			resp.getWriter().write(JSONObject.toJSONString(data));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
}
