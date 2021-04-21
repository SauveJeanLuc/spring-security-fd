package com.tryingrestapi.demo.data;

import com.tryingrestapi.demo.model.Author;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorRepository {
    public List<Author> findAll(){
        return new ArrayList<>();
    }

    public List<Author> saveAll(List<Author> authors){
        return new ArrayList<>();
    }
}
