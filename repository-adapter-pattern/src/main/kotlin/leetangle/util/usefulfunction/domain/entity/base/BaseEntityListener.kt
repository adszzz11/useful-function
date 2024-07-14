package leetangle.util.usefulfunction.domain.entity.base

import jakarta.persistence.PrePersist
import jakarta.persistence.PreUpdate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.time.LocalDateTime

/**
 *packageName    : leetangle.util.usefulfunction.domain.entity
 * fileName       : BaseEntityListener
 * author         : sm
 * date           : 2024. 7. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 7. 14.        sm       최초 생성
 */
@Component
class BaseEntityListener {

    @Autowired
    private lateinit var auditorAware: BaseEntityAuditorAware

    @PrePersist
    fun prePersist(entity: BaseEntity) {
        setAuditFields(entity, true)
    }

    @PreUpdate
    fun preUpdate(entity: BaseEntity) {
        setAuditFields(entity, false)
    }

    private fun setAuditFields(entity: BaseEntity, isNew: Boolean) {
        entity.run {
            if (isNew) {
                createdDate = LocalDateTime.now()
                createdBy = auditorAware.currentAuditor.orElse(null)
                createdProgram = auditorAware.getCurrentProgramName().orElse(null)

            }
            lastModifiedDate = LocalDateTime.now()
            lastModifiedBy = auditorAware.currentAuditor.orElse(null)
            lastModifiedProgram = auditorAware.getCurrentProgramName().orElse(null)
        }
    }
}