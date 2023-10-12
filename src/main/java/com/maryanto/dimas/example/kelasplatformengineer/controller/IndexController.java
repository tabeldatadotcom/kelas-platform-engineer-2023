package com.maryanto.dimas.example.kelasplatformengineer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        model.addAttribute("myName", "Dimas Maryanto");
        model.addAttribute("thisYear", LocalDate.now().getYear());
        return "index";
    }
}
