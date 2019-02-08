package com.fatehistory.patrickjmartin.fatehistory;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigure;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigureSearchHelper;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.NetworkAdapter;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.WikiDao;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class RandomHFFragment extends Fragment {

    private HistoricalFigure randomFigure;
    private HistoricalFigureSearchHelper getRandomHF;

    private ImageView randomHFImage;
    private TextView randomHFText;
    private OnFragmentInteractionListener mListener;

    public RandomHFFragment() {
        // Required empty public constructor
    }


    public static RandomHFFragment newInstance() {
        RandomHFFragment fragment = new RandomHFFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getRandomHF = HistoricalFigureSearchHelper.getINSTANCE();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_random_hf, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        randomHFImage = view.findViewById(R.id.randomHF_bg_imageview);
        randomHFText = view.findViewById(R.id.randomHF_textView);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] randomSearchTerms = getRandomHF.getRandomHF();
        final String[] url = new String[1];
        final Bitmap[] bitmap = new Bitmap[1];
        new Thread(new Runnable() {
            @Override
            public void run() {
                randomFigure = WikiDao.getFateRealBio
                        (randomSearchTerms[0], randomSearchTerms[1], randomSearchTerms[2]);
                url[0] = randomFigure.getFateImageURL();
                bitmap[0] = NetworkAdapter.httpImageRequest(url[0]);
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        randomHFText.setText(randomFigure.getRealName());
                        randomHFImage.setImageBitmap(bitmap[0]);
                    }
                });
            }
        }).start();



    }



    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(HistoricalFigure item);
    }
}
