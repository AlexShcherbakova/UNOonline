package com.UNOonline.UNO.service;

import com.UNOonline.UNO.entity.Player;
import com.UNOonline.UNO.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAll() {
        return playerRepository.findAll(Sort.by(Sort.Order.asc("name")));
    }

    public Player save(Player player) {
        return playerRepository.save(player);
    }

    public void delete(int id) {
        playerRepository.deleteById(id);
    }
}
