package com.esprit.bankPi.resources;

import com.esprit.bankPi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplaintServiceImpl implements IClientService{
    @Autowired
    ClientRepository clientRepository ;

}