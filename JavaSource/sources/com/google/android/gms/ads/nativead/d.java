package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.p20;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.w10;
import com.google.android.gms.internal.ads.y10;
import k2.n;
import s2.b0;
import s2.z;
import w2.p;

/* compiled from: MyApplication */
public final class d extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    private final FrameLayout f4397q;

    /* renamed from: r, reason: collision with root package name */
    private final p20 f4398r;

    public d(Context context) {
        super(context);
        this.f4397q = e(context);
        this.f4398r = f();
    }

    private final void d(String str, View view) {
        p20 p20Var = this.f4398r;
        if (p20Var == null) {
            return;
        }
        try {
            p20Var.g8(str, w3.b.C1(view));
        } catch (RemoteException e8) {
            p.d("Unable to call setAssetView on delegate", e8);
        }
    }

    private final FrameLayout e(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final p20 f() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.f4397q;
        return z.b().e(frameLayout.getContext(), this, frameLayout);
    }

    protected final View a(String str) {
        p20 p20Var = this.f4398r;
        if (p20Var != null) {
            try {
                w3.a W = p20Var.W(str);
                if (W != null) {
                    return (View) w3.b.r0(W);
                }
            } catch (RemoteException e8) {
                p.d("Unable to call getAssetView on delegate", e8);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        super.bringChildToFront(this.f4397q);
    }

    final /* synthetic */ void b(n nVar) {
        p20 p20Var = this.f4398r;
        if (p20Var == null) {
            return;
        }
        try {
            if (nVar == null) {
                p20Var.I1(null);
            } else {
                p.a("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e8) {
            p.d("Unable to call setMediaContent on delegate", e8);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f4397q;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    final /* synthetic */ void c(ImageView.ScaleType scaleType) {
        p20 p20Var = this.f4398r;
        if (p20Var == null || scaleType == null) {
            return;
        }
        try {
            p20Var.t5(w3.b.C1(scaleType));
        } catch (RemoteException e8) {
            p.d("Unable to call setMediaViewImageScaleType on delegate", e8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p20 p20Var = this.f4398r;
        if (p20Var != null) {
            if (((Boolean) b0.c().d(uy.Bc)).booleanValue()) {
                try {
                    p20Var.n6(w3.b.C1(motionEvent));
                } catch (RemoteException e8) {
                    p.d("Unable to call handleTouchEvent on delegate", e8);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final b getMediaView() {
        View a8 = a("3010");
        if (a8 instanceof b) {
            return (b) a8;
        }
        if (a8 == null) {
            return null;
        }
        p.a("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        p20 p20Var = this.f4398r;
        if (p20Var == null) {
            return;
        }
        try {
            p20Var.N0(w3.b.C1(view), i7);
        } catch (RemoteException e8) {
            p.d("Unable to call onVisibilityChanged on delegate", e8);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f4397q);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f4397q == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        d("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        d("3005", view);
    }

    public final void setBodyView(View view) {
        d("3004", view);
    }

    public final void setCallToActionView(View view) {
        d("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        p20 p20Var = this.f4398r;
        if (p20Var == null) {
            return;
        }
        try {
            p20Var.q0(w3.b.C1(view));
        } catch (RemoteException e8) {
            p.d("Unable to call setClickConfirmingView on delegate", e8);
        }
    }

    public final void setHeadlineView(View view) {
        d("3001", view);
    }

    public final void setIconView(View view) {
        d("3003", view);
    }

    public final void setImageView(View view) {
        d("3008", view);
    }

    public final void setMediaView(b bVar) {
        d("3010", bVar);
        if (bVar == null) {
            return;
        }
        bVar.a(new w10() { // from class: com.google.android.gms.ads.nativead.f
            @Override // com.google.android.gms.internal.ads.w10
            public final /* synthetic */ void a(n nVar) {
                d.this.b(nVar);
            }
        });
        bVar.b(new y10() { // from class: com.google.android.gms.ads.nativead.e
            @Override // com.google.android.gms.internal.ads.y10
            public final /* synthetic */ void a(ImageView.ScaleType scaleType) {
                d.this.c(scaleType);
            }
        });
    }

    public void setNativeAd(NativeAd nativeAd) {
        p20 p20Var = this.f4398r;
        if (p20Var == null) {
            return;
        }
        try {
            p20Var.d0((w3.a) nativeAd.d());
        } catch (RemoteException e8) {
            p.d("Unable to call setNativeAd on delegate", e8);
        }
    }

    public final void setPriceView(View view) {
        d("3007", view);
    }

    public final void setStarRatingView(View view) {
        d("3009", view);
    }

    public final void setStoreView(View view) {
        d("3006", view);
    }
}
