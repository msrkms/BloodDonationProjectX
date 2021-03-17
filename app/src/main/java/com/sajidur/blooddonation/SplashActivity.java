package com.sajidur.blooddonation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.res.ColorStateList;
import android.os.Bundle;

import com.sajidur.blooddonation.BackEnd.DataHolder;
import com.sajidur.blooddonation.adapter.OnBoardingAdapter;
import com.sajidur.blooddonation.items.OnBoardingItems;

import java.util.ArrayList;
import java.util.List;

public class SplashActivity extends AppCompatActivity {

    private OnBoardingAdapter onBoardingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        setOnBoardingItems();
        ViewPager2 viewPager2=findViewById(R.id.viewPager2);
        DataHolder.viewPager2=viewPager2;
        viewPager2.setAdapter(onBoardingAdapter);
    }

    private void setOnBoardingItems(){
        List<OnBoardingItems> onBoardingItems=new ArrayList<>();
        OnBoardingItems onBoardingItem =new OnBoardingItems();

        onBoardingItem.setImage(R.drawable.splash_one);
        onBoardingItem.setTitle("Donate Blood");
        onBoardingItem.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sit amet metus porttitor, tincidunt ante sit amet, lacinia purus. Ut nec libero cursus, tristique odio ac, dapibus neque");
        onBoardingItem.setColor(ColorStateList.valueOf(getResources().getColor(R.color.red)));
        onBoardingItem.setButtonText("Next");
        onBoardingItems.add(onBoardingItem);

        OnBoardingItems onBoardingItems1=new OnBoardingItems();
        onBoardingItems1.setImage(R.drawable.splash_two);
        onBoardingItems1.setTitle("Save Life");
        onBoardingItems1.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sit amet metus porttitor, tincidunt ante sit amet, lacinia purus. Ut nec libero cursus, tristique odio ac, dapibus neque");
        onBoardingItems1.setColor(ColorStateList.valueOf(getResources().getColor(R.color.blue)));
        onBoardingItems1.setButtonText("Start");

        onBoardingItems.add(onBoardingItems1);

        onBoardingAdapter =new OnBoardingAdapter(onBoardingItems);
    }
}