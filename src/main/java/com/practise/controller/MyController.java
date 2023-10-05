package com.practise.controller;

import com.practise.entities.LoginData;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class MyController {
    @GetMapping("/form")
    public String openForm(Model model){
        System.out.println("opening form");
        model.addAttribute("loginData",new LoginData());
        return "form";
    }

    //handler for submit the form
    @PostMapping("/process")
    public String processForm(@Validated @ModelAttribute("loginData") LoginData loginData, BindingResult result){

        if(result.hasErrors()){
            System.out.println("fail");
            System.out.println(result);
            return "form";
        }

        System.out.println(loginData);
        System.out.println("pass");
        //data process
        return "success";
    }




}
