package com.example.demo.ejb;

import javax.ejb.Remote;

@Remote
public interface Calculator {

	public float calculateInterest(long money);
}
