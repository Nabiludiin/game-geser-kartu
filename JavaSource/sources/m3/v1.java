package m3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
public final class v1 extends Fragment implements j {

    /* renamed from: s0, reason: collision with root package name */
    private static final WeakHashMap f24876s0 = new WeakHashMap();

    /* renamed from: r0, reason: collision with root package name */
    private final u1 f24877r0 = new u1();

    public static v1 D1(androidx.fragment.app.e eVar) {
        v1 v1Var;
        WeakHashMap weakHashMap = f24876s0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(eVar);
        if (weakReference != null && (v1Var = (v1) weakReference.get()) != null) {
            return v1Var;
        }
        try {
            v1 v1Var2 = (v1) eVar.D().g0("SLifecycleFragmentImpl");
            if (v1Var2 == null || v1Var2.b0()) {
                v1Var2 = new v1();
                eVar.D().l().d(v1Var2, "SLifecycleFragmentImpl").g();
            }
            weakHashMap.put(eVar, new WeakReference(v1Var2));
            return v1Var2;
        } catch (ClassCastException e8) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void G0() {
        super.G0();
        this.f24877r0.i();
    }

    @Override // androidx.fragment.app.Fragment
    public final void H0(Bundle bundle) {
        super.H0(bundle);
        this.f24877r0.j(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void I0() {
        super.I0();
        this.f24877r0.k();
    }

    @Override // androidx.fragment.app.Fragment
    public final void J0() {
        super.J0();
        this.f24877r0.l();
    }

    @Override // m3.j
    public final i a(String str, Class cls) {
        return this.f24877r0.c(str, cls);
    }

    @Override // m3.j
    public final Activity b() {
        return l();
    }

    @Override // m3.j
    public final void d(String str, i iVar) {
        this.f24877r0.d(str, iVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        this.f24877r0.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.fragment.app.Fragment
    public final void g0(int i7, int i8, Intent intent) {
        super.g0(i7, i8, intent);
        this.f24877r0.f(i7, i8, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void l0(Bundle bundle) {
        super.l0(bundle);
        this.f24877r0.g(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void q0() {
        super.q0();
        this.f24877r0.h();
    }
}
