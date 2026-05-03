package com.saurabh.Feedback;
public class Feedback
{
    private Integer id;
    private String name;
    private String feedback;

    public Feedback() {}

    public Feedback(Integer id, String name, String feedback)
    {
        this.id = id;
        this.name = name;
        this.feedback = feedback;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFeedback() { return feedback; }
    public void setFeedback(String feedback) { this.feedback = feedback; }
}