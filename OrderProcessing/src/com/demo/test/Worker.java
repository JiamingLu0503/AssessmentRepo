package com.demo.test;

import java.util.ArrayDeque;
import java.util.Queue;

public class Worker extends Thread {
	
	private Queue<Order> orders;
	
	public Worker() {
		orders = new ArrayDeque<>(5);
	}
	
	@Override
    public void run() {
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
