package leetangle.util.usefulfunction.domain.entity.base

import org.springframework.beans.factory.annotation.Value
import org.springframework.data.domain.AuditorAware
import org.springframework.stereotype.Component
import java.util.*

/**
 *packageName    : leetangle.util.usefulfunction.domain.entity
 * fileName       : BaseEntityAuditorAware
 * author         : sm
 * date           : 2024. 7. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 7. 14.        sm       최초 생성
 */
@Component
class BaseEntityAuditorAware : AuditorAware<String> {
    @Value("\${service.name}")
    private lateinit var serviceName: String


    @Value("\${service.machine-id}")
    private lateinit var machineId: String

    override fun getCurrentAuditor(): Optional<String> {
        return Optional.of("currentUser")
    }

    fun getCurrentProgramName(): Optional<String> {
        return Optional.of("${serviceName}_${machineId}")
    }
}