package pw.tineo.kotlindemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pw.tineo.kotlindemo.model.Article

@RestController
//@RequestMapping("/api")
class DefaultController {
    @GetMapping("/")
    fun getIndex() : String {
        return "index"
    }
}