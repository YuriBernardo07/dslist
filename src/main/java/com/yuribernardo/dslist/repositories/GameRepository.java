package com.yuribernardo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yuribernardo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game , Long> {

}
