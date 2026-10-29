package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* compiled from: MyApplication */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private boolean A0;
    private Dialog C0;
    private boolean D0;
    private boolean E0;
    private boolean F0;

    /* renamed from: r0, reason: collision with root package name */
    private Handler f2231r0;

    /* renamed from: s0, reason: collision with root package name */
    private Runnable f2232s0 = new a();

    /* renamed from: t0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f2233t0 = new b();

    /* renamed from: u0, reason: collision with root package name */
    private DialogInterface.OnDismissListener f2234u0 = new c();

    /* renamed from: v0, reason: collision with root package name */
    private int f2235v0 = 0;

    /* renamed from: w0, reason: collision with root package name */
    private int f2236w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f2237x0 = true;

    /* renamed from: y0, reason: collision with root package name */
    private boolean f2238y0 = true;

    /* renamed from: z0, reason: collision with root package name */
    private int f2239z0 = -1;
    private androidx.lifecycle.q B0 = new C0038d();
    private boolean G0 = false;

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f2234u0.onDismiss(d.this.C0);
        }
    }

    /* compiled from: MyApplication */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.C0 != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.C0);
            }
        }
    }

    /* compiled from: MyApplication */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.C0 != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.C0);
            }
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    class C0038d implements androidx.lifecycle.q {
        C0038d() {
        }

        @Override // androidx.lifecycle.q
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.k kVar) {
            if (kVar == null || !d.this.f2238y0) {
                return;
            }
            View m12 = d.this.m1();
            if (m12.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (d.this.C0 != null) {
                if (n.D0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.C0);
                }
                d.this.C0.setContentView(m12);
            }
        }
    }

    /* compiled from: MyApplication */
    class e extends g {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ g f2244q;

        e(g gVar) {
            this.f2244q = gVar;
        }

        @Override // androidx.fragment.app.g
        public View d(int i7) {
            return this.f2244q.f() ? this.f2244q.d(i7) : d.this.J1(i7);
        }

        @Override // androidx.fragment.app.g
        public boolean f() {
            return this.f2244q.f() || d.this.K1();
        }
    }

    private void G1(boolean z7, boolean z8) {
        if (this.E0) {
            return;
        }
        this.E0 = true;
        this.F0 = false;
        Dialog dialog = this.C0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.C0.dismiss();
            if (!z8) {
                if (Looper.myLooper() == this.f2231r0.getLooper()) {
                    onDismiss(this.C0);
                } else {
                    this.f2231r0.post(this.f2232s0);
                }
            }
        }
        this.D0 = true;
        if (this.f2239z0 >= 0) {
            F().S0(this.f2239z0, 1);
            this.f2239z0 = -1;
            return;
        }
        v l7 = F().l();
        l7.k(this);
        if (z7) {
            l7.g();
        } else {
            l7.f();
        }
    }

    private void L1(Bundle bundle) {
        if (this.f2238y0 && !this.G0) {
            try {
                this.A0 = true;
                Dialog I1 = I1(bundle);
                this.C0 = I1;
                if (this.f2238y0) {
                    N1(I1, this.f2235v0);
                    Context r7 = r();
                    if (r7 instanceof Activity) {
                        this.C0.setOwnerActivity((Activity) r7);
                    }
                    this.C0.setCancelable(this.f2237x0);
                    this.C0.setOnCancelListener(this.f2233t0);
                    this.C0.setOnDismissListener(this.f2234u0);
                    this.G0 = true;
                } else {
                    this.C0 = null;
                }
                this.A0 = false;
            } catch (Throwable th) {
                this.A0 = false;
                throw th;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void H0(Bundle bundle) {
        super.H0(bundle);
        Dialog dialog = this.C0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i7 = this.f2235v0;
        if (i7 != 0) {
            bundle.putInt("android:style", i7);
        }
        int i8 = this.f2236w0;
        if (i8 != 0) {
            bundle.putInt("android:theme", i8);
        }
        boolean z7 = this.f2237x0;
        if (!z7) {
            bundle.putBoolean("android:cancelable", z7);
        }
        boolean z8 = this.f2238y0;
        if (!z8) {
            bundle.putBoolean("android:showsDialog", z8);
        }
        int i9 = this.f2239z0;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    public int H1() {
        return this.f2236w0;
    }

    @Override // androidx.fragment.app.Fragment
    public void I0() {
        super.I0();
        Dialog dialog = this.C0;
        if (dialog != null) {
            this.D0 = false;
            dialog.show();
            View decorView = this.C0.getWindow().getDecorView();
            androidx.lifecycle.a0.a(decorView, this);
            androidx.lifecycle.b0.a(decorView, this);
            androidx.savedstate.d.a(decorView, this);
        }
    }

    public Dialog I1(Bundle bundle) {
        if (n.D0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(l1(), H1());
    }

    @Override // androidx.fragment.app.Fragment
    public void J0() {
        super.J0();
        Dialog dialog = this.C0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    View J1(int i7) {
        Dialog dialog = this.C0;
        if (dialog != null) {
            return dialog.findViewById(i7);
        }
        return null;
    }

    boolean K1() {
        return this.G0;
    }

    @Override // androidx.fragment.app.Fragment
    public void L0(Bundle bundle) {
        Bundle bundle2;
        super.L0(bundle);
        if (this.C0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.C0.onRestoreInstanceState(bundle2);
    }

    public void M1(boolean z7) {
        this.f2238y0 = z7;
    }

    public void N1(Dialog dialog, int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void O1(n nVar, String str) {
        this.E0 = false;
        this.F0 = true;
        v l7 = nVar.l();
        l7.d(this, str);
        l7.f();
    }

    @Override // androidx.fragment.app.Fragment
    void S0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.S0(layoutInflater, viewGroup, bundle);
        if (this.X != null || this.C0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.C0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    g f() {
        return new e(super.f());
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(Context context) {
        super.i0(context);
        T().e(this.B0);
        if (this.F0) {
            return;
        }
        this.E0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(Bundle bundle) {
        super.l0(bundle);
        this.f2231r0 = new Handler();
        this.f2238y0 = this.N == 0;
        if (bundle != null) {
            this.f2235v0 = bundle.getInt("android:style", 0);
            this.f2236w0 = bundle.getInt("android:theme", 0);
            this.f2237x0 = bundle.getBoolean("android:cancelable", true);
            this.f2238y0 = bundle.getBoolean("android:showsDialog", this.f2238y0);
            this.f2239z0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.D0) {
            return;
        }
        if (n.D0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        G1(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void s0() {
        super.s0();
        Dialog dialog = this.C0;
        if (dialog != null) {
            this.D0 = true;
            dialog.setOnDismissListener(null);
            this.C0.dismiss();
            if (!this.E0) {
                onDismiss(this.C0);
            }
            this.C0 = null;
            this.G0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void t0() {
        super.t0();
        if (!this.F0 && !this.E0) {
            this.E0 = true;
        }
        T().i(this.B0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater u0(Bundle bundle) {
        LayoutInflater u02 = super.u0(bundle);
        if (this.f2238y0 && !this.A0) {
            L1(bundle);
            if (n.D0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.C0;
            if (dialog != null) {
                return u02.cloneInContext(dialog.getContext());
            }
        } else if (n.D0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f2238y0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return u02;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return u02;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
