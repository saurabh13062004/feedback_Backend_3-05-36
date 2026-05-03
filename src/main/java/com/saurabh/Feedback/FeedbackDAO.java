package com.saurabh.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.*;
import java.util.*;

@Repository
public class FeedbackDAO
{
    private final JdbcTemplate jt;

    public FeedbackDAO(JdbcTemplate jt)
    {
        this.jt = jt;
    }

    public int save(Feedback f)
    {
        String sql = "insert into feedback(name, feedback) values(?, ?)";
        return jt.update(sql, f.getName(), f.getFeedback());
    }

    public List<Feedback> getAll()
    {
        String sql = "select * from feedback";
        return jt.query(sql, new BeanPropertyRowMapper<>(Feedback.class));
    }
}