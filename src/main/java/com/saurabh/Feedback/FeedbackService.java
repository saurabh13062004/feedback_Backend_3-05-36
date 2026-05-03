package com.saurabh.Feedback;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService
{
    private final FeedbackDAO dao;

    public FeedbackService(FeedbackDAO dao)
    {
        this.dao = dao;
    }

    public String save(Feedback f)
    {
        try
        {
            dao.save(f);
            return "thank you for the feedback";
        }
        catch(Exception e)
        {
            return "issue " + e;
        }
    }
	public List<Feedback> getAll()
    {
        return dao.getAll();
    }
}