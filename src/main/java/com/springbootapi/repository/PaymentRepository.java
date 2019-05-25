package com.springbootapi.repository;
import com.springbootapi.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;;

public interface PaymentRepository extends JpaRepository<Payment,Long> {

}
