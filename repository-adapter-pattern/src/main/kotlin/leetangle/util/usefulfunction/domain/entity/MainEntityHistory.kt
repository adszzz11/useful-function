package leetangle.util.usefulfunction.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import leetangle.util.usefulfunction.domain.entity.base.BaseEntity

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
    var body: MainEntityBody? = null
) : BaseEntity() {
    init {
        this.isUsed = false
    }

    @Id
    @GeneratedValue
    var historyId: Long = 0

    companion object {
        fun from(mainEntity: MainEntity): MainEntityHistory {
            return MainEntityHistory(
                id = mainEntity.id,
                body = mainEntity.body
            )
        }
    }

}