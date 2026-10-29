package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: MyApplication */
public final class vw0 {
    private static final String A;
    private static final String B;
    private static final String C;
    private static final String D;
    private static final String E;
    private static final String F;
    private static final String G;
    private static final String H;
    private static final String I;

    /* renamed from: q, reason: collision with root package name */
    private static final String f17865q;

    /* renamed from: r, reason: collision with root package name */
    private static final String f17866r;

    /* renamed from: s, reason: collision with root package name */
    private static final String f17867s;

    /* renamed from: t, reason: collision with root package name */
    private static final String f17868t;

    /* renamed from: u, reason: collision with root package name */
    private static final String f17869u;

    /* renamed from: v, reason: collision with root package name */
    private static final String f17870v;

    /* renamed from: w, reason: collision with root package name */
    private static final String f17871w;

    /* renamed from: x, reason: collision with root package name */
    private static final String f17872x;

    /* renamed from: y, reason: collision with root package name */
    private static final String f17873y;

    /* renamed from: z, reason: collision with root package name */
    private static final String f17874z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f17875a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f17876b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f17877c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f17878d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17879e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17880f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17881g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17882h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17883i;

    /* renamed from: j, reason: collision with root package name */
    public final float f17884j;

    /* renamed from: k, reason: collision with root package name */
    public final float f17885k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17886l;

    /* renamed from: m, reason: collision with root package name */
    public final float f17887m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17888n;

    /* renamed from: o, reason: collision with root package name */
    public final float f17889o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17890p;

    static {
        uv0 uv0Var = new uv0();
        uv0Var.a("");
        uv0Var.r();
        String str = hi2.f9535a;
        f17865q = Integer.toString(0, 36);
        f17866r = Integer.toString(17, 36);
        f17867s = Integer.toString(1, 36);
        f17868t = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f17869u = Integer.toString(18, 36);
        f17870v = Integer.toString(4, 36);
        f17871w = Integer.toString(5, 36);
        f17872x = Integer.toString(6, 36);
        f17873y = Integer.toString(7, 36);
        f17874z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
        F = Integer.toString(14, 36);
        G = Integer.toString(15, 36);
        H = Integer.toString(16, 36);
        I = Integer.toString(19, 36);
    }

    /* synthetic */ vw0(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f8, int i7, int i8, float f9, int i9, int i10, float f10, float f11, float f12, boolean z7, int i11, int i12, float f13, int i13, byte[] bArr) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            rx3.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f17875a = SpannedString.valueOf(charSequence);
        } else {
            this.f17875a = charSequence != null ? charSequence.toString() : null;
        }
        this.f17876b = alignment;
        this.f17877c = alignment2;
        this.f17878d = bitmap;
        this.f17879e = f8;
        this.f17880f = i7;
        this.f17881g = i8;
        this.f17882h = f9;
        this.f17883i = i9;
        this.f17884j = f11;
        this.f17885k = f12;
        this.f17886l = i10;
        this.f17887m = f10;
        this.f17888n = i12;
        this.f17889o = f13;
        this.f17890p = i13;
    }

    public final uv0 a() {
        return new uv0(this, null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f17875a;
        if (charSequence != null) {
            bundle.putCharSequence(f17865q, charSequence);
            if (charSequence instanceof Spanned) {
                ArrayList<? extends Parcelable> a8 = yz0.a((Spanned) charSequence);
                if (!a8.isEmpty()) {
                    bundle.putParcelableArrayList(f17866r, a8);
                }
            }
        }
        bundle.putSerializable(f17867s, this.f17876b);
        bundle.putSerializable(f17868t, this.f17877c);
        bundle.putFloat(f17870v, this.f17879e);
        bundle.putInt(f17871w, this.f17880f);
        bundle.putInt(f17872x, this.f17881g);
        bundle.putFloat(f17873y, this.f17882h);
        bundle.putInt(f17874z, this.f17883i);
        bundle.putInt(A, this.f17886l);
        bundle.putFloat(B, this.f17887m);
        bundle.putFloat(C, this.f17884j);
        bundle.putFloat(D, this.f17885k);
        bundle.putBoolean(F, false);
        bundle.putInt(E, -16777216);
        bundle.putInt(G, this.f17888n);
        bundle.putFloat(H, this.f17889o);
        bundle.putInt(I, this.f17890p);
        Bitmap bitmap = this.f17878d;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            rx3.h(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f17869u, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && vw0.class == obj.getClass()) {
            vw0 vw0Var = (vw0) obj;
            if (TextUtils.equals(this.f17875a, vw0Var.f17875a) && this.f17876b == vw0Var.f17876b && this.f17877c == vw0Var.f17877c && ((bitmap = this.f17878d) != null ? !((bitmap2 = vw0Var.f17878d) == null || !bitmap.sameAs(bitmap2)) : vw0Var.f17878d == null) && this.f17879e == vw0Var.f17879e && this.f17880f == vw0Var.f17880f && this.f17881g == vw0Var.f17881g && this.f17882h == vw0Var.f17882h && this.f17883i == vw0Var.f17883i && this.f17884j == vw0Var.f17884j && this.f17885k == vw0Var.f17885k && this.f17886l == vw0Var.f17886l && this.f17887m == vw0Var.f17887m && this.f17888n == vw0Var.f17888n && this.f17889o == vw0Var.f17889o && this.f17890p == vw0Var.f17890p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f17875a, this.f17876b, this.f17877c, this.f17878d, Float.valueOf(this.f17879e), Integer.valueOf(this.f17880f), Integer.valueOf(this.f17881g), Float.valueOf(this.f17882h), Integer.valueOf(this.f17883i), Float.valueOf(this.f17884j), Float.valueOf(this.f17885k), Boolean.FALSE, -16777216, Integer.valueOf(this.f17886l), Float.valueOf(this.f17887m), Integer.valueOf(this.f17888n), Float.valueOf(this.f17889o), Integer.valueOf(this.f17890p));
    }
}
