package me.c10s.employeestrategy.enums;

import lombok.Getter;

/**
 * @author cowboyonmars
 * @date 2020/6/24 19:26
 */
@Getter
public enum PositionType {

    /**
     * 工程师
     */
    ENGINEER("engineer"),

    /**
     * 高级工程师
     */
    SENIOR("senior_engineer"),

    /**
     * 经理
     */
    MANAGER("manager");

    private String position;

    PositionType(String position) {
        this.position = position;
    }

}
