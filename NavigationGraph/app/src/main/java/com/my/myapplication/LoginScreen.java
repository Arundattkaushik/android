package com.my.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LoginScreen extends Fragment {

    View view;
    Button homeButton, registrationButton, forgotPasswordButton ;
    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_login_screen, container, false);
        homeButton = view.findViewById(R.id.home_button);
        registrationButton = view.findViewById(R.id.registration_button);
        forgotPasswordButton = view.findViewById(R.id.forgot_password_button);
        homeButton.setOnClickListener(this::homeScreen);
        registrationButton.setOnClickListener(this::registrationScreen);
        forgotPasswordButton.setOnClickListener(this::forgotPasswordScreen);

        return view;
    }

    private void homeScreen(View view){
        Navigation.findNavController(view).navigate(R.id.action_loginScreen_to_homeScreen);
    }

    private void registrationScreen(View view){
        Navigation.findNavController(view).navigate(R.id.action_loginScreen_to_registrationPage);
    }

    private void forgotPasswordScreen(View view){
        Navigation.findNavController(view).navigate(R.id.action_loginScreen_to_forgotPassword);
    }
}