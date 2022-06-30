package anouar.oulhaj.materialdesign1app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import anouar.oulhaj.materialdesign1app.databinding.ActivityDesignTestBinding;

public class DesignTest extends AppCompatActivity {

    ActivityDesignTestBinding activity_design;
    ArrayList<Name> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity_design = ActivityDesignTestBinding.inflate(getLayoutInflater());
        setContentView(activity_design.getRoot());
        setSupportActionBar(activity_design.myToolbar);

        AddItemList();
        MyAdapter adapter = new MyAdapter(names, new onRecyclerItemClickListener() {
            @Override
            public void RecyclerItemClick(String s_name) {
                Toast.makeText(DesignTest.this, s_name, Toast.LENGTH_SHORT).show();
            }
        });
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        activity_design.designLv.setLayoutManager(lm);
        activity_design.designLv.setAdapter(adapter);
    }

     @Override
      public boolean onCreateOptionsMenu(Menu menu) {
          getMenuInflater().inflate(R.menu.my_menu,menu);
          SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
          searchView.setSubmitButtonEnabled(true);
          searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
              @Override
              public boolean onQueryTextSubmit(String query) {
                 Snackbar.make(activity_design.designLv,"btn search was clicked ",Snackbar.LENGTH_SHORT).show();
                  Toast.makeText(DesignTest.this, "btn search was clicked :"+query, Toast.LENGTH_SHORT).show();
                  return false;
              }

              @Override
              public boolean onQueryTextChange(String newText) {
               //  Snackbar.make(activity_design.designLv,"you have changed it",Snackbar.LENGTH_SHORT).show();
                  Toast.makeText(DesignTest.this, "you have changed it :"+newText, Toast.LENGTH_SHORT).show();
                  return false;
              }
          });
          return true;
      }


    void AddItemList(){
        names = new ArrayList<>();
        names.add(new Name("Anouar"));
        names.add(new Name("Sadik"));
        names.add(new Name("Soumia"));
        names.add(new Name("Khawla"));
        names.add(new Name("Ikram"));
        names.add(new Name("Israa"));
        names.add(new Name("Imran"));
        names.add(new Name("Anouar"));
        names.add(new Name("Sadik"));
        names.add(new Name("Soumia"));
        names.add(new Name("Khawla"));
        names.add(new Name("Ikram"));
        names.add(new Name("Israa"));
        names.add(new Name("Imran"));
        names.add(new Name("Anouar"));
        names.add(new Name("Sadik"));
        names.add(new Name("Soumia"));
        names.add(new Name("Khawla"));
        names.add(new Name("Ikram"));
        names.add(new Name("Israa"));
        names.add(new Name("Imran"));
    }
}