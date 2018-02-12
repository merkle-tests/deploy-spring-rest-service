package com.github.unqualsevol.spring;

import com.github.unqualsevol.spring.model.Message;
import org.springframework.web.bind.annotation.*;

/**
 * Created by agimenez on 19/09/17.
 */
@RestController
public class HelloWorldController {

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    @ResponseBody
    Message helloworld(@RequestParam("name") String userId) {
        return new Message(userId);
    }
}
