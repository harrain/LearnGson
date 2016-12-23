package com.example.learngson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv= (TextView) findViewById(R.id.tv);

        new Thread(new Runnable() {
            @Override
            public void run() {
                String s = GetHttp.RequstGetHttp(GetHttp.URI + "?key=fef7afbad536b0e252663dead0105a64&dtype=json");
                Gson gson = new Gson();
                final Category category = gson.fromJson(s, Category.class);
                final StringBuilder sb = new StringBuilder();
                for(Category.result result:category.getResultList()){
                    sb.append(result.id+"+"+result.catalog+"\n");

                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        tv.setText(category.getReason()+"+"+category.getResultList().size()+"\n"+sb.toString());


                    }
                });

            }
        }).start();
        //http://apis.juhe.cn/goodbook/catalog?key=你申请的key&dtype=json
    }
}
