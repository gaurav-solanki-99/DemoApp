package com.example.demoapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.demoapp.databinding.LayoutMcxTradeBinding;

public class Mcxtrade extends AppCompatActivity
{
    LayoutMcxTradeBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= LayoutMcxTradeBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        binding.btnTabOrder.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        binding.llorderForm.setVisibility(View.GONE);
                        binding.llmarketForm.setVisibility(View.VISIBLE);

                    }
                }
        );

        binding.btnTabMarket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.llorderForm.setVisibility(View.VISIBLE);
                binding.llmarketForm.setVisibility(View.GONE);
            }
        });




    }
}
