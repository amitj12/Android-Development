package com.example.fruitslist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.fruitslist.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView cric_list;
    String Names[];
    int crick_pics[];
    int order[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MSG","oncrete");
        cric_list = findViewById(R.id.crik_list);
        CricketerList cl = new CricketerList();

        Names = new String[]{"Virat Kohli", "Rohit Sharma", "K L Rahul", "S Yadav", "M S Dhoni", "Hardik Pandya", "R Jadeja", "Yuzi Chahal",
                "J Bumrah", "D Chahar", "Arshdeep Singh"};
        order=new int[]{
                1,2,3,4,5,6,7,8,9,10,11};

        crick_pics =new int[]{ R.drawable.kohli, R.drawable.rohit, R.drawable.kl, R.drawable.surya, R.drawable.msd, R.drawable.pandya, R.drawable.jaddu,
                R.drawable.yuzi, R.drawable.jassi, R.drawable.chahar, R.drawable.arsh};
        CricketerList c = new CricketerList();
        Log.i("MSG","oncrete");
        cric_list.setAdapter(c);

    }

    class CricketerList extends BaseAdapter {

        CricketerList()
        {
            Log.i("MSG","ConvertedView");
        }
        @Override
        public int getCount() {
            return Names.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }
        @Override
        public long getItemId(int i) {
            return 0;
        }
        @Override
        public View getView(int position, View convertedview, ViewGroup viewGroup) {
            if(convertedview==null)
            {
                convertedview=getLayoutInflater().inflate(R.layout.one_item_design,viewGroup,false);
            }
            ImageView cricketer_pic =convertedview.findViewById(R.id.player_image);
            TextView name= convertedview.findViewById(R.id.Textview);
            TextView player = convertedview.findViewById(R.id.vk);
            cricketer_pic.setImageResource(crick_pics[position]);
            name.setText(Names[position]);
            player.setText("Player "+order[position]);
            Log.i("MSG","view");
            return convertedview;
        }
    }
}