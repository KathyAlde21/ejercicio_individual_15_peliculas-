package cl.bootcamp.ejercicioindividual15.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import java.util.Objects;

import cl.bootcamp.ejercicioindividual15.MainActivity;
import cl.bootcamp.ejercicioindividual15.R;

public class MainFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        Button button1 = view.findViewById(R.id.button1);

        button1.setOnClickListener(v -> {
            ((MainActivity) requireActivity()).navigateToFragment(
                    VideoFragment.newInstance("https://www.youtube.com/embed/example1")
            );
        });

        Button button2 = view.findViewById(R.id.button2);
        button2.setOnClickListener(v -> {
            ((MainActivity) getActivity()).navigateToFragment(
                    VideoFragment.newInstance("https://www.youtube.com/embed/example2")
            );
        });

        return view;
    }
}