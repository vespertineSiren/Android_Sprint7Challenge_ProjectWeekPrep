package com.fatehistory.patrickjmartin.fatehistory;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigure;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.NetworkAdapter;
import com.fatehistory.patrickjmartin.fatehistory.PastViewedFragment.OnListFragmentInteractionListener;


import java.util.ArrayList;
import java.util.List;


public class PastViewedHistoricalFigureRecyclerViewAdapter extends RecyclerView.Adapter<PastViewedHistoricalFigureRecyclerViewAdapter.ViewHolder> {

    private final List<HistoricalFigure> mValues;
    Activity activity;


    public PastViewedHistoricalFigureRecyclerViewAdapter(Activity activity, ArrayList<HistoricalFigure> items) {
        mValues = items;
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_pastviewed, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(holder.mItem.getRealName());
        final Bitmap[] bitmap = new Bitmap[1];

        new Thread(new Runnable() {
            @Override
            public void run() {
                bitmap[0] = NetworkAdapter.httpImageRequest(holder.mItem.getFateImageURL());
                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        holder.mContentView.setImageBitmap(bitmap[0]);
                    }
                });

            }
        }).start();



    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final ImageView mContentView;
        public HistoricalFigure mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView =  view.findViewById(R.id.past_hf_content);
            mContentView = view.findViewById(R.id.past_hf_image);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mIdView.getText() + "'";
        }
    }
}
