package com.gu.swiperefreshplush.extention;

import android.view.View;

import com.gu.swiperefresh.IRefreshViewController;
import com.gu.swiperefresh.SwipeRefreshPlush;
import com.gu.swiperefresh.Utils.Size;

/**
 * Created by GUHY on 2017/4/18.
 */

public class RefreshViewController implements IRefreshViewController {
    @Override
    public void reset() {

    }

    @Override
    public View create() {
        return null;
    }

    @Override
    public int getCurrentTargetOffsetTop() {
        return 0;
    }

    @Override
    public Size getRefreshViewSize() {
        return null;
    }

    @Override
    public boolean isRefresh() {
        return false;
    }

    @Override
    public float showPullRefresh(float overscrollTop) {
        return 0;
    }

    @Override
    public float finishPullRefresh(float overscrollTop) {
        return 0;
    }

    @Override
    public void startProgress() {

    }

    @Override
    public void setTargetOffsetTopAndBottom(int i, boolean b) {

    }

    @Override
    public void setRefreshListener(SwipeRefreshPlush.OnRefreshListener mListener) {

    }

    @Override
    public void setRefreshing(boolean refresh) {

    }

}
