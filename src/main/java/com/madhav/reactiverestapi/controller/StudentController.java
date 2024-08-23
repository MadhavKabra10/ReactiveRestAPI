package com.madhav.reactiverestapi.controller;

import com.madhav.reactiverestapi.model.Student;
import com.madhav.reactiverestapi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    @Autowired
    private StudentService service;
    @PostMapping
    Mono<Student> save(@RequestBody Student student){
        return service.save(student);
    }
    @GetMapping
    public Flux<Student> findAll(){
        return service.findAll();
    }
    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable int id){
        return service.findById(id);
    }
}
