package com.MIA.rest.webservices.restfulwebservices.todo;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class TodoHardCodedService {

    private static List<Todo> todos = new ArrayList<>();
    private static int idCounter=0;

    static{
        todos.add(new Todo(++idCounter, "alex", "Learn to code", new Date(), false));
        todos.add(new Todo(++idCounter, "alex", "Learn to implement new features", new Date(), false));
        todos.add(new Todo(++idCounter, "alex", "Learn to be positive", new Date(), false));
    }

    public List<Todo> findAll(){
        return todos;
    }

}
