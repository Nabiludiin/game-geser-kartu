package p3;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p3.c;

/* compiled from: MyApplication */
final class y0 extends o4.f {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f25279b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c cVar, Looper looper) {
        super(looper);
        this.f25279b = cVar;
    }

    private static final void a(Message message) {
        z0 z0Var = (z0) message.obj;
        z0Var.b();
        z0Var.e();
    }

    private static final boolean b(Message message) {
        int i7 = message.what;
        return i7 == 2 || i7 == 1 || i7 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.a aVar;
        c.a aVar2;
        k3.b bVar;
        k3.b bVar2;
        boolean z7;
        if (this.f25279b.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i7 = message.what;
        if ((i7 == 1 || i7 == 7 || ((i7 == 4 && !this.f25279b.y()) || message.what == 5)) && !this.f25279b.f()) {
            a(message);
            return;
        }
        int i8 = message.what;
        if (i8 == 4) {
            this.f25279b.f25146z = new k3.b(message.arg2);
            if (c.m0(this.f25279b)) {
                c cVar = this.f25279b;
                z7 = cVar.A;
                if (!z7) {
                    cVar.n0(3, null);
                    return;
                }
            }
            c cVar2 = this.f25279b;
            bVar2 = cVar2.f25146z;
            k3.b bVar3 = bVar2 != null ? cVar2.f25146z : new k3.b(8);
            this.f25279b.f25136p.b(bVar3);
            this.f25279b.Q(bVar3);
            return;
        }
        if (i8 == 5) {
            c cVar3 = this.f25279b;
            bVar = cVar3.f25146z;
            k3.b bVar4 = bVar != null ? cVar3.f25146z : new k3.b(8);
            this.f25279b.f25136p.b(bVar4);
            this.f25279b.Q(bVar4);
            return;
        }
        if (i8 == 3) {
            Object obj = message.obj;
            k3.b bVar5 = new k3.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f25279b.f25136p.b(bVar5);
            this.f25279b.Q(bVar5);
            return;
        }
        if (i8 == 6) {
            this.f25279b.n0(5, null);
            c cVar4 = this.f25279b;
            aVar = cVar4.f25141u;
            if (aVar != null) {
                aVar2 = cVar4.f25141u;
                aVar2.O(message.arg2);
            }
            this.f25279b.R(message.arg2);
            c.l0(this.f25279b, 5, 1, null);
            return;
        }
        if (i8 == 2 && !this.f25279b.a()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((z0) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
