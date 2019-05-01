package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {

        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View listItemView = convertView;
       if (listItemView == null){
           listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent, false);
       }
       Word currentWord = getItem(position);

        TextView nameTextview = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        nameTextview.setText(currentWord.getMiwokTranslation());

        TextView nameTextView2 = (TextView) listItemView.findViewById(R.id.default_text_view);
        nameTextView2.setText(currentWord.getDefaultTranslation());

        ImageView imageView= (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());

            imageView.setVisibility(View.VISIBLE);
        }else {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.two_textViews);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

            return listItemView;

    }
}