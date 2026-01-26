package com.reflection.dicontainer;


//Consumer class that depends on MessageService
public class UserController {

 @Inject // This field should be injected by our DI container
 private MessageService messageService;

 public void process() {
     messageService.sendMessage("Hello from UserController!");
 }
}

