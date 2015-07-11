package com.thebyteguru.utils;

public class Time {

	public static final long	SECOND	= 1000000000l;

	public static long get() {
		return System.nanoTime();
	}

}
