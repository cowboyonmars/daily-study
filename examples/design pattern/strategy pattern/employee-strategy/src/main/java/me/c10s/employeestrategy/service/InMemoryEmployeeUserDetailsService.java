package me.c10s.employeestrategy.service;

import me.c10s.employeestrategy.enums.GenderType;
import me.c10s.employeestrategy.enums.PositionType;
import me.c10s.employeestrategy.model.EmployeeUserDetails;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cowboyonmars
 * @date 2020/6/24 21:10
 */
@Service
public class InMemoryEmployeeUserDetailsService implements UserDetailsService {

    private final Map<String, EmployeeUserDetails> inMemoryUsers = new HashMap<>();

    public InMemoryEmployeeUserDetailsService() {
        EmployeeUserDetails employeeUserDetails = new EmployeeUserDetails();
        employeeUserDetails.setAge(10);
        employeeUserDetails.setPosition(PositionType.ENGINEER.getPosition());
        employeeUserDetails.setGender(GenderType.MALE.getGender());
        employeeUserDetails.setUsername("admin");
        employeeUserDetails.setPassword("{noop}password");
        List<GrantedAuthority> authorities = Collections.singletonList(new SimpleGrantedAuthority("ROLE_user"));
        employeeUserDetails.setAuthorities(authorities);
        inMemoryUsers.put(employeeUserDetails.getUsername(), employeeUserDetails);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails = inMemoryUsers.get(username);
        if (userDetails == null) {
            throw new UsernameNotFoundException(username);
        }
        return userDetails;
    }
}
