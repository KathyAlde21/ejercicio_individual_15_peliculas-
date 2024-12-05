package cl.bootcamp.ejercicioindividual15.fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cl.bootcamp.ejercicioindividual15.databinding.FragmentLaEraDeHieloBinding;

public class LaEraDeHieloFragment extends Fragment {

    private FragmentLaEraDeHieloBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLaEraDeHieloBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}