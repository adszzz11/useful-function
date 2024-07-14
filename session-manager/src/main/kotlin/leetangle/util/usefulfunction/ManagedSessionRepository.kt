package leetangle.util.usefulfunction

import org.springframework.data.jpa.repository.JpaRepository

/**
 *packageName    : leetangle.util.usefulfunction
 * fileName       : ManagedSessionRepository
 * author         : sm
 * date           : 2024. 6. 22.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 22.        sm       최초 생성
 */

interface ManagedSessionRepository: JpaRepository<ManagedSession, Long> {
}