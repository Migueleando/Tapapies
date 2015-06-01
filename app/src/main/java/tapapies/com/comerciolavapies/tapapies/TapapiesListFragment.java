package tapapies.com.comerciolavapies.tapapies;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A placeholder fragment containing a simple view.
 */
public class TapapiesListFragment extends ListFragment {

    String[] bares = {"Bierzo Alto, calle sombreria 6, Entre felicidad y gloria",
            "Automatico Bar, calle argumosa 17, hummus a la naranja",
            "El rincon guay, calle embajadores 62, crema a la huancaina",
            "La playa de Lavapies, calle argumosa 9, la cama noruega"};

    public TapapiesListFragment() {
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.fragment_main, bares);
        setListAdapter(adapter);
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
    }
}
