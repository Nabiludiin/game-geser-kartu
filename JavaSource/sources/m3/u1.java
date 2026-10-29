package m3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MyApplication */
final class u1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f24870a = Collections.synchronizedMap(new r.a());

    /* renamed from: b, reason: collision with root package name */
    private int f24871b = 0;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f24872c;

    u1() {
    }

    final i c(String str, Class cls) {
        return (i) cls.cast(this.f24870a.get(str));
    }

    final void d(String str, i iVar) {
        if (this.f24870a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f24870a.put(str, iVar);
        if (this.f24871b > 0) {
            new o4.f(Looper.getMainLooper()).post(new t1(this, iVar, str));
        }
    }

    final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f24870a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    final void f(int i7, int i8, Intent intent) {
        Iterator it = this.f24870a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).e(i7, i8, intent);
        }
    }

    final void g(Bundle bundle) {
        this.f24871b = 1;
        this.f24872c = bundle;
        for (Map.Entry entry : this.f24870a.entrySet()) {
            ((i) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void h() {
        this.f24871b = 5;
        Iterator it = this.f24870a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).g();
        }
    }

    final void i() {
        this.f24871b = 3;
        Iterator it = this.f24870a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).h();
        }
    }

    final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f24870a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((i) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void k() {
        this.f24871b = 2;
        Iterator it = this.f24870a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).j();
        }
    }

    final void l() {
        this.f24871b = 4;
        Iterator it = this.f24870a.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).k();
        }
    }
}
