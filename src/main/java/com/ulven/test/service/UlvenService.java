package com.ulven.test.service;

import com.ulven.test.exception.ValidationException;

import java.io.*;
import java.security.SecureRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UlvenService {
    Logger logger = Logger.getLogger(UlvenService.class.getName());

    private static UlvenService instance;

    static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static SecureRandom rnd = new SecureRandom();

    public static UlvenService getInstance() {
        if(instance == null) {
            instance = new UlvenService();
        }
        return instance;
    }

    public void generateRandomString(Integer number) {
        if (number == null || number <= 0)
            throw new ValidationException("Invalid parameter, size should be bigger than 0");

        try {
            File fileDir = new File("output");
            if (!fileDir.exists()) {
                logger.info("Target file output created.");
                fileDir.mkdirs();
            }

            File newFile = new File("output/filename" + System.currentTimeMillis() + ".txt");

            FileOutputStream fos = new FileOutputStream(newFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

            for(int i = 1; i <= number; i++) {
                StringBuilder sb = new StringBuilder(100);
                for(int j = 0; j < 100; j++)
                    sb.append(AB.charAt(rnd.nextInt(AB.length())));
                bw.write(sb.toString());
                bw.newLine();
                logger.log(Level.INFO, "current memory: " + Runtime.getRuntime().totalMemory()/1000000 + "MB");
            }

            bw.close();
            System.out.println("Create random string with size "+ number);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
