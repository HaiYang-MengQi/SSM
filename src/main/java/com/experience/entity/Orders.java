package com.experience.entity;

public class Orders {

  private int id;
  private String goodsname;
  private String time;


  public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getGoodsname() {
    return goodsname;
  }

  public void setGoodsname(String goodsname) {
    this.goodsname = goodsname;
  }


  public String getTime() {
    return time;
  }

  public void setTime() {
    this.time = time;
  }

  @Override
  public String toString() {
    return "Orders{" +
            "id=" + id +
            ", goodsname='" + goodsname + '\'' +
            ", time=" + time +
            '}';
  }
}
