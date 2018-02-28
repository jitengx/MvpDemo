package com.jit.mvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.jit.mvpdemo.R;
import com.jit.mvpdemo.presenter.WetherPresenter;

public class MainActivity extends AppCompatActivity  implements IWetherView{

    private WetherPresenter wetherPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wetherPresenter = new WetherPresenter(this);



    }

    public void onClick(){
        Log.i("mvp","view - 触发事件");
        wetherPresenter.requestWetherInfo();
    }
    @Override
    public void onInfoUpdate(String info) {
        Log.i("mvp","view - 更新");
    }

    @Override
    public void showWaitiingDialog() {

    }

    @Override
    public void dismissWaitingDialog() {

    }
}
