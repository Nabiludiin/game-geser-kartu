package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: MyApplication */
final class jw3 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ qw3 f10802a;

    /* synthetic */ jw3(qw3 qw3Var, byte[] bArr) {
        Objects.requireNonNull(qw3Var);
        this.f10802a = qw3Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        Object[] objArr = {componentName};
        qw3 qw3Var = this.f10802a;
        qw3Var.i().a("LmdServiceConnectionManager.onServiceConnected(%s)", objArr);
        qw3Var.h(new Runnable() { // from class: com.google.android.gms.internal.ads.iw3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IInterface m7;
                su3 j8 = ru3.j8(iBinder);
                jw3 jw3Var = jw3.this;
                qw3 qw3Var2 = jw3Var.f10802a;
                qw3Var2.n(j8);
                qw3Var2.i().a("linkToDeath", new Object[0]);
                try {
                    m7 = qw3Var2.m();
                } catch (RemoteException e8) {
                    jw3Var.f10802a.i().d(e8, "linkToDeath failed", new Object[0]);
                }
                if (m7 == null) {
                    throw null;
                }
                m7.asBinder().linkToDeath(qw3Var2.l(), 0);
                qw3 qw3Var3 = jw3Var.f10802a;
                qw3Var3.k(false);
                synchronized (qw3Var3.j()) {
                    try {
                        Iterator it = qw3Var3.j().iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        qw3Var3.j().clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object[] objArr = {componentName};
        qw3 qw3Var = this.f10802a;
        qw3Var.i().a("LmdServiceConnectionManager.onServiceDisconnected(%s)", objArr);
        qw3Var.h(new Runnable() { // from class: com.google.android.gms.internal.ads.hw3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                qw3 qw3Var2 = jw3.this.f10802a;
                qw3Var2.i().a("unlinkToDeath", new Object[0]);
                IInterface m7 = qw3Var2.m();
                m7.getClass();
                m7.asBinder().unlinkToDeath(qw3Var2.l(), 0);
                qw3Var2.n(null);
                qw3Var2.k(false);
            }
        });
    }
}
