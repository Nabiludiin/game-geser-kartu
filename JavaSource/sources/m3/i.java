package m3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: MyApplication */
public abstract class i {

    /* renamed from: q, reason: collision with root package name */
    protected final j f24812q;

    protected i(j jVar) {
        this.f24812q = jVar;
    }

    public static j c(Activity activity) {
        return d(new h(activity));
    }

    protected static j d(h hVar) {
        if (hVar.d()) {
            return v1.D1(hVar.b());
        }
        if (hVar.c()) {
            return s1.c(hVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public Activity b() {
        Activity b8 = this.f24812q.b();
        p3.o.m(b8);
        return b8;
    }

    public abstract void e(int i7, int i8, Intent intent);

    public void g() {
    }

    public void h() {
    }

    public void j() {
    }

    public void k() {
    }

    public void f(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
