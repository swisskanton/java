package com.firstproject.repository;

import com.firstproject.domain.Blogger;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlogRepository extends CrudRepository<Blogger, Long> {

    //SELECT * FROM BLOGGER
    List<Blogger> findAll();
}
