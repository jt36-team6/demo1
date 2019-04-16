package com.szxs.service.impl;

import com.szxs.dao.AnswerDao;
import com.szxs.dao.QuestionsDao;
import com.szxs.entity.Answers;
import com.szxs.entity.Questions;
import com.szxs.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Resource
    private AnswerDao answerDao;
    @Resource
    private QuestionsDao questionsDao;
    public boolean addAnswer(Answers a) {
        answerDao.addAnswer(a);
        questionsDao.updataNum(a.getQid());
        return true;
    }
}
