package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class s70 implements ze {

    /* renamed from: a, reason: collision with root package name */
    private volatile f70 f15480a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f15481b;

    public s70(Context context) {
        this.f15481b = context;
    }

    @Override // com.google.android.gms.internal.ads.ze
    public final cf a(gf gfVar) {
        Parcelable.Creator<g70> creator = g70.CREATOR;
        Map s7 = gfVar.s();
        int size = s7.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i7 = 0;
        for (Map.Entry entry : s7.entrySet()) {
            strArr[i7] = (String) entry.getKey();
            strArr2[i7] = (String) entry.getValue();
            i7++;
        }
        g70 g70Var = new g70(gfVar.n(), strArr, strArr2);
        long b8 = r2.t.o().b();
        try {
            im0 im0Var = new im0();
            this.f15480a = new f70(this.f15481b, r2.t.w().a(), new q70(this, im0Var), new r70(this, im0Var));
            this.f15480a.v();
            o70 o70Var = new o70(this, g70Var);
            z64 z64Var = cm0.f6500a;
            a5.d i8 = p64.i(p64.j(im0Var, o70Var, z64Var), ((Integer) s2.b0.c().d(uy.f17051a5)).intValue(), TimeUnit.MILLISECONDS, cm0.f6503d);
            i8.c(new p70(this), z64Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) i8.get();
            long b9 = r2.t.o().b() - b8;
            StringBuilder sb = new StringBuilder(String.valueOf(b9).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(b9);
            sb.append("ms");
            v2.n1.k(sb.toString());
            i70 i70Var = (i70) new ch0(parcelFileDescriptor).M0(i70.CREATOR);
            if (i70Var == null) {
                return null;
            }
            if (i70Var.f9861q) {
                throw new of(i70Var.f9862r);
            }
            String[] strArr3 = i70Var.f9865u;
            String[] strArr4 = i70Var.f9866v;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i9 = 0; i9 < strArr3.length; i9++) {
                hashMap.put(strArr3[i9], strArr4[i9]);
            }
            return new cf(i70Var.f9863s, i70Var.f9864t, hashMap, i70Var.f9867w, i70Var.f9868x);
        } catch (InterruptedException | ExecutionException unused) {
            long b10 = r2.t.o().b() - b8;
            StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(b10);
            sb2.append("ms");
            v2.n1.k(sb2.toString());
            return null;
        } catch (Throwable th) {
            long b11 = r2.t.o().b() - b8;
            StringBuilder sb3 = new StringBuilder(String.valueOf(b11).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(b11);
            sb3.append("ms");
            v2.n1.k(sb3.toString());
            throw th;
        }
    }

    final /* synthetic */ void b() {
        if (this.f15480a == null) {
            return;
        }
        this.f15480a.h();
        Binder.flushPendingCommands();
    }

    final /* synthetic */ f70 c() {
        return this.f15480a;
    }
}
