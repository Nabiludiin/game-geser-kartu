package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: MyApplication */
public final class qn2 extends sp2 {

    /* renamed from: b, reason: collision with root package name */
    public final long f14517b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14518c;

    /* renamed from: d, reason: collision with root package name */
    public final List f14519d;

    public qn2(int i7, long j7) {
        super(i7, null);
        this.f14517b = j7;
        this.f14518c = new ArrayList();
        this.f14519d = new ArrayList();
    }

    public final void b(ro2 ro2Var) {
        this.f14518c.add(ro2Var);
    }

    public final void c(qn2 qn2Var) {
        this.f14519d.add(qn2Var);
    }

    public final ro2 d(int i7) {
        List list = this.f14518c;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            ro2 ro2Var = (ro2) list.get(i8);
            if (ro2Var.f15739a == i7) {
                return ro2Var;
            }
        }
        return null;
    }

    public final qn2 e(int i7) {
        List list = this.f14519d;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            qn2 qn2Var = (qn2) list.get(i8);
            if (qn2Var.f15739a == i7) {
                return qn2Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final String toString() {
        List list = this.f14518c;
        String a8 = sp2.a(this.f15739a);
        String arrays = Arrays.toString(list.toArray());
        String arrays2 = Arrays.toString(this.f14519d.toArray());
        int length = a8.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(arrays).length() + 13 + String.valueOf(arrays2).length());
        sb.append(a8);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
