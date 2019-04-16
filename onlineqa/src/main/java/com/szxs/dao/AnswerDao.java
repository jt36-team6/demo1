package com.szxs.dao;

import com.szxs.entity.Answers;

public interface AnswerDao {
    /**
     * 增加回答
     * @param a
     * @return
     */
    int addAnswer(Answers a);
}
