package com.thomaskioko.paybillmanager.mobile.injection.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.thomaskioko.paybillmanager.mobile.injection.annotation.ViewModelKey
import com.thomaskioko.paybillmanager.presentation.ViewModelFactory
import com.thomaskioko.paybillmanager.presentation.viewmodel.JengaRequestsViewModel
import com.thomaskioko.paybillmanager.presentation.viewmodel.SharedViewModel
import com.thomaskioko.paybillmanager.presentation.viewmodel.bill.CreateBillsViewModel
import com.thomaskioko.paybillmanager.presentation.viewmodel.bill.GetBillsViewModel
import com.thomaskioko.paybillmanager.presentation.viewmodel.billcategory.CreateBillCategoryViewModel
import com.thomaskioko.paybillmanager.presentation.viewmodel.billcategory.GetBillCategoryViewModel
import com.thomaskioko.paybillmanager.presentation.viewmodel.category.CreateCategoryViewModel
import com.thomaskioko.paybillmanager.presentation.viewmodel.category.GetCategoriesViewModel
import com.thomaskioko.paybillmanager.presentation.viewmodel.category.GetCategoryViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
@Suppress("unused")
abstract class PresentationModule {


    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(CreateCategoryViewModel::class)
    abstract fun bindCreateCategoryViewModel(viewModel: CreateCategoryViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(GetCategoryViewModel::class)
    abstract fun bindGetCategoryViewModel(viewModel: GetCategoryViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(GetCategoriesViewModel::class)
    abstract fun bindGetCategoriesViewModel(viewModel: GetCategoriesViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(GetBillsViewModel::class)
    abstract fun bindGetBillsViewModel(viewModel: GetBillsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CreateBillsViewModel::class)
    abstract fun bindCreateBillsViewModel(viewModel: CreateBillsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SharedViewModel::class)
    abstract fun bindSharedViewModel(viewModel: SharedViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(JengaRequestsViewModel::class)
    abstract fun bindJengaRequestsViewModel(viewModel: JengaRequestsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CreateBillCategoryViewModel::class)
    abstract fun bindCreateBillCategoryViewModel(viewModel: CreateBillCategoryViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(GetBillCategoryViewModel::class)
    abstract fun bindGetBillCategoryViewModel(viewModel: GetBillCategoryViewModel): ViewModel
}

