package leetangle.util.usefulfunction

import org.springframework.context.annotation.Conditional
import org.springframework.context.annotation.Configuration

/**
 *packageName    : leetangle.util.usefulfunction
 * fileName       : ManagedSessionConfig
 * author         : sm
 * date           : 2024. 6. 22.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 22.        sm       최초 생성
 */

@Configuration
@Conditional(value = [SessionManagedCondition::class])
class ManagedSessionConfig {
}