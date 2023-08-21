package com.experience.entity;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {

  private int id;
  private String name;
  private String press;
  private String author;


  public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPress() {
    return press;
  }

  public void setPress(String press) {
    this.press = press;
  }


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @PostConstruct
  public void init() {
    System.out.println("Book's bean has been injected with values");
  }

  @PreDestroy
  public void destroy() {
    System.out.println("Book's bean is called before it is destroyed");
  }

  @Override
  public String toString() {
    return "Book{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", press='" + press + '\'' +
            ", author='" + author + '\'' +
            '}';
  }

}
