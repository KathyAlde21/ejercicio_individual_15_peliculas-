package cl.bootcamp.ejercicioindividual15.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.Fragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import cl.bootcamp.ejercicioindividual15.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VideoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VideoFragment extends Fragment {

    private static final String ARG_VIDEO_URL = "video_url";

    public static VideoFragment newInstance(String videoUrl) {
        VideoFragment fragment = new VideoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_VIDEO_URL, videoUrl);
        fragment.setArguments(args);
        return fragment;
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video, container, false);

        WebView webView = view.findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        String videoUrl = getArguments().getString(ARG_VIDEO_URL);
        webView.loadUrl(videoUrl);

        FloatingActionButton fab = view.findViewById(R.id.fab_back);
        fab.setOnClickListener(v -> requireActivity().getSupportFragmentManager().popBackStack());

        return view;
    }
    ImageButton homeButton = view.findViewById(R.id.homeButton);
    homeButton.setOnClickListener(v -> {
        NavHostFragment.findNavController(this)
                .navigate(R.id.action_videoFragment_to_defaultFragment);
    });

    ImageButton backButton = view.findViewById(R.id.backButton);
    backButton.setOnClickListener(v -> {
        NavHostFragment.findNavController(this)
                .navigate(R.id.action_videoFragment_to_personajesFragment);
    });


}