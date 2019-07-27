package com.mustafayavuz.mustafa.jsonparse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.mustafayavuz.mustafa.jsonparse.MainActivity.EXTRA_CREATOR;
import static com.mustafayavuz.mustafa.jsonparse.MainActivity.EXTRA_LIKES;
import static com.mustafayavuz.mustafa.jsonparse.MainActivity.EXTRA_URL;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String imageURL = intent.getStringExtra(EXTRA_URL);
        String creatorName = intent.getStringExtra(EXTRA_CREATOR);
        int likeCount = intent.getIntExtra(EXTRA_LIKES, 0);

        ImageView ımageView      = findViewById(R.id.image_view_detail);
        TextView textViewCreator = findViewById(R.id.text_view_creator_detail);
        TextView textViewLikes   = findViewById(R.id.text_view_like_detail);

        Picasso.with(this).load(imageURL).fit().centerInside().into(ımageView);
        textViewCreator.setText(creatorName);
        textViewLikes.setText("Likes: " + likeCount);
    }
}
