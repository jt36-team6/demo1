package com.szxs.service.impl;

import com.szxs.dao.QuestionsDao;
import com.szxs.entity.Questions;
import com.szxs.service.QuestionsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//@Repository
//@Component
public class QuestionServiceImpl implements QuestionsServices {
   @Autowired
    private QuestionsDao questionsDao;
    public List<Questions> queryQuestions() {
        return questionsDao.queryQuestions();
    }
    public boolean addQuestions(Questions q){

        return questionsDao.addQuestions(q)>0;
    }

    public Questions queryQuestionsbyid(int qid) {
        return questionsDao.queryQuestionsbyid(qid);
    }


    public boolean UpdataNum(int qid){
        questionsDao.updataNum(qid);
        return true;
    }
}
