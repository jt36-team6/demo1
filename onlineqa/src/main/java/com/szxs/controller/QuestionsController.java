package com.szxs.controller;

import com.szxs.entity.Questions;
import com.szxs.service.QuestionsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class QuestionsController {
    @Resource
    private QuestionsServices questionsServices;
    @RequestMapping("/showQuest")
    public ModelAndView showList(){
        ModelAndView mav=new ModelAndView();
        List<Questions> questions=questionsServices.queryQuestions();
        mav.addObject("questions",questions);
        mav.setViewName("index");
        return mav;
    }
    @RequestMapping("/toAdd")
    public String toadd(){
        return "add";
    }

    @RequestMapping("/addQues")
    public String addQues(Questions questions){
        if(questionsServices.addQuestions(questions)){
            return "redirect:showQuest";
        }else{
            return "redirect:add";
        }
    }
    @RequestMapping("/showDetail/{qid}")
    public String showContent(@PathVariable ("qid")int qid, Model model){
        Questions questions = questionsServices.queryQuestionsbyid(qid);
        model.addAttribute("questions",questions);
        return "detail";
    }
}
