package com.sivkov.base.di.scopes

import dagger.releasablereferences.CanReleaseReferences
import javax.inject.Scope


@Scope
@Retention(AnnotationRetention.RUNTIME)
@CanReleaseReferences
annotation class PerActivity