package view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.databindingrecyclerviewdemo.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import model.Model;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        MyAdapter adapter = new MyAdapter(getModelList());
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(adapter);
    }

    private List<Model> getModelList() {

        List<Model> list = new ArrayList<>();

//        list.add(new Model("Banana","Fruit","https://images.search.yahoo.com/search/images;_ylt=AwrT4aak0yBipigADWVXNyoA;_ylu=Y29sbwNncTEEcG9zAzEEdnRpZAMEc2VjA3BpdnM-?p=all+fruit&fr2=piv-web&type=E210US714G0&fr=mcafee#id=98&iurl=https%3A%2F%2Fwww.skymetweather.com%2Fthemes%2Fskymet%2Fimages%2Fgallery%2Ftoplists%2F10-All-Season-Fruits-%2F4.jpg&action=click"));
//        list.add(new Model("Water Melon","Big Fruit","http://3.bp.blogspot.com/-i6RP89tQtoU/UoHD9_a-8WI/AAAAAAAAxZM/sAqIVzdkEZU/s1600/Efficacy+And+Benefits+Of+Watermelon+Fruit+For+Health+(1).jpg"));
//


        list.add(new Model("Krish", "Developer"));
        list.add(new Model("Vrusabh","Developer"));
        list.add(new Model("Kartik","Designer"));

        return list;

    }
}