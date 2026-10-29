package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class mb implements s9 {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f12163a = new y82();

    /* renamed from: b, reason: collision with root package name */
    private final cb f12164b = new cb();

    @Override // com.google.android.gms.internal.ads.s9
    public final void a(byte[] bArr, int i7, int i8, r9 r9Var, th1 th1Var) {
        y82 y82Var = this.f12163a;
        y82Var.A(bArr, i8 + i7);
        y82Var.G(i7);
        ArrayList arrayList = new ArrayList();
        try {
            int F = y82Var.F();
            Charset charset = StandardCharsets.UTF_8;
            String n7 = y82Var.n(charset);
            if (n7 == null || !n7.startsWith("WEBVTT")) {
                y82Var.G(F);
                throw wi.b("Expected WEBVTT. Got ".concat(String.valueOf(y82Var.n(charset))), null);
            }
            while (!TextUtils.isEmpty(y82Var.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c8 = 65535;
                int i9 = 0;
                while (c8 == 65535) {
                    i9 = y82Var.F();
                    String n8 = y82Var.n(StandardCharsets.UTF_8);
                    c8 = n8 == null ? (char) 0 : "STYLE".equals(n8) ? (char) 2 : n8.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                y82Var.G(i9);
                if (c8 == 0) {
                    m9.a(new pb(arrayList2), r9Var, th1Var);
                    return;
                }
                if (c8 == 1) {
                    while (!TextUtils.isEmpty(y82Var.n(StandardCharsets.UTF_8))) {
                    }
                } else if (c8 != 2) {
                    eb a8 = kb.a(y82Var, arrayList);
                    if (a8 != null) {
                        arrayList2.add(a8);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    y82Var.n(StandardCharsets.UTF_8);
                    arrayList.addAll(this.f12164b.a(y82Var));
                }
            }
        } catch (wi e8) {
            throw new IllegalArgumentException(e8);
        }
    }
}
