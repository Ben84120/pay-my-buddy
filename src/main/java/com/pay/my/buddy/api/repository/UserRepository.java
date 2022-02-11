package com.pay.my.buddy.api.repository;

import com.pay.my.buddy.api.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    Iterable<User> findUserByEmail(String email);

    Iterable<User> findUserByName(String name);

    Iterable<User> findUserByLastName(String lastName);



}
