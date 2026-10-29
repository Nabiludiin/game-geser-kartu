package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: MyApplication */
public abstract class ma0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f12151a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final ja0 f12152b = new ka0();

    /* renamed from: c, reason: collision with root package name */
    public static final ha0 f12153c = la0.f11476a;

    static /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f12151a));
    }
}
