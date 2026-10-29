package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import o2.a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class bt2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final a.C0117a f5991a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5992b;

    /* renamed from: c, reason: collision with root package name */
    private final kh3 f5993c;

    public bt2(a.C0117a c0117a, String str, kh3 kh3Var) {
        this.f5991a = c0117a;
        this.f5992b = str;
        this.f5993c = kh3Var;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        try {
            JSONObject h8 = v2.r0.h((JSONObject) obj, "pii");
            a.C0117a c0117a = this.f5991a;
            if (c0117a == null || TextUtils.isEmpty(c0117a.a())) {
                String str = this.f5992b;
                if (str != null) {
                    h8.put("pdid", str);
                    h8.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            h8.put("rdid", c0117a.a());
            h8.put("is_lat", c0117a.b());
            h8.put("idtype", "adid");
            kh3 kh3Var = this.f5993c;
            if (kh3Var.c()) {
                h8.put("paidv1_id_android_3p", kh3Var.a());
                h8.put("paidv1_creation_time_android_3p", kh3Var.b());
            }
        } catch (JSONException e8) {
            v2.n1.l("Failed putting Ad ID.", e8);
        }
    }
}
