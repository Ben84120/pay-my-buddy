package com.pay.my.buddy.api.services;

import com.pay.my.buddy.api.entity.Transfer;
import com.pay.my.buddy.api.entity.User;
import com.pay.my.buddy.api.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class TransferService {


    @Autowired
    TransferRepository transferRepository;


    public Optional<Transfer> getTransferById(Integer id) {
        return transferRepository.findById(id);
    }

    public Iterable<Transfer> getAllTransfer() {
        return transferRepository.findAll();
    }

    public Optional<Transfer> getTransferBySenderId(Integer id_sender) {
        return transferRepository.findTransferBySenderId(id_sender);
    }

    public Optional<Transfer> getTransferByReceiverId(Integer id_receiver) {
        return transferRepository.findTransferByReceiverId(id_receiver);
    }

    public Iterable<Transfer> getTransferByDate(Date date) {
        return transferRepository.findTransferByDate(date);
    }

    public Transfer saveTransfer(Transfer transfer) {
        return transferRepository.save(transfer);
    }

    public void deleteTransferById(Integer id) {
        transferRepository.deleteById(id);
    }

}
