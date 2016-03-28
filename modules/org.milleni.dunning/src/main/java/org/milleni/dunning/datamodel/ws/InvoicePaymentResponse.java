package org.milleni.dunning.datamodel.ws;

public class InvoicePaymentResponse {
	private ResponseCode responseCode;
	private String responseDesc;
	private Status status;
	
	public ResponseCode getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(ResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDesc() {
		return responseDesc;
	}
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	

}

enum Status {
	ACTIVATED ,
	DUNNING_FINISHED,
	NOT_ACTIVATED	
}

enum ResponseCode{
	BussinessError,
	SystemError,
	Success
}
