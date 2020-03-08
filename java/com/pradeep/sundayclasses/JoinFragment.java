package com.pradeep.sundayclasses;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class JoinFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/TMZHL9Vao6i2fiBU7"));
        startActivity(i);
        return inflater.inflate(R.layout.join_us,container,false);
    }
}

