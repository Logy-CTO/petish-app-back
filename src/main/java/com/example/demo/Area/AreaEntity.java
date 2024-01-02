package com.example.demo.Area;
import javax.persistence.*;

import lombok.Getter;

@Entity
@Table(name = "area")
@Getter
public class AreaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "AREA_NAME")
    private String areaName;

}