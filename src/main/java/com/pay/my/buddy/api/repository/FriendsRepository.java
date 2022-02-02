package com.pay.my.buddy.api.repository;

import com.pay.my.buddy.api.entity.Friends;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsRepository extends CrudRepository<Friends, Integer> {
}
