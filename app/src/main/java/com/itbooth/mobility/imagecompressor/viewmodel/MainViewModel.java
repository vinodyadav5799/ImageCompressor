package com.itbooth.mobility.imagecompressor.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public final MutableLiveData<Boolean> isLoaded = new MutableLiveData<>();
}
