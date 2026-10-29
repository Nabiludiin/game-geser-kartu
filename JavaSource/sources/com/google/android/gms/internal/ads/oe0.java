package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class oe0 extends NativeAd.a {

    /* renamed from: a, reason: collision with root package name */
    private final List f13306a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private String f13307b;

    public oe0(e20 e20Var) {
        try {
            this.f13307b = e20Var.b();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            this.f13307b = "";
        }
        try {
            for (Object obj : e20Var.d()) {
                l20 j8 = obj instanceof IBinder ? k20.j8((IBinder) obj) : null;
                if (j8 != null) {
                    this.f13306a.add(new pe0(j8));
                }
            }
        } catch (RemoteException e9) {
            w2.p.d("", e9);
        }
    }
}
