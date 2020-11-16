package com.cafeapp.mycafe.use_case.interactors.categories

import com.cafeapp.mycafe.use_case.data.CategoryResult
import com.cafeapp.mycafe.use_case.repositories.ICategoryRepository
import com.less.repository.db.room.CategoryEntity
import io.reactivex.Completable
import io.reactivex.Single

class CategoryInteractor(val repository: ICategoryRepository) : ICategoryInteractor {
    override fun getAllCategory(): Single<List<CategoryEntity?>?>? {
        return repository.getAllCategory()
    }

    override fun saveCategory(category: CategoryEntity): Single<Long>? {
        return repository.saveCategory(category)
    }

    override fun loadCategory(categoryId: Int): Single<CategoryResult> {
        return repository.loadCategory(categoryId)
    }

    override fun deleteCategory(category: CategoryEntity): Completable {
        return repository.deleteCategory(category)
    }
}