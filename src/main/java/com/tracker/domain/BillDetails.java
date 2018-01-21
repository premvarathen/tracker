/**
 * 
 */
package com.tracker.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author premvarathen
 *
 */
public class BillDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public BillDetails() {
		// TODO Auto-generated constructor stub
	}

	private Date billGenerated;
	
	private String  purpose;
	
	private Date billPaid;
	
	private Boolean paid;
	
	private String comments;

	public Date getBillGenerated() {
		return billGenerated;
	}

	public void setBillGenerated(Date billGenerated) {
		this.billGenerated = billGenerated;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Date getBillPaid() {
		return billPaid;
	}

	public void setBillPaid(Date billPaid) {
		this.billPaid = billPaid;
	}

	public Boolean getPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
	
}
