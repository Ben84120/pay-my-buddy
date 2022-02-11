package com.pay.my.buddy.api.repository;

import com.pay.my.buddy.api.entity.Transfer;
import com.pay.my.buddy.api.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface TransferRepository extends CrudRepository<Transfer, Integer> {

    Optional<Transfer> findTransferBySenderId(Integer id_sender);

    Optional<Transfer> findTransferByReceiverId(Integer id_receiver);

    Iterable<Transfer> findTransferByDate(Date date);

    }


