package com.ulven.test.invoker;

import com.ulven.test.service.RequestProcessor;

public class UlvenInvokerFactory {
	private static final UlvenInvokerFactory INSTANCE = new UlvenInvokerFactory();

	private UlvenInvokerFactory() {
	}

	public static UlvenInvokerFactory getInstance() {
		return INSTANCE;
	}

	public UlvenInvoker getInvoker(String[] args) {
//		if (null != args && args.length > 0) {
//			return new FileInvoker(new RequestProcessor(), args[0]);
//		}
		return new CommandLineInvoker(new RequestProcessor());
	}
}
