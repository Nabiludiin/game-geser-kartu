package p3;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* compiled from: MyApplication */
final class l1 implements Handler.Callback {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ n1 f25229q;

    /* synthetic */ l1(n1 n1Var, m1 m1Var) {
        this.f25229q = n1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i7 = message.what;
        if (i7 == 0) {
            hashMap = this.f25229q.f25244g;
            synchronized (hashMap) {
                try {
                    j1 j1Var = (j1) message.obj;
                    hashMap2 = this.f25229q.f25244g;
                    k1 k1Var = (k1) hashMap2.get(j1Var);
                    if (k1Var != null && k1Var.i()) {
                        if (k1Var.j()) {
                            k1Var.g("GmsClientSupervisor");
                        }
                        hashMap3 = this.f25229q.f25244g;
                        hashMap3.remove(j1Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i7 != 1) {
            return false;
        }
        hashMap4 = this.f25229q.f25244g;
        synchronized (hashMap4) {
            try {
                j1 j1Var2 = (j1) message.obj;
                hashMap5 = this.f25229q.f25244g;
                k1 k1Var2 = (k1) hashMap5.get(j1Var2);
                if (k1Var2 != null && k1Var2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(j1Var2), new Exception());
                    ComponentName b8 = k1Var2.b();
                    if (b8 == null) {
                        b8 = j1Var2.a();
                    }
                    if (b8 == null) {
                        String c8 = j1Var2.c();
                        o.m(c8);
                        b8 = new ComponentName(c8, "unknown");
                    }
                    k1Var2.onServiceDisconnected(b8);
                }
            } finally {
            }
        }
        return true;
    }
}
