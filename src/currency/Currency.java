package currency;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Currency {
    @RequestMapping("/index")
    public String home(){
        return "/index";
    }
    @RequestMapping("/home")
    public String calc( @RequestParam float usd, Model model){


       float vnd = usd *23000;
        model.addAttribute("usd",usd);
        model.addAttribute("vnd",vnd);


        return "/index2";
    }


}
