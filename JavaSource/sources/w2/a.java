package w2;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: MyApplication */
public final class a extends q3.a {
    public static final Parcelable.Creator<a> CREATOR = new z();

    /* renamed from: q, reason: collision with root package name */
    public String f27051q;

    /* renamed from: r, reason: collision with root package name */
    public int f27052r;

    /* renamed from: s, reason: collision with root package name */
    public int f27053s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f27054t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f27055u;

    public a(int i7, int i8, boolean z7) {
        this(i7, i8, z7, false, false);
    }

    public static a M0() {
        return new a(k3.k.f24503a, k3.k.f24503a, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 2, this.f27051q, false);
        q3.c.l(parcel, 3, this.f27052r);
        q3.c.l(parcel, 4, this.f27053s);
        q3.c.c(parcel, 5, this.f27054t);
        q3.c.c(parcel, 6, this.f27055u);
        q3.c.b(parcel, a8);
    }

    public a(int i7, int i8, boolean z7, boolean z8) {
        this(i7, i8, z7, false, z8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(int r9, int r10, boolean r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            if (r11 == 0) goto L5
            java.lang.String r12 = "0"
            goto Lc
        L5:
            if (r12 == 0) goto La
            java.lang.String r12 = "2"
            goto Lc
        La:
            java.lang.String r12 = "1"
        Lc:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            java.lang.String r1 = java.lang.String.valueOf(r10)
            int r0 = r0 + 13
            int r1 = r1.length()
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 1
            int r2 = r12.length()
            int r0 = r0 + r2
            r1.<init>(r0)
            java.lang.String r0 = "afma-sdk-a-v"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "."
            r1.append(r0)
            r1.append(r10)
            r1.append(r0)
            r1.append(r12)
            java.lang.String r3 = r1.toString()
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.a.<init>(int, int, boolean, boolean, boolean):void");
    }

    a(String str, int i7, int i8, boolean z7, boolean z8) {
        this.f27051q = str;
        this.f27052r = i7;
        this.f27053s = i8;
        this.f27054t = z7;
        this.f27055u = z8;
    }
}
