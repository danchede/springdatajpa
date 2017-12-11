package com.ifox.dao;


import com.ifox.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    //可以根据方法名进行衍生查询，也可以自定义查询。
    @Query("select u from User u where u.lastname=?1")
    List<User> findByLastname(String lastname);

    Long countByLastname(String lastname);
}
