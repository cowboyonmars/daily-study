package me.c10s.employeestrategy.handler;

import me.c10s.employeestrategy.model.EmployeeUserDetails;

/**
 * @author cowboyonmars
 * @date 2020/6/30 23:43
 */
public interface VacationHandler {
    /**
     * 根据用户信息计算用户本年度的休假天数
     *
     * @param userDetails 用户信息
     * @return 用户本年度的休假天数
     */
    int handle(EmployeeUserDetails userDetails);
}
