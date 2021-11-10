package com.ulven.test.invoker;

import com.ulven.test.exception.UlvenException;
import com.ulven.test.exception.ValidationException;
import com.ulven.test.service.RequestProcessor;

import java.util.Scanner;

import static com.ulven.test.constant.UlvenConstant.EXIT;

public class CommandLineInvoker implements UlvenInvoker {

	private RequestProcessor requestProcessor;

	public CommandLineInvoker(RequestProcessor requestProcessor) {
		this.requestProcessor = requestProcessor;
	}

	@Override
	public void invoke() {
		Scanner in = new Scanner(System.in);
		String inputCommand = in.nextLine();
		while (!EXIT.equalsIgnoreCase(inputCommand)) {
			try {
				requestProcessor.execute(inputCommand);
			} catch (UlvenException | ValidationException e) {
				System.out.println(e.getMessage());
			}
			inputCommand = in.nextLine();
		}
		in.close();
	}
}
