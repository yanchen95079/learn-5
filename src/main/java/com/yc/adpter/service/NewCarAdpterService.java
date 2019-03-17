package com.yc.adpter.service;

import com.yc.adpter.pojo.User;

/**
 * @author Yanchen
 * date 2019/3/17 13:02
 */
public interface NewCarAdpterService {
    void ZuchePerson(User user);
    void MaiPerson(User user) throws InstantiationException, IllegalAccessException;
    void ZhuanChePerson(User user) throws InstantiationException, IllegalAccessException;
}
