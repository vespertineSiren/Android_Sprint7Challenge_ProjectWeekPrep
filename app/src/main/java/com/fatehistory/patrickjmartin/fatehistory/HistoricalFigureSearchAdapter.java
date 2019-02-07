package com.fatehistory.patrickjmartin.fatehistory;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigure;

import java.util.ArrayList;

public class HistoricalFigureSearchAdapter extends BaseAdapter implements Filterable {

    private ArrayList<String> originalSearchValues;
    private ArrayList<String> displayedSearchValues;
    LayoutInflater inflater;
    private Activity activity;

    public HistoricalFigureSearchAdapter(Context context, Activity activity, ArrayList<String> searchArrayList) {
        this.originalSearchValues = searchArrayList;
        this.displayedSearchValues = searchArrayList;
        inflater = LayoutInflater.from(context);
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return displayedSearchValues.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder {
        LinearLayout linearLayoutContainer;
        TextView hfNameTextView;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.search_row, null);
            holder.linearLayoutContainer = convertView.findViewById(R.id.search_row_container);
            holder.hfNameTextView = convertView.findViewById(R.id.hfName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }

        holder.hfNameTextView.setText(displayedSearchValues.get(position));

        holder.linearLayoutContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TEST
                Toast.makeText(activity, displayedSearchValues.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }

    @Override
    public Filter getFilter() {
        Filter filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();
                ArrayList<String> FilteredArrList = new ArrayList<String>();

                if(originalSearchValues == null) {
                    originalSearchValues = new ArrayList<String>(displayedSearchValues);
                }

                if (constraint == null || constraint.length() == 0) {
                    results.count = originalSearchValues.size();
                    results.values = originalSearchValues;
                } else {
                    constraint = constraint.toString().toLowerCase();
                    for (int i = 0; i < originalSearchValues.size(); i++) {
                        String data = originalSearchValues.get(i);
                        if(data.startsWith(constraint.toString())) {
                            FilteredArrList.add(originalSearchValues.get(i));
                        }
                    }
                    results.count = FilteredArrList.size();
                    results.values = FilteredArrList;
                }
                return  results;
            }

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                displayedSearchValues = (ArrayList<String>)results.values;
                notifyDataSetChanged();
            }
        };
        return  filter;
    }
}
