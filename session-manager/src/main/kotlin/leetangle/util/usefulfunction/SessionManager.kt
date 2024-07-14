package leetangle.util.usefulfunction

import org.springframework.stereotype.Component


@Component
class SessionManager {
    fun loadSession(session: ManagedSession) {

    }
    fun saveSession(session: ManagedSession) {

    }
    fun clearSession(session: ManagedSession) {

    }
    fun initSession(): ManagedSession {
        return ManagedSession()
    }
}
