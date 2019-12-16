package com.example.theburguerprovectv2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DialogoConexión extends AppCompatDialogFragment {

    private EditText editTextIp;
    private EditText editTextPuerto;
    private DialogListener listener;


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.settings, null);
        builder.setView(view)
                .setTitle("Configuración")
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Aplicar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String ip = editTextIp.getText().toString();
                        String puerto = editTextPuerto.getText().toString();
                        listener.applyText(ip,puerto);
                    }
                });
        editTextIp = view.findViewById(R.id.ip);
        editTextPuerto = view.findViewById(R.id.puerto);
        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener = (DialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "Se debe implementar DialogListener");
        }
    }

    public interface DialogListener{
        void applyText(String ip, String puerto);
    }
}
