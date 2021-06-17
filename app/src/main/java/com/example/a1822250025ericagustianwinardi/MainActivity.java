package com.example.a1822250025ericagustianwinardi;
//eric agustian winardi 1822250025
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.a1822250025ericagustianwinardi.Adapter.BatikAdapter;
import com.example.a1822250025ericagustianwinardi.Model.Batik;
import com.example.a1822250025ericagustianwinardi.Model.Hasil;
import com.example.a1822250025ericagustianwinardi.Rest.ApiClient;
import com.example.a1822250025ericagustianwinardi.Rest.ApiInterface;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    public static MainActivity ma;
    private RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        String url = "http://batikita.herokuapp.com/index.php/batik/";
        ApiClient.getInstance(url).create(ApiInterface.class).getAllData().enqueue(new Callback<Batik>() {
            @Override
            public void onResponse(Call<Batik> call, Response<Batik> response) {
                if (response.isSuccessful()){
                    assert response.body() != null;
                    List<Hasil> listHasil = response.body().getHasil();

                    Log.d("data = ", listHasil.toString());
                    mAdapter = new BatikAdapter(listHasil);
                    mRecyclerView.setAdapter(mAdapter);
                }
            }

            @Override
            public void onFailure(Call<Batik> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }

}