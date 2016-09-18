package com.hfad.finalproject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.hfad.finalproject.modal.Info;
import com.hfad.finalproject.R;
import com.hfad.finalproject.adapter.LsitViewAdapter;

import java.util.ArrayList;

public class ListViewActivity extends BaseActivtity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        init();
        ArrayList<Info> infos=myApplication.getDbDatabaseManager().fetchContact();
        LsitViewAdapter adapter=new LsitViewAdapter(this,R.layout.activity_list_view,infos);
        listView.setAdapter(adapter);
    }
    public void init(){
        listView=(ListView)findViewById(R.id.listView);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menuAdd) {
            Intent intent = new Intent(ListViewActivity.this, FormActivity.class);
            intent.putExtra("addNews",true);
            startActivityForResult(intent, 101);
        }
        return super.onOptionsItemSelected(item);
    }
}
