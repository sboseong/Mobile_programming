package com.kmu.forcrystaldefects;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.ArrayList;
import java.util.Random;


public class random_Game1 extends Activity {

    ArrayList<String> names;
    ArrayAdapter<String> Adapter;
    EditText edit;
    ImageButton imageButton_add;
    ImageButton imageButton_minus;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random__game1);

        names = new ArrayList<String>();

        Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, names);
        listView = (ListView)findViewById(R.id.listview1);
        listView.setAdapter(Adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        edit = (EditText)findViewById(R.id.string);
        imageButton_add = (ImageButton)findViewById(R.id.add);
        imageButton_minus = (ImageButton)findViewById(R.id.minus);

        imageButton_add.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View view) {
                String text = edit.getText().toString();
                if (text.length() != 0){
                    names.add(text);
                    edit.setText("");
                    Adapter.notifyDataSetChanged();
                }
            }
        });
        imageButton_minus.setOnClickListener(new ImageButton.OnClickListener(){
            public void onClick(View view) {
                int pos;
                pos = listView.getCheckedItemPosition();
                if (pos != ListView.INVALID_POSITION){
                    names.remove(pos);
                    listView.clearChoices();
                    Adapter.notifyDataSetChanged();
                }
            }
        });
    }

    public void backtomain(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void start_button(View view) {
        Random rnd = new Random();
        int tmp = rnd.nextInt(names.size());

        String result = names.get(tmp);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("제 비 뽑 기 의   결 과 는?")
                .setMessage(result)
                .setPositiveButton("확인(초기화)", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);
                    }
                })
                .setNegativeButton("취소", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
