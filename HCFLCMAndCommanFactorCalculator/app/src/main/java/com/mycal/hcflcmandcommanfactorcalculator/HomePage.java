package com.mycal.hcflcmandcommanfactorcalculator;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomePage extends Fragment {

    View view;
    CardView divisionByNumber,
            primeFactors,
            threeNumberHCF,
            threeNumberLCM,
            twoNumberHCF,
            twoNumberLCM;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home_page, container, false);
        initElements();

        //Tap to navigate to a fragment
        tapToGoOnActivity(twoNumberHCF, R.id.action_homePage_to_twoNumberHCF);
        tapToGoOnActivity(twoNumberLCM, R.id.action_homePage_to_twoNumberLCM);
        tapToGoOnActivity(threeNumberHCF, R.id.action_homePage_to_threeNumberHCF);
        tapToGoOnActivity(threeNumberLCM, R.id.action_homePage_to_threeNumberLCM);
        tapToGoOnActivity(divisionByNumber, R.id.action_homePage_to_divisibleByNumber);
        tapToGoOnActivity(primeFactors, R.id.action_homePage_to_primeFactorsOfNumber);
        return view;
    }

    private void tapToGoOnActivity(CardView cardView, int id){
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(id);
            }
        });
    }


    private void initElements(){
        twoNumberHCF = view.findViewById(R.id.card_two_number_hcf);
        twoNumberLCM = view.findViewById(R.id.card_two_number_lcm);
        threeNumberHCF = view.findViewById(R.id.card_three_number_hcf);
        threeNumberLCM = view.findViewById(R.id.card_three_number_lcm);
        primeFactors = view.findViewById(R.id.card_prime_factor_of_number);
        divisionByNumber = view.findViewById(R.id.card_check_divisibility_of_number);
    }
}