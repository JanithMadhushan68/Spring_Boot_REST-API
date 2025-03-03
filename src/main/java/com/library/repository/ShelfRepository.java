package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.Shelf;

public interface ShelfRepository extends JpaRepository<Shelf, Integer> { }