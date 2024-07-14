package leetangle.util.usefulfunction

import org.springframework.context.annotation.Condition
import org.springframework.context.annotation.ConditionContext
import org.springframework.core.type.AnnotatedTypeMetadata

/**
 *packageName    : leetangle.util.usefulfunction
 * fileName       : SessionManagedCondition
 * author         : sm
 * date           : 2024. 6. 22.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 22.        sm       최초 생성
 */
class SessionManagedCondition: Condition {
    override fun matches(context: ConditionContext, metadata: AnnotatedTypeMetadata): Boolean {
        TODO("Not yet implemented")
    }
}