package com.ifox.test;

import com.ifox.dao.UserRepository;
import com.ifox.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void testFindByLastname() throws Exception{
        User user = new User("zhang","san",28,"nan");
        userRepository.save(user);
    }
}
