package com.security.authusersecurity.controller;

import com.security.authusersecurity.models.Councils;
import com.security.authusersecurity.service.CouncilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class CouncilsController {

    @Autowired
    CouncilsService councilsService;

    @GetMapping("councils")
    public List<String> listOfCouncilNames(){
        return councilsService.listOfCouncilNames();


    }

    @GetMapping("councils/{id}")
    public Councils getCouncilByID(@PathVariable int id){

        return councilsService.getCouncilByID(id);
    }


}

