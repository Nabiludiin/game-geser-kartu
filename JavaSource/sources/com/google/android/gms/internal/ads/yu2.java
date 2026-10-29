package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class yu2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f19793a;

    public yu2(Map map) {
        this.f19793a = map;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", s2.z.a().s(this.f19793a));
        } catch (JSONException e8) {
            v2.n1.k("Could not encode video decoder properties: ".concat(String.valueOf(e8.getMessage())));
        }
    }
}
