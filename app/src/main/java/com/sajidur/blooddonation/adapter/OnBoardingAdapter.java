package com.sajidur.blooddonation.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.sajidur.blooddonation.BackEnd.DataHolder;
import com.sajidur.blooddonation.R;
import com.sajidur.blooddonation.items.OnBoardingItems;

import java.util.List;

public class OnBoardingAdapter extends RecyclerView.Adapter<OnBoardingAdapter.OnBoardingViewHolder>{
    public OnBoardingAdapter(List<OnBoardingItems> onBoardingItems) {
        this.onBoardingItems = onBoardingItems;
    }

    private List<OnBoardingItems> onBoardingItems;

    @NonNull
    @Override
    public OnBoardingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new OnBoardingViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout_viewpager,parent,false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull OnBoardingViewHolder holder, int position) {
        holder.setData(onBoardingItems.get(position));

    }

    @Override
    public int getItemCount() {
        return onBoardingItems.size();
    }

    class OnBoardingViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewTitle;
        private TextView textViewDetails;
        private ImageView imageView;
        private MaterialCardView materialCardView;
        private MaterialButton materialButton;

        public OnBoardingViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle=itemView.findViewById(R.id.textViewTitle);
            textViewDetails=itemView.findViewById(R.id.textViewDetails);
            imageView=itemView.findViewById(R.id.imageViewOnBoarding);
            materialCardView=itemView.findViewById(R.id.materialCardViewOnBoarding);
            materialButton=itemView.findViewById(R.id.materialButtonOnBoarding);
        }

       public  void setData(OnBoardingItems boardingItem){
            textViewTitle.setText(boardingItem.getTitle());
            textViewDetails.setText(boardingItem.getDescription());
            imageView.setImageResource(boardingItem.getImage());
            materialCardView.setBackgroundTintList(boardingItem.getColor());
            materialButton.setText(boardingItem.getButtonText());
            materialButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonAction();
                }
            });
        }

        private void buttonAction(){
            ViewPager2 viewPager2= DataHolder.viewPager2;
            if(viewPager2.getCurrentItem()+1<onBoardingItems.size()){
                viewPager2.setCurrentItem(viewPager2.getCurrentItem()+1);
            }else{

            }
        }
    }
}
