package com.example.alpbaba.utils;

import java.time.LocalDateTime;

public class LogUtil {
    public static void log(String message) {
        System.out.println(LocalDateTime.now() + " - " + message);
    }
}
