package dev.regu.contentcalendar.repository;

import dev.regu.contentcalendar.model.Content;
import dev.regu.contentcalendar.model.Status;
import dev.regu.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {

    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll() {
        return content;
    }

    public Optional<Content> findById(Integer id) {
        return content.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init() {
        Content c = new Content(1,
                "My first Blog Post",
                "my first Blog Post",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                ""
                );

        content.add(c);
    }
}


/* https://www.youtube.com/watch?v=UgX5lgv4uVM */

