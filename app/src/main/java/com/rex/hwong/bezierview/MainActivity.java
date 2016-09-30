package com.rex.hwong.bezierview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view){
        Class clz = null;
        switch (view.getId()) {
            case R.id.btn_shopcart:
                clz = ShopCartActivity.class;
                break;
        }
        startActivity(new Intent(this, clz));
    }
}
