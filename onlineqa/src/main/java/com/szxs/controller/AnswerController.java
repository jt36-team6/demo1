package com.szxs.controller;

import com.szxs.entity.Answers;
import com.szxs.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class AnswerController {
        @Resource
        private AnswerService answerService;
        @RequestMapping(value ="/addAnswers",method = RequestMethod.GET)
        public String addAnswers(Answers answers){
            answerService.addAnswer(answers);

            return "redirect:/showDetail/"+answers.getQid();
        }
}
