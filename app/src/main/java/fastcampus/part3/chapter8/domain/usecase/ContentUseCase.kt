package fastcampus.part3.chapter8.domain.usecase

import fastcampus.part3.chapter8.domain.model.Content
import fastcampus.part3.chapter8.domain.repository.ContentRepository
import javax.inject.Inject

class ContentUseCase @Inject constructor(
    private val contentRepository: ContentRepository
) {
    fun loadList() = contentRepository.loadList()

    suspend fun save(item: Content) = contentRepository.insert(item)

    suspend fun delete(item: Content) = contentRepository.delete(item)
}