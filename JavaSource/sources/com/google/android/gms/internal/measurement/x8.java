package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* compiled from: MyApplication */
public abstract class x8 {

    /* renamed from: a, reason: collision with root package name */
    private static final r.a f21438a = new r.a();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21439b = 0;

    public static synchronized Uri a(String str) {
        synchronized (x8.class) {
            r.a aVar = f21438a;
            Uri uri = (Uri) aVar.get("com.google.android.gms.measurement");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            aVar.put("com.google.android.gms.measurement", parse);
            return parse;
        }
    }
}
