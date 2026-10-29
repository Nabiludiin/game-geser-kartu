package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* compiled from: MyApplication */
public final class zzbub implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Activity f20543a;

    /* renamed from: b, reason: collision with root package name */
    private y2.l f20544b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f20545c;

    final /* synthetic */ Activity a() {
        return this.f20543a;
    }

    final /* synthetic */ y2.l b() {
        return this.f20544b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        w2.p.a("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        w2.p.a("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        w2.p.a("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, y2.l lVar, Bundle bundle, y2.e eVar, Bundle bundle2) {
        this.f20544b = lVar;
        if (lVar == null) {
            w2.p.f("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            w2.p.f("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f20544b.c(this, 0);
            return;
        }
        if (!wz.a(context)) {
            w2.p.f("Default browser does not support custom tabs. Bailing out.");
            this.f20544b.c(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            w2.p.f("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f20544b.c(this, 0);
        } else {
            this.f20543a = (Activity) context;
            this.f20545c = Uri.parse(string);
            this.f20544b.o(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        androidx.browser.customtabs.d a8 = new d.C0013d().a();
        a8.f1034a.setData(this.f20545c);
        v2.f2.f26746l.post(new ae0(this, new AdOverlayInfoParcel(new u2.m(a8.f1034a, null), null, new yd0(this), null, new w2.a(0, 0, false), null, null, "")));
        r2.t.l().f();
    }
}
