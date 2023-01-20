package org.training.core.service.impl;

import org.training.core.dao.PITUserDao;

import org.training.core.model.PITUserModel;
import org.training.core.service.PITUserService;

import javax.annotation.Resource;
import java.util.List;

public class PITUserServiceImpl implements PITUserService {
    @Resource
    private PITUserDao pitUserDao;
    @Override
    public List<PITUserModel> getAllPITUsers() {
        return pitUserDao.getAllPITUsers();
    }
}
