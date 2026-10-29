package m3;

import android.util.Log;
import android.util.SparseArray;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import l3.f;

/* compiled from: MyApplication */
public final class h1 extends m1 {

    /* renamed from: v, reason: collision with root package name */
    private final SparseArray f24811v;

    private h1(j jVar) {
        super(jVar, k3.g.p());
        this.f24811v = new SparseArray();
        this.f24812q.d("AutoManageHelper", this);
    }

    public static h1 t(h hVar) {
        j d8 = i.d(hVar);
        h1 h1Var = (h1) d8.a("AutoManageHelper", h1.class);
        return h1Var != null ? h1Var : new h1(d8);
    }

    private final g1 w(int i7) {
        if (this.f24811v.size() <= i7) {
            return null;
        }
        SparseArray sparseArray = this.f24811v;
        return (g1) sparseArray.get(sparseArray.keyAt(i7));
    }

    @Override // m3.i
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i7 = 0; i7 < this.f24811v.size(); i7++) {
            g1 w7 = w(i7);
            if (w7 != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(w7.f24796q);
                printWriter.println(":");
                w7.f24797r.f(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // m3.m1, m3.i
    public final void j() {
        super.j();
        SparseArray sparseArray = this.f24811v;
        Log.d("AutoManageHelper", "onStart " + this.f24831r + " " + String.valueOf(sparseArray));
        if (this.f24832s.get() == null) {
            for (int i7 = 0; i7 < this.f24811v.size(); i7++) {
                g1 w7 = w(i7);
                if (w7 != null) {
                    w7.f24797r.d();
                }
            }
        }
    }

    @Override // m3.m1, m3.i
    public final void k() {
        super.k();
        for (int i7 = 0; i7 < this.f24811v.size(); i7++) {
            g1 w7 = w(i7);
            if (w7 != null) {
                w7.f24797r.e();
            }
        }
    }

    @Override // m3.m1
    protected final void m(k3.b bVar, int i7) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i7 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        g1 g1Var = (g1) this.f24811v.get(i7);
        if (g1Var != null) {
            v(i7);
            f.c cVar = g1Var.f24798s;
            if (cVar != null) {
                cVar.a(bVar);
            }
        }
    }

    @Override // m3.m1
    protected final void n() {
        for (int i7 = 0; i7 < this.f24811v.size(); i7++) {
            g1 w7 = w(i7);
            if (w7 != null) {
                w7.f24797r.d();
            }
        }
    }

    public final void u(int i7, l3.f fVar, f.c cVar) {
        p3.o.n(fVar, "GoogleApiClient instance cannot be null");
        p3.o.q(this.f24811v.indexOfKey(i7) < 0, "Already managing a GoogleApiClient with id " + i7);
        i1 i1Var = (i1) this.f24832s.get();
        Log.d("AutoManageHelper", "starting AutoManage for client " + i7 + " " + this.f24831r + " " + String.valueOf(i1Var));
        g1 g1Var = new g1(this, i7, fVar, cVar);
        fVar.m(g1Var);
        this.f24811v.put(i7, g1Var);
        if (this.f24831r && i1Var == null) {
            Log.d("AutoManageHelper", "connecting ".concat(fVar.toString()));
            fVar.d();
        }
    }

    public final void v(int i7) {
        g1 g1Var = (g1) this.f24811v.get(i7);
        this.f24811v.remove(i7);
        if (g1Var != null) {
            g1Var.f24797r.n(g1Var);
            g1Var.f24797r.e();
        }
    }
}
