package com.example.tamarapuspa.bunnycare_fix.JenisKelinci;

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

public class AdapterJenisKelinci extends RecyclerView.Adapter<AdapterJenisKelinci.ViewHolder>{

    private static final String TAG = "AdapterJenisKelinci";

    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mDescBunny = new ArrayList<>();
    private Context mContext;

    public AdapterJenisKelinci(Context context, ArrayList<String> imageNames, ArrayList<String> images, ArrayList<String> descBunny) {
        mImageNames = imageNames;
        mImages = images;
        mDescBunny = descBunny;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jenis_kelinci, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);

        holder.imageName.setText(mImageNames.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mImageNames.get(position));

                Toast.makeText(mContext, mImageNames.get(position),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, DetailJenisKelinci.class);
                intent.putExtra("image_url", mImages.get(position));
                intent.putExtra("image_name", mImageNames.get(position));
                intent.putExtra("desc_bunny", mDescBunny.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView image;
        TextView imageName;
        CardView parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.iv_image);
            imageName = itemView.findViewById(R.id.tv_nama);
            parentLayout = itemView.findViewById(R.id.cv_item_jeniskelinci);
        }
    }

}
