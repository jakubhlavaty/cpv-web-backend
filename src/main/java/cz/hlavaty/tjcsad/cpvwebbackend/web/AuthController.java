package cz.hlavaty.tjcsad.cpvwebbackend.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hlavaty on 8/3/17.
 */
@RestController
public class AuthController {
//    @RequestMapping("/user")
//    public CpvUserDetails getAuthenticatedUser(@AuthenticationPrincipal CpvUserDetails activeUser) {
//        return activeUser;
//    }

    @RequestMapping("/test")
    public String test() {
        return "hello";
    }
}
