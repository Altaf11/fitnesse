package com.fitnesse.fixtures;

import com.fitnesse.First;

import fit.ColumnFixture;

public class FirstFixture extends ColumnFixture{

	public int getValue(){
		return new First().getAdd();
	}
}
