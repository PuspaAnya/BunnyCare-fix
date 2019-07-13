package com.example.tamarapuspa.bunnycare_fix.Tips;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.tamarapuspa.bunnycare_fix.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdapterTips extends RecyclerView.Adapter<AdapterTips.ViewHolder> {

    private static final String TAG = "AdapterTips";

    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    //private ArrayList<String> mImageNameCast = new ArrayList<>();
    private ArrayList<String> mDescCast = new ArrayList<>();
    //private ArrayList<String> mBioCast = new ArrayList<>();
    private Context mContext;

    public AdapterTips(Context context, ArrayList<String> imageNames, ArrayList<String> images, ArrayList<String> descCast) {
        mImageNames = imageNames;
        mImages = images;
        //mImageNameCast = imageNameCast;
        mDescCast = descCast;
        //mBioCast = bioCast;
        mContext = context;
    }

    @Override
    public AdapterTips.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tips_kelinci, parent, false);
        AdapterTips.ViewHolder holder = new AdapterTips.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterTips.ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);

        holder.imageName.setText(mImageNames.get(position));
//        holder.imageNameCast.setText(mImageNameCast.get(position));
//        holder.descCast.setText(mDescCast.get(position));
//        holder.bioCast.setText(mBioCast.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mImageNames.get(position));

                Toast.makeText(mContext, mImageNames.get(position),Toast.LENGTH_SHORT).show();
//                Toast.makeText(mContext, mImageNameCast.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, DetailTipsKelinci.class);
                intent.putExtra("image_url", mImages.get(position));
                intent.putExtra("image_name", mImageNames.get(position));
                //intent.putExtra("image_name_cast", mImageNameCast.get(position));
                intent.putExtra("desc_cast", mDescCast.get(position));
                //intent.putExtra("bio_cast", mBioCast.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }
//    public int getItemCountCast(){
//        return mImageNameCast.size();
//    }
//    public int getItemCountDesc(){
//        return mDescCast.size();
//    }
//    public int getItemCountBio(){
//        return mBioCast.size();
//    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView imageName;
        TextView imageNameCast;
        TextView descCast;
        TextView bioCast;
        CardView parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.iv_image);
            imageName = itemView.findViewById(R.id.tv_nama);
//            imageNameCast = itemView.findViewById(R.id.image_cast);
//            descCast = itemView.findViewById(R.id.description_cast);
//            bioCast = itemView.findViewById(R.id.bio_cast);
            parentLayout = itemView.findViewById(R.id.cv_item_tipskelinci);
        }
    }
}
