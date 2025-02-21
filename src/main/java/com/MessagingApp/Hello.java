package com.MessagingApp;
import com.MessagingApp.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class Hello {


    @PutMapping("/put/{firstName}")
    public String sayHello3(@PathVariable String firstName,
                            @RequestParam String lastName ) {
        return "Hello" + firstName + " " + lastName + " from BridgeLabz !";
    }
}
