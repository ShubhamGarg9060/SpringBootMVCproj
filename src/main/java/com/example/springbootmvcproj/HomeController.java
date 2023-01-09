package com.example.springbootmvcproj;

import com.example.springbootmvcproject.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @ModelAttribute
    public void modelData(Model m)
    {
        m.addAttribute("name","Aliens");
    }
    @RequestMapping("/")
    public String home()
    {
        return "index";
        //System.out.println("HomePage called");
    }
    //@RequestMapping("add")
    /*public String add(HttpServletRequest req)
    {
        int i= Integer.parseInt(req.getParameter("num1"));
        int j= Integer.parseInt(req.getParameter("num2"));
        int num3=i+j;
        HttpSession session= req.getSession();
        session.setAttribute("num3",num3);
        return "result.jsp";
    }*/
    //using @RequestParam
    /*public String add(@RequestParam("num1") int i,@RequestParam("num2") int j,
                      HttpSession session)
    {

        int num3=i+j;
        session.setAttribute("num3",num3);
        return "result.jsp";
    }*/
    //using ModelAndView->removing HttpSession
    /*public ModelAndView add(@RequestParam("num1") int i,@RequestParam("num2") int j)
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        int num3=i+j;
        mv.addObject("num3",num3);
        return mv;
    }*/
    public String add(@RequestParam("num1") int i,@RequestParam("num2") int j, ModelMap m)
    {
        int num3=i+j;
        m.addAttribute("num3",num3);
        return "result";
    }
    @RequestMapping("addalien")
    /*public String addalien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, Model m)
    {
        Alien a = new Alien();
        a.setId(aid);
        a.setAname(aname);
        m.addAttribute("alien",a);
        return "result";
    }*/
    public String addalien(@ModelAttribute Alien a)
    {
        return "result";
    }
}
