package com.cg.capstoreclient.bean;

import java.sql.Date;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PaymentDetailsBean {

	
	
	private String transactionId;
	
	
	private Date transactionDate;
	
	
	private Double paymentAmount;
	
	
	private Double capStoreRevenueAmount;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Double getCapStoreRevenueAmount() {
		return capStoreRevenueAmount;
	}

	public void setCapStoreRevenueAmount(Double capStoreRevenueAmount) {
		this.capStoreRevenueAmount = capStoreRevenueAmount;
	}

	public PaymentDetailsBean(String transactionId, Date transactionDate, Double paymentAmount,
			Double capStoreRevenueAmount) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.paymentAmount = paymentAmount;
		this.capStoreRevenueAmount = capStoreRevenueAmount;
	}
	
	public PaymentDetailsBean() {
		super();
	}

	@Override
	public String toString() {
		return "PaymentDetailsBean [transactionId=" + transactionId + ", transactionDate=" + transactionDate
				+ ", paymentAmount=" + paymentAmount + ", capStoreRevenueAmount=" + capStoreRevenueAmount + "]";
	}
	
}
