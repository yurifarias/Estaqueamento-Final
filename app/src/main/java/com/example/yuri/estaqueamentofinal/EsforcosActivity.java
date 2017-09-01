package com.example.yuri.estaqueamentofinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class EsforcosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esforcos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        Button confirmarEsforcos = (Button) findViewById(R.id.confirmar_esforcos_button);
        confirmarEsforcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity instanciandoMainActivity = new MainActivity();

                if (findViewById(R.id.esforcoEdit_fx) == null) {
                    instanciandoMainActivity.esforcoFx = 0;
                } else {
                    instanciandoMainActivity.esforcoFx = Double.parseDouble(findViewById(R.id.esforcoEdit_fx).toString());
                }

                if (findViewById(R.id.esforcoEdit_fy) == null) {
                    instanciandoMainActivity.esforcoFy = 0;
                } else {
                    instanciandoMainActivity.esforcoFy = Double.parseDouble(findViewById(R.id.esforcoEdit_fy).toString());
                }

                if (findViewById(R.id.esforcoEdit_fz) == null) {
                    instanciandoMainActivity.esforcoFz = 0;
                } else {
                    instanciandoMainActivity.esforcoFz = Double.parseDouble(findViewById(R.id.esforcoEdit_fz).toString());
                }

                if (findViewById(R.id.esforcoEdit_fa) == null) {
                    instanciandoMainActivity.esforcoFa = 0;
                } else {
                    instanciandoMainActivity.esforcoFa = Double.parseDouble(findViewById(R.id.esforcoEdit_fa).toString());
                }

                if (findViewById(R.id.esforcoEdit_fb) == null) {
                    instanciandoMainActivity.esforcoFb = 0;
                } else {
                    instanciandoMainActivity.esforcoFb = Double.parseDouble(findViewById(R.id.esforcoEdit_fb).toString());
                }

                if (findViewById(R.id.esforcoEdit_fc) == null) {
                    instanciandoMainActivity.esforcoFc = 0;
                } else {
                    instanciandoMainActivity.esforcoFc = Double.parseDouble(findViewById(R.id.esforcoEdit_fc).toString());
                }

                finish();
            }
        });
    }
}
