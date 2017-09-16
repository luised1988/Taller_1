package com.example.android.taller_1;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView res;
    private EditText cantidad;
    private Spinner genero;
    private Spinner tipo_zapato;
    private Spinner marca;
    private String op[];
    private String op2[];
    private String op3[];
    private Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res=(TextView)findViewById(R.id.txtResultado);
        cantidad=(EditText)findViewById(R.id.txtCantidad);

        genero = (Spinner) findViewById(R.id.cmbGenero);
        tipo_zapato = (Spinner) findViewById(R.id.cmbTipoZapato);
        marca = (Spinner) findViewById(R.id.cmbMarca);


        resources = this.getResources();
        op = resources.getStringArray(R.array.opciones1);
        op2 = resources.getStringArray(R.array.opciones2);
        op3 = resources.getStringArray(R.array.opciones3);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op);
        genero.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op2);
        tipo_zapato.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,op3);
        marca.setAdapter(adapter3);

    }

    public  void calcular (View v){
        int opcion1;
        int opcion2;
        int opcion3;

        double cant, resultado=0;

        opcion1 = genero.getSelectedItemPosition();
        opcion2 = tipo_zapato.getSelectedItemPosition();
        opcion3 = marca.getSelectedItemPosition();

        cant = Double.parseDouble(cantidad.getText().toString());


        if (opcion1 == 0){
            if (opcion2 == 0){
                if (opcion3 == 0){
                    resultado = 120000 * cant;
                    res.setText("" + String.format("%.0f", resultado));
                }
            }

        }

        if (opcion1 == 0){
            if (opcion2 == 0){
                if (opcion3 == 1){
                    resultado = 140000 * cant;
                    res.setText("" + String.format("%.0f", resultado));
                }
            }

        }

        if (opcion1 == 0){
            if (opcion2 == 0){
                if (opcion3 == 2){
                    resultado = 130000 * cant;
                    res.setText("" + String.format("%.0f", resultado));
                }
            }

        }

        if (opcion1 == 0){
            if (opcion2 == 1){
                if (opcion3 == 0){
                    resultado = 50000 * cant;
                    res.setText("" + String.format("%.0f", resultado));
                }
            }

        }

        if (opcion1 == 0){
            if (opcion2 == 1){
                if (opcion3 == 1){
                    resultado = 80000 * cant;
                    res.setText("" + String.format("%.0f", resultado));
                }
            }

        }

        if (opcion1 == 0){
            if (opcion2 == 1){
                if (opcion3 == 2){
                    resultado = 100000 * cant;
                    res.setText("" + String.format("%.0f", resultado));
                }
            }

        }





        if (opcion1 == 1){
            if (opcion2 == 0){
                if (opcion3 == 0){
                    resultado = 100000 * cant;
                    res.setText("" + String.format("%.0f", resultado));
                }
            }

        }

        if (opcion1 == 1){
            if (opcion2 == 0){
                if (opcion3 == 1){
                    resultado = 130000 * cant;
                    res.setText("" + String.format("%.0f", resultado));
                }
            }

        }

        if (opcion1 == 1){
            if (opcion2 == 0){
                if (opcion3 == 2){
                    resultado = 110000 * cant;
                    res.setText("" + String.format("%.0f", resultado));
                }
            }

        }

        if (opcion1 == 1){
            if (opcion2 == 1){
                if (opcion3 == 0){
                    resultado = 60000 * cant;
                    res.setText("" + String.format("%.0f", resultado));
                }
            }

        }

        if (opcion1 == 1){
            if (opcion2 == 1){
                if (opcion3 == 1){
                    resultado = 70000 * cant;
                    res.setText("" + String.format("%.0f", resultado));
                }
            }

        }

        if (opcion1 == 1){
            if (opcion2 == 1){
                if (opcion3 == 2){
                    resultado = 120000 * cant;
                    res.setText("" + String.format("%.0f", resultado));
                }
            }

        }

    }





}
