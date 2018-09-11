package com.example.raju.basiccalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button one, two, three, four, five, six, seven, eight, nine, zero, dot, add, sub, multy, div, equal, sin, cos, tan, exit_button, clear;
    TextView result;
    ImageButton image;
    double var1, var2, var3;
    boolean b_add, b_sub, b_multy, b_div, b_clear, b_image, b_exit, b_sin, b_cos, b_tan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find all ID.......................
        one=findViewById(R.id.button_one_id);
        two=findViewById(R.id.button_two_id);
        three=findViewById(R.id.button_three_id);
        four=findViewById(R.id.button_four_id);
        five=findViewById(R.id.button_five_id);
        six=findViewById(R.id.button_six_id);
        seven=findViewById(R.id.button_seven_id);
        eight=findViewById(R.id.button_eight_id);
        nine=findViewById(R.id.button_nine_id);
        zero=findViewById(R.id.zero_button_id);
        dot=findViewById(R.id.dot_button_id);

        add=findViewById(R.id.add_button_id);
        sub=findViewById(R.id.sub_button_id);
        multy=findViewById(R.id.multy_button_id);
        div=findViewById(R.id.div_button_id);
        equal=findViewById(R.id.equal_button_id);

        sin=findViewById(R.id.sin_button_id);
        cos=findViewById(R.id.cos_button_id);
        tan=findViewById(R.id.tan_button_id);

        image=findViewById(R.id.image_button_id);
        clear=findViewById(R.id.clear_button_id);
        result=findViewById(R.id.edit_text_result_id);
        exit_button=findViewById(R.id.exit_button_id);

        //Set onclick listner.........................
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);

        sin.setOnClickListener(this);
        cos.setOnClickListener(this);
        tan.setOnClickListener(this);
        image.setOnClickListener(this);
        clear.setOnClickListener(this);
        exit_button.setOnClickListener(this);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        multy.setOnClickListener(this);
        div.setOnClickListener(this);
        dot.setOnClickListener(this);
        equal.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        try {
            // Here declare 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.........
            if(view==one)
            {
                result.setText(result.getText()+"1");
            }
            if(view==two)
            {
                result.setText(result.getText()+"2");
            }
            if(view==three)
            {
                result.setText(result.getText()+"3");
            }
            if(view==four)
            {
                result.setText(result.getText()+"4");
            }
            if(view==five)
            {
                result.setText(result.getText()+"5");
            }
            if(view==six)
            {
                result.setText(result.getText()+"6");
            }
            if(view==seven)
            {
                result.setText(result.getText()+"7");
            }
            if(view==eight)
            {
                result.setText(result.getText()+"8");
            }
            if(view==nine)
            {
                result.setText(result.getText()+"9");
            }
            if(view==zero)
            {
                result.setText(result.getText()+"0");
            }

//Here declare sin, cos, tan, dot..................
            if(view==sin)
            {
                b_sin=true;
                result.setText(result.getText()+"sin");
                //esult.setText(result.getText()+"sin");
                // result.setText(result.getText()+"Sin");
                /*var3=Double.parseDouble(result.getText()+"");
                result.setText(Math.sin(Math.toRadians(var3)) +"");*/
            }
            if(view==cos)
            {
                b_cos=true;
                result.setText(result.getText()+"cos");
                /*var3=Double.parseDouble(result.getText()+"");
                result.setText(Math.cos(Math.toRadians(var3)) +"");*/
            }
            if(view==tan)
            {
                b_tan=true;
                result.setText(result.getText()+"tan");
                /*var3=Double.parseDouble(result.getText()+"");
                result.setText(Math.tan(Math.toRadians(var3)) +"");*/
            }
            if(view==dot)
            {
                result.setText(result.getText()+".");
            }

// here declare +, -, * and /.....................
            if(view==add)
            {
                var1=Double.parseDouble(result.getText()+"");
                b_add=true;
                result.setText(null);
            }
            if(view==sub)
            {
                var1=Double.parseDouble(result.getText()+"");
                b_sub=true;
                result.setText(null);

            }
            if(view==multy)
            {
                var1=Double.parseDouble(result.getText()+"");
                b_multy=true;
                result.setText(null);
            }
            if(view==div)
            {
                var1=Double.parseDouble(result.getText()+"");
                b_div=true;
                result.setText(null);
            }
            if(view==equal)
            {
                if(b_sin==true)
                {
                    String str=result.getText().toString();
                    str=str.replace("sin(","");
                    var1=Double.parseDouble(str);
                    var3=Math.toRadians(var1);
                    result.setText(Math.sin(var3)+"");
                    b_sin=false;
                }
                if(b_cos==true)
                {
                    String str=result.getText().toString();
                    str=str.replace("cos(","");
                    var1=Double.parseDouble(str);
                    var3=Math.toRadians(var1);
                    result.setText(Math.cos(var3)+"");
                    b_cos=false;
                }
                if(b_tan==true)
                {
                    String str=result.getText().toString();
                    str=str.replace("tan(","");
                    var1=Double.parseDouble(str);
                    var3=Math.toRadians(var1);
                    result.setText(Math.tan(var3)+"");
                    b_tan=false;
                }

                else {
                    var2=Double.parseDouble(result.getText()+"");
                    if(b_add==true)
                    {
                        result.setText(var1+var2 +"");
                        b_add=false;
                    }
                    if(b_sub==true)
                    {
                        result.setText(var1-var2 +"");
                        b_sub=false;
                    }
                    if(b_multy==true)
                    {
                        result.setText(var1*var2 +"");
                        b_multy=false;
                    }
                    if(b_div==true)
                    {
                        result.setText(var1/var2 +"");
                        b_div=false;
                    }
                }



            }
//Here declare image, clear, exit...................
            if(view==image)
            {
                Intent intent=new Intent(this,SecondActivity.class);
                startActivity(intent);
            }
            if(view==clear)
            {
                result.setText(null);
                //result.setText(result.getText()+"clear");
            }
            if(view==exit_button)
            {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        }catch (Exception e)
        {
            Toast.makeText(MainActivity.this,"Invalide",Toast.LENGTH_SHORT).show();
        }


    }
}

