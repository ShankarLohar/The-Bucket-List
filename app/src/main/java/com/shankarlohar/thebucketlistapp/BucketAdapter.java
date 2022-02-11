package com.shankarlohar.thebucketlistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketAdapter extends RecyclerView.Adapter<BucketAdapter.BucketViewHolder> {

    private BucketElement[] bucket;

    public BucketAdapter(BucketElement[] bucket) {
        this.bucket = bucket;
    }

    @Override
    public int getItemCount() {
        return bucket.length;
    }

    @NonNull
    @Override
    public BucketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent,false);
        return new BucketViewHolder(view) {
        };
    }

    @Override
    public void onBindViewHolder(@NonNull BucketViewHolder holder, int position) {
        holder.bind(bucket[position],position);
    }

    static class BucketViewHolder extends RecyclerView.ViewHolder{

        private ImageView thingImage;
        private TextView thingTitle, thingDescription;
        private RatingBar ratingBar;

        public BucketViewHolder(@NonNull View itemView) {
            super(itemView);
            thingImage = itemView.findViewById(R.id.image_view_project_icon);
            thingTitle = itemView.findViewById(R.id.text_view_project_titile);
            thingDescription = itemView.findViewById(R.id.text_view_project_description);
            ratingBar = itemView.findViewById(R.id.rating_bar);
        }

        public void bind(BucketElement bucketElement, int position){
            String heading = (position + 1) + ". " + bucketElement.name;
            thingTitle.setText(heading);
            thingDescription.setText(bucketElement.description);
            thingImage.setImageResource(bucketElement.image);
            ratingBar.setRating(bucketElement.rating);
        }
    }


}
