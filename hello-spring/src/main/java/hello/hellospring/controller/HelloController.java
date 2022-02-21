package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    //메서드가 hello라고 들어오면 이걸 호출을 해준다
    @GetMapping("hello")
    public String hello(Model model) {
        //attributeName와 attributeValue는 부가 설명 같은 것 !
        // data라는 이름의 hello 라는 값을 가진걸 넘기고, hello를 return 한다.
        model.addAttribute("data", "hello!!");
        return "hello";
    }
}
