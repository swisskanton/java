package com.firstproject.service;

import com.firstproject.domain.Blogger;
import com.firstproject.domain.Story;
import com.firstproject.repository.BlogRepository;
import com.firstproject.repository.StoryRepository;
import org.attoparser.prettyhtml.PrettyHtmlMarkupHandler;
import org.hibernate.dialect.unique.CreateTableUniqueDelegate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoryService {
    private StoryRepository storyRepo;
    private BlogRepository blogRepo;

    public void setStoryRepo(StoryRepository storyRepo) {
        this.storyRepo = storyRepo;
    }

    public void setBlogRepo(BlogRepository blogRepo) {
        this.blogRepo = blogRepo;
    }

    public List<Story> getStories() {
        return storyRepo.findAll();
    }

    public Story getStory() {
        return storyRepo.findFirstByOrderByPostedDesc();
    }

    public Story getSpecificStory(String title) {
        return storyRepo.findByTitle(title);
    }

    public List<Blogger> getBloggers() {
        return blogRepo.findAll();
    }
}
