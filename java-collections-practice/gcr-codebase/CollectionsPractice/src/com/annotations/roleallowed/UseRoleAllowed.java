package com.annotations.roleallowed;
import java.lang.reflect.Method;

import java.lang.reflect.Method;

public class UseRoleAllowed {

    public static void main(String[] args) throws Exception {

        // Take role from user
        UserContext.takeUserRole();

        AdminService service = new AdminService();

        Method method = service.getClass().getMethod("deleteUser");

        if (method.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

            // Compare roles
            if (UserContext.currentRole.equals(roleAllowed.value())) {

                method.invoke(service); // access granted

            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}
