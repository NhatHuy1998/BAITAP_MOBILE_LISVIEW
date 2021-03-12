package com.example.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomerAoThunAdapter extends ArrayAdapter<AoThun> {

    private Activity context;
    private int resource;
    private List<AoThun> objects;
    public CustomerAoThunAdapter(@NonNull Activity context, int resource, @NonNull List<AoThun> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public AoThun getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View row = layoutInflater.inflate(this.resource,null);
        ImageView image = row.findViewById(R.id.imageView);
        TextView title = row.findViewById(R.id.textView);
        TextView price = row.findViewById(R.id.textView2);

        AoThun aoThun = this.objects.get(position);
        image.setImageResource(aoThun.getResImage());
        title.setText(aoThun.getTitle());
        price.setText(aoThun.getPrice() + "$");

        return row;
    }
}
