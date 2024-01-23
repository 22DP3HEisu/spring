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
    
    @GetMapping(value = "/test")
    public ModelAndView testAction() {
        Money mon1 = new Money(10, (byte) 10);
        Money mon2 = new Money(20);
        Money mon3 = new Money((byte) 10);

        Money result = mon1.plus(mon3);

        ModelAndView modelAndView = new ModelAndView("test");
        modelAndView.addObject("result", result);
        return modelAndView;
    }

}
