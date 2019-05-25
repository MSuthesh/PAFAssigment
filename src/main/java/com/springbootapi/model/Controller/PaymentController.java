package com.springbootapi.model.Controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootapi.dao.PaymentDao;
import com.springbootapi.model.Payment;
//api class url handle
@RestController
@RequestMapping("/company")
public class PaymentController {
	
	@Autowired
	PaymentDao paymentDAO;
	
	//save an payment into db
	@PostMapping("/Payments")
	public Payment createPayment(@Valid @RequestBody Payment pay) {
	return paymentDAO.Save(pay);
	}
	
	//get all payments
	@GetMapping("/Payments")
	public List<Payment>getAllPayment(){
		return paymentDAO.findAll();
		
	}
	
	//get payment by id
	@GetMapping("/notes/{id}")
	public ResponseEntity<Payment> getPaymentById(@PathVariable(value="id") Long
			payid){
			 Payment pay = paymentDAO.findOne(payid);

			 if(pay==null) {
			 return ResponseEntity.notFound().build();
			 }
			 return ResponseEntity.ok().body(pay);
			 }
	
	
	//update payment
	@PutMapping("/Payment/{id}")
		public ResponseEntity<Payment> updatePayments(@PathVariable(value="id") Long payId,
				@Valid @RequestBody Payment payDetails){

			 Payment pay = paymentDAO.findOne(payId);

				 if(pay==null) {
				 return ResponseEntity.notFound().build();
				 }
				 pay.setId(payDetails.getId());
				 pay.setProductId(payDetails.getProductId());
				 pay.setDescription(payDetails.getDescription());
				 pay.setAmount(payDetails.getAmount());
				 

				 Payment updatePayment=paymentDAO.Save(pay);

				 return ResponseEntity.ok().body(updatePayment);
				 } 
	
	
	
	@DeleteMapping("/Payment/{id}")
	 public ResponseEntity<Payment> deletePayment(@PathVariable(value="id") Long payId){
		Payment pay = paymentDAO.findOne(payId);
	 if(pay==null) {
	 return ResponseEntity.notFound().build();
	 }
	 paymentDAO.delete(pay);
	 return ResponseEntity.ok().build();
	 }


} 


		
		
	

	
	


