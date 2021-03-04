package com.wldrmnd.socialnetwork.controller;


import com.wldrmnd.socialnetwork.model.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/enter")
    public String form(Model model) {
        Room room = new Room();
        model.addAttribute("room", room);

        List<String> roomList = Arrays.asList("Poland", "Russia", "Belarus");
        model.addAttribute("jobList", roomList);
        return "enter_form";
    }
}
