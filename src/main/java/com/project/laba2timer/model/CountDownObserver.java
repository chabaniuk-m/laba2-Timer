package com.project.laba2timer.model;

public interface CountDownObserver {
    void update(int seconds);
    void timeIsUp();
}
