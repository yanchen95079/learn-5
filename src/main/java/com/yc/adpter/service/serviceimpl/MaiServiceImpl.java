package com.yc.adpter.service.serviceimpl;

import com.yc.adpter.pojo.User;
import com.yc.adpter.service.NewCarService;

/**
 * @author Yanchen
 * date 2019/3/17 12:59
 */
public class MaiServiceImpl implements NewCarService {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof MaiServiceImpl;
    }

    @Override
    public void ZuchePerson(User user) {
        System.out.println("买卖车逻辑");
    }
}
