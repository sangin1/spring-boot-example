package com.bookshop01;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bookshop01.goods.vo.GoodsVO;
import com.bookshop01.goods.service.GoodsService;
import com.bookshop01.common.base.BaseController;

@Controller
public  class DemoController{
	
@ResponseBody
  @RequestMapping("/") 
  public String home(){
    System.out.println("Hello Boot!!");
    return "Hello Boot!!"; 
  }

  @RequestMapping("/hello.do")
  public String hello(Model model){
	System.out.println("안녕하세요");
	model.addAttribute("message","hello.jsp입니다.!");
	return "hello";
  } 
  
  
  
}

