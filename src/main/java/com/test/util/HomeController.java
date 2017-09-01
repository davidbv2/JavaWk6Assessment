package com.test.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
//
//    @RequestMapping("/")
//    public ModelAndView helloWorld()
//    {
//        return new
//                ModelAndView("welcome","message","Hello World");
//    }

    @RequestMapping("/welcome")
    public ModelAndView welcome(){

       return new ModelAndView("welcome","start","Thank you for visiting.");

    }

    @RequestMapping("/receipt")
    public ModelAndView receipt(@RequestParam("ordernum")String orderNumber)
    {
        ModelAndView mv = new ModelAndView("summarypage");
        mv.addObject("ordernum",orderNumber);
        return new ModelAndView("summarypage","order",orderNumber);
    }
}