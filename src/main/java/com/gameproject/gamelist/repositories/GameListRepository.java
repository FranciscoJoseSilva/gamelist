package com.gameproject.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gameproject.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}