package leetangle.util.usefulfunction

import org.springframework.stereotype.Service

/**
 *packageName    : leetangle.util.usefulfunction
 * fileName       : DomainService
 * author         : sm
 * date           : 5/25/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 5/25/24        sm       최초 생성
 */
@Service
class DomainService {
    @DomainAnnotation
    fun oneSecondJob(): String {
        Thread.sleep(1000)
        return "FINISH"
    }

    fun twoSecondJob(): String {
        Thread.sleep(2000)
        return "FINISH"
    }

    @Throws(Exception::class)
    fun oneSecondAndExceptionJob(): String {
        Thread.sleep(1000)
        throw Exception("EXCEPTION CAUCH")

        return "FINISH"
    }
}