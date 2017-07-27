package com.example.android.miwok;

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

/**
 * Created by archit on 26/7/17.
 */

public class WordAdapter extends ArrayAdapter<word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        word data = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView defaultTraslation = (TextView) listItemView.findViewById(R.id.defaultTranlsation);
        TextView miwokTransaltion = (TextView) listItemView.findViewById(R.id.miwokTranslation);
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        defaultTraslation.setText(data.getDefaultTranslation());
        miwokTransaltion.setText(data.getMiwokTranslation());


        if (data.hasImage()) {
            image.setImageResource(data.getImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.textContainer);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
