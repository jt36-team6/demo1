package com.szxs.entity;


import java.util.Date;
import java.util.List;

public class Questions {

  private int id;
  private String title;
  private String detaileDesc;
  private int answerCount;
  private Date lastModified;
  private List<Answers> answersList;

  public List<Answers> getAnswersList() {
    return answersList;
  }

  public void setAnswersList(List<Answers> answersList) {
    this.answersList = answersList;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDetaileDesc() {
    return detaileDesc;
  }

  public void setDetaileDesc(String detaileDesc) {
    this.detaileDesc = detaileDesc;
  }

  public int getAnswerCount() {
    return answerCount;
  }

  public void setAnswerCount(int answerCount) {
    this.answerCount = answerCount;
  }

  public Date getLastModified() {
    return lastModified;
  }

  public void setLastModified(Date lastModified) {
    this.lastModified = lastModified;
  }
}
