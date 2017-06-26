package com.efebudak.androidsampleproject.di;

import android.support.v4.app.Fragment;

import com.efebudak.androidsampleproject.moviedetail.MovieDetailFragment;
import com.efebudak.androidsampleproject.moviedetail.MovieDetailFragmentSubComponent;
import com.efebudak.androidsampleproject.movielist.MovieListFragment;
import com.efebudak.androidsampleproject.movielist.MovieListFragmentSubComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * Created by efebudak on 24/06/2017.
 */

@Module
public abstract class FragmentModule {

    @Binds
    @IntoMap
    @FragmentKey(MovieListFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindMovieListFragment(MovieListFragmentSubComponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(MovieDetailFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindMovieDetailFragment(MovieDetailFragmentSubComponent.Builder builder);
}
