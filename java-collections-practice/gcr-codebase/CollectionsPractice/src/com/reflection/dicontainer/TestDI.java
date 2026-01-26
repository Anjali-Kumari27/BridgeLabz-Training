package com.reflection.dicontainer;


public class TestDI {
    public static void main(String[] args) {

        // Get instance of UserController with dependencies injected
        UserController controller = SimpleDIContainer.getInstance(UserController.class);

        // Call method; MessageService is injected automatically
        controller.process();
    }
}

