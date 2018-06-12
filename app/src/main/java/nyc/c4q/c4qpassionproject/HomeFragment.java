package nyc.c4q.c4qpassionproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

  View view;
  Toolbar toolbar;

  public HomeFragment() {
    // Required empty public constructor
  }

  @Override public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    view = inflater.inflate(R.layout.fragment_home, container, false);

    WebView delishWebView = view.findViewById(R.id.delish_blog);
    delishWebView.loadUrl("https://www.delish.com/food/");

    // Enable Javascript
    WebSettings webSettings = delishWebView.getSettings();
    webSettings.setJavaScriptEnabled(true);

    // Force links and redirects to open in the WebView instead of in a browser
    delishWebView.setWebViewClient(new WebViewClient());

    return view;
  }

  @Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    setupToolBar();
  }

  public void setupToolBar() {
    toolbar = view.findViewById(R.id.home_toolbar);
    ((MainActivity) getActivity()).setSupportActionBar(toolbar);
    if (((MainActivity) getActivity()).getSupportActionBar() != null) {
      ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
      ((MainActivity) getActivity()).setupNavigationDrawer(toolbar);
    }
  }
}
