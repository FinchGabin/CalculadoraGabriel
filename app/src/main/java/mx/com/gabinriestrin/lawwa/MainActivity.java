package mx.com.gabinriestrin.lawwa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button cero;
    Button uno;
    Button dos;
    Button tres;
    Button cuatro;
    Button cinco;
    Button seis;
    Button siete;
    Button ocho;
    Button nueve;
    Button punto;
    Button suma;
    Button resta;
    Button multi;
    Button potencia;
    Button igual;
    Button division;
    Button cos;
    Button sen;
    Button borrar;
    TextView screen;
    double a;
    double b;
    String add,sub,mul,div;
    String senoo;
    String cosenoo;
    String pote;












    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suma = (Button) findViewById(R.id.button21);
        resta = (Button) findViewById(R.id.button22);
        multi = (Button) findViewById(R.id.button23);
        division = (Button) findViewById(R.id.button24);
        igual = (Button) findViewById(R.id.button25);
        ocho = (Button) findViewById(R.id.button12);
        cinco = (Button) findViewById(R.id.button13);
        dos = (Button) findViewById(R.id.button14);
        cero = (Button) findViewById(R.id.button15);
        potencia = (Button) findViewById(R.id.button16);
        siete = (Button) findViewById(R.id.button17);
        cuatro = (Button) findViewById(R.id.button18);
        uno = (Button) findViewById(R.id.button19);
        punto = (Button) findViewById(R.id.button20);
        seis = (Button) findViewById(R.id.button3);
        borrar = (Button) findViewById(R.id.button5);
        tres = (Button) findViewById(R.id.button4);
        sen = (Button) findViewById(R.id.button6);
        cos = (Button) findViewById(R.id.button);
        nueve = (Button) findViewById(R.id.button2);
        screen = (TextView) findViewById(R.id.editText);



        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText()+"0");

            }
        });

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText()+"1");

            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText()+"2");

            }
        });

        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText()+"3");

            }
        });

        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText()+"4"); }});


        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText()+"5");

            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText()+"6");

            }
        });

        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText()+"7");

            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText()+"8");

            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText()+"9");

            }
        });

        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText()+"."); }});


        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(screen.getText()+"");
                add="sum";
                screen.setText(null);
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(screen.getText()+"");
                sub="rest";
                screen.setText(null);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(screen.getText()+"");
                mul="mu";
                screen.setText(null);
            }
        });
        potencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(screen.getText()+"");
                pote="soss";
                screen.setText(null);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=Double.parseDouble(screen.getText()+"");
                div="di";
                screen.setText(null);
            }
        });


        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=Double.parseDouble(screen.getText()+"");
                screen.setText(Math.cos(b)+"");




            }
        });
        sen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=Double.parseDouble(screen.getText()+"");
                screen.setText(Math.sin(b)+"");




            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b=Double.parseDouble(screen.getText()+"");
                if (add=="sum")
                {
                    screen.setText(a+b+"");
                    add="nada";

                }
                if (sub=="rest")
                {
                    screen.setText(a-b+"");
                    sub="nadin";

                }
                if (mul=="mu")
                {
                    screen.setText(a*b+"");
                    mul="none";

                }
                if (div=="di")
                {
                    screen.setText(a/b+"");
                    div="cac";

                }
                if (pote=="soss")
                {
                    screen.setText(Math.pow(a,b)+"");
                    pote="sass";

                }


            }

        });



        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(null);
            }
        });






    }









}
