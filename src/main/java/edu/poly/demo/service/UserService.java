package edu.poly.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service
@Component
// @Repository
public class UserService {
    public String getUserInfo() {
        return "User information";
    }
    public String getCompanyInfo() {
        return "Company information";
    }
}
