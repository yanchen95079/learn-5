package com.yc.adpter.service.serviceimpl;

import com.yc.adpter.pojo.User;
import com.yc.adpter.service.NewCarService;

/**
 * @author Yanchen
 * date 2019/3/17 12:59
 */
public class ZhuancheServiceImpl implements NewCarService {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof ZhuancheServiceImpl;
    }

    @Override
    public void ZuchePerson(User user) {
        System.out.println("专车逻辑");
    }
}
