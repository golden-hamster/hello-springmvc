package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1(){
        ModelAndView mav = new ModelAndView("response.hello")
                .addObject("data", "hello!");
        System.out.println("ResponseViewController.responseViewV1");
        return mav;
    }
}
