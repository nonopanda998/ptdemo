package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 查詢全部
     * @return
     */
    public List<User> findAllUser() {
        return userDao.findAll();
    }



}
