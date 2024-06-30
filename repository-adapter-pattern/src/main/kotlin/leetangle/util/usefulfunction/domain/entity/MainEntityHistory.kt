package leetangle.util.usefulfunction.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.LocalDateTime

/**
 *packageName    : leetangle.util.usefulfunction.domain
 * fileName       : MainEntityHistory
 * author         : sm
 * date           : 2024. 6. 30.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 30.        sm       최초 생성
 */

@Entity
class MainEntityHistory(
    var id: Long = 0,
    var name: String = "",
    var email: String? = null,
    var createdDate: LocalDateTime = LocalDateTime.now(),
    var lastModifiedDate: LocalDateTime = LocalDateTime.now(),
    var createdBy: String = "",
    var modifiedBy: String = ""
) {
    @Id
    @GeneratedValue
    var historyId: Long = 0

    companion object {
        fun from(mainEntity: MainEntity): MainEntityHistory {
            return MainEntityHistory(
                id = mainEntity.id,
                name = mainEntity.name,
                email = mainEntity.email,
                createdDate = mainEntity.createdDate,
                lastModifiedDate = mainEntity.lastModifiedDate,
                createdBy = mainEntity.createdBy,
                modifiedBy = mainEntity.modifiedBy
            )
        }
    }

}