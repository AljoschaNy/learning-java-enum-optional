package org.example;

public enum DaysOfWeek {
    MONDAY("monday", "working day"),
    TUESDAY("tuesday", "working day"),
    WEDNESDAY("wednesday", "working day"),
    THURSDAY("thursday", "working day"),
    FRIDAY("friday", "working day"),
    SATURDAY("saturday", "weekend"),
    SUNDAY("sunday", "weekend");

    private final String weekday;
    private final String weekdayType;

    DaysOfWeek(String weekday, String weekDayType) {
        this.weekday = weekday;
        this.weekdayType = weekDayType;
    }

    public String getWeekday() {
        return weekday;
    }

    public String getWeekDayType() {
        return weekdayType;
    }
}