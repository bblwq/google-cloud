package com.bblwq.home;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;

@Controller
public class MyErrorController implements ErrorController  {

    @RequestMapping("/error")
    public String handleError() {
        //do something like logging
        return "error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
