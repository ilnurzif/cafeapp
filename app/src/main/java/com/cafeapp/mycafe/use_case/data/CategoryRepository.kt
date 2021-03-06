package com.cafeapp.mycafe.use_case.data

import com.cafeapp.mycafe.use_case.repositories.ICategoryRepository
import com.less.repository.db.room.CategoryEntity
import io.reactivex.Completable
import io.reactivex.Single

class CategoryRepository(val dataSource: ICategoryDataSource): ICategoryRepository {
    override fun getAllCategory(): Single<List<CategoryEntity?>?>? {
        return dataSource.getAllCategory()
    }

    override fun saveCategory(category: CategoryEntity): Single<Long>? {
        return dataSource.saveCategory(category)
    }

    override fun loadCategory(categoryId: Long): Single<CategoryEntity> {
        return dataSource.loadCategory(categoryId)
    }

    override fun updateCategory(categoryEntity: CategoryEntity): Completable {
        return dataSource.updateCategory(categoryEntity)
    }

    override fun deleteCategory(category: CategoryEntity): Completable {
        return dataSource.deleteCategory(category)
    }
}