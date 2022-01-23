package n9mac.me.bsdsupportofferpage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BsdSupportOfferHomeController {


    @GetMapping("/")
    public String home() {
        return "home";
    }

}
