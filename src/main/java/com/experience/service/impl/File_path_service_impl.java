package com.experience.service.impl;

import com.experience.dao.File_path_dao;
import com.experience.entity.Filestoragedb;
import com.experience.service.File_path_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class File_path_service_impl implements File_path_service {
    @Autowired
    File_path_dao file_path_dao;
    @Override
    public int getFilePath(Filestoragedb filestoragedb) {
        return file_path_dao.getFilePath(filestoragedb);
    }
}
