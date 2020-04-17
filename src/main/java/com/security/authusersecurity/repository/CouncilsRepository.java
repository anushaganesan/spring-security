package com.security.authusersecurity.repository;

import com.security.authusersecurity.models.Councils;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CouncilsRepository extends CrudRepository<Councils, Integer> {

    @Query("SELECT councilname FROM councils")
    public List<String> listOfCouncilNames();
}
