package com.example.springbootmvcproj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home()
    {
        return "index.jsp";
        //System.out.println("HomePage called");
    }
}
