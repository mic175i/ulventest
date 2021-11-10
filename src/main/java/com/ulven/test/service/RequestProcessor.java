package com.ulven.test.service;

import com.ulven.test.constant.UlvenConstant;
import com.ulven.test.exception.UlvenException;

import static com.ulven.test.exception.UlvenErrorStatus.INVALID_INPUT_COMMAND;

public class RequestProcessor {

    private UlvenService ulvenService;

    public void execute(String inputCommand) {
        String[] inputCommandDetails = inputCommand.split(" ");
        switch (inputCommandDetails[0]) {
            case UlvenConstant.CREATE_TXT_FILE:
                try {
                    int capacity = Integer.parseInt(inputCommandDetails[1]);
                    UlvenService.getInstance().generateRandomString(capacity);
                } catch (Exception e) {
                    throw new UlvenException(INVALID_INPUT_COMMAND);
                }
                break;
            case UlvenConstant.EXIT:
                System.exit(0);
            default:
                break;
        }
    }

    public UlvenService getUlvenService() {
        return ulvenService;
    }

    public void setUlvenService(UlvenService ulvenService) {
        this.ulvenService = ulvenService;
    }
}
