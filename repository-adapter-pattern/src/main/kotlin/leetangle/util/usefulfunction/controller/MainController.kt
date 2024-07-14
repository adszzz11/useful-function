package leetangle.util.usefulfunction.controller

import leetangle.util.usefulfunction.service.MainService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Random

/**
 *packageName    : leetangle.util.usefulfunction.controller
 * fileName       : MainController
 * author         : sm
 * date           : 2024. 6. 30.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 30.        sm       최초 생성
 */
@RestController
class MainController(val service: MainService) {

    @GetMapping("/save")
    fun home(): String {
        service.saveMainEntity("smlee","smlee@a.a")
        return "success"
    }

    @GetMapping("/update")
    fun update(): String {
        service.updateMainEntity(name = "smlee${Random().nextInt()}", email = "smlee@a.a${Random().nextInt()}", id = 1)
        return "success"
    }


    @GetMapping("/list")
    fun list(): Map<String, Any> {

        return service.getMainEntity()
    }
}