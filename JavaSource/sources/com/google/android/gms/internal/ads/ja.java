package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: MyApplication */
final class ja {

    /* renamed from: a, reason: collision with root package name */
    public final int f10417a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10418b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10419c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10420d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10421e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10422f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10423g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10424h;

    /* renamed from: i, reason: collision with root package name */
    public final int f10425i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10426j;

    /* renamed from: k, reason: collision with root package name */
    public final int f10427k;

    private ja(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f10417a = i7;
        this.f10418b = i8;
        this.f10419c = i9;
        this.f10420d = i10;
        this.f10421e = i11;
        this.f10422f = i12;
        this.f10423g = i13;
        this.f10424h = i14;
        this.f10425i = i15;
        this.f10426j = i16;
        this.f10427k = i17;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static ja a(String str) {
        String[] split = TextUtils.split(str.substring(7), ",");
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        while (true) {
            int length = split.length;
            if (i7 >= length) {
                if (i8 != -1) {
                    return new ja(i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, length);
                }
                return null;
            }
            String a8 = zw3.a(split[i7].trim());
            switch (a8.hashCode()) {
                case -1178781136:
                    if (!a8.equals("italic")) {
                        break;
                    } else {
                        i14 = i7;
                        break;
                    }
                case -1026963764:
                    if (!a8.equals("underline")) {
                        break;
                    } else {
                        i15 = i7;
                        break;
                    }
                case -192095652:
                    if (!a8.equals("strikeout")) {
                        break;
                    } else {
                        i16 = i7;
                        break;
                    }
                case -70925746:
                    if (!a8.equals("primarycolour")) {
                        break;
                    } else {
                        i10 = i7;
                        break;
                    }
                case 3029637:
                    if (!a8.equals("bold")) {
                        break;
                    } else {
                        i13 = i7;
                        break;
                    }
                case 3373707:
                    if (!a8.equals("name")) {
                        break;
                    } else {
                        i8 = i7;
                        break;
                    }
                case 366554320:
                    if (!a8.equals("fontsize")) {
                        break;
                    } else {
                        i12 = i7;
                        break;
                    }
                case 767321349:
                    if (!a8.equals("borderstyle")) {
                        break;
                    } else {
                        i17 = i7;
                        break;
                    }
                case 1767875043:
                    if (!a8.equals("alignment")) {
                        break;
                    } else {
                        i9 = i7;
                        break;
                    }
                case 1988365454:
                    if (!a8.equals("outlinecolour")) {
                        break;
                    } else {
                        i11 = i7;
                        break;
                    }
            }
            i7++;
        }
    }
}
