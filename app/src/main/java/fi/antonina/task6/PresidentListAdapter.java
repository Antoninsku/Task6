package fi.antonina.task6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class PresidentListAdapter extends ArrayAdapter<President> {
    private static final String TAG = "PresidentListAdapter";

    private Context mContext;
    int mResource;
    private int lastPosition = -1;

    private static class ViewHolder {
        TextView name;
    }

    public PresidentListAdapter(Context context, int resource, ArrayList<President> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get the persons information
        String name = getItem(position).getName();


        final View result;

        //ViewHolder object
        ViewHolder holder;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.textView1);

            result = convertView;

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        //animation
        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
        result.startAnimation(animation);
        lastPosition = position;

        holder.name.setText(name);
        return convertView;
    }

}













