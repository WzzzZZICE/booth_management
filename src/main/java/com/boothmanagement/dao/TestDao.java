package com.boothmanagement.dao;

import com.boothmanagement.pojo.User;
import com.boothmanagement.pojo.dto.UserQueryPage;

import java.util.List;

/**
 * com.boothmanagement.dao
 * User: Wzq
 * Date: 2024/12/03 9:10
 * motto:   相与笑春风
 * Description:
 * Version: V1.0
 */
public interface TestDao {
    List<User> test(UserQueryPage userQueryPage);
    int testDelete(int id);
    int testUpdate(User user);
    long testCount(User user);
}
