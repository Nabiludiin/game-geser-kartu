package p3;

import android.util.Log;
import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f25282a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25283b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f25284c;

    public z0(c cVar, Object obj) {
        this.f25284c = cVar;
        this.f25282a = obj;
    }

    protected abstract void a(Object obj);

    protected abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f25282a;
                if (this.f25283b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f25283b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f25282a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f25284c.f25138r;
        synchronized (arrayList) {
            arrayList2 = this.f25284c.f25138r;
            arrayList2.remove(this);
        }
    }
}
