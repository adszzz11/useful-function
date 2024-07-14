package leetangle.util.usefulfunction.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import leetangle.util.usefulfunction.domain.MainEntityPJ
import leetangle.util.usefulfunction.domain.entity.base.BaseEntity

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
    var body: MainEntityBody? = null
) : BaseEntity(){
    @Id
    @GeneratedValue
    var id: Long = 0

    companion object {
        fun from(mainEntityPJ: MainEntityPJ): MainEntity {
            return MainEntity(
                MainEntityBody(mainEntityPJ.name,mainEntityPJ.email)
            )
        }
    }
}