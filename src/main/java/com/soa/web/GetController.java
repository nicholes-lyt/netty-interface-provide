package com.soa.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetController {
	
	@RequestMapping(value="/soa/get.htm")
    public void getShopInJSON(HttpServletRequest request,HttpServletResponse resp) {
        try {
			resp.getWriter().write("GET请求，参数为："+request.getParameter("data"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
}
