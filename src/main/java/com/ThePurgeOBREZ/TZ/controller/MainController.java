package com.ThePurgeOBREZ.TZ.controller;

import com.ThePurgeOBREZ.TZ.model.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
