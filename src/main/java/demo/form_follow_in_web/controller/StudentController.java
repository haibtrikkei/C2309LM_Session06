package demo.form_follow_in_web.controller;

import demo.form_follow_in_web.model.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping(value = {"/","/initInsertStudent"})
    public String initInsertStudent(Model model){
        Student s = new Student();
        model.addAttribute("s",s);
        return "insertStudent";
    }

    @RequestMapping("/insertStudent")
    public String insertStudent(@ModelAttribute Student s, Model model){
        model.addAttribute("s",s);
        return "viewStudent";
    }
}
