package com.example;

import java.time.LocalTime;

public class SystemTimeProvider implements TimeProvider {
    @Override
    public LocalTime now() {
        return LocalTime.now();
    }
}
