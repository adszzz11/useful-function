package leetangle.util.usefulfunction.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.PrePersist
import jakarta.persistence.PreUpdate
import leetangle.util.usefulfunction.domain.MainEntityPJ
import java.time.LocalDateTime
import java.util.*

/**
 *packageName    : leetangle.util.usefulfunction.domain
 * fileName       : MainEntity
 * author         : sm
 * date           : 2024. 6. 30.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 30.        sm       최초 생성
 */
@Entity
class MainEntity(
    var name: String = "",
    var email: String? = null

) {
    @Id
    @GeneratedValue
    var id: Long = 0
    var createdDate: LocalDateTime = LocalDateTime.now()
    var lastModifiedDate: LocalDateTime = LocalDateTime.now()
    var createdBy: String = ""
    var modifiedBy: String = ""

    companion object {
        fun from(mainEntityPJ: MainEntityPJ): MainEntity {
            return MainEntity(
                name = mainEntityPJ.name,
                email = mainEntityPJ.email
            )
        }
    }

    @PrePersist
    fun prePersist() {
        createdDate = LocalDateTime.now()
        createdBy = UUID.randomUUID().toString()
        modifiedBy = createdBy
        lastModifiedDate = createdDate
    }

    @PreUpdate
    fun preUpdate() {
        modifiedBy = UUID.randomUUID().toString()
        lastModifiedDate = LocalDateTime.now()
    }
}