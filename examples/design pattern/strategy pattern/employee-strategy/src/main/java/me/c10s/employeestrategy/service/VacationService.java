package me.c10s.employeestrategy.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * @author cowboyonmars
 * @date 2020/6/24 20:20
 */
@Service
public class VacationService {

    public int getAnnualLeave(UserDetails userDetails) {
        return 0;
    }
}
