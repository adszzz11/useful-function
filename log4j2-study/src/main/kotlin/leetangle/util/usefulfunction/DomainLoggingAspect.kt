package leetangle.util.usefulfunction

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

/**
 *packageName    : leetangle.util.usefulfunction
 * fileName       : DomainLoggingAspect
 * author         : sm
 * date           : 5/25/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 5/25/24        sm       최초 생성
 */
@Component
@Aspect
class DomainLoggingAspect {

    @Around("@annotation(annotation)")
    fun executeAspect(joinpoint: ProceedingJoinPoint, annotation: DomainAnnotation) : Any{
        log.info { "ASPECT Success" }
        return joinpoint.proceed()
    }
}