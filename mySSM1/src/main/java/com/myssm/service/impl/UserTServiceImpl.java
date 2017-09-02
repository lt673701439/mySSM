package com.myssm.service.impl;

import com.myssm.entity.UserT;
import com.myssm.mapper.UserTMapper;
import com.myssm.service.UserTService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("userTService")
public class UserTServiceImpl implements UserTService {
    @Resource
    private UserTMapper userTMapper;

    public UserT getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userTMapper.selectByPrimaryKey(userId);
    }
}
