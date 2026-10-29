package m3;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
public final class s1 extends Fragment implements j {

    /* renamed from: r, reason: collision with root package name */
    private static final WeakHashMap f24854r = new WeakHashMap();

    /* renamed from: q, reason: collision with root package name */
    private final u1 f24855q = new u1();

    public static s1 c(Activity activity) {
        s1 s1Var;
        WeakHashMap weakHashMap = f24854r;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (s1Var = (s1) weakReference.get()) != null) {
            return s1Var;
        }
        try {
            s1 s1Var2 = (s1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (s1Var2 == null || s1Var2.isRemoving()) {
                s1Var2 = new s1();
                activity.getFragmentManager().beginTransaction().add(s1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(s1Var2));
            return s1Var2;
        } catch (ClassCastException e8) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e8);
        }
    }

    @Override // m3.j
    public final i a(String str, Class cls) {
        return this.f24855q.c(str, cls);
    }

    @Override // m3.j
    public final Activity b() {
        return getActivity();
    }

    @Override // m3.j
    public final void d(String str, i iVar) {
        this.f24855q.d(str, iVar);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f24855q.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        this.f24855q.f(i7, i8, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f24855q.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f24855q.h();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f24855q.i();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f24855q.j(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f24855q.k();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f24855q.l();
    }
}
