package com.google.android.gms.ads.nativead;

import android.os.Bundle;
import java.util.Map;
import k2.u;

/* compiled from: MyApplication */
public abstract class NativeAd {

    /* compiled from: MyApplication */
    public static abstract class a {
    }

    /* compiled from: MyApplication */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        protected Map f4373a;
    }

    /* compiled from: MyApplication */
    public interface c {
        void a(NativeAd nativeAd);
    }

    public abstract String a();

    public abstract String b();

    public abstract u c();

    protected abstract Object d();

    protected abstract void recordEvent(Bundle bundle);
}
