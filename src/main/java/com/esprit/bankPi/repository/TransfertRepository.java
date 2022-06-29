package com.esprit.bankPi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.bankPi.data.TransactionPojo;

@Repository
public interface TransfertRepository extends CrudRepository<TransactionPojo, Integer>{

}
