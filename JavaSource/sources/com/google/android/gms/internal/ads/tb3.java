package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: MyApplication */
final class tb3 implements Runnable {
    tb3() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = vb3.f17522j;
        if (handler != null) {
            handler2 = vb3.f17522j;
            runnable = vb3.f17523k;
            handler2.post(runnable);
            handler3 = vb3.f17522j;
            runnable2 = vb3.f17524l;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
