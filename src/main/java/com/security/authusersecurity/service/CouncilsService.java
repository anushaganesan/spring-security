package com.security.authusersecurity.service;

import com.security.authusersecurity.models.Councils;
import com.security.authusersecurity.repository.CouncilsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CouncilsService {

    @Autowired
    CouncilsRepository repository;


    public List<String> listOfCouncilNames() {

        List<String> councilNames = new ArrayList<>();
        councilNames.add("CouncilName1");
        councilNames.add("CouncilName2");

        repository.listOfCouncilNames();

        return councilNames;
    }

    public Councils getCouncilByID(int id) {

        return repository.findById(id).get();
    }
}
