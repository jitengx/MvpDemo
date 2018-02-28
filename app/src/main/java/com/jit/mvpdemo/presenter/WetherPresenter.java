package com.jit.mvpdemo.presenter;

import com.jit.mvpdemo.model.IWetherImpl;
import com.jit.mvpdemo.model.IWetherModel;
import com.jit.mvpdemo.view.IWetherView;

/**
 * Created by jit  on 2018/2/26.
 */

public class WetherPresenter {
    IWetherModel wetherModel;
    IWetherView wetherView;


    public WetherPresenter(IWetherView wetherView) {
        this.wetherView = wetherView;
        wetherModel = new IWetherImpl();

    }

    public void requestWetherInfo() {

    }

    private void showWaitintDialog() {
        if (wetherView != null) {
            wetherView.showWaitiingDialog();
        }
    }

    private void dismissWaitintDialog() {
        if (wetherView != null) {
            wetherView.dismissWaitingDialog();
        }
    }

    private void updateWetherInfo(String info) {
        if (wetherView != null) {
            wetherView.onInfoUpdate(info);
        }
    }


    private void saveInfo(String info) {
        wetherModel.setInfo(info);
    }

    private String localInfo(){
        return wetherModel.getInfo();
    }

}
