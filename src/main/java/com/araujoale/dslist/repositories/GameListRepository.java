package com.araujoale.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.araujoale.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}