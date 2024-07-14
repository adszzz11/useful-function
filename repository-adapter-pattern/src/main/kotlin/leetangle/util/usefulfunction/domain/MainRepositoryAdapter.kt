package leetangle.util.usefulfunction.domain

import leetangle.util.usefulfunction.domain.entity.MainEntity
import leetangle.util.usefulfunction.domain.entity.MainEntityHistory
import leetangle.util.usefulfunction.domain.repository.MainHistoryRepository
import leetangle.util.usefulfunction.domain.repository.MainRepository
import org.springframework.stereotype.Service

/**
 *packageName    : leetangle.util.usefulfunction.domain
 * fileName       : MainRepositoryAdapter
 * author         : sm
 * date           : 2024. 6. 30.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024. 6. 30.        sm       최초 생성
 */
@Service
class MainRepositoryAdapter(
    val mainRepository: MainRepository,
    val mainHistoryRepository: MainHistoryRepository
) {
    fun save(main: MainEntityPJ): MainEntityPJ {
        println("save called")
        val save: MainEntity = mainRepository.save(MainEntity.from(main))
        val saveHistory = mainHistoryRepository.save(MainEntityHistory.from(save))
        println(saveHistory)
        return MainEntityPJ.from(save)
    }

    fun update(main: MainEntityPJ) {
        mainRepository.findById(main.id).ifPresentOrElse(
            {
                it.body!!.name = main.name
                it.body!!.email = main.email
                val save = mainRepository.save(it)
                mainHistoryRepository.save(MainEntityHistory.from(save))
            },{
                throw Exception()
            }
        )
    }


    fun select(): Map<String, Any> {
        val mutableMapOf = mutableMapOf<String, Any>()
        val mainAll = mainRepository.findAll()
        val historyAll = mainHistoryRepository.findAll()
        mutableMapOf["mainAll"] = mainAll
        mutableMapOf["historyAll"] = historyAll

        return mutableMapOf
    }

}