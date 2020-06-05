package com.example.androishaper.bottomnavigation.ui.notifications;

import com.example.androishaper.bottomnavigation.R;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment"+ R.drawable.ic_launcher_background);
    }

    public LiveData<String> getText() {
        return mText;
    }
}