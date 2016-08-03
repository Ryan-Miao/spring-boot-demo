package hello.web;

import hello.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by miaorf on 2016/8/2.
 */
@RequestMapping("/hello")
@Controller
public class HelloController {

    @RequestMapping("/index")
    public String hello(Model model, @RequestParam(defaultValue = "Ryan") String name){
        model.addAttribute("name",name);
        return "index";
    }

    @ResponseBody
    @RequestMapping("/info")
    public Map info(@Valid @ModelAttribute("user")User user, Errors errors){

        Map map = new HashMap();
        if (errors.hasErrors()){
            map.put("error",errors.getAllErrors());
        }else{
            map.put("user",user);
        }

        return map;
    }

    @RequestMapping(value = "/map.json", method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Map map(){
        Map map = new HashMap();
        map.put("name","Ryan");
        map.put("sex","man");
        map.put("age",18);
        List list = new ArrayList();
        list.add("red");
        list.add("black");
        list.add("blue");
        list.add("yellow");
        map.put("colors",list);
        return map;
    }
}
