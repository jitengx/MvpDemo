package com.jit.mvpdemo.view;

/**
 * Created by jit  on 2018/2/26.
 */

public interface IWetherView {

     void onInfoUpdate(String info);
     void showWaitiingDialog();
     void dismissWaitingDialog();

}
