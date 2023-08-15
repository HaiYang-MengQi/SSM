package com.experience.entity;
public class Comment {

  private int id;
  private String comment;
  private String time;


  public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  @Override
  public String toString() {
    return "Comment{" +
            "id=" + id +
            ", comment='" + comment + '\'' +
            ", time='" + time + '\'' +
            '}';
  }
}
