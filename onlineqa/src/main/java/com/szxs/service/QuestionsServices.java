package com.szxs.service;

import com.szxs.entity.Questions;

import java.util.List;

public interface QuestionsServices {
    /**
     * 查询所有问答
     * @return
     */
    List<Questions> queryQuestions();

    /**
     * 增加问答
     * @param q
     * @return
     */
    boolean addQuestions(Questions q);


    /**
     * 查询单个问答
     * @param qid
     * @return
     */
    Questions queryQuestionsbyid(int qid);

}
