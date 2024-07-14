package leetangle.util.usefulfunction.domain.entity

import jakarta.persistence.Embeddable

/**
 *packageName    : leetangle.util.usefulfunction.domain.entity
 * fileName       : MainEntityBody
 * author         : sm
 * date           : 2024. 7. 14.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 7. 14.        sm       최초 생성
 */
@Embeddable
class MainEntityBody(
    var name: String? = "",
    var email: String? = null
) {

}