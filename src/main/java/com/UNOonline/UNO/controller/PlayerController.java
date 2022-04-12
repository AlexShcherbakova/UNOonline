package com.UNOonline.UNO.controller;

import com.UNOonline.UNO.entity.Player;
import com.UNOonline.UNO.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/wait")
    public String getAll(Model model) {
        List<Player> playerList = playerService.getAll();
        model.addAttribute("playerList", playerList);
        model.addAttribute("playerSize", playerList.size());
        return "wait";
    }

    @RequestMapping("/wait/delete/{id}")
    public String deletePlayer(@PathVariable int id) {
        playerService.delete(id);
        return "redirect:/wait";
    }

    @PostMapping("/add")
    public String addPlayer(@ModelAttribute Player player) {
        playerService.save(player);
        return "redirect:/wait";
    }
}
