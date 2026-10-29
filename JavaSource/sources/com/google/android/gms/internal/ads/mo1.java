package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MyApplication */
final class mo1 implements x10 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ op1 f12331a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f12332b;

    mo1(op1 op1Var, ViewGroup viewGroup) {
        this.f12331a = op1Var;
        this.f12332b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.x10
    public final void a() {
        w04 w04Var = lo1.E;
        op1 op1Var = this.f12331a;
        Map l7 = op1Var.l();
        if (l7 == null) {
            return;
        }
        int size = w04Var.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = l7.get((String) w04Var.get(i7));
            i7++;
            if (obj != null) {
                op1Var.onClick(this.f12332b);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.x10
    public final void b(MotionEvent motionEvent) {
        this.f12331a.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.x10
    public final JSONObject d() {
        return this.f12331a.s();
    }

    @Override // com.google.android.gms.internal.ads.x10
    public final JSONObject h() {
        return this.f12331a.m();
    }
}
