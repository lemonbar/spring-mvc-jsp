
package com.lemon.spring.controller;

import com.lemon.spring.domain.User;
import com.lemon.spring.validator.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {

    private User user;

    @ModelAttribute("user")
    public User addUser(){
        if(user == null){
            user = new User();
        }
        return user;
    }

    @RequestMapping("/login")
    public String login(Model model) {
//        User user = new User();
//        model.addAttribute("user", user);
        return "login";
    }

    @InitBinder
    public void initBinder(DataBinder binder){
        binder.setValidator(new UserValidator());
    }

    @RequestMapping("/greeting")
    public String greeting(@Validated User user, Errors errors){
        if(errors.hasFieldErrors()){
            return "login";
        }
        return "greeting";
    }

    //used for ${interestList} in jsp file.
    //ModelAttribute means the return value will be added into the model.
    @ModelAttribute("interestList")
    public List<String> getInterests(){
        List<String> result = new ArrayList<String>();
        result.add("III");
        result.add("JJJ");
        return result;
    }

    //used for ${sexOptions} in jsp file.
    //ModelAttribute means the return value will be added into the model.
    @ModelAttribute("sexOptions")
    public List<String> getSexList(){
        List<String> result = new ArrayList<String>();
        result.add("M");
        result.add("F");
        return result;
    }

    @ModelAttribute("skillList")
    public List<String> getSkillList(){
        List<String> result = new ArrayList<String>();
        result.add("Potions");
        result.add("Herbology");
        return result;
    }

    @ModelAttribute("countryList")
    public List<String> getCountryList(){
        List<String> result = new ArrayList<String>();
        result.add("China");
        result.add("USA");
        return result;
    }
}
