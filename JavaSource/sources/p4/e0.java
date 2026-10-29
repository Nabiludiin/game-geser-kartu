package p4;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import x4.b;
import x4.f;

/* compiled from: MyApplication */
public final class e0 implements x4.b {

    /* renamed from: a, reason: collision with root package name */
    private final Application f25330a;

    /* renamed from: b, reason: collision with root package name */
    private final u0 f25331b;

    /* renamed from: c, reason: collision with root package name */
    private final r f25332c;

    /* renamed from: d, reason: collision with root package name */
    private final n0 f25333d;

    /* renamed from: e, reason: collision with root package name */
    private final r2 f25334e;

    /* renamed from: f, reason: collision with root package name */
    private Dialog f25335f;

    /* renamed from: g, reason: collision with root package name */
    private s0 f25336g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f25337h = new AtomicBoolean();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference f25338i = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference f25339j = new AtomicReference();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicReference f25340k = new AtomicReference();

    /* renamed from: l, reason: collision with root package name */
    boolean f25341l = false;

    public e0(Application application, e eVar, u0 u0Var, r rVar, n0 n0Var, r2 r2Var) {
        this.f25330a = application;
        this.f25331b = u0Var;
        this.f25332c = rVar;
        this.f25333d = n0Var;
        this.f25334e = r2Var;
    }

    private final void l() {
        Dialog dialog = this.f25335f;
        if (dialog != null) {
            dialog.dismiss();
            this.f25335f = null;
        }
        this.f25331b.a(null);
        a0 a0Var = (a0) this.f25340k.getAndSet(null);
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // x4.b
    public final void a(Activity activity, b.a aVar) {
        q1.a();
        if (!this.f25337h.compareAndSet(false, true)) {
            aVar.a(new u2(3, true != this.f25341l ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").a());
            return;
        }
        this.f25336g.c();
        a0 a0Var = new a0(this, activity);
        this.f25330a.registerActivityLifecycleCallbacks(a0Var);
        this.f25340k.set(a0Var);
        this.f25331b.a(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.f25336g);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            aVar.a(new u2(3, "Activity with null windows is passed in.").a());
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        androidx.core.view.o0.a(window, false);
        this.f25339j.set(aVar);
        dialog.show();
        this.f25335f = dialog;
        this.f25336g.d("UMP_messagePresented", "");
    }

    final s0 d() {
        return this.f25336g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void g(f.b bVar, f.a aVar) {
        s0 a8 = ((t0) this.f25334e).a();
        this.f25336g = a8;
        a8.setBackgroundColor(0);
        a8.getSettings().setJavaScriptEnabled(true);
        a8.getSettings().setAllowFileAccess(false);
        a8.getSettings().setAllowContentAccess(false);
        a8.setWebViewClient(new q0(a8, null));
        this.f25338i.set(new c0(bVar, aVar, 0 == true ? 1 : 0));
        s0 s0Var = this.f25336g;
        n0 n0Var = this.f25333d;
        s0Var.loadDataWithBaseURL(n0Var.a(), n0Var.b(), "text/html", "UTF-8", null);
        q1.f25500a.postDelayed(new Runnable() { // from class: p4.z
            @Override // java.lang.Runnable
            public final void run() {
                e0.this.k(new u2(4, "Web view timed out."));
            }
        }, 10000L);
    }

    final void h(int i7) {
        l();
        b.a aVar = (b.a) this.f25339j.getAndSet(null);
        if (aVar == null) {
            return;
        }
        this.f25332c.e(i7);
        aVar.a(null);
    }

    final void i(u2 u2Var) {
        l();
        b.a aVar = (b.a) this.f25339j.getAndSet(null);
        if (aVar == null) {
            return;
        }
        aVar.a(u2Var.a());
    }

    final void j() {
        c0 c0Var = (c0) this.f25338i.getAndSet(null);
        if (c0Var == null) {
            return;
        }
        c0Var.b(this);
    }

    final void k(u2 u2Var) {
        c0 c0Var = (c0) this.f25338i.getAndSet(null);
        if (c0Var == null) {
            return;
        }
        c0Var.a(u2Var.a());
    }
}
