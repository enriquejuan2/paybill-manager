package com.thomaskioko.paybillmanager.data.store.billcategory

import com.thomaskioko.paybillmanager.data.repository.billcategory.BillCategoryDataStore
import javax.inject.Inject

/**
 * Helper class that decides which data source to use.
 */
open class BillCategoryDataStoreFactory @Inject constructor(
        private val billCategoryDataStore: BillCategoryCacheDataStore
) {
    open fun getCacheDataStore(): BillCategoryDataStore {
        return billCategoryDataStore
    }
}