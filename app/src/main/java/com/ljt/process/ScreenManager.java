package com.ljt.process;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import java.lang.ref.WeakReference;

public class ScreenManager {
    public static String TAG=ScreenManager .class.getSimpleName();
    private Context mContext;

    private WeakReference<Activity> mActivityWref;

    public static ScreenManager gDefualt;

    public static ScreenManager getInstance(Context pContext) {
        if (gDefualt == null) {
            gDefualt = new ScreenManager(pContext.getApplicationContext());
        }
        return gDefualt;
    }
    private ScreenManager(Context pContext) {
        this.mContext = pContext;
    }

    public void setActivity(Activity pActivity) {
        Log.d(TAG,TAG+" setActivity(Activity pActivity)----->>>activity = "+pActivity.getClass().getName());
        mActivityWref = new WeakReference<Activity>(pActivity);
    }

    public void startActivity() {
            LiveActivity.actionToLiveActivity(mContext);
    }

    public void finishActivity() {
        //结束掉LiveActivity
        if (mActivityWref != null) {
            Activity activity = mActivityWref.get();
             Log.d(TAG,TAG+"finishActivity() ----->>>activity = "+activity.getClass().getName());
            if (activity != null) {
                activity.finish();
            }
        }
    }
}