package com.yc.adpter.service;

import com.yc.adpter.pojo.User;

/**
 * @author Yanchen
 * date 2019/3/17 12:58
 */
public interface NewCarService {
    boolean support(Object adapter);
    void ZuchePerson(User  user);
}
