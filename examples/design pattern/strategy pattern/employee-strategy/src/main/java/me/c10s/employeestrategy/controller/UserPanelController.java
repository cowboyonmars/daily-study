package me.c10s.employeestrategy.controller;

import me.c10s.employeestrategy.model.EmployeeUserDetails;
import me.c10s.employeestrategy.service.VacationService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cowboyonmars
 * @date 2020/6/24 20:15
 */
@RestController
public class UserPanelController {

    private VacationService vacationService;

    public UserPanelController(VacationService vacationService) {
        this.vacationService = vacationService;
    }

    @GetMapping("/vacation")
    public String getAnnualLeave(Authentication authentication) {
        Object principal = authentication.getPrincipal();
        if (principal instanceof EmployeeUserDetails) {
            EmployeeUserDetails userDetails = (EmployeeUserDetails) principal;
            int vacation = vacationService.getAnnualLeave(userDetails);
            return "your annual leave: " + vacation;
        }
        return null;
    }

}
