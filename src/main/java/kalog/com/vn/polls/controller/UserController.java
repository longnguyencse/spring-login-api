package kalog.com.vn.polls.controller;

import kalog.com.vn.polls.payload.ApiResponse;
import kalog.com.vn.polls.security.UserPrincipal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Author Mikorn vietnam
 * Created on 25-Feb-19.
 */
@RestController
public class UserController {

    @RequestMapping(method = RequestMethod.POST, value = "/create/poll")
    public ResponseEntity<?> createPoll() {
        // my stuff
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        userPrincipal.getId();
        return new ResponseEntity(new ApiResponse(true,
                String.format("create poll in the queue, user is %s", userPrincipal.getName())),
                HttpStatus.OK);
    }
}
