package com.yc.adpter.service.serviceimpl;

import com.yc.adpter.pojo.User;
import com.yc.adpter.service.NewCarAdpterService;
import com.yc.adpter.service.NewCarService;
import com.yc.adpter.service.ZucheService;

/**
 * @author Yanchen
 * date 2019/3/17 13:02
 */
public class NewCarAdpterServiceImpl extends ZucheServiceImpl implements NewCarAdpterService {

    @Override
    public void ZuchePerson(User user) {
        super.ZuchePerson(user);
    }

    @Override
    public void MaiPerson(User user) throws InstantiationException, IllegalAccessException {
        commonWork(MaiServiceImpl.class,user);
    }

    @Override
    public void ZhuanChePerson(User user) throws InstantiationException, IllegalAccessException {
        commonWork(ZhuancheServiceImpl.class,user);
    }

    private void commonWork(Class<? extends NewCarService> clazz, User user) throws IllegalAccessException, InstantiationException {
        NewCarService newCarService = clazz.newInstance();
        if(newCarService.support(newCarService)){
            newCarService.ZuchePerson(user);
        }
    }
}
