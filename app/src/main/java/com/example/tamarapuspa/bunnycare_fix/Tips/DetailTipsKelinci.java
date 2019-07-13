package com.example.tamarapuspa.bunnycare_fix.Tips;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.tamarapuspa.bunnycare_fix.R;

public class DetailTipsKelinci extends AppCompatActivity {

    private static final String TAG = "DetailTipsKelinci";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tips_kelinci);

        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();

        ImageView btn_back = (ImageView)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(DetailTipsKelinci.this, TipsKelinciAct.class);
                startActivity(gotohome);
            }
        });
    }

    private void getIncomingIntent(){
        //Action bar
//        ActionBar actionBar = getSupportActionBar();
//
//        //Action bar title
//        actionBar.setTitle("Jenis Kelinci Detail");
//
//        //set back button in action bar
//        actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.setDisplayShowHomeEnabled(true);

        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") && getIntent().hasExtra("desc_cast")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            //String imageNameCast = getIntent().getStringExtra("image_name_cast");
            String descCast = getIntent().getStringExtra("desc_cast");
            //String bioCast = getIntent().getStringExtra("bio_cast");

            setImage(imageUrl, imageName, descCast);
        }
    }


    private void setImage(String imageUrl, String imageName, String descCast){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = (TextView) findViewById(R.id.tv_judul_det);
        name.setText(imageName);

//        TextView namecast = findViewById(R.id.image_desc_cast);
//        namecast.setText(imageNameCast);

        TextView desccast = (TextView) findViewById(R.id.tv_definisi_det);
        desccast.setText(descCast);

//        TextView biocast = findViewById(R.id.bio_cast);
//        biocast.setText(bioCast);

        ImageView image = (ImageView) findViewById(R.id.iv_image_det);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(image);
    }

}
