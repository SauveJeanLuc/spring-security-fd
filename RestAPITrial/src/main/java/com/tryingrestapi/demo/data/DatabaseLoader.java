package com.tryingrestapi.demo.data;

import com.tryingrestapi.demo.model.Author;
import com.tryingrestapi.demo.model.Post;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class DatabaseLoader implements ApplicationRunner {

    private final String[] templates = {
            "Smart Home %s", "Mobile %s - For When You're on he Go", "The %s - Your New Favorite Accessory "
    };

    private final String[] gadgets = {
            "Earbuds", "Speakers", "Tripod", "Instant Pot", "Ameza", "Keyboard"
    };
    public List<Post> randomPosts = new ArrayList<>();
    public List<Author> authors = new ArrayList<>();

    public DatabaseLoader(){

    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        IntStream.range(0,40).forEach(i->{
            String template = templates[i % templates.length];
            String gadget = gadgets[i% gadgets.length];

            String title = String.format(template,gadget);
            Post post = new Post(title, "Lorem ipsum dolor sit amet, consectetur adipiscing elit… ");
            randomPosts.add(post);
        });
    }
}
