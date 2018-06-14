package nyc.c4q.c4qpassionproject.recipes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import nyc.c4q.c4qpassionproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecipeInstructionsFragment extends Fragment {

    private View view;
    private TextView textView;

    public RecipeInstructionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_recipe_instructions, container, false);
        String instructions = getArguments().getString("Instructions");
        Log.d("BUNDLE_ARGS", "onArgumentsRecieved: " + instructions);
        textView = view.findViewById(R.id.rec_instruc_tv);
        textView.setText(instructions);
        return view;
    }
}
