package com.example.androishaper.bottomnavigation.ui.cart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androishaper.bottomnavigation.R;

import java.util.zip.Inflater;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

public class CartFragment extends Fragment {

    private CartViewModel cartViewModel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        cartViewModel= ViewModelProviders.of(this).get(CartViewModel.class);
        View root=inflater.inflate(R.layout.fragment_cart,container,false);
        final TextView textViewt=root.findViewById(R.id.text_cart);
        textViewt.setText("Cart View Fragment");
        return root;
    }
}
