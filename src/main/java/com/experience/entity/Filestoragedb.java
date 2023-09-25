package com.experience.entity;


public class Filestoragedb {

  private int id;
  private String fileName;
  private String filePath;
  private String uploadDate;
  private long fileSize;
  private String description;

  public Filestoragedb(String fileName, String filePath, String uploadDate, long fileSize, String description) {
    this.fileName = fileName;
    this.filePath = filePath;
    this.uploadDate = uploadDate;
    this.fileSize = fileSize;
    this.description = description;
  }

  public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }


  public String getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(String uploadDate) {
    this.uploadDate = uploadDate;
  }


  public long getFileSize() {
    return fileSize;
  }

  public void setFileSize(long fileSize) {
    this.fileSize = fileSize;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Filestoragedb{" +
            "id=" + id +
            ", fileName='" + fileName + '\'' +
            ", filePath='" + filePath + '\'' +
            ", uploadDate='" + uploadDate + '\'' +
            ", fileSize=" + fileSize +
            ", description='" + description + '\'' +
            '}';
  }
}
