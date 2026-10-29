package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.e30;
import com.google.android.gms.internal.ads.w10;
import com.google.android.gms.internal.ads.y10;
import k2.n;
import w2.p;

/* compiled from: MyApplication */
public class b extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    private boolean f4374q;

    /* renamed from: r, reason: collision with root package name */
    private w10 f4375r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView.ScaleType f4376s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4377t;

    /* renamed from: u, reason: collision with root package name */
    private y10 f4378u;

    public b(Context context) {
        super(context);
    }

    protected final synchronized void a(w10 w10Var) {
        this.f4375r = w10Var;
        if (this.f4374q) {
            w10Var.a(null);
        }
    }

    protected final synchronized void b(y10 y10Var) {
        this.f4378u = y10Var;
        if (this.f4377t) {
            y10Var.a(this.f4376s);
        }
    }

    public n getMediaContent() {
        return null;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f4377t = true;
        this.f4376s = scaleType;
        y10 y10Var = this.f4378u;
        if (y10Var != null) {
            y10Var.a(scaleType);
        }
    }

    public void setMediaContent(n nVar) {
        boolean y02;
        this.f4374q = true;
        w10 w10Var = this.f4375r;
        if (w10Var != null) {
            w10Var.a(nVar);
        }
        if (nVar == null) {
            return;
        }
        try {
            e30 b8 = nVar.b();
            if (b8 != null) {
                if (!nVar.c()) {
                    if (nVar.a()) {
                        y02 = b8.y0(w3.b.C1(this));
                    }
                    removeAllViews();
                }
                y02 = b8.j0(w3.b.C1(this));
                if (y02) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e8) {
            removeAllViews();
            p.d("", e8);
        }
    }
}
