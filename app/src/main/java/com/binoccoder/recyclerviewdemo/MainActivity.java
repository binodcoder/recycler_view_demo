package com.binoccoder.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button addOne;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter userAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private static final String TAG="User List";

    List<User> userList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillUserList();
        Log.d(TAG, "onCreate: "+ userList.toString());
        Toast.makeText(this, "User count: "+userList.size(), Toast.LENGTH_LONG).show();
        addOne=(Button)findViewById(R.id.btn_addOne);
        recyclerView=(RecyclerView)findViewById(R.id.rv_list);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        userAdapter=new MyAdapter(userList, this);
        recyclerView.setAdapter(userAdapter);


        addOne.setOnClickListener(v->{
            //to do
            Intent intent=new Intent(MainActivity.this, AddEditOne.class);
            startActivity(intent);
        });
    }

    private void fillUserList() {
        User u0=new User(0, "Binod Bhandari", 1994, "https://api.time.com/wp-content/uploads/2019/09/joe-biden-ukraine-fundraising.jpg");
        User u1=new User(0, "Ram Bhandari", 1993, "https://api.time.com/wp-content/uploads/2019/09/joe-biden-ukraine-fundraising.jpg");
        userList.addAll(Arrays.asList(new User[]{u0,u1}));
    }
}