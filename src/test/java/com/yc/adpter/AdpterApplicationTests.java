package com.yc.adpter;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yc.adpter.pojo.User;
import com.yc.adpter.service.NewCarAdpterService;
import com.yc.adpter.service.ZucheService;
import com.yc.adpter.service.serviceimpl.NewCarAdpterServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdpterApplicationTests {

    @Test
    public void contextLoads() throws IllegalAccessException, InstantiationException {
        NewCarAdpterService newCarAdpterService = new NewCarAdpterServiceImpl();
        newCarAdpterService.MaiPerson(new User());
        newCarAdpterService.ZhuanChePerson(new User());
        newCarAdpterService.ZuchePerson(new User());
    }

}
