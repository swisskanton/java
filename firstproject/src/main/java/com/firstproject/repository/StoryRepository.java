package com.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import com.firstproject.domain.Story;

import java.util.List;

public interface StoryRepository extends CrudRepository<Story, Long> {

    //SELECT * FROM STORY
    List<Story> findAll();

    //SELECT * FROM STORY WHERE posted IN (SELECT max(posted) FROM story) LIMIT 1;
    Story findFirstByOrderByPostedDesc();

    Story findByTitle(String title);
}
