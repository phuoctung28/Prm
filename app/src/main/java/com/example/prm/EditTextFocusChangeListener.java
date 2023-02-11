package com.example.prm;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.EditText;

import androidx.core.content.ContextCompat;

public class EditTextFocusChangeListener implements View.OnFocusChangeListener {

    @Override
    public void onFocusChange(View view, boolean hasFocus) {
        if (view instanceof EditText) {
            EditText editText = (EditText) view;
            // Set the backgroundTint color
            if (hasFocus)
                editText.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(editText.getContext(), R.color.white)));
            else {
                // Reset the backgroundTint color
                editText.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(editText.getContext(), R.color.gray_background_tine)));
            }
        }
    }
}
