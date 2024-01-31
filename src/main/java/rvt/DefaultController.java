package rvt;

import java.util.ArrayList;
import java.util.Arrays;
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
        int[] arr = {5, 7, -1, 4, 10};

        Sorter.Sort(arr);

        System.out.println(Searcher.BinarySearch(arr, 5));

        ModelAndView modelAndView = new ModelAndView("test");
        modelAndView.addObject("result", Arrays.toString(arr));
        return modelAndView;
    }

    @GetMapping(value = "/signup")
    public ModelAndView newSite() {
        ModelAndView modelAndView = new ModelAndView("signup");
        return modelAndView;
    }
    
}
