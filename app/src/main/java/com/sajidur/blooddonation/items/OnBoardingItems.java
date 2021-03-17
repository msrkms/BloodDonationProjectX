package com.sajidur.blooddonation.items;

import android.content.res.ColorStateList;
import android.widget.Button;

public class OnBoardingItems {
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ColorStateList getColor() {
        return color;
    }

    public void setColor(ColorStateList color) {
        this.color = color;
    }

    public String getButtonText() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    private int image;
    private String title;
    private String description;
    private ColorStateList color;
    private String buttonText;
}
