package demo.demo_jspservlet_intellij.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/hello")
public class MyController {
    @RequestMapping(value = {"/","/home"})
    public String home(Model model){
        model.addAttribute("myname","Nguyễn Văn Bình");
        model.addAttribute("address","Hà Nội");
        return "home";
    }
}
