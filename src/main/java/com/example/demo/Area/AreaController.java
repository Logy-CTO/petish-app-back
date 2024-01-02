package com.example.demo.Area;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/area")
public class AreaController {

    private final AreaService areaService;

    @Autowired
    public AreaController(AreaService areaService) {
        this.areaService = areaService;
    }

    @GetMapping("/{areaName}")
    public List<AreaEntity> searchAreaNames(@PathVariable("areaName") String areaName) {
        System.out.println("searchAreaNames() method is called with " + areaName);
        List<AreaEntity> resultList = areaService.searchAreaNames(areaName);
        System.out.println("searchAreaNames() method returns " + resultList);
        return resultList;
    }
}