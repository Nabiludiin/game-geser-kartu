package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
final /* synthetic */ class zx implements Callable {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ zx f20509a = new zx();

    private /* synthetic */ zx() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
