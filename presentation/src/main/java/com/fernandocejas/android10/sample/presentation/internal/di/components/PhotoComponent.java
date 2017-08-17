package com.fernandocejas.android10.sample.presentation.internal.di.components;

/**
 * Created by an.tran on 8/16/2017.
 */

import com.fernandocejas.android10.sample.presentation.internal.di.PerActivity;
import com.fernandocejas.android10.sample.presentation.internal.di.modules.ActivityModule;
import com.fernandocejas.android10.sample.presentation.view.fragment.PhotoFoldersFragment;
import com.fernandocejas.android10.sample.presentation.view.fragment.PhotoSelectorFragment;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class, })
public interface PhotoComponent extends ActivityComponent {

    void inject(PhotoFoldersFragment fragment);
    void inject(PhotoSelectorFragment fragment);
}
