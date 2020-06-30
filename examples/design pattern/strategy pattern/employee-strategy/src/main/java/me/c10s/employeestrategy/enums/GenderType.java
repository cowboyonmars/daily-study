package me.c10s.employeestrategy.enums;

import lombok.Getter;

@Getter
public enum GenderType {

    /**
     * male
     */
    MALE("male"),

    /**
     * female
     */
    FEMALE("female");

    private String gender;

    GenderType(String gender) {
        this.gender = gender;
    }
}
