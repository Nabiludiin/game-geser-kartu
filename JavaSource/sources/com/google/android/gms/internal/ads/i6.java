package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
public final class i6 extends d6 {

    /* renamed from: b, reason: collision with root package name */
    public final String f9845b;

    /* renamed from: c, reason: collision with root package name */
    public final w04 f9846c;

    public i6(String str, String str2, List list) {
        super(str);
        rx3.a(!list.isEmpty());
        this.f9845b = str2;
        w04 u7 = w04.u(list);
        this.f9846c = u7;
    }

    private static List b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0181 A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x0203, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x0203, blocks: (B:6:0x0123, B:13:0x0178, B:15:0x0181, B:16:0x018d, B:71:0x01dc), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018c  */
    @Override // com.google.android.gms.internal.ads.d6, com.google.android.gms.internal.ads.ld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.lb r7) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i6.a(com.google.android.gms.internal.ads.lb):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i6.class == obj.getClass()) {
            i6 i6Var = (i6) obj;
            if (Objects.equals(this.f6930a, i6Var.f6930a) && Objects.equals(this.f9845b, i6Var.f9845b) && this.f9846c.equals(i6Var.f9846c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6930a.hashCode() + 527;
        String str = this.f9845b;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f9846c.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.d6
    public final String toString() {
        String valueOf = String.valueOf(this.f9846c);
        String str = this.f6930a;
        int length = String.valueOf(str).length();
        String str2 = this.f9845b;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + valueOf.length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": values=");
        sb.append(valueOf);
        return sb.toString();
    }
}
