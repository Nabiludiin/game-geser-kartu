package s2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.cg0;
import com.google.android.gms.internal.ads.dj0;
import com.google.android.gms.internal.ads.g40;
import com.google.android.gms.internal.ads.h40;
import com.google.android.gms.internal.ads.kb0;
import com.google.android.gms.internal.ads.ki0;
import com.google.android.gms.internal.ads.p20;
import com.google.android.gms.internal.ads.ve0;
import com.google.android.gms.internal.ads.wk0;
import com.google.android.gms.internal.ads.ze0;

/* compiled from: MyApplication */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final z4 f26245a;

    /* renamed from: b, reason: collision with root package name */
    private final x4 f26246b;

    /* renamed from: c, reason: collision with root package name */
    private final a4 f26247c;

    /* renamed from: d, reason: collision with root package name */
    private final g40 f26248d;

    /* renamed from: e, reason: collision with root package name */
    private final ze0 f26249e;

    /* renamed from: f, reason: collision with root package name */
    private final h40 f26250f;

    /* renamed from: g, reason: collision with root package name */
    private cg0 f26251g;

    /* renamed from: h, reason: collision with root package name */
    private final a5 f26252h;

    public w(z4 z4Var, x4 x4Var, a4 a4Var, g40 g40Var, dj0 dj0Var, ze0 ze0Var, h40 h40Var, a5 a5Var) {
        this.f26245a = z4Var;
        this.f26246b = x4Var;
        this.f26247c = a4Var;
        this.f26248d = g40Var;
        this.f26249e = ze0Var;
        this.f26250f = h40Var;
        this.f26252h = a5Var;
    }

    static /* synthetic */ void k(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        z.a().q(context, z.d().f27051q, "gmob-apps", bundle, true);
    }

    public final v0 a(Context context, g5 g5Var, String str, kb0 kb0Var) {
        return (v0) new l(this, context, g5Var, str, kb0Var).d(context, false);
    }

    public final v0 b(Context context, g5 g5Var, String str, kb0 kb0Var) {
        return (v0) new n(this, context, g5Var, str, kb0Var).d(context, false);
    }

    public final r0 c(Context context, String str, kb0 kb0Var) {
        return (r0) new p(this, context, str, kb0Var).d(context, false);
    }

    public final h1 d(Context context, kb0 kb0Var) {
        return (h1) new r(this, context, kb0Var).d(context, false);
    }

    public final p20 e(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (p20) new v(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final ki0 f(Context context, String str, kb0 kb0Var) {
        return (ki0) new b(this, context, str, kb0Var).d(context, false);
    }

    public final cf0 g(Activity activity) {
        d dVar = new d(this, activity);
        Intent intent = activity.getIntent();
        boolean z7 = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z7 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            w2.p.c("useClientJar flag not found in activity intent extras.");
        }
        return (cf0) dVar.d(activity, z7);
    }

    public final t2 h(Context context, kb0 kb0Var) {
        return (t2) new f(this, context, kb0Var).d(context, false);
    }

    public final wk0 i(Context context, kb0 kb0Var) {
        return (wk0) new h(this, context, kb0Var).d(context, false);
    }

    public final ve0 j(Context context, kb0 kb0Var) {
        return (ve0) new j(this, context, kb0Var).d(context, false);
    }

    final /* synthetic */ z4 l() {
        return this.f26245a;
    }

    final /* synthetic */ x4 m() {
        return this.f26246b;
    }

    final /* synthetic */ a4 n() {
        return this.f26247c;
    }

    final /* synthetic */ g40 o() {
        return this.f26248d;
    }

    final /* synthetic */ ze0 p() {
        return this.f26249e;
    }

    final /* synthetic */ cg0 q() {
        return this.f26251g;
    }

    final /* synthetic */ void r(cg0 cg0Var) {
        this.f26251g = cg0Var;
    }

    final /* synthetic */ a5 s() {
        return this.f26252h;
    }
}
