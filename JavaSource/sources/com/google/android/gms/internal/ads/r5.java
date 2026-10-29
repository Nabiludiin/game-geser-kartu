package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class r5 implements ld {

    /* renamed from: a, reason: collision with root package name */
    public final String f14740a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14741b;

    public r5(String str, String str2) {
        this.f14740a = zw3.b(str);
        this.f14741b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.ld
    public final void a(lb lbVar) {
        Integer h8;
        Integer h9;
        Integer h10;
        Integer h11;
        String str = this.f14740a;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (h8 = m44.h(this.f14741b, 10)) != null) {
                    lbVar.E(h8);
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (h9 = m44.h(this.f14741b, 10)) != null) {
                    lbVar.P(h9);
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (h10 = m44.h(this.f14741b, 10)) != null) {
                    lbVar.D(h10);
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    lbVar.z(this.f14741b);
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    lbVar.Q(this.f14741b);
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    lbVar.x(this.f14741b);
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    lbVar.B(this.f14741b);
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (h11 = m44.h(this.f14741b, 10)) != null) {
                    lbVar.O(h11);
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    lbVar.A(this.f14741b);
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    lbVar.y(this.f14741b);
                    break;
                }
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r5 r5Var = (r5) obj;
            if (this.f14740a.equals(r5Var.f14740a) && this.f14741b.equals(r5Var.f14741b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14740a.hashCode() + 527) * 31) + this.f14741b.hashCode();
    }

    public final String toString() {
        String str = this.f14740a;
        int length = String.valueOf(str).length();
        String str2 = this.f14741b;
        StringBuilder sb = new StringBuilder(length + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }
}
