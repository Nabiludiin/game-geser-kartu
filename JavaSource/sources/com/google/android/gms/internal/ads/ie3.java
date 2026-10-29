package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;
import java.util.Objects;

/* compiled from: MyApplication */
public final class ie3 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f10017a;

    /* renamed from: b, reason: collision with root package name */
    private int f10018b;

    /* renamed from: c, reason: collision with root package name */
    private int f10019c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ je3 f10020d;

    /* synthetic */ ie3(je3 je3Var, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(je3Var);
        this.f10020d = je3Var;
        this.f10017a = bArr;
    }

    public final synchronized void a() {
        try {
            je3 je3Var = this.f10020d;
            if (je3Var.f10527b) {
                me3 me3Var = je3Var.f10526a;
                me3Var.E4(this.f10017a);
                me3Var.F(this.f10018b);
                me3Var.I(this.f10019c);
                me3Var.A7(null);
                me3Var.c();
            }
        } catch (RemoteException e8) {
            Log.d("GASS", "Clearcut log failed", e8);
        }
    }

    public final ie3 b(int i7) {
        this.f10018b = i7;
        return this;
    }

    public final ie3 c(int i7) {
        this.f10019c = i7;
        return this;
    }
}
