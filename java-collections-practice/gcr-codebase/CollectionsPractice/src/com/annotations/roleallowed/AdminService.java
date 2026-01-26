package com.annotations.roleallowed;

public class AdminService {

    // Only ADMIN role can access this method
    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully");
    }
}

