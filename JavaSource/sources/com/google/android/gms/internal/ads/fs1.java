package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class fs1 implements x10 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f8460a = "_videoMediaView";

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gs1 f8461b;

    fs1(gs1 gs1Var, String str) {
        Objects.requireNonNull(gs1Var);
        this.f8461b = gs1Var;
    }

    @Override // com.google.android.gms.internal.ads.x10
    public final void a() {
        gs1 gs1Var = this.f8461b;
        if (gs1Var.k8() != null) {
            gs1Var.k8().L(this.f8460a);
        }
    }

    @Override // com.google.android.gms.internal.ads.x10
    public final JSONObject d() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.x10
    public final JSONObject h() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.x10
    public final void b(MotionEvent motionEvent) {
    }
}
