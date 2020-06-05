package com.example.androishaper.bottomnavigation.ui.cart;

import com.example.androishaper.bottomnavigation.R;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CartViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public CartViewModel() {
        mText=new MutableLiveData<>();
        mText.setValue("This is Cart fragment"+ R.drawable.ic_launcher_background);
    }
    public LiveData<String> getText(){
        return mText;
    }
}
