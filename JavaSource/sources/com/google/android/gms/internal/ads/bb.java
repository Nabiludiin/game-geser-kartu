package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public final class bb implements s9 {

    /* renamed from: a, reason: collision with root package name */
    private final y82 f5667a = new y82();

    @Override // com.google.android.gms.internal.ads.s9
    public final void a(byte[] bArr, int i7, int i8, r9 r9Var, th1 th1Var) {
        vw0 r7;
        y82 y82Var = this.f5667a;
        y82Var.A(bArr, i8 + i7);
        y82Var.G(i7);
        ArrayList arrayList = new ArrayList();
        while (y82Var.C() > 0) {
            rx3.b(y82Var.C() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int b8 = y82Var.b() - 8;
            if (y82Var.b() == 1987343459) {
                CharSequence charSequence = null;
                uv0 uv0Var = null;
                while (b8 > 0) {
                    rx3.b(b8 >= 8, "Incomplete vtt cue box header found.");
                    int b9 = y82Var.b();
                    int b10 = y82Var.b();
                    int i9 = b8 - 8;
                    int i10 = b9 - 8;
                    String G = hi2.G(y82Var.H(), y82Var.F(), i10);
                    y82Var.J(i10);
                    if (b10 == 1937011815) {
                        uv0Var = kb.b(G);
                    } else if (b10 == 1885436268) {
                        charSequence = kb.c(null, G.trim(), Collections.EMPTY_LIST);
                    }
                    b8 = i9 - i10;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (uv0Var != null) {
                    uv0Var.a(charSequence);
                    r7 = uv0Var.r();
                } else {
                    Pattern pattern = kb.f10948a;
                    jb jbVar = new jb();
                    jbVar.f10438c = charSequence;
                    r7 = jbVar.a().r();
                }
                arrayList.add(r7);
            } else {
                y82Var.J(b8);
            }
        }
        th1Var.d(new k9(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
