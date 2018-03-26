package com.clj.test.user.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping({"/", "/index"})
    public ModelAndView index() {
    	System.out.println("----");
        return new ModelAndView("jsp2");

    }
    
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> test2() {
		System.out.println("test2");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "s20070");
		map.put("name", "郑城斌");
		return map;
	}
	@RequestMapping("/test3.do")
    @ResponseBody
    public List<String> test3(){
		System.out.println("test3");
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        return list;
    }

}