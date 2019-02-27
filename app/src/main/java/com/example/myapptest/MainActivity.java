package com.example.myapptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import com.example.myapptest.adapter.RecyclerAdapter;
import com.example.myapptest.model.MyPojo;
import com.example.myapptest.model.Results;
import com.example.myapptest.services.ApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Call<MyPojo> call=ApiClient.getClient().getPojo();
        call.enqueue(new Callback<MyPojo>() {
            @Override
            public void onResponse(Call<MyPojo> call, Response<MyPojo> response) {
                MyPojo myPojo=response.body();
               Results[] results= myPojo.getResults();
                RecyclerAdapter adapter=new RecyclerAdapter(results);
                recyclerView.setAdapter(adapter);
                Toast.makeText(MainActivity.this,"sucess",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<MyPojo> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
