package hello;

import hello.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
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
}
