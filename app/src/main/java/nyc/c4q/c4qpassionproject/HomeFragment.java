package nyc.c4q.c4qpassionproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

  public HomeFragment() {
    // Required empty public constructor
  }

  @Override public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    View view = inflater.inflate(R.layout.fragment_home, container, false);

    TextView textView = view.findViewById(R.id.home_frag_tv);
    textView.setText("Hello Fragment");
    return view;
  }
}
