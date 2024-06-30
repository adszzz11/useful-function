package leetangle.util.usefulfunction.domain.repository

import leetangle.util.usefulfunction.domain.entity.MainEntity
import leetangle.util.usefulfunction.domain.entity.MainEntityHistory
import org.springframework.data.jpa.repository.JpaRepository

/**
 *packageName    : leetangle.util.usefulfunction.domain
 * fileName       : MainRepository
 * author         : sm
 * date           : 2024. 6. 30.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 30.        sm       최초 생성
 */
interface MainRepository: JpaRepository<MainEntity, Long>

interface MainHistoryRepository: JpaRepository<MainEntityHistory, Long>
