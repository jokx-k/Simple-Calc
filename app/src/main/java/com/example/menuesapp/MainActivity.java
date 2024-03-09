    package com.example.menuesapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    EditText FirstNumber,SecondNumber;
    TextView Res , ViewRes;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Res=(TextView)findViewById(R.id.Result);
        registerForContextMenu(Res);
    }

    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.operations,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

       FirstNumber=(EditText) findViewById(R.id.FirstNumber);
       SecondNumber=(EditText) findViewById(R.id.SecondNumber);
       ViewRes=(TextView)findViewById(R.id.ViewResult);

        double FirstNum=Double.parseDouble(FirstNumber.getText().toString());
        double SecondNum=Double.parseDouble(SecondNumber.getText().toString());

        switch (item.getItemId()) {

            case R.id.Addition:
                ViewRes.setText(String.valueOf(FirstNum+SecondNum));
               break;
            case R.id.Multiplication:
                ViewRes.setText(String.valueOf(FirstNum*SecondNum));
                break;
            case R.id.Division:
                ViewRes.setText(String.valueOf(FirstNum/SecondNum));
                break;
            case R.id.Subtraction:
                ViewRes.setText(String.valueOf(FirstNum-SecondNum));
                break;
        }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        getMenuInflater().inflate(R.menu.operations,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {


        FirstNumber=(EditText) findViewById(R.id.FirstNumber);
        SecondNumber=(EditText) findViewById(R.id.SecondNumber);
        ViewRes=(TextView)findViewById(R.id.ViewResult);

        double FirstNum=Double.parseDouble(FirstNumber.getText().toString());
        double SecondNum=Double.parseDouble(SecondNumber.getText().toString());

        switch (item.getItemId()) {

            case R.id.Addition:
                ViewRes.setText(String.valueOf(FirstNum+SecondNum));
                break;
            case R.id.Multiplication:
                ViewRes.setText(String.valueOf(FirstNum*SecondNum));
                break;
            case R.id.Division:
                ViewRes.setText(String.valueOf(FirstNum/SecondNum));
                break;
            case R.id.Subtraction:
                ViewRes.setText(String.valueOf(FirstNum-SecondNum));
                break;
        }
        return true;
    }
}