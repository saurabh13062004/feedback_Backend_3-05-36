package com.saurabh.Feedback;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*")
public class FeedbackController
{
    private final FeedbackService service;

    public FeedbackController(FeedbackService service)
    {
        this.service = service;
    }

    @PostMapping("/save")
    public String save(@RequestBody Feedback f)
    {
        return service.save(f);
    }

    @GetMapping("/getall")
    public List<Feedback> getAll()
    {
        return service.getAll();
    }
}