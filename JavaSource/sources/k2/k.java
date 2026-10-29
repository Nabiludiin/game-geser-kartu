package k2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.ag0;
import com.google.android.gms.internal.ads.u00;
import com.google.android.gms.internal.ads.uy;
import s2.l3;

/* compiled from: MyApplication */
public abstract class k extends ViewGroup {

    /* renamed from: q, reason: collision with root package name */
    protected final l3 f24420q;

    protected k(Context context, int i7) {
        super(context);
        this.f24420q = new l3(this, i7);
    }

    public void a() {
        uy.a(getContext());
        if (((Boolean) u00.f16528e.e()).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.gc)).booleanValue()) {
                w2.c.f27059b.execute(new Runnable() { // from class: k2.e0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        k kVar = k.this;
                        try {
                            kVar.f24420q.g();
                        } catch (IllegalStateException e8) {
                            ag0.c(kVar.getContext()).a(e8, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f24420q.g();
    }

    public void b(final g gVar) {
        p3.o.f("#008 Must be called on the main UI thread.");
        uy.a(getContext());
        if (((Boolean) u00.f16529f.e()).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.jc)).booleanValue()) {
                w2.c.f27059b.execute(new Runnable() { // from class: k2.b0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        g gVar2 = gVar;
                        k kVar = k.this;
                        try {
                            kVar.f24420q.m(gVar2.f24399a);
                        } catch (IllegalStateException e8) {
                            ag0.c(kVar.getContext()).a(e8, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f24420q.m(gVar.f24399a);
    }

    public void c() {
        uy.a(getContext());
        if (((Boolean) u00.f16530g.e()).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.hc)).booleanValue()) {
                w2.c.f27059b.execute(new Runnable() { // from class: k2.c0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        k kVar = k.this;
                        try {
                            kVar.f24420q.n();
                        } catch (IllegalStateException e8) {
                            ag0.c(kVar.getContext()).a(e8, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f24420q.n();
    }

    public void d() {
        uy.a(getContext());
        if (((Boolean) u00.f16531h.e()).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.fc)).booleanValue()) {
                w2.c.f27059b.execute(new Runnable() { // from class: k2.d0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        k kVar = k.this;
                        try {
                            kVar.f24420q.o();
                        } catch (IllegalStateException e8) {
                            ag0.c(kVar.getContext()).a(e8, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f24420q.o();
    }

    public d getAdListener() {
        return this.f24420q.h();
    }

    public h getAdSize() {
        return this.f24420q.i();
    }

    public String getAdUnitId() {
        return this.f24420q.k();
    }

    public o getOnPaidEventListener() {
        this.f24420q.A();
        return null;
    }

    public long getPlacementId() {
        return this.f24420q.y();
    }

    public u getResponseInfo() {
        return this.f24420q.w();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i11 = ((i9 - i7) - measuredWidth) / 2;
        int i12 = ((i10 - i8) - measuredHeight) / 2;
        childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        h hVar;
        int i9;
        int i10 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                hVar = getAdSize();
            } catch (NullPointerException e8) {
                w2.p.d("Unable to retrieve ad size.", e8);
                hVar = null;
            }
            if (hVar != null) {
                Context context = getContext();
                int d8 = hVar.d(context);
                i9 = hVar.b(context);
                i10 = d8;
            } else {
                i9 = 0;
            }
        } else {
            measureChild(childAt, i7, i8);
            i10 = childAt.getMeasuredWidth();
            i9 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i10, getSuggestedMinimumWidth()), i7), View.resolveSize(Math.max(i9, getSuggestedMinimumHeight()), i8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(d dVar) {
        l3 l3Var = this.f24420q;
        l3Var.p(dVar);
        if (dVar == 0) {
            l3Var.q(null);
            return;
        }
        if (dVar instanceof s2.a) {
            l3Var.q((s2.a) dVar);
        }
        if (dVar instanceof l2.d) {
            l3Var.u((l2.d) dVar);
        }
    }

    public void setAdSize(h hVar) {
        this.f24420q.r(hVar);
    }

    public void setAdUnitId(String str) {
        this.f24420q.t(str);
    }

    public void setOnPaidEventListener(o oVar) {
        this.f24420q.x(oVar);
    }

    public void setPlacementId(long j7) {
        this.f24420q.z(j7);
    }
}
