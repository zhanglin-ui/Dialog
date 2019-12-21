package com.example.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyDialog extends Dialog {
    public MyDialog(Context context){
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tishi);
        Button button_queren = findViewById(R.id.button_queren);
        Button button_cancel = findViewById(R.id.button_cancel);
        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        button_queren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText_zhanghao = findViewById(R.id.tishi_zhanghao);
                EditText editText_mima = findViewById(R.id.tishi_mima);
                if(editText_zhanghao.getText().toString().equals("abc")&&editText_mima.getText().toString().equals("123")){
                    System.out.println("this");
                    Toast.makeText(getContext(),"正确",Toast.LENGTH_SHORT).show();
                    dismiss();
                    return;
                }
                Toast.makeText(getContext(),"错误",Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });
    }
}
