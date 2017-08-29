package com.example.yuri.estaqueamentofinal;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

public class GeometriaActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_geometria);
    }

    @Override
    protected void onResume() {
        super.onResume();
        findViewById(R.id.q3_button).setOnClickListener(this);
        findViewById(R.id.e4_button).setOnClickListener(this);
        findViewById(R.id.q4_button).setOnClickListener(this);
        findViewById(R.id.e2_button).setOnClickListener(this);
        findViewById(R.id.centro_button).setOnClickListener(this);
        findViewById(R.id.e1_button).setOnClickListener(this);
        findViewById(R.id.q2_button).setOnClickListener(this);
        findViewById(R.id.e3_button).setOnClickListener(this);
        findViewById(R.id.q1_button).setOnClickListener(this);
    }

    @Override
    public void onClick(final View view){

        View dialog = getLayoutInflater().inflate(R.layout.dialog_geometria, null);

        final Dialog geometriaEstacasDialog = new Dialog(this);
        geometriaEstacasDialog.setContentView(dialog);

        final LinearLayout layoutAngulos = dialog.findViewById(R.id.angulos_opcionais);
        CheckBox estacaInclinada = dialog.findViewById(R.id.inclinacao_check);
        estacaInclinada.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if (isChecked) {
                    layoutAngulos.setVisibility(View.VISIBLE);

                } else {
                    layoutAngulos.setVisibility(View.GONE);
                }
            }
        });

        Button confirmarButton = dialog.findViewById(R.id.confirmar_geometria_button);

        confirmarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                geometriaEstacasDialog.dismiss();
            }
        });

        geometriaEstacasDialog.show();

    }



}
