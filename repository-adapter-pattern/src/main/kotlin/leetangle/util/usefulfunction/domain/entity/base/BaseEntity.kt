package leetangle.util.usefulfunction.domain.entity.base

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime

/**
 *packageName    : leetangle.util.usefulfunction.domain.entity
 * fileName       : BaseEntity
 * author         : sm
 * date           : 2024. 7. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 7. 14.        sm       최초 생성
 */
@MappedSuperclass
@EntityListeners(BaseEntityListener::class)
open class BaseEntity{
    @Column(name = "created_at", updatable = false)
    var createdDate: LocalDateTime? = null

    @Column(name = "modified_date", updatable = false)
    var lastModifiedDate: LocalDateTime? = null

    @Column(name = "created_by", updatable = false)
    var createdBy: String? = null

    @Column(name = "modified_by", updatable = false)
    var lastModifiedBy: String? = null

    @Column(name = "created_program", updatable = false)
    var createdProgram: String? = null

    @Column(name = "modified_program", updatable = false)
    var lastModifiedProgram: String? = null

    @Transient
    var isUsed: Boolean = true
}
