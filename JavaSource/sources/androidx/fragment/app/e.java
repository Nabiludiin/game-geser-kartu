package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.b;
import androidx.lifecycle.g;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: MyApplication */
public abstract class e extends ComponentActivity implements b.c {
    boolean C;
    boolean D;
    final i A = i.b(new c());
    final androidx.lifecycle.l B = new androidx.lifecycle.l(this);
    boolean E = true;

    /* compiled from: MyApplication */
    class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.F();
            e.this.B.h(g.b.ON_STOP);
            Parcelable x7 = e.this.A.x();
            if (x7 != null) {
                bundle.putParcelable("android:support:fragments", x7);
            }
            return bundle;
        }
    }

    /* compiled from: MyApplication */
    class b implements d.b {
        b() {
        }

        @Override // d.b
        public void a(Context context) {
            e.this.A.a(null);
            Bundle a8 = e.this.j().a("android:support:fragments");
            if (a8 != null) {
                e.this.A.w(a8.getParcelable("android:support:fragments"));
            }
        }
    }

    /* compiled from: MyApplication */
    class c extends k implements androidx.lifecycle.z, androidx.activity.c, androidx.activity.result.d, r {
        public c() {
            super(e.this);
        }

        @Override // androidx.fragment.app.r
        public void a(n nVar, Fragment fragment) {
            e.this.H(fragment);
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher c() {
            return e.this.c();
        }

        @Override // androidx.fragment.app.g
        public View d(int i7) {
            return e.this.findViewById(i7);
        }

        @Override // androidx.activity.result.d
        public ActivityResultRegistry e() {
            return e.this.e();
        }

        @Override // androidx.fragment.app.g
        public boolean f() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.z
        public androidx.lifecycle.y h() {
            return e.this.h();
        }

        @Override // androidx.fragment.app.k
        public LayoutInflater m() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        @Override // androidx.fragment.app.k
        public boolean n(Fragment fragment) {
            return !e.this.isFinishing();
        }

        @Override // androidx.fragment.app.k
        public void p() {
            e.this.K();
        }

        @Override // androidx.fragment.app.k
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public e l() {
            return e.this;
        }

        @Override // androidx.lifecycle.k
        public androidx.lifecycle.g t() {
            return e.this.B;
        }
    }

    public e() {
        E();
    }

    private void E() {
        j().d("android:support:fragments", new a());
        w(new b());
    }

    private static boolean G(n nVar, g.c cVar) {
        boolean z7 = false;
        for (Fragment fragment : nVar.q0()) {
            if (fragment != null) {
                if (fragment.A() != null) {
                    z7 |= G(fragment.q(), cVar);
                }
                z zVar = fragment.f2096j0;
                if (zVar != null && zVar.t().b().c(g.c.STARTED)) {
                    fragment.f2096j0.g(cVar);
                    z7 = true;
                }
                if (fragment.f2095i0.b().c(g.c.STARTED)) {
                    fragment.f2095i0.o(cVar);
                    z7 = true;
                }
            }
        }
        return z7;
    }

    final View C(View view, String str, Context context, AttributeSet attributeSet) {
        return this.A.v(view, str, context, attributeSet);
    }

    public n D() {
        return this.A.t();
    }

    void F() {
        while (G(D(), g.c.CREATED)) {
        }
    }

    protected boolean I(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void J() {
        this.B.h(g.b.ON_RESUME);
        this.A.p();
    }

    public abstract void K();

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.C);
        printWriter.print(" mResumed=");
        printWriter.print(this.D);
        printWriter.print(" mStopped=");
        printWriter.print(this.E);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.A.t().V(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        this.A.u();
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.A.u();
        super.onConfigurationChanged(configuration);
        this.A.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.B.h(g.b.ON_CREATE);
        this.A.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i7, Menu menu) {
        return i7 == 0 ? super.onCreatePanelMenu(i7, menu) | this.A.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i7, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View C = C(view, str, context, attributeSet);
        return C == null ? super.onCreateView(view, str, context, attributeSet) : C;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.A.h();
        this.B.h(g.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.A.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 0) {
            return this.A.k(menuItem);
        }
        if (i7 != 6) {
            return false;
        }
        return this.A.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z7) {
        this.A.j(z7);
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        this.A.u();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i7, Menu menu) {
        if (i7 == 0) {
            this.A.l(menu);
        }
        super.onPanelClosed(i7, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.D = false;
        this.A.m();
        this.B.h(g.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z7) {
        this.A.n(z7);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        J();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i7, View view, Menu menu) {
        return i7 == 0 ? I(view, menu) | this.A.o(menu) : super.onPreparePanel(i7, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        this.A.u();
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.A.u();
        super.onResume();
        this.D = true;
        this.A.s();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.A.u();
        super.onStart();
        this.E = false;
        if (!this.C) {
            this.C = true;
            this.A.c();
        }
        this.A.s();
        this.B.h(g.b.ON_START);
        this.A.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.A.u();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.E = true;
        F();
        this.A.r();
        this.B.h(g.b.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View C = C(null, str, context, attributeSet);
        return C == null ? super.onCreateView(str, context, attributeSet) : C;
    }

    public void H(Fragment fragment) {
    }

    @Override // androidx.core.app.b.c
    public final void b(int i7) {
    }
}
