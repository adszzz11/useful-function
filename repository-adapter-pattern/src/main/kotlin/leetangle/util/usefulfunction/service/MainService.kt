package leetangle.util.usefulfunction.service

import leetangle.util.usefulfunction.domain.MainEntityPJ
import leetangle.util.usefulfunction.domain.MainRepositoryAdapter
import org.springframework.stereotype.Service

/**
 *packageName    : leetangle.util.usefulfunction.service
 * fileName       : MainService
 * author         : sm
 * date           : 2024. 6. 30.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 30.        sm       최초 생성
 */
@Service
class MainService(val component: MainRepositoryAdapter) {
    fun saveMainEntity(
        name: String,
        email: String
    ): MainEntityPJ {
        return component.save(
            MainEntityPJ(
                name = name,
                email = email
            )
        )
    }

    fun updateMainEntity(
        name: String,
        email: String,
        id: Long
    ) : String{
        component.update(
            MainEntityPJ(
                id = id,
                name = name,
                email = email
            )
        )
        return "SUCCESS"
    }

    fun getMainEntity(): Map<String, Any> {
        return component.select()
    }
}