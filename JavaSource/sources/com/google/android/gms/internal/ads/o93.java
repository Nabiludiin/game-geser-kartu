package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public final class o93 {

    /* renamed from: a, reason: collision with root package name */
    private final ba3 f13243a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f13244b;

    /* renamed from: c, reason: collision with root package name */
    private final List f13245c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Map f13246d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final String f13247e;

    /* renamed from: f, reason: collision with root package name */
    private final String f13248f;

    /* renamed from: g, reason: collision with root package name */
    private final p93 f13249g;

    private o93(ba3 ba3Var, WebView webView, String str, List list, String str2, String str3, p93 p93Var) {
        this.f13243a = ba3Var;
        this.f13244b = webView;
        this.f13249g = p93Var;
        this.f13248f = str2;
        this.f13247e = str3;
    }

    public static o93 a(ba3 ba3Var, WebView webView, String str, String str2) {
        if (str2 != null) {
            lb3.d(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new o93(ba3Var, webView, null, null, str, str2, p93.HTML);
    }

    public static o93 b(ba3 ba3Var, WebView webView, String str, String str2) {
        lb3.d("", 256, "CustomReferenceData is greater than 256 characters");
        return new o93(ba3Var, webView, null, null, str, "", p93.JAVASCRIPT);
    }

    public final ba3 c() {
        return this.f13243a;
    }

    public final List d() {
        return Collections.unmodifiableList(this.f13245c);
    }

    public final Map e() {
        return Collections.unmodifiableMap(this.f13246d);
    }

    public final WebView f() {
        return this.f13244b;
    }

    public final String g() {
        return this.f13248f;
    }

    public final String h() {
        return this.f13247e;
    }

    public final p93 i() {
        return this.f13249g;
    }
}
