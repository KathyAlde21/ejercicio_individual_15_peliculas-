package cl.bootcamp.ejercicioindividual15.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cl.bootcamp.ejercicioindividual15.R;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import cl.bootcamp.ejercicioindividual15.databinding.FragmentPersonajesBinding;

public class PersonajesFragment extends Fragment {

    private FragmentPersonajesBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPersonajesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Configurar clics para cada imagen
        binding.imageAvengers.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_personajesFragment_to_avengersFragment));

        binding.imageDdm.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_personajesFragment_to_ddmFragment));

        binding.imageJurassicPark.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_personajesFragment_to_jurassicParkFragment));

        binding.imageEraDeHielo.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_personajesFragment_to_laEraDeHieloFragment));

        binding.imageMatrix.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_personajesFragment_to_matrixFragment));

        binding.imageYoRobot.setOnClickListener(v ->
                Navigation.findNavController(view).navigate(R.id.action_personajesFragment_to_yoRobotFragment));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}