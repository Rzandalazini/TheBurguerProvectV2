package com.example.theburguerprovectv2;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextLinks;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    LinearLayout lineasPedido;

    Button mesa1, mesa2, mesa3, mesa4, mesa5, mesa6, mesa7, mesa8, mesa9, mesa10, cerrarPedido;

    ImageButton editarPedido;

    int mesaActiva = 1;


    ArrayList<String> pedidoMesa1 = new ArrayList<>();
    ArrayList<String> pedidoMesa2 = new ArrayList<>();
    ArrayList<String> pedidoMesa3 = new ArrayList<>();
    ArrayList<String> pedidoMesa4 = new ArrayList<>();
    ArrayList<String> pedidoMesa5 = new ArrayList<>();
    ArrayList<String> pedidoMesa6 = new ArrayList<>();
    ArrayList<String> pedidoMesa7 = new ArrayList<>();
    ArrayList<String> pedidoMesa8 = new ArrayList<>();
    ArrayList<String> pedidoMesa9 = new ArrayList<>();
    ArrayList<String> pedidoMesa10 = new ArrayList<>();

    String dbLineaPedido = "";




    public void actualizar(View view){

        lineasPedido.removeAllViewsInLayout();

        switch (view.getId()) {
            case R.id.mesa1:
                for (String i : pedidoMesa1) {

                    if (i != "") {
                        TextView nuevaLinea = new TextView(getApplicationContext());
                        nuevaLinea.setText(i);
                        nuevaLinea.setTextSize(18f);
                        lineasPedido.addView(nuevaLinea);
                    }
                }
                mesaActiva = 1;
                break;
            case R.id.mesa2:
                for (String i : pedidoMesa2) {

                    if (i != "") {
                        TextView nuevaLinea = new TextView(getApplicationContext());
                        nuevaLinea.setText(i);
                        nuevaLinea.setTextSize(18f);
                        lineasPedido.addView(nuevaLinea);
                    }
                }
                mesaActiva = 2;
                break;
            case R.id.mesa3:
                for (String i : pedidoMesa3) {

                    if (i != "") {
                        TextView nuevaLinea = new TextView(getApplicationContext());
                        nuevaLinea.setText(i);
                        nuevaLinea.setTextSize(18f);
                        lineasPedido.addView(nuevaLinea);
                    }
                }
                mesaActiva = 3;
                break;
            case R.id.mesa4:
                for (String i : pedidoMesa4) {

                    if (i != "") {
                        TextView nuevaLinea = new TextView(getApplicationContext());
                        nuevaLinea.setText(i);
                        nuevaLinea.setTextSize(18f);
                        lineasPedido.addView(nuevaLinea);
                    }
                }
                mesaActiva = 4;
                break;
            case R.id.mesa5:
                for (String i : pedidoMesa5) {

                    if (i != "") {
                        TextView nuevaLinea = new TextView(getApplicationContext());
                        nuevaLinea.setText(i);
                        nuevaLinea.setTextSize(18f);
                        lineasPedido.addView(nuevaLinea);
                    }
                }
                mesaActiva = 5;
                break;
            case R.id.mesa6:
                for (String i : pedidoMesa6) {

                    if (i != "") {
                        TextView nuevaLinea = new TextView(getApplicationContext());
                        nuevaLinea.setText(i);
                        nuevaLinea.setTextSize(18f);
                        lineasPedido.addView(nuevaLinea);
                    }
                }
                mesaActiva = 6;
                break;
            case R.id.mesa7:
                for (String i : pedidoMesa7) {

                    if (i != "") {
                        TextView nuevaLinea = new TextView(getApplicationContext());
                        nuevaLinea.setText(i);
                        nuevaLinea.setTextSize(18f);
                        lineasPedido.addView(nuevaLinea);
                    }
                }
                mesaActiva = 7;
                break;
            case R.id.mesa8:
                for (String i : pedidoMesa8) {

                    if (i != "") {
                        TextView nuevaLinea = new TextView(getApplicationContext());
                        nuevaLinea.setText(i);
                        nuevaLinea.setTextSize(18f);
                        lineasPedido.addView(nuevaLinea);
                    }
                }
                mesaActiva = 8;
                break;
            case R.id.mesa9:
                for (String i : pedidoMesa9) {

                    if (i != "") {
                        TextView nuevaLinea = new TextView(getApplicationContext());
                        nuevaLinea.setText(i);
                        nuevaLinea.setTextSize(18f);
                        lineasPedido.addView(nuevaLinea);
                    }
                }
                mesaActiva = 9;
                break;
            case R.id.mesa10:
                for (String i : pedidoMesa10) {

                    if (i != "") {
                        TextView nuevaLinea = new TextView(getApplicationContext());
                        nuevaLinea.setText(i);
                        nuevaLinea.setTextSize(18f);
                        lineasPedido.addView(nuevaLinea);
                    }
                }
                mesaActiva = 10;
                break;
            }

        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.config_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings:

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        lineasPedido =findViewById(R.id.lineasPedido);
        editarPedido = findViewById(R.id.editarPedido);
        editarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int PEDIDO = 1;
                Intent intent = new Intent(getApplicationContext(), armadoPedido.class);
                startActivityForResult(intent, PEDIDO);
            }
        });

        cerrarPedido = findViewById(R.id.cerrarPedido);
        cerrarPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbLineaPedido= "";

                switch (mesaActiva) {
                    case 1:
                        for (String i : pedidoMesa1) {
                            if (i != "") {
                                if (dbLineaPedido == "") {
                                    dbLineaPedido = i;
                                } else {
                                    dbLineaPedido = dbLineaPedido + "," + i;
                                }
                            }
                        }
                        pedidoMesa1.clear();
                        if (dbLineaPedido == "") {
                            Toast.makeText(getApplicationContext(), "Genere un Pedido", Toast.LENGTH_SHORT).show();
                        } else {
                            ejecutarServicio("http://192.168.0.232:80/theburguerproject/registro.php");
                            lineasPedido.removeAllViewsInLayout();
                        }
                        break;
                    case 2:
                        for (String i : pedidoMesa2) {
                            if (i != "") {
                                if (dbLineaPedido == "") {
                                    dbLineaPedido = i;
                                } else {
                                    dbLineaPedido = dbLineaPedido + "," + i;
                                }
                            }
                        }
                        pedidoMesa2.clear();
                        if (dbLineaPedido == "") {
                            Toast.makeText(getApplicationContext(), "Genere un Pedido", Toast.LENGTH_SHORT).show();
                        } else {
                            ejecutarServicio("http://192.168.0.232:80/theburguerproject/registro.php");
                            lineasPedido.removeAllViewsInLayout();
                        }
                        break;
                    case 3:
                        for (String i : pedidoMesa3) {
                            if (i != "") {
                                if (dbLineaPedido == "") {
                                    dbLineaPedido = i;
                                } else {
                                    dbLineaPedido = dbLineaPedido + "," + i;
                                }
                            }
                        }
                        pedidoMesa3.clear();
                        if (dbLineaPedido == "") {
                            Toast.makeText(getApplicationContext(), "Genere un Pedido", Toast.LENGTH_SHORT).show();
                        } else {
                            ejecutarServicio("http://192.168.0.232:80/theburguerproject/registro.php");
                            lineasPedido.removeAllViewsInLayout();
                        }
                        break;
                    case 4:
                        for (String i : pedidoMesa4) {
                            if (i != "") {
                                if (dbLineaPedido == "") {
                                    dbLineaPedido = i;
                                } else {
                                    dbLineaPedido = dbLineaPedido + "," + i;
                                }
                            }
                        }
                        pedidoMesa4.clear();
                        if (dbLineaPedido == "") {
                            Toast.makeText(getApplicationContext(), "Genere un Pedido", Toast.LENGTH_SHORT).show();
                        } else {
                            ejecutarServicio("http://192.168.0.232:80/theburguerproject/registro.php");
                            lineasPedido.removeAllViewsInLayout();
                        }
                        break;
                    case 5:
                        for (String i : pedidoMesa5) {
                            if (i != "") {
                                if (dbLineaPedido == "") {
                                    dbLineaPedido = i;
                                } else {
                                    dbLineaPedido = dbLineaPedido + "," + i;
                                }
                            }
                        }
                        pedidoMesa5.clear();
                        if (dbLineaPedido == "") {
                            Toast.makeText(getApplicationContext(), "Genere un Pedido", Toast.LENGTH_SHORT).show();
                        } else {
                            ejecutarServicio("http://192.168.0.232:80/theburguerproject/registro.php");
                            lineasPedido.removeAllViewsInLayout();
                        }
                        break;
                    case 6:
                        for (String i : pedidoMesa6) {
                            if (i != "") {
                                if (dbLineaPedido == "") {
                                    dbLineaPedido = i;
                                } else {
                                    dbLineaPedido = dbLineaPedido + "," + i;
                                }
                            }
                        }
                        pedidoMesa6.clear();
                        if (dbLineaPedido == "") {
                            Toast.makeText(getApplicationContext(), "Genere un Pedido", Toast.LENGTH_SHORT).show();
                        } else {
                            ejecutarServicio("http://192.168.0.232:80/theburguerproject/registro.php");
                            lineasPedido.removeAllViewsInLayout();
                        }
                        break;
                    case 7:
                        for (String i : pedidoMesa7) {
                            if (i != "") {
                                if (dbLineaPedido == "") {
                                    dbLineaPedido = i;
                                } else {
                                    dbLineaPedido = dbLineaPedido + "," + i;
                                }
                            }
                        }
                        pedidoMesa7.clear();
                        if (dbLineaPedido == "") {
                            Toast.makeText(getApplicationContext(), "Genere un Pedido", Toast.LENGTH_SHORT).show();
                        } else {
                            ejecutarServicio("http://192.168.0.232:80/theburguerproject/registro.php");
                            lineasPedido.removeAllViewsInLayout();
                        }
                        break;
                    case 8:
                        for (String i : pedidoMesa8) {
                            if (i != "") {
                                if (dbLineaPedido == "") {
                                    dbLineaPedido = i;
                                } else {
                                    dbLineaPedido = dbLineaPedido + "," + i;
                                }
                            }
                        }
                        pedidoMesa8.clear();
                        if (dbLineaPedido == "") {
                            Toast.makeText(getApplicationContext(), "Genere un Pedido", Toast.LENGTH_SHORT).show();
                        } else {
                            ejecutarServicio("http://192.168.0.232:80/theburguerproject/registro.php");
                            lineasPedido.removeAllViewsInLayout();
                        }
                        break;
                    case 9:
                        for (String i : pedidoMesa9) {
                            if (i != "") {
                                if (dbLineaPedido == "") {
                                    dbLineaPedido = i;
                                } else {
                                    dbLineaPedido = dbLineaPedido + "," + i;
                                }
                            }
                        }
                        pedidoMesa9.clear();
                        if (dbLineaPedido == "") {
                            Toast.makeText(getApplicationContext(), "Genere un Pedido", Toast.LENGTH_SHORT).show();
                        } else {
                            ejecutarServicio("http://192.168.0.232:80/theburguerproject/registro.php");
                            lineasPedido.removeAllViewsInLayout();
                        }
                        break;
                    case 10:
                        for (String i : pedidoMesa10) {
                            if (i != "") {
                                if (dbLineaPedido == "") {
                                    dbLineaPedido = i;
                                } else {
                                    dbLineaPedido = dbLineaPedido + "," + i;
                                }
                            }
                        }
                        pedidoMesa10.clear();
                        if (dbLineaPedido == "") {
                            Toast.makeText(getApplicationContext(), "Genere un Pedido", Toast.LENGTH_SHORT).show();
                        } else {
                            ejecutarServicio("http://192.168.0.232:80/theburguerproject/registro.php");
                            lineasPedido.removeAllViewsInLayout();
                        }
                        break;
                    }



                }
        });




    }
    @Override protected void onActivityResult(int PEDIDO, int resultCode, Intent data) {

        super.onActivityResult(PEDIDO,resultCode,data);

        if (PEDIDO == 1 && resultCode == RESULT_OK && data != null) {

            TextView lineaView = new TextView(this);
            lineaView.setText(data.getStringExtra("linea"));
            lineaView.setTextSize(18f);
            lineasPedido.addView(lineaView);

            switch (mesaActiva) {

                case 1:
                    pedidoMesa1.add(data.getStringExtra("linea"));
                    break;
                case 2:
                    pedidoMesa2.add(data.getStringExtra("linea"));
                    break;
                case 3:
                    pedidoMesa3.add(data.getStringExtra("linea"));
                    break;
                case 4:
                    pedidoMesa4.add(data.getStringExtra("linea"));
                    break;
                case 5:
                    pedidoMesa5.add(data.getStringExtra("linea"));
                    break;
                case 6:
                    pedidoMesa6.add(data.getStringExtra("linea"));
                    break;
                case 7:
                    pedidoMesa7.add(data.getStringExtra("linea"));
                    break;
                case 8:
                    pedidoMesa8.add(data.getStringExtra("linea"));
                    break;
                case 9:
                    pedidoMesa9.add(data.getStringExtra("linea"));
                    break;
                case 10:
                    pedidoMesa10.add(data.getStringExtra("linea"));
                    break;
                }
            }


        }


    private void ejecutarServicio(String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST,URL, new Response.Listener<String>(){
            @Override
            public void onResponse(String response){
                Toast.makeText(getApplicationContext(),"Pedido Cargado",Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error){
                Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams(){
                Map<String,String> parametros =new HashMap<>();
                parametros.put("mesa",String.valueOf(mesaActiva));
                parametros.put("pedido",dbLineaPedido);
                return parametros;
            }
        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }






}