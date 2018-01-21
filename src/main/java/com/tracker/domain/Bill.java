/**
 * 
 */
package com.tracker.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author premvarathen
 *
 */
public class Bill implements Serializable {

	/**
	 * 
	 */
	public Bill() {
		// TODO Auto-generated constructor stub
	}

	private String billNo;
	private Date billDate;
	private BigDecimal amount;
	private BillDetails billDetails;
	public String getBillNo() {
		return billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BillDetails getBillDetails() {
		return billDetails;
	}
	public void setBillDetails(BillDetails billDetails) {
		this.billDetails = billDetails;
	}
}
