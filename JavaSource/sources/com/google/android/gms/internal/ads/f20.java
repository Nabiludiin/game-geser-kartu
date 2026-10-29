package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MyApplication */
public final class f20 extends n2.c {

    /* renamed from: a, reason: collision with root package name */
    private final e20 f7975a;

    /* renamed from: b, reason: collision with root package name */
    private final List f7976b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private String f7977c;

    public f20(e20 e20Var) {
        l20 l20Var;
        this.f7975a = e20Var;
        try {
            this.f7977c = e20Var.b();
        } catch (RemoteException e8) {
            w2.p.d("", e8);
            this.f7977c = "";
        }
        try {
            for (Object obj : e20Var.d()) {
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    l20Var = queryLocalInterface instanceof l20 ? (l20) queryLocalInterface : new j20(iBinder);
                } else {
                    l20Var = null;
                }
                if (l20Var != null) {
                    this.f7976b.add(new m20(l20Var));
                }
            }
        } catch (RemoteException e9) {
            w2.p.d("", e9);
        }
    }
}
