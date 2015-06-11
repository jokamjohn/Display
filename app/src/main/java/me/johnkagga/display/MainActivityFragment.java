package me.johnkagga.display;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {



    public MainActivityFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.fragment_main, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.dimension){

            ScreenUtility screenUtility = new ScreenUtility(getActivity());

            String metric = "Width: " + screenUtility.getDpWidth() + ", "
                    + "Height: " + screenUtility.getDpHeight();

            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("Dimensions")
                    .setMessage(metric)
                    .create()
                    .show();

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
