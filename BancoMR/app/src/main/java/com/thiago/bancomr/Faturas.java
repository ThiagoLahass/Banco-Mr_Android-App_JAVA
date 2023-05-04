package com.thiago.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.thiago.bancomr.databinding.ActivityFaturasBinding;
import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;

public class Faturas extends AppCompatActivity {

    private ActivityFaturasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFaturasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarFaturas.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        CreditCardView creditCardView = binding.cartaoCredito;
        creditCardView.setCardNumber("4235 6477 2802 5682");
        creditCardView.setCardName("Thiago F N Lahass");
        creditCardView.setExpiryDate("08/28");
        creditCardView.setType(CardType.MASTERCARD);
    }
}