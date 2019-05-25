package com.springbootapi.dao;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootapi.model.Payment;
import com.springbootapi.repository.PaymentRepository;

@Service
public class PaymentDao {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	
	//Add data 
public Payment Save(Payment pay) {
	return paymentRepository.save(pay);
}

//to search all payments

public List<Payment>findAll(){
	return paymentRepository.findAll();
	
}

//get a payment by id 

public Payment findOne(Long payid) {
	 Optional<Payment> op = paymentRepository.findById(payid);
	 if(op.isPresent()) {
	 return op.get();
	 }
	 else {
	 return null;
	 }
	 } 


//delete payment
public void delete(Payment pay) {
	paymentRepository.delete(pay);
	
	
}












}
