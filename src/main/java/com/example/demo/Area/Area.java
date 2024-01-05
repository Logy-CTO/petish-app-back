package com.example.demo.Area;
import javax.persistence.*;

import lombok.Getter;

@Entity
@Table(name = "area")
@Getter
public class Area {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "AREA_NAME")
    private String areaName;

}