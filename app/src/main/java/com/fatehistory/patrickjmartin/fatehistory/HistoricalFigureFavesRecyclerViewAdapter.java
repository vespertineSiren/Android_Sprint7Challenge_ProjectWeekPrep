package com.fatehistory.patrickjmartin.fatehistory;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fatehistory.patrickjmartin.fatehistory.FavoriteFragment.OnListFragmentInteractionListener;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigure;

import java.util.List;


public class HistoricalFigureFavesRecyclerViewAdapter extends RecyclerView.Adapter<HistoricalFigureFavesRecyclerViewAdapter.ViewHolder> {

    private final List<HistoricalFigure> mValues;
    Activity activity;

    public HistoricalFigureFavesRecyclerViewAdapter(Activity activity, List<HistoricalFigure> items) {
        mValues = items;
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_historicalfigure, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final HistoricalFigureFavesRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);


        holder.mRealImage.setImageBitmap(holder.mItem.getRealBitmap());
        holder.mFateImage.setImageBitmap(holder.mItem.getFateBitmap());
        holder.mIdView.setText(holder.mItem.getRealName());





    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final ImageView mFateImage;
        public final ImageView mRealImage;
        public HistoricalFigure mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView =  view.findViewById(R.id.fave_text_view);
            mFateImage = view.findViewById(R.id.fave_real_image);
            mRealImage = view.findViewById(R.id.fave_fate_image);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mIdView.getText() + "'";
        }
    }
}
