package com.demo.test;

public class Order {

	private State state;
	private int orderNo;
		
	public Order() {
		super();
	}

	public Order(int orderNo) {
		super();
		this.state = State.NEW;
		this.orderNo = orderNo;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	@Override
	public String toString() {
		return "Order [state=" + state + ", orderNo=" + orderNo + "]";
	}
	
}
