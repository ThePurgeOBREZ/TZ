package com.wldrmnd.socialnetwork.controller;

import com.wldrmnd.socialnetwork.model.ListCountry;
import com.wldrmnd.socialnetwork.model.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

@Controller
public class MainController {

    @GetMapping("/enter/{id}")
    public String form(@PathVariable map<> String id, Model model) {

        Room room = new Room();
        model.addAttribute("room", room);

        String[] locales = Locale.getISOCountries();
        for (String countryCode : locales) {
            Locale obj = new Locale("", countryCode);
        }
        model.addAttribute("country", locales);

        model.addAttribute("id", id);
        return "enter_form";
    }

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("names", "belarus");
        return "index";
    }
}
