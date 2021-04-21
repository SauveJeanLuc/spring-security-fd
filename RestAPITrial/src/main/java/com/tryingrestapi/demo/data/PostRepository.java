package com.tryingrestapi.demo.data;


import com.tryingrestapi.demo.model.Post;
import org.springframework.stereotype.Component;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PostRepository {

    public List<Post> findAll(){
       return new ArrayList<>();
    }

    public List<Post> saveAll(List<Post> posts){
        return new ArrayList<>();
    }

    public Post save(Post post){
        return  null;
    }

    public Optional<Post> findById(Long id){
        return null;
    }
}
