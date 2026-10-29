package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Map;

/* compiled from: MyApplication */
final class bj3 implements gm3 {

    /* renamed from: a, reason: collision with root package name */
    private final ri3 f5821a;

    /* renamed from: b, reason: collision with root package name */
    private final yi3 f5822b;

    /* renamed from: c, reason: collision with root package name */
    private Context f5823c;

    /* renamed from: d, reason: collision with root package name */
    private View f5824d;

    /* renamed from: e, reason: collision with root package name */
    private Activity f5825e;

    /* renamed from: f, reason: collision with root package name */
    private String f5826f;

    /* renamed from: g, reason: collision with root package name */
    private Map f5827g;

    /* renamed from: h, reason: collision with root package name */
    private ak f5828h;

    /* renamed from: i, reason: collision with root package name */
    private jj3 f5829i;

    /* synthetic */ bj3(ri3 ri3Var, yi3 yi3Var, byte[] bArr) {
        this.f5821a = ri3Var;
        this.f5822b = yi3Var;
    }

    @Override // com.google.android.gms.internal.ads.gm3
    public final hm3 a() {
        v85.c(this.f5823c, Context.class);
        v85.c(this.f5827g, Map.class);
        v85.c(this.f5828h, ak.class);
        v85.c(this.f5829i, jj3.class);
        return new cj3(this.f5821a, this.f5822b, this.f5823c, this.f5824d, this.f5825e, this.f5826f, this.f5827g, this.f5828h, this.f5829i);
    }

    @Override // com.google.android.gms.internal.ads.gm3
    public final /* bridge */ /* synthetic */ gm3 b(Map map) {
        this.f5827g = map;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.gm3
    public final /* bridge */ /* synthetic */ gm3 c(Context context) {
        context.getClass();
        this.f5823c = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.gm3
    public final /* bridge */ /* synthetic */ gm3 d(ak akVar) {
        akVar.getClass();
        this.f5828h = akVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.gm3
    public final /* bridge */ /* synthetic */ gm3 e(jj3 jj3Var) {
        jj3Var.getClass();
        this.f5829i = jj3Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.gm3
    public final /* synthetic */ gm3 f(Activity activity) {
        this.f5825e = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.gm3
    public final /* synthetic */ gm3 g(View view) {
        this.f5824d = view;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.gm3
    public final /* synthetic */ gm3 y(String str) {
        this.f5826f = str;
        return this;
    }
}
