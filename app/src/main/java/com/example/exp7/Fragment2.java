package com.example.exp7;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.exp7.R;

public class Fragment2 extends Fragment {

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View frag2_view = inflater.inflate(R.layout.fragment_2, container, false);
        Button button = frag2_view.findViewById(R.id.button);
        textView = frag2_view.findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                // Get Fragment2 instance from FragmentManager
                Fragment3 fragment3 = (Fragment3) getParentFragmentManager().findFragmentById(R.id.fragment3);

                if (fragment3 != null) {
                    // Update text in Fragment2's TextView
                    fragment3.updateText("Press Below button to change text of Fragment-1");
                } else {
                    Toast.makeText(getActivity(), "Fragment 3 is not available", Toast.LENGTH_SHORT).show();
                }
            }
        });



        return frag2_view;
    }

    // Method to update text in Fragment2
    public void updateText(String newText) {
        if (textView != null) {
            textView.setText(newText);
        }
    }
}

