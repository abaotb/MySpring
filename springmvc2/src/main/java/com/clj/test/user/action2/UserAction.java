package com.clj.test.user.action2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, 2014年3月4日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Controller
@Scope("prototype")
@RequestMapping("/user")
public class UserAction {
	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public ModelAndView save(String name, String password) {
		System.out.println("接收到的用户信息：" + name);

		ModelAndView mov = new ModelAndView();
		mov.setViewName("/test/saveUserSuccess");
		mov.addObject("msg", "保存成功了");

		return mov;
	}
	@RequestMapping(value = "/save2", method = RequestMethod.POST)
	public ModelAndView save2(String name, String password) {
		System.out.println("接收到的用户信息：" + name);
		
		ModelAndView mov = new ModelAndView();
		mov.setViewName("/test/saveUserSuccess");
		mov.addObject("msg", "保存成功了");
		
		return mov;
	}

	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	@ResponseBody
	public boolean test1() {
		System.out.println("test1");
		return true;
	}

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> test2() {
		System.out.println("test2");
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
    
    @RequestMapping("/test4.do")
    @ResponseBody
    public User test4(){
    	System.out.println("test4");
    	try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        User user = new User();
        user.setId("s20068");
        user.setName("余清波");
        user.setAge(21);
        return user;
    }
    
    @RequestMapping("/test5.do")
    @ResponseBody
    public List<User> test5(){
    	System.out.println("test5");
        List<User> list = new ArrayList<User>();
        
        User user1 = new User();
        user1.setId("s200681");
        user1.setName("余清波1");
        user1.setAge(21);
        list.add(user1);
        
        User user2 = new User();
        user2.setId("s200682");
        user2.setName("余清波2");
        user2.setAge(21);
        list.add(user2);
        
        User user3 = new User();
        user3.setId("s200683");
        user3.setName("余清波3");
        user3.setAge(21);
        list.add(user3);
        
        return list;
    }
}