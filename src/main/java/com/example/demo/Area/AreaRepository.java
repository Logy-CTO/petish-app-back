package com.example.demo.Area;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AreaRepository extends JpaRepository<AreaEntity, Long> {
    List<AreaEntity> findByAreaNameStartingWith(String areaName);
}