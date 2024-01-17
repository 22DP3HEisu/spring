package rvt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {
    
    @GetMapping(value = "/")
    ModelAndView index(@RequestParam(name="name", required=false, defaultValue="null") String name) {
        Money mon1 = new Money(10, 10);
        Money mon2 = new Money(20, 20);

        Money mon3 = mon1.plus(mon2);

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("result", mon3);
        return modelAndView;
    }

}
