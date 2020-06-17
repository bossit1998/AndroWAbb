package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ImagesListAdapter extends BaseAdapter {

    private Context context;
    private  int layout;
    private ArrayList<Images> imagesList;

    public ImagesListAdapter(Context context, int layout, ArrayList<Images> imagesList) {
        this.context = context;
        this.layout = layout;
        this.imagesList = imagesList;
    }

    @Override
    public int getCount() {
        return imagesList.size();
    }

    @Override
    public Object getItem(int position) {
        return imagesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        ImageView imageView;
        TextView txtDescription, txtPlace;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View row = view;
        ViewHolder holder = new ViewHolder();

        if(row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);

            holder.txtDescription = (TextView) row.findViewById(R.id.txtDescription);
            holder.txtPlace = (TextView) row.findViewById(R.id.txtPlace);
            holder.imageView = (ImageView) row.findViewById(R.id.imgImage);
            row.setTag(holder);
        }
        else {
            holder = (ViewHolder) row.getTag();
        }

        Images images = imagesList.get(position);

        holder.txtDescription.setText(images.getDescription());
        holder.txtPlace.setText(images.getPlace());

        byte[] imageImage = images.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(imageImage, 0, imageImage.length);
        holder.imageView.setImageBitmap(bitmap);

        return row;
    }
}
