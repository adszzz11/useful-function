package leetangle.util.usefulfunction.domain

import leetangle.util.usefulfunction.domain.entity.MainEntity
import java.time.LocalDateTime

/**
 *packageName    : leetangle.util.usefulfunction.domain
 * fileName       : MainEntityPJ
 * author         : sm
 * date           : 2024. 6. 30.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 30.        sm       최초 생성
 */
data class MainEntityPJ(
    var id: Long = 0,
    var name: String = "",
    var email: String? = null,
    var createdDate: LocalDateTime = LocalDateTime.now(),
    var lastModifiedDate: LocalDateTime = LocalDateTime.now(),
    var createdBy: String = "",
    var modifiedBy: String = ""
) {
    companion object {
        fun from(entity: MainEntity): MainEntityPJ {
            return MainEntityPJ(
                id = entity.id,
                name = entity.name,
                email = entity.email,
                createdDate = entity.createdDate,
                lastModifiedDate = entity.lastModifiedDate,
                createdBy = entity.createdBy,
                modifiedBy = entity.modifiedBy
            )
        }
    }
}