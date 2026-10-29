package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class vt1 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f17759a;

    private vt1(w85 w85Var) {
        this.f17759a = w85Var;
    }

    public static vt1 a(w85 w85Var) {
        return new vt1(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        ou ouVar = ((n91) this.f17759a).a().f17970p.f10839a == 3 ? ou.REWARDED_INTERSTITIAL : ou.REWARD_BASED_VIDEO_AD;
        v85.b(ouVar);
        return ouVar;
    }
}
