package com.fatehistory.patrickjmartin.fatehistory;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.HistoricalFigure;
import com.fatehistory.patrickjmartin.fatehistory.HistoryAPI.NetworkAdapter;
import com.fatehistory.patrickjmartin.fatehistory.Storage.Favorites;
import com.fatehistory.patrickjmartin.fatehistory.Storage.ImageCache;
import com.fatehistory.patrickjmartin.fatehistory.Storage.MostRecent;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class HistoricalFiguresDetails extends AppCompatActivity implements OnMapReadyCallback {

    public static final int FINE_LOCATION_REQUEST_CODE = 1;
    Context context;
    FusedLocationProviderClient fusedLocationProviderClient;
    private GoogleMap mMap;
    private Boolean isFateImage, isFateName, isFateBio;

    private ImageView detailsImaageView;
    private TextView detailsNameTextView, detailsBioTextView;

    private MostRecent mostRecent;
    private Favorites favorites;
    private ImageCache imageCache;


    private Bitmap fateBitmap, historicBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_figures_details);

        context = this;
        isFateImage = true;
        isFateName = true;
        isFateBio = true;

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        detailsImaageView = findViewById(R.id.details_image_view);
        detailsNameTextView = findViewById(R.id.name_textview);
        detailsBioTextView = findViewById(R.id.long_bio_textview);

        Intent intent = getIntent();
        HistoricalFigure historicalFigure = (HistoricalFigure)intent.getSerializableExtra("hfDeets");

        mostRecent = MostRecent.getINSTANCE();
        favorites = Favorites.getINSTANCE();
        imageCache = ImageCache.getINSTANCE();

        mostRecent.addHF(historicalFigure);

        detailsNameTextView.setText(historicalFigure.getFateName());
        detailsBioTextView.setText(historicalFigure.getFateBio());


        fateBitmap = (Bitmap) imageCache.getObject(historicalFigure.getFateImageURL());

        if(fateBitmap != null) {
            detailsImaageView.setImageBitmap(fateBitmap);
        } else {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    fateBitmap = NetworkAdapter.httpImageRequest(historicalFigure.getFateImageURL());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            detailsImaageView.setImageBitmap(fateBitmap);
                        }
                    });
                }
            }).start();
        }


        historicBitmap = (Bitmap) imageCache.getObject(historicalFigure.getRealImageURL());

        if(historicBitmap == null) {
            if(historicalFigure.getRealImageURL() != null) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        historicBitmap = NetworkAdapter.httpImageRequest(historicalFigure.getRealImageURL());

                    }
                }).start();
            }
        }



        detailsImaageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(detailsImaageView, "scaleX", 1f, 0f);
                final ObjectAnimator oa2 = ObjectAnimator.ofFloat(detailsImaageView, "scaleX", 0f, 1f);
                oa1.setInterpolator(new DecelerateInterpolator());
                oa2.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.setDuration(500);
                oa2.setDuration(500);
                oa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);

                        if(isFateImage) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    detailsImaageView.setImageBitmap(historicBitmap);
                                }
                            });
                            isFateImage = false;
                        } else {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    detailsImaageView.setImageBitmap(fateBitmap);
                                }
                            });
                            isFateImage = true;
                        }

                        oa2.start();
                    }
                });
                oa1.start();
            }
        });

        detailsNameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(detailsNameTextView, "scaleX", 1f, 0f);
                final ObjectAnimator oa2 = ObjectAnimator.ofFloat(detailsNameTextView, "scaleX", 0f, 1f);
                oa1.setInterpolator(new DecelerateInterpolator());
                oa2.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.setDuration(500);
                oa2.setDuration(500);
                oa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);

                        if(isFateName) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    detailsNameTextView.setText(historicalFigure.getRealName());
                                }
                            });
                            isFateName = false;
                        } else {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    detailsNameTextView.setText(historicalFigure.getFateName());
                                }
                            });
                            isFateName = true;
                        }

                        oa2.start();
                    }
                });
                oa1.start();
            }
        });

        detailsBioTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ObjectAnimator oa1 = ObjectAnimator.ofFloat(detailsBioTextView, "scaleX", 1f, 0f);
                final ObjectAnimator oa2 = ObjectAnimator.ofFloat(detailsBioTextView, "scaleX", 0f, 1f);
                oa1.setInterpolator(new DecelerateInterpolator());
                oa2.setInterpolator(new AccelerateDecelerateInterpolator());
                oa1.setDuration(500);
                oa2.setDuration(500);
                oa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);

                        if(isFateBio) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    detailsBioTextView.setText(historicalFigure.getRealBio());
                                }
                            });
                            isFateBio = false;
                        } else {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    detailsBioTextView.setText(historicalFigure.getFateBio());
                                }
                            });
                            isFateBio = true;
                        }

                        oa2.start();
                    }
                });
                oa1.start();
            }
        });

        findViewById(R.id.details_add_to_favorite_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favorites.addHF(historicalFigure);



            }
        });










    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34.234234, 151.345345);
//
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
 //       mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                marker.remove();

                return true;
            }
        });

        mMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
            @Override
            public void onMapLongClick(LatLng latLng) {

                mMap.addMarker(new MarkerOptions().position(latLng));

            }
        });
    }

}
