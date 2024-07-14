package leetangle.util.usefulfunction

import jakarta.persistence.*
import java.time.Instant
import java.util.Date

/**
 *packageName    : leetangle.util.usefulfunction
 * fileName       : ManagedSession
 * author         : sm
 * date           : 2024. 6. 21.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 21.        sm       최초 생성
 */

@Entity
@Table(name = "SESSION")
class ManagedSession(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    var hiddenContext: String = "",
    var openContext: String = "",
    var created: Date = Date.from(Instant.now()),
    var expires: Date = Date.from(Instant.now()),
    var modified: Date = Date.from(Instant.now()),
)

fun main() {
    var created: Date = Date.from(Instant.now())
    var expires: Date = Date.from(Instant.now())
    var modified: Date = Date.from(Instant.now())
    println(created)
    println(expires)
    println(modified)
}