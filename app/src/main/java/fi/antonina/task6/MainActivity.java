package fi.antonina.task6;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(TAG, "onCreate");
        ListView mListView = findViewById(R.id.listView);

        //Add the Person objects to an ArrayList
        ArrayList<President> peopleList = new ArrayList<>();

        peopleList.add(new President("Stahlberg, Kaarlo Juho", "1919- 1925", "Eka presidentti"));
        peopleList.add(new President("Relander, Lauri Kristian", "1925 - 1931", "Reissulasse"));
        peopleList.add(new President("Svinhufvud, Pehr, Evind", "1931 - 1937", "Ukko-Pekka"));
        peopleList.add(new President("Kallio, Kyosti", "1937 - 1940", "Neljas presidentti"));
        peopleList.add(new President("Ryti, Risto Heikki", "1940 - 1944", "Nuorena Kustu Kalliokangas"));
        peopleList.add(new President("Mannerheim, Carl Gustav", "1944 - 1946", "Marski"));
        peopleList.add(new President("Paasikivi, Juho Kusti", "1946 - 1956", "Äkäinen ukko"));
        peopleList.add(new President("Kekkonen, Urho Kaleva", "1956 - 1982", "Pelimies"));
        peopleList.add(new President("Koivisto, Mauno Henrik", "1982 - 1994", "Manu"));
        peopleList.add(new President("Ahtisaari, Martti Oiva", "1994 - 2000", "Mahtisaari"));
        peopleList.add(new President("Ahtisaari, Martti Oiva", "1994 - 2000", "Mahtisaari"));
        peopleList.add(new President("Ahtisaari, Martti Oiva", "1994 - 2000", "Mahtisaari"));
        PresidentListAdapter adapter = new PresidentListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);

        //to second activity

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Log.d(TAG, "onItemClick: name: " + peopleList.get(i));

                President str = peopleList.get(i);

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", str.getName());
                intent.putExtra("date", str.getDate());
                intent.putExtra("freeText", str.getFreetext());
                startActivity(intent);
            }
        });
    }

}