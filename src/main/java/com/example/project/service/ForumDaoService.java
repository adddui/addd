package com.example.project.service;

import com.example.project.entity.Forum;
import com.example.project.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ForumDaoService {
    List<Forum> findAll();

    //新增数据
    int add(Forum forum);

    //删除数据
    int delete(int id);

    //根据id查找
    Forum findForumById(int id);

    //更新数据
    int update(Forum forum);
}
