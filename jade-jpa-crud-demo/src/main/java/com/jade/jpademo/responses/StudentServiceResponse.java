/**
 * 
 */
package com.jade.jpademo.responses;

/**
 * 
 */
public class StudentServiceResponse<T> {

	T data;
	String errorMessage;
	/**
	 * @param data
	 * @param errorMessage
	 */
	public StudentServiceResponse(T data, String errorMessage) {
		this.data = data;
		this.errorMessage = errorMessage;
	}
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
