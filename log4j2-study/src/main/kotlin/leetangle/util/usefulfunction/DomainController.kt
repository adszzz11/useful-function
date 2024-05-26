package leetangle.util.usefulfunction

import org.apache.logging.log4j.ThreadContext
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 *packageName    : leetangle.util.usefulfunction
 * fileName       : DomainController
 * author         : sm
 * date           : 5/25/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 5/25/24        sm       최초 생성
 */
@RestController
class DomainController(val service: DomainService) {
    @GetMapping("/oneSecondJob")

    fun oneSec() : String{
        ThreadContext.put("TID","OneSec")
        log.info { "oneSec" }
        val res = service.oneSecondJob()
        ThreadContext.clearMap()
        return res
    }

    @GetMapping("/twoSecondJob")
    fun twoSec() : String{
        ThreadContext.put("TID","TwoSec")
        log.info { "twoSec" }
        val res = service.twoSecondJob()
        ThreadContext.clearMap()
        return res
    }
    @GetMapping("/exception")
    fun exception(): String {
        ThreadContext.put("TID","Exception")
        log.info { "exception" }
        val res = service.oneSecondAndExceptionJob()
        ThreadContext.clearMap()
        return res
    }
}