package com.example.demo.Area;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;

@Service
public class AreaService {

    private final AreaRepository areaRepository;

    @Autowired
    public AreaService(AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    public List<AreaEntity> searchAreaNames(String areaName) {
        System.out.println("Area name: " + areaName);
        return areaRepository.findByAreaNameStartingWith(areaName);
    }
}