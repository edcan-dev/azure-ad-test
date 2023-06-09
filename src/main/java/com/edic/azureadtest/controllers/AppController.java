package com.edic.azureadtest.controllers;

import org.springframework.http.MediaType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@CrossOrigin("*")

public class AppController {

    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public void helloWorld(HttpServletResponse response) throws IOException {
        response.sendRedirect("/auth/azuread");
    }*/

    @RequestMapping({"/exam/home","/"})
    public String examHome(Model model/*, Authentication authentication*/) {
//        DefaultOidcUser user = (DefaultOidcUser) authentication.getPrincipal();
//        System.out.println("Se ha loggeado: " + user.getPreferredUsername());

//        model.addAttribute("username",user.getPreferredUsername());
//        model.addAttribute("name",authentication.getName());

        model.addAttribute("name","NOMBRE DE EJEMPLO");
        model.addAttribute("username","USERNAME DE EJEMPLO");

        return "screen_02";
    }



        @RequestMapping("/exam/start")
        public String examStart(Model model/* Authentication authentication*/) {
        // System.out.println(authentication.getPrincipal());
        //System.out.println("Se ha loggeado: " + user.getPreferredUsername());
            model.addAttribute("name","NOMBRE DE EJEMPLO");
            model.addAttribute("username","USERNAME DE EJEMPLO");

        return "screen_03";
    }

    @PostMapping(value = "/exam/end", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String helloWorld(@RequestBody String body) {
        System.out.println(body);
        return "ok";
    }


}