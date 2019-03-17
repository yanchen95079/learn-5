package com.yc.adpter.service.serviceimpl;

import com.yc.adpter.pojo.User;
import com.yc.adpter.service.ZucheService;

/**
 * @author Yanchen
 * date 2019/3/17 12:56
 */
public class ZucheServiceImpl implements ZucheService {
    @Override
    public void ZuchePerson(User user) {
        System.out.println("租车逻辑");
    }
}
