package com.szxs.dao;

import com.szxs.entity.Questions;

import java.util.List;

public interface QuestionsDao {
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
    int addQuestions(Questions q);

    /**
     * 查询单个问答
     * @param qid
     * @return
     */
    Questions queryQuestionsbyid(int qid);

    /**
     * 增加提问次数
     * @param qid
     * @return
     */
    int updataNum(int qid);
}
